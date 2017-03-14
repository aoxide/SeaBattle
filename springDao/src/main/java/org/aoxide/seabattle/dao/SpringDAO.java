package org.aoxide.seabattle.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import org.aoxide.seabattle.entities.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

/**
 *
 * @author AOxide
 */
public class SpringDAO implements DAO
{
    private JdbcTemplate jdbcTemplate;
            
    @Override
    public void CreateGame(Game game)
    {
        Map<String,Object> params = new HashMap();
        params.put("session1_id",game.getSession());
        params.put("state",game.getState().ordinal());
        
        SimpleJdbcInsert inserter = new SimpleJdbcInsert(jdbcTemplate).
                withSchemaName("public").withTableName("game").usingGeneratedKeyColumns("id");
        game.setId(
            inserter.executeAndReturnKey(params).longValue()
        );
    }
    
    @Override
    public Game OpenGame(long game_id, long session_id)
    {
        DAO dao = this;
        Game game = jdbcTemplate.queryForObject("select * from public.game where id = ?", 
          new RowMapper<Game>(){
              @Override
              public Game mapRow(ResultSet rs, int i) throws SQLException
              {
                  return new Game(dao, session_id);
              }
          }
        );
        
        return game;
    }
    
    @Override
    public void CreateShip(Game game, Ship ship) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void Shot(Game game, long session_id, int x, int y) 
    {
        Map<String,Object> params = new HashMap();
        params.put("game_id",game.getId());
        params.put("session_id",session_id);
        params.put("x",x);
        params.put("y",y);
        
        SimpleJdbcInsert inserter = new SimpleJdbcInsert(jdbcTemplate).
                withSchemaName("public").withTableName("shots").usingGeneratedKeyColumns("id");
        inserter.execute(params);
    }
    
    public JdbcTemplate getJdbcTemplate()
    {
        return jdbcTemplate;
    }
    
    public void setJdbcTemplate(JdbcTemplate aJdbcTemplate)
    {
        jdbcTemplate = aJdbcTemplate;
    }
    
}
