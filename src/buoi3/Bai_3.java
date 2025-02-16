package buoi3;

//  Số hoàn hảo:
//    Định nghĩa: Một số được gọi là số hoàn hảo nếu tổng các ước của nó (không tính chính nó) bằng chính nó.
//    Ước số: Một số k được gọi là ước của n nếu n % k == 0.
//
//  Cách kiểm tra:
//    1. Duyệt qua các số từ 1 đến n - 1.
//    2. Kiểm tra nếu n % i == 0 thì i là một ước của n.
//    3. Cộng dồn các ước này lại.
//    4. Nếu tổng các ước bằng n, thì n là một số hoàn hảo.


//  Số Armstrong:
//      Một số n được gọi là số Armstrong
//      nếu tổng các lũy thừa của mỗi chữ số trong n (với số mũ bằng số lượng chữ số của n) bằng chính n.
//
//  Cách kiểm tra:
//    1. Xác định số lượng chữ số k của n.
//    2. Tính tổng các chữ số của n với lũy thừa k.
//    3. So sánh tổng này với n:
//          Nếu bằng nhau, n là số Armstrong.
//          Nếu không bằng, n không phải là số Armstrong.
//
//  Ví dụ:
//  •Số 153 là một số Armstrong vì:
//    	Số lượng chữ số k = 3.
//    	Tính tổng: 1^3+5^3+3^3 = 1+125+27 = 153.
//    	Kết quả bằng 153, nên 153 là số Armstrong.
//
//  •Số 370 cũng là số Armstrong vì:
//    	Số lượng chữ số k = 3.
//    	Tính tổng: 3^3+7^3+0^3 = 27+343+0 = 370.
//    	Kết quả bằng 370, nên 370 là số Armstrong.


//    Số đối xứng:
//         Một số được gọi là số đối xứng nếu khi
//         đảo ngược thứ tự các chữ số của nó, số thu được vẫn bằng số ban đầu.
//
//    Cách kiểm tra:
//      1. Lưu số ban đầu n vào một biến tạm. Vẫn cần tách được các số ra
//      2. Đảo Ngược số ban đầu n.
//      3. So sánh số đảo ngược với số ban đầu n:
//              Nếu bằng nhau, số đó là số đối xứng.
//              Nếu không bằng, số đó không phải là số đối xứng.

public class Bai_3 {
    public static boolean kiemTraSoHoanHao(int n){
        int tongTam =0;
        for(int i=1;i<n;i++){

            // tìm ước của n
            if(n%i==0){
                // i chính là ước của n
                tongTam+= i;
            }
        }
        // so sánh tổng và n
        if(tongTam==n) { return true; } return false;
    }


    public static boolean kiemTraSoArmstrong(int n)
    {
        // Xác định số lượng chữ số k của n.
        int soN = n;
        int soCacChuSo = 0;

        while(soN != 0){
            soN = soN / 10;
            soCacChuSo++;
        }
        // dòng đặt debug này để định hình cho chúng ta biết: ít nhất code của chúng ta đã chạy qua dòng này\
        System.out.println("Armstrong-so cac chu so: "+soCacChuSo);

        // đặt lại giá trị của soN về n để tính toán tổng
        soN = n;
        // Tính tổng các chữ số của n với lũy thừa k.
        int chuSo =0;
        int tong =0;

        while(soN != 0){
            chuSo = soN % 10;   // Lấy chữ số cuối cùng xử lý trước (sau đó tiến dần về chữ số đầu tiên)
            tong += Math.pow(chuSo, soCacChuSo);    // Cộng dồn lũy thừa k của (các) chữ số
            soN = soN / 10;     // Loại bỏ chữ số cuối cùng
        }

        // So sánh với n
        if(tong==n) { return true; } return false;
    }


    public static boolean kiemTraSoDoiXung(int n){
        int soN = n;
        int soDoiXung = 0;
        int soTam = 0;

        // Đảo Ngược số n
        while(soN != 0){
            soTam = soN % 10;   // Lấy chữ số cuối cùng của soN
            soDoiXung = soDoiXung * 10 + soTam;     // Xây dựng số đối xứng
            soN = soN / 10;     // Loại bỏ chữ số cuối cùng của soN
        }
        // kiểm tra
        if(soDoiXung==n) { return true; } return false;
    }

    public static void main(String[] args) {
        System.out.println(kiemTraSoHoanHao(6));
        System.out.println(kiemTraSoHoanHao(7));

        System.out.println(kiemTraSoArmstrong(153));
        System.out.println(kiemTraSoArmstrong(154));

        System.out.println(kiemTraSoDoiXung(15151));
        System.out.println(kiemTraSoDoiXung(15152));
    }
}
