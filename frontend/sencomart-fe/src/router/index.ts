import { createRouter, createWebHistory } from 'vue-router'
import DefaultLayout from '@/layouts/DefaultLayout.vue'
import Home from '@/modules/user/pages/Home.vue'
import ProductDetail from '@/modules/user/pages/ProductDetail.vue'
// import Category from '@/modules/user/pages/Category.vue'
// import Cart from '@/modules/user/pages/Cart.vue'
// import Login from '@/modules/user/pages/Login.vue'

const routes = [
  {
    path: '/',
    component: DefaultLayout,
    children: [
      { path: '', name: 'home', component: Home, meta: { requiresAuth: false } },
      { path: 'spct', name: 'spct', component: ProductDetail, meta: { requiresAuth: true } },
      // các route khác...
    ],
  },
]


const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes,
})

export default router
