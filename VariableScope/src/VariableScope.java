public class VariableScope {

    // Class variables declared outside methods are available to all methods
    static int x; // Declaring the variable x

    public static void main(String[] args) {
        x = 5; // Assigning a value to x
        System.out.println(x);

        doSomething();
        doSomethingLocally();
    }

    static void doSomething() {
        x = 10; // Assigning a value to x
        System.out.println(x);
    }

    static void doSomethingLocally() {
        // Variable declared in this method is local to this method
        int y = 100; // Declaring and Initialising a to y
        System.out.println(y);
    }
}
