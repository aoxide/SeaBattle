/**
 * Author:  AOxide
 * Created: 12.03.2017
 */

CREATE TABLE seabattle.game
(
    id bigserial NOT NULL,
    session1_id bigserial NOT NULL,
    session2_id bigserial NOT NULL,
    state int,
    CONSTRAINT game_pk PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE seabattle.game
  OWNER TO postgres;
  
CREATE TABLE seabattle.cells
(
    id bigserial NOT NULL,
    game_id bigserial NOT NULL,
    session_id bigserial NOT NULL,
    x int,
    y int,
    state int,
    CONSTRAINT cells_pk PRIMARY KEY (id),
    CONSTRAINT cells_fk_game_id FOREIGN KEY (game_id)
    REFERENCES seabattle.game (id) MATCH SIMPLE
    ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE seabattle.cells
  OWNER TO postgres;