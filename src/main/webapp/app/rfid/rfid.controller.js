/**
 * Created by bisaibang-player on 2017/4/11.
 */
(function() {
    'use strict';

    angular
        .module('yikatongApp')
        .controller('RfidController', RfidController);

    RfidController.$inject = ['$scope', 'Principal', 'LoginService', '$state'];

    function RfidController ($scope, Principal, LoginService, $state) {
        var vm = this;

        vm.isLost = 0;

    }
})();
