<template>
  <header class="bg-white shadow">
    <div class="max-w-7xl mx-auto px-4 py-2 flex items-center justify-between">
      <div class="flex items-center gap-4">
        <!-- <img src="/logo.png" alt="Sencomart" class="w-32" /> -->
        <select class="border rounded px-2 py-1 text-sm">
          <option>Tiếng Việt</option>
          <option>English</option>
        </select>
      </div>

      <div class="flex-1 mx-4">
        <div class="flex border rounded overflow-hidden">
          <input
            type="text"
            placeholder="Tôi đang tìm mua..."
            class="flex-1 px-3 py-2 outline-none"
          />
          <button class="bg-red-600 text-white px-4">Tìm</button>
        </div>
      </div>

      <div class="flex items-center gap-6 text-sm">
<a href="#" class="hover:text-red-600" @click.prevent="handleAuth">
    {{ isAuthenticated ? 'Đăng xuất' : 'Đăng nhập' }}
  </a>        <a href="#" class="hover:text-red-600">Đăng ký</a>
        <a href="#" class="hover:text-red-600">Giỏ hàng (0)</a>
      </div>
    </div>
  </header>
</template>
<script setup lang="ts">
import { computed, getCurrentInstance } from 'vue'

const { appContext } = getCurrentInstance()!
const keycloak = appContext.config.globalProperties.$keycloak

const isAuthenticated = computed(() => keycloak.authenticated)

const handleAuth = () => {
  if (!keycloak.authenticated) {
    keycloak.login()  // redirect Keycloak login
  } else {
    keycloak.logout({ redirectUri: window.location.origin }) // hoặc redirect tới trang đăng ký
  }
}
</script>