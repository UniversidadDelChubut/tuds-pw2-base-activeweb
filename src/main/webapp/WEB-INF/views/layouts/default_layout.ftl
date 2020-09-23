<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="${context_path}/css/estilos.css">
        <title>Proyecto Activeweb</title>
    </head>
    <body>
        <div class="header">
            <h1>Proyecto Activeweb</h1>
        </div>
        <div class="contenido">
            ${page_content?no_esc}
        </div>
        <hr>
        <#if session.nombre_usuario?has_content>
        <p>Conectado como: ${session.nombre_usuario}. <a href="${context_path}/admin/cerrar">Cerrar sesión</a></p>
        <#else>
        <p><a href="${context_path}/admin">Ingresar al área de administración</a></p>
        </#if>
    </body>
</html>
