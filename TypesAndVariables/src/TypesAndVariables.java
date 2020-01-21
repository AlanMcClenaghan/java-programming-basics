public class TypesAndVariables {
    public static void main(String[] args) {
        // Declaring a variable called myInteger that stores that type int, or integer
        int myInteger;
        // Initialising myInteger to the value 5
        myInteger = 5;
        System.out.println(myInteger);

        myInteger = 10;
        System.out.println(myInteger);

        myInteger = myInteger + 1;
        System.out.println(myInteger);

        // Declaring and initialising in one step
        int myInteger2 = 9;
        System.out.println(myInteger + myInteger2);

        // Declaring and initialising a decimal
        double myDouble = 2.5;
        System.out.println(myDouble);

        // Declaring and initialising a String
        String helloWorld = "Hello, World!";
        System.out.println(helloWorld);

        // String concatenation
        String hello = "Hello, ";
        String name = "Alan";
        System.out.println(hello + name);
    }
}
