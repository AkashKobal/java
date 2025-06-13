public class _9_ConditionalStatement {
    public static void main(String[] args) {
        System.out.println("===== Conditional Statements in Java =====");
        // conditional statements are used to make decisions in a program.
        // They allow you to execute different blocks of code based on certain conditions.
        // Java provides several types of conditional statements:


        // 1. If Statement:
        // The if statement is used to execute a block of code only if a specified condition is true.
        // if condition is false, the block of code will not be executed.
        System.out.println("\n1. If Statement:");
        int a = 10;
        if (a > 5) {
            System.out.println("1. If Statement: a is greater than 5");
        }

        // 2. If-Else Statement
        // The if-else statement is used to execute one block of code if a specified condition is true, and another block of code if the condition is false.
        System.out.println("\n2. If-Else Statement:");
        if (a < 5) {
            System.out.println("2. If-Else Statement: a is less than 5");
        } else {
            System.out.println("2. If-Else Statement: a is not less than 5");
        }

        // 3. Else-If Ladder
        // The else-if ladder is used to execute a block of code if any one of the specified conditions is true.
        System.out.println("\n3. Else-If Ladder:");
        if (a < 0) {
            System.out.println("3. Else-If Ladder: a is negative");
        } else if (a == 0) {
            System.out.println("3. Else-If Ladder: a is zero");
        } else {
            System.out.println("3. Else-If Ladder: a is positive");
        }

        // 4. Switch Statement
        // The switch statement is used to execute a block of code based on the value of a variable or an expression.
        // It is similar to a series of if-else statements, but it can be more efficient and easier to read.

        System.out.println("\n4.  Switch Statement:");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("4. Switch Statement: Monday");
                break;
            case 2:
                System.out.println("4. Switch Statement: Tuesday");
                break;
            case 3:
                System.out.println("4. Switch Statement: Wednesday");
                break;
            case 4:
                System.out.println("4. Switch Statement: Thursday");
                break;
            case 5:
                System.out.println("4. Switch Statement: Friday");
                break;
            case 6:
                System.out.println("4. Switch Statement: Saturday");
                break;
            case 7:
                System.out.println("4. Switch Statement: Sunday");
                break;
            default:
                System.out.println("4. Switch Statement: Invalid day");
                break;
        }

    }
}
