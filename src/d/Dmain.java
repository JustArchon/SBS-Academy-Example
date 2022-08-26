package d;

public class Dmain {
    public static void main(String[] args) {
        Human human = new Human() {
            @Override
            int add(int a, int b) {
                return 0;
            }
        };
    }
}
