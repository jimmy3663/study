
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/OrderManager"

import DeliveryManager from "./components/DeliveryManager"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/Order',
                name: 'OrderManager',
                component: OrderManager
            },

            {
                path: '/Delivery',
                name: 'DeliveryManager',
                component: DeliveryManager
            },



    ]
})
