<h2>Datos de empleado</h2>

<table border='1'>
    <tr><th>ID: </th><td>${empleado.id}</td></tr>
    <tr><th>Nombre completo: </th><td>${empleado.nombre} ${empleado.apellido}</td></tr>
    <tr><th>Documento: </th><td>${empleado.documento?string[",##0"]}</td></tr>
    <tr><th>Fecha alta: </th><td>${empleado.fecha_alta}</td></tr>
</table>

<a href="${context_path}/empleados">Volver</a>

<style>
    table, th, td { padding: 5px; }
</style>