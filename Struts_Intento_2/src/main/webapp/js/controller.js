app.controller('primerController', [
    '$scope',
    '$http',
    '$filter',
    function($scope, $http, $filter){

        var prev = "http://localhost:8080/Struts_Intento_2";

        $scope.fechaHoy = new Date();
        $scope.personas = [];
        $scope.persona = {};
        $scope.persona.nombre = "Diego";
        $scope.persona.apellido = "Albabera";

        $scope.person = {};

        $scope.presentate = () => {
            alert(`${$scope.persona.nombre} ${$scope.persona.apellido}`);
        }

        $scope.valorCambiando="";
        $scope.cambioTexto = (value) => {
            alert('pasa algo ' + value);
        }

        $http({
            method:'GET',
            url: `${prev}/getAllPeople`,
        }).then(function(response){
            console.log(response.data);
            $scope.personas = response.data.personas;
        }).catch((error) => {
            console.log(error);
        })

        $scope.addPerson = () => {
            console.log("PERSONA", $scope.person);
            $http({
                method: 'POST',
                url: `${prev}/createPerson`,
                data: `data=${angular.toJson($scope.person)}`
            }).then((response) => {
                console.log(response);
                alert('apocositilin');
            })
        }
    }]);