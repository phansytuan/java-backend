package buoi4;
/**
 Bài tập Java
 Cho chuỗi:
 Ngôn ngữ lập trình Java ban đầu được phát triển bởi Sun Microsystems do James Gosling khởi xướng và phát hành vào năm 1995. Phiên bản mới nhất của Java Standard Edition là Java SE 8. Với sự tiến bộ của Java và sự phổ biến rộng rãi của nó, nhiều cấu hình đã được xây dựng để phù hợp với nhiều loại nền tảng khác nhau. Ví dụ: J2EE cho các ứng dụng doanh nghiệp, J2ME cho các ứng dụng di động.

 a) Đếm số lượng từng từ trong đoạn trên (không phân biệt hoa thường):
 Ví dụ ta có chuỗi “Tôi học lập trình, học lập trình rất hay”
 Kết quả từ
 Tôi : 1 từ
 Học : 2 từ
 Lập: 2 từ
 Trình: 2 từ
 Rất: 1 từ
 Hay: 1 từ
 */

public class Bai1mrKien {

    public static void main(String[] args) {
        String str2 = "Ngôn ngữ lập trình Java ban đầu được phát triển bởi Sun Microsystems do James Gosling khởi xướng và phát hành vào năm 1995. Phiên bản mới nhất của Java Standard Edition là Java SE 8. Với sự tiến bộ của Java và sự phổ biến rộng rãi của nó, nhiều cấu hình đã được xây dựng để phù hợp với nhiều loại nền tảng khác nhau. Ví dụ: J2EE cho các ứng dụng doanh nghiệp, J2ME cho các ứng dụng di động.";

        // Gọi hàm đếm số lượng từ trong chuỗi
        demSoLuongTu(str2);
    }

    /**
     * Phương thức xóa các ký tự đặc biệt (.,;:) trong một mảng
     * để thuận tiện cho việc so sánh từ (tránh sai sót do dấu câu).
     * @param arrStr Mảng các từ cần lọc bỏ ký tự đặc biệt
     */
    public static void xoaKyTuDacBiet(String[] arrStr){
        for (int i = 0; i < arrStr.length; i++) {
            // Lần lượt thay thế các dấu . ; : , bằng chuỗi rỗng, sau đó trim() để xóa khoảng trắng thừa
            String str = arrStr[i].replace(".", "")
                    .replace(";", "")
                    .replace(":", "")
                    .replace(",", "")
                    .trim(); // cắt bỏ tất cả khoảng trắng
            arrStr[i] = str;
        }
    }

    /**
     * Phương thức đếm số lượng từng từ trong một chuỗi, không phân biệt hoa thường
     * @param str Chuỗi cần phân tích
     */
    public static void demSoLuongTu(String str){
        // Tách chuỗi thành mảng dựa trên dấu cách (space)
        String[] arrStr = str.split(" ");

        // Xóa các ký tự đặc biệt như . , ; : nhằm tránh ảnh hưởng khi so sánh từ (Chuẩn hoá chuỗi)
        xoaKyTuDacBiet(arrStr);

        // Tạo mảng 2 chiều để lưu kết quả (từ và số lượng xuất hiện)
        int soDong = arrStr.length;
        int soCot = 2;
        int soLuongDongThuTe = 0;
        String[][] mangKetQua = new String[soDong][soCot];

        // Đếm số lần xuất hiện: Vòng lặp qua tất cả các từ trong mảng
        for (int i = 0; i < arrStr.length; i++) {
            boolean boQuaKyTu = false;         // Đánh dấu nếu từ đã kiểm tra ở vị trí trước
            String kyTuKiemTra = arrStr[i];   // Từ hiện tại cần đếm

            // Kiểm tra những từ trước (từ index 0 đến index i-1) xem có trùng không
            for (int j = 0; j < i; j++) {
                // Nếu đã tồn tại từ nào trùng với từ cần kiểm tra, đánh dấu bỏ qua và dừng
                if (kyTuKiemTra.equalsIgnoreCase(arrStr[j])){
                    boQuaKyTu = true;
                    break;
                }
            }
            // Nếu từ này đã xuất hiện trước đó, ta bỏ qua không đếm lại
            if (boQuaKyTu){
                continue;
            }

            // Đếm số lần xuất hiện của từ kyTuKiemTra trong phần còn lại của mảng (từ i đến cuối)
            int count = 0;
            for (int j = i; j < arrStr.length; j++) {
                if (kyTuKiemTra.equalsIgnoreCase(arrStr[j])){
                    count++;
                }
            }

            // Lưu kết quả (từ và số lần xuất hiện) vào mangKetQua (là một 2 dimensional array)
            mangKetQua[soLuongDongThuTe][0] = kyTuKiemTra;
            mangKetQua[soLuongDongThuTe][1] = String.valueOf(count);
            soLuongDongThuTe++;
        }
        // hiển thị kết quả  đếm từ: Gọi hàm hiển thị kết quả
        hienThiMangHaiChieu(mangKetQua, soLuongDongThuTe);
    }

    /**
     * Phương thức hiển thị mảng hai chiều kết quả
     * (từ ở cột 0 và số lần xuất hiện ở cột 1)
     * @param arr Mảng hai chiều chứa kết quả
     * @param soDongThuTe Số dòng (bản ghi) thực tế có dữ liệu
     */
    public static void hienThiMangHaiChieu(String[][] arr,int soDongThuTe){
        // Duyệt qua các dòng trong mảng kết quả
        for (int i = 0; i < soDongThuTe; i++) {
            // Mỗi dòng có 2 cột: [0] = từ, [1] = số đếm
            for (int j = 0; j < arr[i].length; j++) {
                String data = arr[i][j];
                // Nếu là cột 0 (từ), ta in hoa ký tự đầu để kết quả đẹp hơn
                if (j == 0){
                    data = data.substring(0, 1).toUpperCase() + data.substring(1);
                    System.out.printf(data + " : ");
                    continue;
                }
                // Nếu là cột 1, in ra số đếm + "từ"
                System.out.printf(arr[i][j] + " từ");
            }
            // Xuống dòng sau mỗi dòng kết quả
            System.out.println("");
        }
    }
}

