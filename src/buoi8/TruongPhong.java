package buoi8;

import java.util.ArrayList;
import java.util.List;

public class TruongPhong extends NhanVien {
    private List<NhanVienThuong> dsNhanVienDuoiQuyen;

    public TruongPhong(String maNV, String hoTen, String soDienThoai, int soNgayLam) {
        super(maNV, hoTen, soDienThoai, soNgayLam, ChucVu.TRUONG_PHONG, 200);
        dsNhanVienDuoiQuyen = new ArrayList<>();
    }

    @Override
    public double tinhLuongThang() {
        return luong1Ngay * soNgayLam + 100 * dsNhanVienDuoiQuyen.size();
    }

    public void themNhanVienDuoiQuyen(NhanVienThuong nv) {
        dsNhanVienDuoiQuyen.add(nv);
    }

    public void xoaNhanVienDuoiQuyen(NhanVienThuong nv) {
        dsNhanVienDuoiQuyen.remove(nv);
    }

    public List<NhanVienThuong> getDsNhanVienDuoiQuyen() {
        return dsNhanVienDuoiQuyen;
    }
}

