<h2>Datos de empleado</h2>

<table border='1'>
    <tr><th>ID: </th><td>${empleado.id}</td></tr>
    <tr><th>Nombre completo: </th><td>${empleado.nombreCompleto}</td></tr>
    <tr><th>Documento: </th><td>${empleado.documento?string[",##0"]}</td></tr>
    <tr><th>Fecha alta: </th><td>${empleado.fecha_alta}</td></tr>
</table>

<h2>Lista completa:</h2>
<ul>
    <#list lista_completa as item>
    <li>${item.id} - ${item.nombreCompleto}</li>
    </#list>
</ul>

<a href="${context_path}/empleados">Volver</a>

<style>
    table, th, td { padding: 5px; }
</style>


<table border='1'>
    <tr><th>ID: </th><td>${empleado.id}</td></tr>
    <tr><th>Nombre completo: </th><td>${empleado.nombreCompleto}</td></tr>
    <tr><th>Sucursal: </th><td>${empleado.sucursal.nombre}</td></tr>
    <tr><th>Fichadas: </th>
        <td>
            <#list empleado.fichadas as item>
            ${item.fecha_hora} - ${item.tipo_movimiento} <br>
            </#list>
        </td>
    </tr>
</table>