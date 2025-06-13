public class _10_TernaryOperator {
    public static void main(String[] args) {
        System.out.println("===== Ternary Operator in Java =====");
        // The ternary operator is a shorthand for the if-else statement.
        // It takes three operands and is used to evaluate a boolean expression.
        // Syntax: condition ? expression1 : expression2
        int a = 10;
        int b = 20;
        // Using the ternary operator to find the maximum of two numbers
        int max = (a > b) ? a : b; // If a is greater than b, max is a; otherwise, max is b
        System.out.println("1. Ternary Operator: The maximum of " + a + " and " + b + " is " + max);
        // Using the ternary operator to check if a number is even or odd
        String result = (a % 2 == 0) ? "even" : "odd"; // If a is even, result is "even"; otherwise, result is "odd"
        System.out.println("2. Ternary Operator: The number " + a + " is " + result);
        // Using the ternary operator to assign a value based on a condition
        String message = (a > 0) ? "Positive" : "Non-Positive"; // If a is greater than 0, message is "Positive"; otherwise, it is "Non-Positive"
        System.out.println("3. Ternary Operator: The number " + a + " is " + message);

        // The ternary operator can also be nested for multiple conditions
        int score = 85;
        String grade = (score >= 90) ? "A" :
                (score >= 80) ? "B" :
                        (score >= 70) ? "C" :
                                (score >= 60) ? "D" : "F"; // Assigns a grade based on the score

        System.out.println("4. Ternary Operator: The grade for score " + score + " is " + grade);
        // Note: While the ternary operator can make code more concise, it can also reduce readability if overused or nested too deeply.
        // Therefore, it's important to use it judiciously and maintain code clarity.

        // The ternary operator can also be used with other data types, such as strings and characters.
        String name = "Alice";
        String greeting = (name != null) ? "Hello, " + name + "!" : "Hello, Guest!"; // If name is not null, greeting includes the name; otherwise, it greets a guest
        System.out.println("5. Ternary Operator: " + greeting);

    }
}
