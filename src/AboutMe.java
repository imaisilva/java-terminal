public class AboutMe {
    public static void main(String[] args) {

        String name = args [0];
        String lastName = args [1];
        int age = Integer.parseInt(args[2]);
        double height = Double.parseDouble(args[3]);

        System.out.println("Hi, i'm " + name + " " + lastName);
        System.out.println("I'm " + age);
        System.out.println("My height is " + height + " cm");
    }
}

