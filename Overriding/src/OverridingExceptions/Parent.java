package OverridingExceptions;

public class Parent {
    public void m1() throws Exception {

    }
}
 class Child extends Parent{
    public void m1() throws InterruptedException{}

}
