public class Loops {
    public static void main(String[] args) {
        whileLoop();
        doWhileLoop();
        forLoop();
    }

    static void whileLoop() {
        // While loop - while the condition evaluates to true, the loop will run
        int counter = 1;
        while(counter <= 10) {
            System.out.println(counter);
            counter = counter + 1;
        }
    }

    static void doWhileLoop() {
        // Do While loop - always executes at least once before the condition is checked
        int counter = 100;
        do {
            System.out.println(counter);
            counter = counter + 1;
        } while(counter <= 10);
    }

    static void forLoop() {
        // for loop (initialise counter; condition to see if the loop should run; change counter variable)
        for (int counter = 11; counter <= 20; counter = counter + 1) {
            System.out.println(counter);
        }
    }
}
