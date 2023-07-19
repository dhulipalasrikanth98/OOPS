public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.m1();

        Parent parent1 =  new Child();
        parent1.m1();
//        parent1.m2();

    }
}