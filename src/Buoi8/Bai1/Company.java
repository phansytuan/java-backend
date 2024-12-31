package Buoi8.Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company {
    private String tenCongTy;
    private String maSoThue;
    private double doanhThuThang;
    private List<NhanVien> dsNhanVien = new ArrayList<>();

    public void nhapThongTinCongTy(String ten, String mst, double doanhThu) {
        this.tenCongTy = ten;
        this.maSoThue = mst;
        this.doanhThuThang = doanhThu;
    }

    public void themNhanVien(NhanVien nv) {
        dsNhanVien.add(nv);
    }

    public void xoaNhanVien(String maNV) {
        NhanVien nvXoa = timNhanVien(maNV);
        if (nvXoa == null) {
            System.out.println("Khong tim thay nhan vien co ma: " + maNV);
            return;
        }

        if (nvXoa instanceof TruongPhong) {
            // Ngắt liên kết với nhân viên dưới quyền
            TruongPhong tp = (TruongPhong) nvXoa;
            for (NhanVienThuong nvt : tp.getDsNhanVienDuoiQuyen()) {
                nvt.setTruongPhongQuanLy(null);
            }
        }

        if (nvXoa instanceof NhanVienThuong) {
            // Nếu có trưởng phòng quản lý, xóa nv này khỏi ds của trưởng phòng
            NhanVienThuong nvt = (NhanVienThuong) nvXoa;
            if (nvt.getTruongPhongQuanLy() != null) {
                nvt.getTruongPhongQuanLy().xoaNhanVienDuoiQuyen(nvt);
            }
        }

        dsNhanVien.remove(nvXoa);
        System.out.println("Da xoa nhan vien ma " + maNV);
    }

    public void phanBoNhanVienChoTruongPhong(String maNV, String maTP) {
        NhanVien nv = timNhanVien(maNV);
        NhanVien tp = timNhanVien(maTP);

        if (nv == null || tp == null) {
            System.out.println("Khong tim thay NV hoac TP.");
            return;
        }

        if (!(nv instanceof NhanVienThuong)) {
            System.out.println("Nhan vien co ma " + maNV + " khong phai la nhan vien thuong.");
            return;
        }

        if (!(tp instanceof TruongPhong)) {
            System.out.println("Ma " + maTP + " khong phai la truong phong.");
            return;
        }

        NhanVienThuong nvt = (NhanVienThuong) nv;
        TruongPhong truongPhong = (TruongPhong) tp;

        // Xóa khỏi trưởng phòng cũ nếu có
        if (nvt.getTruongPhongQuanLy() != null) {
            nvt.getTruongPhongQuanLy().xoaNhanVienDuoiQuyen(nvt);
        }

        nvt.setTruongPhongQuanLy(truongPhong);
        truongPhong.themNhanVienDuoiQuyen(nvt);
        System.out.println("Phan bo nhan vien " + maNV + " cho truong phong " + maTP + " thanh cong.");
    }

    public double tinhTongLuong() {
        double tong = 0;
        for (NhanVien nv : dsNhanVien) {
            tong += nv.tinhLuongThang();
        }
        return tong;
    }

    public NhanVienThuong timNVThuongLuongCaoNhat() {
        NhanVienThuong max = null;
        for (NhanVien nv : dsNhanVien) {
            if (nv instanceof NhanVienThuong) {
                if (max == null || nv.tinhLuongThang() > max.tinhLuongThang()) {
                    max = (NhanVienThuong) nv;
                }
            }
        }
        return max;
    }

    public TruongPhong timTruongPhongMaxNV() {
        TruongPhong max = null;
        for (NhanVien nv : dsNhanVien) {
            if (nv instanceof TruongPhong) {
                TruongPhong tp = (TruongPhong) nv;
                if (max == null || tp.getDsNhanVienDuoiQuyen().size() > max.getDsNhanVienDuoiQuyen().size()) {
                    max = tp;
                }
            }
        }
        return max;
    }

    public void sapXepTheoTen() {
        dsNhanVien.sort(Comparator.comparing(NhanVien::getHoTen));
    }

    public void sapXepTheoLuongGiamDan() {
        dsNhanVien.sort((nv1, nv2) -> Double.compare(nv2.tinhLuongThang(), nv1.tinhLuongThang()));
    }

    public GiamDoc timGiamDocCoPhanCaoNhat() {
        GiamDoc max = null;
        for (NhanVien nv : dsNhanVien) {
            if (nv instanceof GiamDoc) {
                GiamDoc gd = (GiamDoc) nv;
                if (max == null || gd.getCoPhan() > (max == null ? -1 : max.getCoPhan())) {
                    max = gd;
                }
            }
        }
        return max;
    }

    public void tinhThuNhapChoGiamDoc() {
        double tongLuong = tinhTongLuong();
        double loiNhuan = doanhThuThang - tongLuong;
        for (NhanVien nv : dsNhanVien) {
            if (nv instanceof GiamDoc) {
                GiamDoc gd = (GiamDoc) nv;
                double thuNhap = gd.tinhThuNhap(loiNhuan);
                System.out.println("Giam doc: " + gd.getHoTen() + " (Ma: " + gd.getMaNV() + "), Thu nhap: " + thuNhap);
            }
        }
    }

    public void xuatDanhSachNhanVien() {
        System.out.printf("%-5s %-10s %-20s %-15s %-10s %-10s %-15s %-20s\n",
                "STT", "Ma NV", "Ho Ten", "Chuc Vu", "Ngay Lam", "L/Ngay", "Luong Thang", "Truong Phong");
        int stt = 1;
        for (NhanVien nv : dsNhanVien) {
            String chucVuStr = nv.getChucVu().toString();
            double luongThang = nv.tinhLuongThang();
            String tenTP = "";
            if (nv instanceof NhanVienThuong) {
                NhanVienThuong nvt = (NhanVienThuong) nv;
                if (nvt.getTruongPhongQuanLy() != null) {
                    tenTP = nvt.getTruongPhongQuanLy().getHoTen();
                }
            }
            System.out.printf("%-5d %-10s %-20s %-15s %-10d %-10.2f %-15.2f %-20s\n",
                    stt++, nv.getMaNV(), nv.getHoTen(), chucVuStr, nv.getSoNgayLam(), nv.getLuong1Ngay(), luongThang, tenTP);
        }
    }

    public NhanVien timNhanVien(String maNV) {
        for (NhanVien nv : dsNhanVien) {
            if (nv.getMaNV().equalsIgnoreCase(maNV)) {
                return nv;
            }
        }
        return null;
    }

    public double getDoanhThuThang() {
        return doanhThuThang;
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public String getMaSoThue() {
        return maSoThue;
    }
}
