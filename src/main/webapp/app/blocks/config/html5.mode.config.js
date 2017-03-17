/**
 * Created by lth14 on 2017/3/17.
 */
(function() {
    'use strict';

    angular
        .module('yikatongApp')
        .config(html5ModeConfig);

    html5ModeConfig.$inject = ['$locationProvider'];

    function html5ModeConfig($locationProvider) {
        $locationProvider.html5Mode({ enabled: true, requireBase: true });
    }
})();
