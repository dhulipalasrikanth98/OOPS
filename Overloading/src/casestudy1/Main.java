package casestudy1;

public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.m1();
        c.m1(10);
        c.m1(10.5f);
        c.m1('a');//m1(int) is called
        c.m1(10l);//m1(float) is called
    }
}
