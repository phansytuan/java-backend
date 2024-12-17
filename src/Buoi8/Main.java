package Buoi8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("========== MENU ==========");
            System.out.println("1. Nhap thong tin cong ty");
            System.out.println("2. Phan bo nhan vien vao truong phong");
            System.out.println("3. Them nhan vien");
            System.out.println("4. Xoa nhan vien");
            System.out.println("5. Xuat thong tin toan bo nhan vien");
            System.out.println("6. Tinh va xuat tong luong toan cong ty");
            System.out.println("7. Tim nhan vien thuong co luong cao nhat");
            System.out.println("8. Tim truong phong co so luong nhan vien duoi quyen nhieu nhat");
            System.out.println("9. Sap xep nhan vien toan cong ty theo ten ABC");
            System.out.println("10. Sap xep nhan vien toan cong ty theo luong giam dan");
            System.out.println("11. Tim giam doc co co phan nhieu nhat");
            System.out.println("12. Tinh va xuat tong thu nhap cua tung giam doc");
            System.out.println("13. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: {
                    System.out.print("Nhap ten cong ty: ");
                    String ten = sc.nextLine();
                    System.out.print("Nhap ma so thue: ");
                    String mst = sc.nextLine();
                    System.out.print("Nhap doanh thu thang: ");
                    double dt = Double.parseDouble(sc.nextLine());
                    company.nhapThongTinCongTy(ten, mst, dt);
                    System.out.println("Da nhap thong tin cong ty.");
                    break;
                }
                case 2: {
                    System.out.print("Nhap ma nhan vien thuong: ");
                    String maNV = sc.nextLine();
                    System.out.print("Nhap ma truong phong: ");
                    String maTP = sc.nextLine();
                    company.phanBoNhanVienChoTruongPhong(maNV, maTP);
                    break;
                }
                case 3: {
                    System.out.print("Nhap ma nhan vien: ");
                    String maNV = sc.nextLine();
                    System.out.print("Nhap ho ten: ");
                    String hoTen = sc.nextLine();
                    System.out.print("Nhap so dien thoai: ");
                    String sdt = sc.nextLine();
                    System.out.print("Nhap so ngay lam: ");
                    int soNgayLam = Integer.parseInt(sc.nextLine());
                    System.out.println("Chon chuc vu: 1-Giam doc, 2-Truong phong, 3-Nhan vien thuong");
                    int cv = Integer.parseInt(sc.nextLine());
                    switch (cv) {
                        case 1: {
                            System.out.print("Nhap co phan (vd 0.2 = 20%): ");
                            double cp = Double.parseDouble(sc.nextLine());
                            GiamDoc gd = new GiamDoc(maNV, hoTen, sdt, soNgayLam, cp);
                            company.themNhanVien(gd);
                            System.out.println("Da them giam doc.");
                            break;
                        }
                        case 2: {
                            TruongPhong tp = new TruongPhong(maNV, hoTen, sdt, soNgayLam);
                            company.themNhanVien(tp);
                            System.out.println("Da them truong phong.");
                            break;
                        }
                        case 3: {
                            NhanVienThuong nvt = new NhanVienThuong(maNV, hoTen, sdt, soNgayLam);
                            company.themNhanVien(nvt);
                            System.out.println("Da them nhan vien thuong.");
                            break;
                        }
                        default:
                            System.out.println("Chuc vu khong hop le.");
                    }
                    break;
                }
                case 4: {
                    System.out.print("Nhap ma nhan vien can xoa: ");
                    String maNV = sc.nextLine();
                    company.xoaNhanVien(maNV);
                    break;
                }
                case 5: {
                    System.out.println("Danh sach nhan vien trong cong ty:");
                    company.xuatDanhSachNhanVien();
                    break;
                }
                case 6: {
                    double tongLuong = company.tinhTongLuong();
                    System.out.println("Tong luong toan cong ty: " + tongLuong);
                    break;
                }
                case 7: {
                    NhanVienThuong nvt = company.timNVThuongLuongCaoNhat();
                    if (nvt == null) {
                        System.out.println("Khong co nhan vien thuong nao.");
                    } else {
                        System.out.println("Nhan vien thuong luong cao nhat: " + nvt.getHoTen()
                                + " (Luong: " + nvt.tinhLuongThang() + ")");
                    }
                    break;
                }
                case 8: {
                    TruongPhong tp = company.timTruongPhongMaxNV();
                    if (tp == null) {
                        System.out.println("Khong co truong phong nao.");
                    } else {
                        System.out.println("Truong phong quan ly nhieu nhan vien nhat: " + tp.getHoTen()
                                + " (So NV: " + tp.getDsNhanVienDuoiQuyen().size() + ")");
                    }
                    break;
                }
                case 9: {
                    company.sapXepTheoTen();
                    System.out.println("Da sap xep theo ten (ABC).");
                    break;
                }
                case 10: {
                    company.sapXepTheoLuongGiamDan();
                    System.out.println("Da sap xep theo luong giam dan.");
                    break;
                }
                case 11: {
                    GiamDoc gd = company.timGiamDocCoPhanCaoNhat();
                    if (gd == null) {
                        System.out.println("Khong co giam doc nao.");
                    } else {
                        System.out.println("Giam doc co co phan cao nhat: " + gd.getHoTen()
                                + " (Co phan: " + (gd.getCoPhan()*100) + "%)");
                    }
                    break;
                }
                case 12: {
                    System.out.println("Tong thu nhap cua tung giam doc:");
                    company.tinhThuNhapChoGiamDoc();
                    break;
                }
                case 13: {
                    System.out.println("Thoat chuong trinh.");
                    break;
                }
                default:
                    System.out.println("Lua chon khong hop le.");
            }

        } while (choice != 13);
        sc.close();
    }
}

