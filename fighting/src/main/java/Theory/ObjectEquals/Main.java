package Theory.ObjectEquals;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("伊东美咲",21);
        Person p2 = new Person("东凛", 21);
        System.out.println(p1.equals(p2));
        System.out.println("===================================");

        Person p3 = new Person("伊东美咲",21);
        Person p4 = new Person("伊东美咲", 21);
        System.out.println(p3.equals(p4));
        System.out.println("===================================");

        Object p5 = new Person("伊东美咲",21);
        Object p6 = new Person("东凛", 21);
        System.out.println(p6.equals(p5));
        System.out.println("===================================");


        Object p7 = new Person("伊东美咲",21);
        Object p8 = new Person("伊东美咲", 21);
        System.out.println(p8.equals(p7));
        System.out.println("===================================");
    }
}
