# RETO2 – 3-WAN

# SPRINT 1 LMSGI

Pagina web de RocktheSport.

## Contenido

La web está en la carpeta [SPRINT1LMSGI/](SPRINT1LMSGI/):

- [estructura.html](SPRINT1LMSGI/estructura.html): estructura base.
- [Productos.html](SPRINT1LMSGI/Productos.html): página de productos. (Falta añadir esto al esquema de la BBDD -- Rodrigo) 
- [Eventos.html](SPRINT1LMSGI/Eventos.html): página de eventos.
- [iniciar sesion.html](SPRINT1LMSGI/iniciar%20sesion.html): formulario de inicio de sesión.
- [procesar-formulario.html](SPRINT1LMSGI/procesar-formulario.html): procesado del formulario.

Estilos en [SPRINT1LMSGI/css/](SPRINT1LMSGI/css/):

- [stylessprint.css](SPRINT1LMSGI/css/stylessprint.css)
- [Productos.css](SPRINT1LMSGI/css/Productos.css)
- [eventos.css](SPRINT1LMSGI/css/eventos.css)
- [iniciarSesion.css](SPRINT1LMSGI/css/iniciarSesion.css)
- [formulario.css](SPRINT1LMSGI/css/formulario.css)

Recursos:

- [SPRINT1LMSGI/img/](SPRINT1LMSGI/img/)
- [SPRINT1LMSGI/js/](SPRINT1LMSGI/js/) (vacía por ahora debido que al momento no tenemos planificacion creada -- Rodrigo)

## Ejecutar

Al ser HTML/CSS, basta con abrir los archivos `.html` en el navegador.

Recomendado desde VS Code: abrir [estructura.html](SPRINT1LMSGI/estructura.html) y usar una extensión tipo Live Server.

## Notas

- Seguramente se añada Boostrap a la pagina esta estara como CDN en los html -- Rodrigo
- El JavaScript irá en [SPRINT1LMSGI/js/](SPRINT1LMSGI/js/) cuando se añada.

# SPRINT 1 PROGRAM

Ejercicios de consola en Java para el RETO2 (Sprint 1). Tiene **inicio de sesión**, **registro** y **menús** para administrador y usuario final.

## Contenido

Los programas están en la carpeta [SPRINT1PROGRAM/](SPRINT1PROGRAM/):

- [Inicio_de_sesion.java](SPRINT1PROGRAM/Inicio_de_sesion.java): login (usuarios/contraseñas en memoria).
- [Registro.java](SPRINT1PROGRAM/Registro.java): registro (alta simple en memoria).
- [MenuPrincipalAdministrador.java](SPRINT1PROGRAM/MenuPrincipalAdministrador.java): menú de administración.
- [MenuPrincipalUsuarioFinal.java](SPRINT1PROGRAM/MenuPrincipalUsuarioFinal.java): menú de usuario final.

## Ejecutar

Estos archivos usan el paquete `RETO2.SPRINT1PROGRAM`, así que lo más simple es compilar y ejecutar desde la carpeta **padre** del repositorio. (con padre me refiero a la carpeta anterior para hacerlo en Eclipse -- Rodrigo)

## Notas

- Los datos (usuarios, contraseñas, etc.) se guardan en la memoria (Mas tarde nos pediran BBDD -- Rodrigo)
- Imports:

- **Arraylist**
- **Scanner**
