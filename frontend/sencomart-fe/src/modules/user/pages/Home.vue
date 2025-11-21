<template>
  <div class="flex max-w-7xl mx-auto mt-6 gap-4">
    <Sidebar />

    <div class="flex-1">
      <!-- Banner -->
      <img src="D:\duantotnghiep\duancuabelink\frontend\sencomart-fe\src\assets\images\banner.jpg" alt="Banner" class="w-full rounded-md shadow" />

      <!-- Danh mục -->
      <div class="grid grid-cols-4 gap-4 mt-6">
        <div v-for="i in 8" :key="i" class="text-center bg-white p-3 rounded shadow hover:scale-105 transition">
          <img :src="`/sample-${i}.jpg`" class="h-24 w-full object-cover rounded" />
          <p class="mt-2 font-medium">Danh mục {{ i }}</p>
        </div>
      </div>

      <!-- Sản phẩm nổi bật -->
      <div class="mt-8">
        <h2 class="bg-green-500 text-white px-4 py-2 font-bold">Sản phẩm nổi bật</h2>
        <div class="grid grid-cols-4 gap-4 mt-4">
          <div v-for="i in 8" :key="i" class="bg-white rounded shadow p-3">
            <img :src="`/sp-${i}.jpg`" class="h-32 w-full object-cover rounded" />
            <p class="mt-2 text-sm font-medium">Sản phẩm {{ i }}</p>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import Sidebar from '@/components/layout/slidebar.vue'
</script>
