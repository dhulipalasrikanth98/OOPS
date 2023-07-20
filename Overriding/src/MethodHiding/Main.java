package MethodHiding;



public class Main {
    public static void main(String[] args) {
      Parent parent = new Parent();
      parent.m1();
      Parent parent1 = new Child();
      /*
         Method hiding
      * */
      parent1.m1();

    }
}
