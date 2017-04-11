/**
 * Created by bisaibang-player on 2017/4/11.
 */
(function() {
    'use strict';

    angular
        .module('yikatongApp')
        .config(stateConfig);

    stateConfig.$inject = ['$stateProvider'];

    function stateConfig($stateProvider) {
        $stateProvider.state('rfid', {
            parent: 'app',
            url: '/rfid',
            data: {
                authorities: []
            },
            views: {
                'content@': {
                    templateUrl: 'app/rfid/rfid.html',
                    controller: 'RfidController',
                    controllerAs: 'vm'
                }
            },
            resolve: {

            }
        });
    }
})();
