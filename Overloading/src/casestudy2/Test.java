package casestudy2;

public class Test {

    public void m1(Object o){
        System.out.println("Object version");
    }
    public void m1(String o){
        System.out.println("string version");
    }

    public static  void main(String[] args){

        Test t = new Test();
        t.m1(new Object());
        t.m1("srikanth");
        t.m1(null);//Always the child class has highest priority while overloading

    }

}
