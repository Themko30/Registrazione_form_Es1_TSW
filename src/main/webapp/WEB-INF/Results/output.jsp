<jsp:useBean id="customerkey" scope="request" type="Model.Customer"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Output</title>
</head>
<body>
<h1>Output:</h1>
Nome: ${customerkey.name}<br>
Cognome: ${customerkey.surname}<br>
Genere: ${customerkey.gender}<br>
Compleanno: ${customerkey.birthday}<br>
Città: ${customerkey.city}<br>
Provincia: ${customerkey.province}<br>
Zip: ${customerkey.zipcode}<br>
Indirizzo: ${customerkey.address}<br>
Carta Identità: ${customerkey.codid}<br>
Email: ${customerkey.email}<br>
Telefono: ${customerkey.telephone}<br>
Pagina Web: ${customerkey.webPage}<br>
</body>
</html>
