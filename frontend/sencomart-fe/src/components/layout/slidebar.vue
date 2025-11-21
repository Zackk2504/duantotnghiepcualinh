<script setup lang="ts">
import { ref, onMounted } from 'vue'

interface LoaiSanPham {
  id: number
  maLoaiSanPham: string
  tenLoaiSanPham: string
  trangThai: boolean
}

const categories = ref<LoaiSanPham[]>([])

onMounted(async () => {
  try {
    const res = await fetch('http://localhost:9082/api/loai-sp')
    categories.value = await res.json()
  } catch (err) {
    console.error('Failed to fetch categories', err)
  }
})
</script>
