<h2>Listado de empleados</h2>

<table border='1'>
    <tr>
        <th>ID</th>
        <th>Nombre completo</th>
        <th>Sucursal</th>
    </tr>
    <#list filas as item>
    <tr>
        <td>${item.id}</td>
        <td>${item.nombreCompleto}</td>
        <td>${item.sucursal.nombre}</td>
    </tr>
    </#list>
</table>



<style>
    table, th, td { padding: 5px; }
</style>