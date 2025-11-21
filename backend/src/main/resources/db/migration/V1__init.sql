CREATE TABLE dia_chi (
                         id SERIAL PRIMARY KEY,
                         so_nha VARCHAR(255),
                         quan_huyen_xa_thanh_pho VARCHAR(255)
);

-- ========================
-- BẢNG KHÁCH HÀNG
-- ========================
CREATE TABLE khach_hang (
                            id SERIAL PRIMARY KEY,
                            ho_ten VARCHAR(100),
                            gioi_tinh VARCHAR(10),
                            so_dt VARCHAR(20),
                            email VARCHAR(100),
                            ngay_sinh DATE,
                            ten_dang_nhap VARCHAR(50),
                            mat_khau VARCHAR(100),
                            trang_thai BOOLEAN DEFAULT TRUE,
                            id_dia_chi INT,
                            FOREIGN KEY (id_dia_chi) REFERENCES dia_chi(id)
);

-- ========================
-- BẢNG NHÂN VIÊN
-- ========================
CREATE TABLE nhan_vien (
                           id SERIAL PRIMARY KEY,
                           vai_tro VARCHAR(50),
                           ho_ten VARCHAR(100),
                           gioi_tinh VARCHAR(10),
                           ngay_sinh DATE,
                           so_dt VARCHAR(20),
                           email VARCHAR(100),
                           dia_chi VARCHAR(255),
                           ten_dang_nhap VARCHAR(50),
                           mat_khau VARCHAR(100),
                           trang_thai BOOLEAN DEFAULT TRUE
);

-- ========================
-- BẢNG VOUCHER
-- ========================
CREATE TABLE voucher (
                         id SERIAL PRIMARY KEY,
                         ma_voucher VARCHAR(50),
                         ten_voucher VARCHAR(100),
                         gia_tri_voucher NUMERIC(10,2),
                         gia_tri_toi_da_voucher NUMERIC(10,2),
                         gia_tri_toi_thieu_ap_dung NUMERIC(10,2),
                         so_luong_voucher INT,
                         so_luong_con_lai INT,
                         ngay_bat_dau DATE,
                         ngay_ket_thuc DATE,
                         mo_ta TEXT,
                         hinh_thuc_giam VARCHAR(50),
                         trang_thai BOOLEAN DEFAULT TRUE
);

-- ========================
-- BẢNG HÓA ĐƠN
-- ========================
CREATE TABLE hoa_don (
                         id SERIAL PRIMARY KEY,
                         id_khach_hang INT,
                         id_nhan_vien INT,
                         id_voucher INT,
                         gia_tri_thanh_toan NUMERIC(10,2),
                         thanh_tien NUMERIC(10,2),
                         hinh_thuc_thanh_toan VARCHAR(50),
                         trang_thai_hoa_don VARCHAR(50),
                         dia_chi_nhan_hang VARCHAR(255),
                         ten_nguoi_nhan VARCHAR(100),
                         sdt_nguoi_nhan VARCHAR(20),
                         loai_hoa_don VARCHAR(50),
                         ghi_chu TEXT,
                         ten_nguoi_mua VARCHAR(100),
                         sdt_nguoi_mua VARCHAR(20),
                         ngay_tao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                         tien_tra_sau NUMERIC(10,2),
                         FOREIGN KEY (id_khach_hang) REFERENCES khach_hang(id),
                         FOREIGN KEY (id_nhan_vien) REFERENCES nhan_vien(id),
                         FOREIGN KEY (id_voucher) REFERENCES voucher(id)
);

-- ========================
-- BẢNG LỊCH SỬ HÓA ĐƠN
-- ========================
CREATE TABLE lich_su_hoa_don (
                                 id SERIAL PRIMARY KEY,
                                 trang_thai_cu VARCHAR(50),
                                 trang_thai_moi VARCHAR(50),
                                 ngay_cap_nhat TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                                 nguoi_cap_nhat VARCHAR(100),
                                 ghi_chu TEXT,
                                 id_hoa_don INT,
                                 FOREIGN KEY (id_hoa_don) REFERENCES hoa_don(id)
);

-- ========================
-- BẢNG LOẠI SẢN PHẨM
-- ========================
CREATE TABLE loai_san_pham (
                               id SERIAL PRIMARY KEY,
                               ma_loai_san_pham VARCHAR(50),
                               ten_loai_san_pham VARCHAR(100),
                               trang_thai BOOLEAN DEFAULT TRUE
);

