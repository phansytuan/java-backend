package Buoi8;

public class NhanVienThuong extends NhanVien {
    private TruongPhong truongPhongQuanLy;

    public NhanVienThuong(String maNV, String hoTen, String soDienThoai, int soNgayLam) {
        super(maNV, hoTen, soDienThoai, soNgayLam, ChucVu.NHAN_VIEN, 100);
    }

    @Override
    public double tinhLuongThang() {
        return luong1Ngay * soNgayLam;
    }

    public TruongPhong getTruongPhongQuanLy() {
        return truongPhongQuanLy;
    }

    public void setTruongPhongQuanLy(TruongPhong truongPhongQuanLy) {
        this.truongPhongQuanLy = truongPhongQuanLy;
    }
}

