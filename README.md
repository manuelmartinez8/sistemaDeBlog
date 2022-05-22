# sistemaDeBlog

Sistema desarrollado con Springboot para generar publicaciones tipo foro, y comentarios,
la misma posee una autenticacion con jwt para  autenticar los usuarios que desean interactuar con la applicacion.


Json para publicaciones 

{
    "titulo" : "API Rest en SpringBoot 8",
    "descripcion" : "En esta aplicacion encontraras desaarrollos hechos con Springboot",
    "contenido" : "JWT, Hibernate, Spring Data JPA, Mysql, Spring Security"
    }
    
    Json de Registro de usuarios
    
    {

    "nombre" : "Manuel",
    "username" : "manuelon",
    "email" : "manuelon@hotmail.com",
    "password" : "manu"
    }
    
    Json para generar el token 
    
    {
    "usernameOrEmail" : "Admin",
    "password" : "password"
}
