<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--<h1>Hello, ${kek} </h1>--%>
<%--<p>--%>
    <%--Today's date: <%= (new java.util.Date()).toString()%>--%>
<%--</p>--%>
<style>
    .edit {
        border:1px solid #9E9E9E;
        color: #000000;
        padding: 3px;
        margin-top: 2px;
        margin-bottom: 2px;
        font-size: 11px;
        font-family: Verdana;
        background: #FFF;
    }
    input[type="text"] {
        border: 1px solid #cccccc; //цвет рамки
    border-radius: 3px; //закругление углов (общее)
    -webkit-border-radius: 3px; //закругление углов (Google Chrome)
    -moz-border-radius: 3px; //закругление углов (FireFox)
    -khtml-border-radius: 3px; //закругление углов (Safari)
    background: #ffffff !important; // желательно прописывать, так как в Chrome при сохранных данных оно может быть желтым
    outline: none; // удаляет обводку в браузерах хром(желтая) и сафари(синяя)
    height: 24px; // высота на свое усмотрение
    width: 120px; // ширина на свое усмотрение
    color: #cccccc; //цвет шрифта в обычном состоянии
    font-size: 11px; // Размер шрифта
    font-family: Tahoma; // Стиль шрифта
    }


</style>
<form action="" method="post">
    Name:<input type="text" name="username"/><br/><br/>
    Password:<input  type="password" name="userpass"/><br/><br/>
    <input type="submit" value="login"/>
    <input type="reset" value="reset"/>
</form>

