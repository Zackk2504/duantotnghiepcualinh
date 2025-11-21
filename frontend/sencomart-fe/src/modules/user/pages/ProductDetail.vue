<template>
  <div class="max-w-6xl mx-auto py-10 px-4">
    <div class="grid grid-cols-1 md:grid-cols-2 gap-10">

      <!-- Hình ảnh sản phẩm -->
      <div>
        <img
          src="D:\duantotnghiep\duancuabelink\frontend\sencomart-fe\src\assets\images\OIP.webp"
          alt="Máy phun khói BF150"
          class="w-full rounded-lg shadow-md"
        />
        <div class="flex gap-3 mt-3">
          <img src="D:\duantotnghiep\duancuabelink\frontend\sencomart-fe\src\assets\images\OIP.webp" class="w-20 h-20 border rounded cursor-pointer hover:ring-2 ring-blue-500" />
          <img src="D:\duantotnghiep\duancuabelink\frontend\sencomart-fe\src\assets\images\OIP.webp" class="w-20 h-20 border rounded cursor-pointer hover:ring-2 ring-blue-500" />
          <img src="D:\duantotnghiep\duancuabelink\frontend\sencomart-fe\src\assets\images\OIP.webp" class="w-20 h-20 border rounded cursor-pointer hover:ring-2 ring-blue-500" />
        </div>
      </div>

      <!-- Thông tin sản phẩm -->
      <div>
        <h1 class="text-2xl font-semibold text-gray-800">
          Máy phun khói BF150 Hàn Quốc - Diệt trừ sâu bệnh & khử trùng trang trại
        </h1>

        <div class="mt-2 text-green-600 font-medium">Còn hàng</div>

        <div class="mt-4">
          <span class="text-gray-600">Giá bán:</span>
          <span class="text-red-600 text-3xl font-bold ml-2">17,000,000₫</span>
        </div>

        <div class="mt-4">
          <div class="mb-2 text-gray-600 font-medium">Kích thước:</div>
          <div class="inline-block border rounded px-3 py-1 text-sm bg-gray-50">
            130X20X30
          </div>
        </div>

        <div class="mt-4">
          <div class="mb-2 text-gray-600 font-medium">Màu sắc:</div>
          <div class="flex items-center space-x-3">
            <div class="w-6 h-6 rounded-full border-2 border-gray-400 bg-gray-300"></div>
          </div>
        </div>

        <div class="mt-6 flex items-center space-x-4">
          <span class="text-gray-700 font-medium">Số lượng:</span>
          <input
            type="number"
            value="1"
            class="w-20 border rounded-md px-2 py-1 text-center focus:ring focus:ring-blue-200"
          />
        </div>

        <div class="mt-8 flex gap-4">
          <button
            class="bg-red-600 text-white font-semibold px-6 py-3 rounded hover:bg-red-700 transition"
          >
            Mua Ngay
          </button>
          <button
            class="bg-orange-500 text-white font-semibold px-6 py-3 rounded hover:bg-orange-600 transition"
          >
            Thêm Vào Giỏ Hàng
          </button>
        </div>

        <div class="mt-8 border-t pt-4 text-sm text-gray-500">
          <p>Đảm bảo người bán: Người bán đã được xác minh</p>
          <div class="flex items-center mt-3 space-x-2">
            <img src="" alt="Thanh toán" class="h-6" />
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
// Hiện tại là trang tĩnh, sau này bạn có thể truyền props như:
// defineProps({ product: Object })
</script>
