public class _11_Loops {
    public static void main(String[] args) {
        System.out.println("===== Loops in Java =====");
        // Loops are used to execute a block of code repeatedly until a specified condition is met.
        // Java provides several types of loops: for, while, and do-while.
        // 1. For Loop:
        // The for loop is used to execute a block of code a specified number of times.
        // Syntax: for (initialization; condition; increment/decrement) { code block }
        // Here we know how many times we want to execute the code block.

        System.out.println("\n1. For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " + i);
        }

        // 2. While Loop
        // The while loop is used to execute a block of code as long as a specified condition is true.
        // Syntax: while (condition) { code block }
        // Here we don't know how many times we want to execute the code block, we just know the condition.
        System.out.println("\n2. While Loop:");
        int j = 0;
        while (j < 5) {
            System.out.println("Iteration " + j);
            j++;
        }

        // 3. Do-While Loop
        // The do-while loop is similar to the while loop, but it guarantees that the code block will be executed at least once.
        // Syntax: do { code block } while (condition);
        // Here we don't know how many times we want to execute the code block, we just know the condition.
        // Here, first the code block is executed, and then the condition is checked.

        System.out.println("\n3. Do-While Loop:");
        int k = 0;
        do {
            System.out.println("Iteration " + k);
            k++;
        } while (k < 5);

        // 4. Enhanced For Loop (For-Each Loop)
        // The enhanced for loop is used to iterate over an array or a collection.
        // Syntax: for (dataType element : array/collection) { code block }
        // For-each loop is used when we want to iterate over all elements in a collection or array.

        System.out.println("\n4. Enhanced For Loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
        // 5. Nested Loops
        //  are loops within loops.
        // They are used when we need to perform a loop inside another loop.

        System.out.println("\n5. Nested Loops:");
        for (int i = 1; i <= 3; i++) {
            for (int l = 1; j <= 3; j++) {
                System.out.println("Outer Loop: " + i + ", Inner Loop: " + l);
            }
        }
        // 6. Loop Control Statements
        // Loop control statements are used to alter the flow of a loop.
        // They include break, continue, and return.
        // break: Exit the loop immediately.
        // continue: Skip the current iteration and move to the next iteration.
        // return: Exit the loop and the method immediately.

        System.out.println("\n6. Loop Control Statements:");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Skipping iteration " + i);
                continue; // Skip the rest of the loop when i is 5
            }
            if (i == 8) {
                System.out.println("Breaking the loop at iteration " + i);
                break; // Exit the loop when i is 8
            }

        }

    }
}

// Which loop is best to use depends on the specific use case:
// - If you know how many times you want to execute the code block, use a for loop.
// - If you don't know how many times you want to execute the code block, but you know the condition, use a while loop.
// - If you want to guarantee that the code block will be executed at least once, use a do-while loop.
// - If you want to iterate over an array or a collection, use an enhanced for loop.
// - If you want to alter the flow of a loop, use a loop control statement.
// - If you need to perform a loop inside another loop, use nested loops.
// - If you want to exit the loop immediately, use the break statement.
// - If you want to skip the current iteration and move to the next iteration, use the continue statement.
// - If you want to exit the loop and the method immediately, use the return statement.
