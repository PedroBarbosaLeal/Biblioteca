PGDMP           
            |         
   Biblioteca    17.0    17.0     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                           false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                           false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                           false            �           1262    33523 
   Biblioteca    DATABASE     �   CREATE DATABASE "Biblioteca" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Portuguese_Brazil.1252';
    DROP DATABASE "Biblioteca";
                     postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
                     pg_database_owner    false            �           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                        pg_database_owner    false    4            �            1259    33525    autor    TABLE     f   CREATE TABLE public.autor (
    id_autor integer NOT NULL,
    nome character varying(50) NOT NULL
);
    DROP TABLE public.autor;
       public         heap r    	   PedroLeal    false    4            �            1259    33524    autor_id_autor_seq    SEQUENCE     �   CREATE SEQUENCE public.autor_id_autor_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.autor_id_autor_seq;
       public            	   PedroLeal    false    218    4            �           0    0    autor_id_autor_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.autor_id_autor_seq OWNED BY public.autor.id_autor;
          public            	   PedroLeal    false    217            �            1259    33544 
   emprestimo    TABLE     �   CREATE TABLE public.emprestimo (
    id_emprestimo integer NOT NULL,
    livro_id integer,
    data_emprestimo character varying(8) NOT NULL,
    data_devolucao character varying(8) NOT NULL
);
    DROP TABLE public.emprestimo;
       public         heap r    	   PedroLeal    false    4            �            1259    33543    emprestimo_id_emprestimo_seq    SEQUENCE     �   CREATE SEQUENCE public.emprestimo_id_emprestimo_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 3   DROP SEQUENCE public.emprestimo_id_emprestimo_seq;
       public            	   PedroLeal    false    222    4            �           0    0    emprestimo_id_emprestimo_seq    SEQUENCE OWNED BY     ]   ALTER SEQUENCE public.emprestimo_id_emprestimo_seq OWNED BY public.emprestimo.id_emprestimo;
          public            	   PedroLeal    false    221            �            1259    33532    livro    TABLE     �   CREATE TABLE public.livro (
    id_livro integer NOT NULL,
    titulo character varying(60) NOT NULL,
    autor_id integer,
    genero character varying(30) NOT NULL
);
    DROP TABLE public.livro;
       public         heap r    	   PedroLeal    false    4            �            1259    33531    livro_id_livro_seq    SEQUENCE     �   CREATE SEQUENCE public.livro_id_livro_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.livro_id_livro_seq;
       public            	   PedroLeal    false    220    4            �           0    0    livro_id_livro_seq    SEQUENCE OWNED BY     I   ALTER SEQUENCE public.livro_id_livro_seq OWNED BY public.livro.id_livro;
          public            	   PedroLeal    false    219            +           2604    33528    autor id_autor    DEFAULT     p   ALTER TABLE ONLY public.autor ALTER COLUMN id_autor SET DEFAULT nextval('public.autor_id_autor_seq'::regclass);
 =   ALTER TABLE public.autor ALTER COLUMN id_autor DROP DEFAULT;
       public            	   PedroLeal    false    217    218    218            -           2604    33547    emprestimo id_emprestimo    DEFAULT     �   ALTER TABLE ONLY public.emprestimo ALTER COLUMN id_emprestimo SET DEFAULT nextval('public.emprestimo_id_emprestimo_seq'::regclass);
 G   ALTER TABLE public.emprestimo ALTER COLUMN id_emprestimo DROP DEFAULT;
       public            	   PedroLeal    false    222    221    222            ,           2604    33535    livro id_livro    DEFAULT     p   ALTER TABLE ONLY public.livro ALTER COLUMN id_livro SET DEFAULT nextval('public.livro_id_livro_seq'::regclass);
 =   ALTER TABLE public.livro ALTER COLUMN id_livro DROP DEFAULT;
       public            	   PedroLeal    false    219    220    220            /           2606    33530    autor autor_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.autor
    ADD CONSTRAINT autor_pkey PRIMARY KEY (id_autor);
 :   ALTER TABLE ONLY public.autor DROP CONSTRAINT autor_pkey;
       public              	   PedroLeal    false    218            3           2606    33549    emprestimo emprestimo_pkey 
   CONSTRAINT     c   ALTER TABLE ONLY public.emprestimo
    ADD CONSTRAINT emprestimo_pkey PRIMARY KEY (id_emprestimo);
 D   ALTER TABLE ONLY public.emprestimo DROP CONSTRAINT emprestimo_pkey;
       public              	   PedroLeal    false    222            1           2606    33537    livro livro_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.livro
    ADD CONSTRAINT livro_pkey PRIMARY KEY (id_livro);
 :   ALTER TABLE ONLY public.livro DROP CONSTRAINT livro_pkey;
       public              	   PedroLeal    false    220            4           2606    33538    livro fk_autor_id    FK CONSTRAINT     w   ALTER TABLE ONLY public.livro
    ADD CONSTRAINT fk_autor_id FOREIGN KEY (autor_id) REFERENCES public.autor(id_autor);
 ;   ALTER TABLE ONLY public.livro DROP CONSTRAINT fk_autor_id;
       public            	   PedroLeal    false    218    4655    220            5           2606    33550    emprestimo fk_livro_id    FK CONSTRAINT     |   ALTER TABLE ONLY public.emprestimo
    ADD CONSTRAINT fk_livro_id FOREIGN KEY (livro_id) REFERENCES public.livro(id_livro);
 @   ALTER TABLE ONLY public.emprestimo DROP CONSTRAINT fk_livro_id;
       public            	   PedroLeal    false    222    4657    220           