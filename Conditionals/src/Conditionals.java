public class Conditionals {
    public static void main(String[] args) {

        // if (true)
            // do something

        // Comparison operators: > GREATER THAN, < LESS THAN
        // >= GREATER THAN or EQUAL TO, <= LESS THAN or EQUAL TO
        // != NOW EQUAL TO, == EQUAL TO

        // Relational operators: && AND, || OR operators

        boolean sayHello = true;

        if (sayHello) {
            System.out.println("Hello");
        } else {
            System.out.println("Goodbye");
        }

        sayHello = false;
        boolean sayHey =  true;

        // Only the first statement that is true gets executed
        if (sayHello) {
            System.out.println("Hello");
        } else if (sayHey) {
            System.out.println("Hey");
        } else {
            System.out.println("Goodbye");
        }

        int playerX = 50;

        // if player is past the left side of the screen, OR if the player is past the right side of the screen
        if (playerX < 0 || playerX > 0) {
            // Some code that reverses the player's direction
            System.out.println("Direction changed!");
        }

    }
}
