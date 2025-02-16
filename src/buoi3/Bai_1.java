package buoi3;

public class Bai_1 {
    public static void main(String[] args) {
        int soTo1000;
        int soTo2000;
        int soTo5000;

        for (soTo1000=0; soTo1000 <= 200; soTo1000++) {
            for(soTo2000=0; soTo2000 <= 100; soTo2000++) {
                for(soTo5000=0; soTo5000 <= 40; soTo5000++) {
                    if(soTo1000*1000 + soTo2000*2000 + soTo5000*5000 == 20000) {
                        System.out.println("1000d: "+soTo1000+"  2000d: "+soTo2000+"  5000d "+soTo5000);
                    }
                }
            }
        }
    }
}
