<h2>Listado de empleados</h2>

<table border='1'>
    <tr>
        <th>ID</th>
        <th>Nombre completo</th>
        <th>Último movimiento</th>
        <th></th>
    </tr>
    <#list filas as item>
    <tr>
        <td>${item.id}</td>
        <td>${item.nombre_completo}</td>
        <td>${item.tipo_movimiento!''} - ${item.fecha_hora!''}</td>
        <td><a href="${context_path}/empleados/ver/${item.id}">Ver datos</a></td>
    </tr>
    </#list>
</table>

<style>
    table, th, td { padding: 5px; }
</style>