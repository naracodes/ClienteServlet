<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastrar Clientes</title>
</head>
<body>
<div align ="center">
    <form action="cadastrar" method="post">
        <p>Digite o nome: <input type="text" name="nome" required></p>
        <p>Digite o cpf: <input type="number" name="cpf" required></p>
        <p>Tipo de conta:
            <select name="tipo">
                <option value="corrente">Conta Corrente</option>
                <option value="poupanca">Conta Poupança</option>
            </select>
        </p>
        <p><input type="submit" value="Cadastrar"></p>
    </form>
</div>
</body>
</html>