-- ========================
-- BẢNG XUẤT XỨ
-- ========================
CREATE TABLE xuat_xu (
                         id SERIAL PRIMARY KEY,
                         ma_xuat_xu VARCHAR(50),
                         noi_xuat_xu VARCHAR(100),
                         trang_thai BOOLEAN DEFAULT TRUE
);

-- ========================
-- BẢNG MÀU SẮC
-- ========================
CREATE TABLE mau_sac (
                         id SERIAL PRIMARY KEY,
                         ma_mau_sac VARCHAR(50),
                         ten_mau_sac VARCHAR(50),
                         trang_thai BOOLEAN DEFAULT TRUE
);

-- ========================
-- BẢNG SIZE
-- ========================
CREATE TABLE size (
                      id SERIAL PRIMARY KEY,
                      ma_size VARCHAR(50),
                      ten_size VARCHAR(50),
                      trang_thai BOOLEAN DEFAULT TRUE
);

-- ========================
-- BẢNG SẢN PHẨM
-- ========================
CREATE TABLE san_pham (
                          id SERIAL PRIMARY KEY,
                          id_loai_san_pham INT,
                          id_xuat_xu INT,
                          ma_san_pham VARCHAR(50),
                          ten_san_pham VARCHAR(100),
                          mo_ta TEXT,
                          trang_thai BOOLEAN DEFAULT TRUE,
                          FOREIGN KEY (id_loai_san_pham) REFERENCES loai_san_pham(id),
                          FOREIGN KEY (id_xuat_xu) REFERENCES xuat_xu(id)
);

-- ========================
-- BẢNG ẢNH SẢN PHẨM
-- ========================
CREATE TABLE anh_san_pham (
                              id SERIAL PRIMARY KEY,
                              id_san_pham INT,
                              url TEXT,
                              FOREIGN KEY (id_san_pham) REFERENCES san_pham(id)
);

-- ========================
-- BẢNG SẢN PHẨM CHI TIẾT
-- ========================
CREATE TABLE san_pham_chi_tiet (
                                   id SERIAL PRIMARY KEY,
                                   id_san_pham INT,
                                   id_mau_sac INT,
                                   id_phien_ban INT,
                                   anh_sp TEXT,
                                   so_luong_ton INT,
                                   don_gia NUMERIC(10,2),
                                   mo_ta TEXT,
                                   trang_thai BOOLEAN DEFAULT TRUE,
                                   FOREIGN KEY (id_san_pham) REFERENCES san_pham(id),
                                   FOREIGN KEY (id_mau_sac) REFERENCES mau_sac(id),
                                   FOREIGN KEY (id_phien_ban) REFERENCES size(id)
);

-- ========================
-- BẢNG GIỎ HÀNG
-- ========================
CREATE TABLE gio_hang (
                          id SERIAL PRIMARY KEY,
                          id_khach_hang INT,
                          ngay_tao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                          ngay_cap_nhat TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                          FOREIGN KEY (id_khach_hang) REFERENCES khach_hang(id)
);

-- ========================
-- BẢNG GIỎ HÀNG CHI TIẾT
-- ========================
CREATE TABLE gio_hang_chi_tiet (
                                   id SERIAL PRIMARY KEY,
                                   id_gio_hang INT,
                                   id_san_pham_chi_tiet INT,
                                   so_luong INT,
                                   FOREIGN KEY (id_gio_hang) REFERENCES gio_hang(id),
                                   FOREIGN KEY (id_san_pham_chi_tiet) REFERENCES san_pham_chi_tiet(id)
);

-- ========================
-- BẢNG HÓA ĐƠN CHI TIẾT
-- ========================
CREATE TABLE hoa_don_chi_tiet (
                                  id SERIAL PRIMARY KEY,
                                  id_hoa_don INT,
                                  id_san_pham_chi_tiet INT,
                                  so_luong INT,
                                  don_gia NUMERIC(10,2),
                                  FOREIGN KEY (id_hoa_don) REFERENCES hoa_don(id),
                                  FOREIGN KEY (id_san_pham_chi_tiet) REFERENCES san_pham_chi_tiet(id)
);