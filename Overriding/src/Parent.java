public class Parent {

    /*
        1.Covariant return type means it is either the parent class method return type with same signature or
        return type should be it child class of same method return type

     */
    public String m1(){ // covariant return type
        return null;
    }
    public int m2(){
        return 10;
    }
}
class Child extends Parent{

   /*
   * Return type can be Object,Number,String....etc
   * */

    public Object m1(){
        return null;
    }
}

class Child1 extends Parent{
    /*
    * Covariant return type not applicable for primitives
    * */

    /*public float m2(){

    }*/


}
