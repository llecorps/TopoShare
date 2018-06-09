CREATE SEQUENCE public.Utilisateur_id_seq;

CREATE TABLE public.Utilisateur (
                id INTEGER NOT NULL DEFAULT nextval('public.user_id_seq'),
                username VARCHAR(16) NOT NULL,
                email VARCHAR(255) NOT NULL,
                password VARCHAR(32) NOT NULL,
                create_time TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
                CONSTRAINT Utilisateur_pk PRIMARY KEY (id)
);

ALTER SEQUENCE public.Utilisateur_id_seq OWNED BY public.Utilisateur.id;

CREATE SEQUENCE public.Location_id_seq;

CREATE TABLE public.Location (
                id INTEGER NOT NULL DEFAULT nextval('public.Location_id_seq'),
                proprio VARCHAR(45) NOT NULL,
                emprunteur VARCHAR(45) NOT NULL,
                datedeb DATE NULL,
                datefin DATE NULL,
                Utilisateur_id INT NOT NULL,
                CONSTRAINT Location_pk PRIMARY KEY (id)
);

ALTER SEQUENCE public.Location_id_seq OWNED BY public.Location.id;

CREATE SEQUENCE public.Topo_id_seq;

CREATE TABLE public.Topo (
                id INTEGER NOT NULL DEFAULT nextval('public.Topo_id_seq'),
                secteur VARCHAR(45) NOT NULL,
                voie VARCHAR(45) NOT NULL,
                hauteur VARCHAR(45) NOT NULL,
                cotation VARCHAR(45) NOT NULL,
                points VARCHAR(45) NOT NULL,
                Location_id INT NOT NULL

                CONSTRAINT Topo_pk PRIMARY KEY (id)
);

ALTER SEQUENCE public.Location_id_seq OWNED BY public.Location.id;
