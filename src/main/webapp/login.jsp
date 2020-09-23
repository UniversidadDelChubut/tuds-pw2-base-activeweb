<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html"%>
<html>
    <head>
        <title>Login local</title>
        <link href="<c:url value="/css/estilos.css"/>" rel="stylesheet"/>
    </head>
    <body>
        <h1>Iniciar sesión</h1>
        
        <form name="j_security_form" method="post" action="j_security_check">
            <p>Usuario: <input type="text" name="j_username"></p>
            <p>Clave: <input type="password" name="j_password"></p>
                                    
            <p><button type="submit">Ingresar</button></p>
        </form>
        <hr>
        <a href="<c:url value="/home/index"/>">Volver al área pública</a>
    </body>
</html>