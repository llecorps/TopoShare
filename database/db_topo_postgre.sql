CREATE SEQUENCE public.Utilisateur_id_seq;

CREATE TABLE public.Utilisateur (
                idUtilisateur INTEGER NOT NULL DEFAULT nextval('public.Utilisateur_id_seq'),
                username VARCHAR(16) NOT NULL,
                email VARCHAR(255) NOT NULL,
                password VARCHAR(32) NOT NULL,
                create_time TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
                CONSTRAINT Utilisateur_pk PRIMARY KEY (idUtilisateur)
);

ALTER SEQUENCE public.Utilisateur_id_seq OWNED BY public.Utilisateur.idUtilisateur;

CREATE SEQUENCE public.Location_id_seq;

CREATE TABLE public.Location (
                idLocation INTEGER NOT NULL DEFAULT nextval('public.Location_id_seq'),
                datedeb DATE NULL,
                datefin DATE NULL,
                Utilisateur_idUtilisateur INT NOT NULL,
                Topo_idTopo INT NOT NULL,
                CONSTRAINT Location_pk PRIMARY KEY (idLocation)
);

ALTER SEQUENCE public.Location_id_seq OWNED BY public.Location.idLocation;

CREATE SEQUENCE public.Topo_id_seq;

CREATE TABLE public.Topo (
                idTopo INTEGER NOT NULL DEFAULT nextval('public.Topo_id_seq'),
                libelle VARCHAR(45) NOT NULL,
                notation VARCHAR(45) NOT NULL,
                Location_Utilisateur_idUtilisateur INT NOT NULL,
                Utilisateur_idUtilisateur INT NOT NULL,
                CONSTRAINT Topo_pk PRIMARY KEY (idTopo)
);

ALTER SEQUENCE public.Topo_id_seq OWNED BY public.Topo.idTopo;

CREATE SEQUENCE public.Commentaire_id_seq;

CREATE TABLE public.Commentaire (
                idCommentaire INTEGER NOT NULL DEFAULT nextval('public.Commentaire_id_seq'),
                decription VARCHAR(255) NOT NULL,
                Topo_idTopo INT NOT NULL,
                CONSTRAINT Commentaire_pk PRIMARY KEY (idCommentaire)
);

ALTER SEQUENCE public.Commentaire_id_seq OWNED BY public.Commentaire.idCommentaire;

CREATE SEQUENCE public.Secteur_id_seq;

CREATE TABLE public.Secteur (
                idSecteur INTEGER NOT NULL DEFAULT nextval('public.Secteur_id_seq'),
                libelle VARCHAR(45) NOT NULL,
                statut VARCHAR(45) NOT NULL,
                Topo_idTopo INT NOT NULL,
                CONSTRAINT Secteur_pk PRIMARY KEY (idSecteur)
);

ALTER SEQUENCE public.Secteur_id_seq OWNED BY public.Secteur.idSecteur;

CREATE SEQUENCE public.Voie_id_seq;

CREATE TABLE public.Voie (
                idVoie INTEGER NOT NULL DEFAULT nextval('public.Voie_id_seq'),
                libelle VARCHAR(45) NOT NULL,
                notation VARCHAR(45) NOT NULL,
                hauteur VARCHAR(45) NOT NULL,
                largeur VARCHAR(45) NOT NULL,
                Secteur_idSecteur INT NOT NULL,
                CONSTRAINT Voie_pk PRIMARY KEY (idVoie)
);

ALTER SEQUENCE public.Voie_id_seq OWNED BY public.Voie.idVoie;

ALTER TABLE public.Voie ADD CONSTRAINT fk_secteur_id
FOREIGN KEY (Secteur_idSecteur)
REFERENCES public.Secteur (idSecteur)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Secteur ADD CONSTRAINT fk_topo_id
FOREIGN KEY (Topo_idTopo)
REFERENCES public.Topo (idTopo)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Commentaire ADD CONSTRAINT fk_topo_id
FOREIGN KEY (Topo_idTopo)
REFERENCES public.Topo (idTopo)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Topo ADD CONSTRAINT fk_location_id
FOREIGN KEY (Location_Utilisateur_idUtilisateur)
REFERENCES public.Location (Utilisateur_idUtilisateur)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Topo ADD CONSTRAINT fk_utilisateur_id
FOREIGN KEY (Utilisateur_idUtilisateur)
REFERENCES public.Utilisateur (idUtilisateur)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Location ADD CONSTRAINT fk_utilisateur_id
FOREIGN KEY (Utilisateur_idUtilisateur)
REFERENCES public.Utilisateur (idUtilisateur)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Location ADD CONSTRAINT fk_topo_id
FOREIGN KEY (Topo_idTopo)
REFERENCES public.Topo (idTopo)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
