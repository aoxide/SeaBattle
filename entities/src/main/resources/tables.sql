/**
 * Author:  AOxide
 * Created: 12.03.2017
 */

CREATE TABLE public.game
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
ALTER TABLE public.game
  OWNER TO postgres;
  
CREATE TABLE public.shots
(
    id bigserial NOT NULL,
    game_id bigserial NOT NULL,
    session_id bigserial NOT NULL,
    x int,
    y int,
    CONSTRAINT shots_pk PRIMARY KEY (id),
    CONSTRAINT shots_fk_game_id FOREIGN KEY (game_id)
    REFERENCES public.game (id) MATCH SIMPLE
    ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.shots
  OWNER TO postgres;
  
CREATE TABLE public.ships
(
    id bigserial NOT NULL,
    game_id bigserial NOT NULL,
    session_id bigserial NOT NULL,
    ship_id bigserial NOT NULL,
    x int,
    y int,
    CONSTRAINT ships_pk PRIMARY KEY (id),
    CONSTRAINT ships_fk_game_id FOREIGN KEY (game_id)
    REFERENCES public.game (id) MATCH SIMPLE
    ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.ships
  OWNER TO postgres;