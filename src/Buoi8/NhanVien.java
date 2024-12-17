package Buoi8;

public abstract class NhanVien {
    protected String maNV;
    protected String hoTen;
    protected String soDienThoai;
    protected int soNgayLam;
    protected double luong1Ngay;
    protected ChucVu chucVu;

    public NhanVien(String maNV, String hoTen, String soDienThoai, int soNgayLam, ChucVu chucVu, double luong1Ngay) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.soNgayLam = soNgayLam;
        this.chucVu = chucVu;
        this.luong1Ngay = luong1Ngay;
    }

    public abstract double tinhLuongThang();

    public String getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public int getSoNgayLam() {
        return soNgayLam;
    }

    public double getLuong1Ngay() {
        return luong1Ngay;
    }

    public ChucVu getChucVu() {
        return chucVu;
    }
}

