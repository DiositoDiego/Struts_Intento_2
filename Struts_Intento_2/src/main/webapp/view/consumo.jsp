<%--
  Created by IntelliJ IDEA.
  User: papas
  Date: 31/08/2023
  Time: 04:35 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.8.2/angular.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/app.js"></script>
    <script src="${pageContext.request.contextPath}/js/controller.js"></script>
    <title>Document</title>
</head>
<body ng-app="AppTaller" ng-controller="primerController">

<h1>Hola mundo</h1>
<h2 ng-bind="persona.nombre"></h2>
<h2>{{persona.apellido}}</h2>
<button ng-click="presentate()">Has click</button>
<br>
<input type="text" ng-model="valorCambiando" ng-change="cambioTexto()"/>
<br>
<label>{{fechaHoy | date: mediumDate}}</label>
<br>
<h3>Lista de Personas:</h3>
<ul>
    <li ng-repeat="persona in personas">
        {{ persona }}
    </li>
</ul>

<form>
    <label>Nombre</label>
    <input ng-model="person.name" />
    <br>
    <label>Apellido paterno</label>
    <input ng-model="person.lastname" />
    <br>
    <label>Apellido materno</label>
    <input ng-model="person.surname" />
    <br>
    <label>Fecha de cumpleaños</label>
    <input ng-model="person.birthdate" />
    <br>
    <label>Genero</label>
    <input ng-model="person.gender" />
    <br>
    <button ng-click="addPerson()">Agregar</button>
    {{person}}
</form>
</body>
</html>
