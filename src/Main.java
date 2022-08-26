public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, World!");
        System.out.println("I'm Java");
        System.out.println("안녕하세요");
        int a = 10;
        String b = "hello world";
        System.out.println(a);
        System.out.println(b);
//        int c;
//        long d;
//        c = 10;
//        d = 10324242;
        byte c = 1;
        short d = 2000;
        int e = 3;
        long f = 4L;
        float g = 3.14f;
        double h = 3.14;
        char i = 'a';
        System.out.println((int)i);
        boolean j = true;
    }
    public static void SongPrint(){
        String[][] koreasong = {{"동해물과 백두산이"}, {"마르고 닳도록"}, {"하느님이 보우하사"}, {"우리나라 만세"}};
        String song = "동해물과 백두산이";
        String song2 = "마르고 닳도록";
        String song3 = "하느님이 보우하사";
        String song4 = "우리나라 만세";
        System.out.println(song);
        System.out.println(song2);
        System.out.println(song3);
        System.out.println(song4);
        for (int i = 0; i < 4; i++) {
            for(int j = 0; j < koreasong[i].length; j ++){
                System.out.println(koreasong[i][j]);
            }
        }
    }
}
