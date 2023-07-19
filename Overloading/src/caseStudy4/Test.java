package caseStudy4;

public class Test {

    public void m1(int i){
        System.out.println("general method");
    }
    public void m1(int... i){
        System.out.println("var arg method");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.m1();
        test.m1(10);//always the var arg will get leadt priority if there is a clash
        test.m1(10,200);
    }
}
