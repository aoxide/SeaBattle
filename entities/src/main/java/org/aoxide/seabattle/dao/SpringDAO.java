/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aoxide.seabattle.dao;

import java.util.HashMap;
import java.util.Map;
import org.aoxide.seabattle.entities.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

/**
 *
 * @author AOxide
 */
public class SpringDAO implements DAO
{
    private final ApplicationContext context;
    private final JdbcTemplate jdbcTemplate;
            
    public SpringDAO()
    {
        context = new ClassPathXmlApplicationContext(new String[]{"springContext.xml"});
        jdbcTemplate = context.getBean("jdbcTemplate",JdbcTemplate.class);
    }
    
    @Override
    public void CreateGame(Game game)
    {
        Map<String,Object> params = new HashMap();
        params.put("session1_id",game.getSession1());
        params.put("session2_id",game.getSession2());
        params.put("state",game.getState().ordinal());
        
        
        SimpleJdbcInsert inserter = new SimpleJdbcInsert(jdbcTemplate).
                withSchemaName("public").withTableName("game").usingGeneratedKeyColumns("id");
        game.setId(
            inserter.executeAndReturnKey(params).longValue()
        );
    }
    
    @Override
    public void CreateShip(Game game, long session_id, Ship ship) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void Shot(Game game, long Session_ID, int X, int Y) {
        Map<String,Object> params = new HashMap();
        params.put("game_id",game.getId());
        params.put("session_id",Session_ID);
        params.put("x",X);
        params.put("y",Y);
        
        SimpleJdbcInsert inserter = new SimpleJdbcInsert(jdbcTemplate).
                withSchemaName("public").withTableName("shots").usingGeneratedKeyColumns("id");
        inserter.execute(params);
    }
    
}
