package AbstractOverriding;

public class Parent {

    public void m1(){

    }
}
abstract class child extends Parent{

    public abstract void m1();
}
class SubC extends child{


    public void m1() {

    }
}