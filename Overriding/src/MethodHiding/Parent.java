package MethodHiding;

public class Parent {

    public static void m1(){
        System.out.println("parent static method");
    }
}
class Child extends Parent{

    public  static void m1(){
        System.out.println("child static method");
    }

}

