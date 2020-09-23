<h2>Ejemplo de autenticación</h2>
<h4>Administración</h4>
<p>Este es el área de administración. Sólo los usuarios con rol "administrador" pueden acceder.</p>
<#if session.puede_acceder_area_restringida!false>
<a href="${context_path}/admin/restringido">Ir a área restringida</a>
</#if>