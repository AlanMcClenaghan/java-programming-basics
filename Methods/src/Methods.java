public class Methods {
    public static void main(String[] args) {
        // Calling a method
        sayHelloWorld();
        sayHello("Alan");
        sayHello("Matthew");

        int x =  returnNumber(5);
        System.out.println(x);

        int square = returnSquare(3);
        System.out.println(square);
        System.out.println(returnSquare(4));
        System.out.println(returnSquare(returnNumber(8)));

    }

    // Declaring a method
    static void sayHelloWorld() {
        System.out.println("Hello, World!");
    }

    // Passing an argument to a method
    static void sayHello(String name) {
        System.out.println("Hello, " +  name + "!");
    }

    // Returns an integer value entered as an argument
    static int returnNumber(Integer num) {
        return num;
    }

    // Passing an argument to a method and returning a value
    static int returnSquare(int x) {
        return x * x;
    }
}
