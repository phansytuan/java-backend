package Buoi3;

public class Bai_4 {
    public static void main(String[] args) {
        int tongTien=200000;

        for(int x=0;x<=tongTien/1000;x++) {
            for (int y = 0; y <= tongTien/2000; y++) {
                for (int z = 0; z <= tongTien/5000; z++){
                    if(x*1000+y*2000+z*5000==tongTien) {
                        System.out.println("1000đ: "+x+", 2000đ: "+y+", 5000đ: "+z);
                    }
                }
            }
        }
    }
}
