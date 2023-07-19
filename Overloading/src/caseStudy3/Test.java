package caseStudy3;

public class Test {

    public void m1(String s){
        System.out.print("string -version");

    }

    public void m1(StringBuffer sb){
        System.out.print("String buffer version");
    }

    public static void main(String[] args) {
        Test t = new Test();

        t.m1("srikanth");
        t.m1(new StringBuffer());
//        t.m1(null);//compile time error ambigious method call
    }
}
