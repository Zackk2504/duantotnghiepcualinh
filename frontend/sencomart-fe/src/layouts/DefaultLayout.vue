<template>
  <div class="flex flex-col min-h-screen bg-gray-50">
    <Header />
    <main class="flex-grow">
      <RouterView />
    </main>
    <Footer />
  </div>
</template>

<script setup>
import Header from '@/components/layout/Header.vue'
import Footer from '@/components/layout/Footer.vue'
import { RouterView } from 'vue-router'
</script>

