import { createApp } from 'vue'
import { createPinia } from 'pinia'
import App from './App.vue'
import router from './router'
import keycloak from './keycloak/keycloak'

// Khởi tạo Keycloak trước khi mount app
keycloak.init({ onLoad: 'check-sso' })
  .then(() => {
    console.log('Authenticated?', keycloak.authenticated)
    const app = createApp(App)
    app.use(createPinia())
    app.use(router)
    app.config.globalProperties.$keycloak = keycloak
    app.mount('#app')
  })
  .catch(() => console.error('Keycloak init failed'))

