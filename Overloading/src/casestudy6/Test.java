package casestudy6;

public class Test {
    public void m1(Animal a){
        System.out.println("Animal Version");
    }
    public void m1(Monkey m){
        System.out.println("Monkey Version");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.m1(new Animal());
        test.m1(new Monkey());
        Animal a1 = new Monkey();
        test.m1(a1);//in method overloading method resolution is based on the parent reference even if has child reference
        //method resolution means which overloaded method to take compiler will decide
    }
}
class Animal{

}
class Monkey extends Animal{

}
