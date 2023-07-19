package casestudy5;

public class Test {

    public void m1(int i,float f){
        System.out.println("int-float method");
    }
    public void m1(float f, int i){
        System.out.println("float-int method");
    }

    public static void main(String[] args){
        Test t = new Test();

//        t.m1(10,10);ambigious
//        t.m1(10.5f,10.5f);no suitable method found
        t.m1(10,10.5f);
        t.m1(10.5f,10);
    }
}
