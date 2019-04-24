--
-- PostgreSQL database dump
--

-- Dumped from database version 10.7 (Ubuntu 10.7-0ubuntu0.18.04.1)
-- Dumped by pg_dump version 10.7 (Ubuntu 10.7-0ubuntu0.18.04.1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: -
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: -
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: clients; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.clients (
    id integer NOT NULL,
    name character varying,
    stylistid integer
);


--
-- Name: clients_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE public.clients_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- Name: clients_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE public.clients_id_seq OWNED BY public.clients.id;


--
-- Name: stylists; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.stylists (
    id integer NOT NULL,
    name character varying
);


--
-- Name: stylists_id_seq; Type: SEQUENCE; Schema: public; Owner: -
--

CREATE SEQUENCE public.stylists_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


--
-- Name: stylists_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: -
--

ALTER SEQUENCE public.stylists_id_seq OWNED BY public.stylists.id;


--
-- Name: clients id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.clients ALTER COLUMN id SET DEFAULT nextval('public.clients_id_seq'::regclass);


--
-- Name: stylists id; Type: DEFAULT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.stylists ALTER COLUMN id SET DEFAULT nextval('public.stylists_id_seq'::regclass);


--
-- Data for Name: clients; Type: TABLE DATA; Schema: public; Owner: -
--

COPY public.clients (id, name, stylistid) FROM stdin;
5	Thor	6
6	\N	13
7	\N	13
8	\N	13
9	\N	13
10	\N	13
11	\N	14
12	\N	14
13	\N	14
14	\N	14
15	Alexa	14
18	Alexa	15
23	Angel	16
25	Kylie	16
26	Roy	18
27	lexa	17
30	Kim	23
31	Jill	24
33	Harriet	24
34	home	25
35	Alexa	24
38	Roy	23
\.


--
-- Data for Name: stylists; Type: TABLE DATA; Schema: public; Owner: -
--

COPY public.stylists (id, name) FROM stdin;
23	Alex
25	Angelica
26	Alexa
27	Marion
24	Kyler
28	Mimo
\.


--
-- Name: clients_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('public.clients_id_seq', 38, true);


--
-- Name: stylists_id_seq; Type: SEQUENCE SET; Schema: public; Owner: -
--

SELECT pg_catalog.setval('public.stylists_id_seq', 28, true);


--
-- Name: clients clients_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.clients
    ADD CONSTRAINT clients_pkey PRIMARY KEY (id);


--
-- Name: stylists stylists_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.stylists
    ADD CONSTRAINT stylists_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

