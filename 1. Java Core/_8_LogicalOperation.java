public class _8_LogicalOperation {
    public static void main(String[] args) {
        // (| = pipe)
        System.out.println("===== Logical Operations in Java =====");
        // 1. Logical AND (&&)
        boolean condition1 = true;
        boolean condition2 = false;
        boolean andResult = condition1 && condition2; // true if both conditions are true
        System.out.println("1. Logical AND (&&):");
        System.out.println("condition1 && condition2 = " + andResult);

        // 2. Logical OR (||)
        boolean orResult = condition1 || condition2; // true if at least one condition is true
        System.out.println("\n2. Logical OR (||):");
        System.out.println("condition1 || condition2 = " + orResult);

        // 3. Logical NOT (!)
        boolean notCondition1 = !condition1; // true if condition1 is false
        System.out.println("\n3. Logical NOT (!):");
        System.out.println("!condition1 = " + notCondition1);

        // 4. Logical XOR (^)
        boolean xorResult = condition1 ^ condition2; // true if exactly one condition is true
        System.out.println("\n4. Logical XOR (^):");
        System.out.println("condition1 ^ condition2 = " + xorResult);


        // 5. Combining Logical Operators
        boolean combinedResult = (condition1 && condition2) || (!condition1 && condition2);
        System.out.println("\n5. Combining Logical Operators:");
        System.out.println("(condition1 && condition2) || (!condition1 && condition2) = " + combinedResult);

        // 6. Short-Circuit Evaluation
        // In Java, logical AND (&&) and OR (||) operators use short-circuit evaluation.
        // This means that if the first condition in an AND operation is false, the second condition is not evaluated.
        boolean shortCircuitAnd = false && (5 / 0 > 1); // The second condition is not evaluated
        System.out.println("\n6. Short-Circuit Evaluation:");
        System.out.println("false && (5 / 0 > 1) = " + shortCircuitAnd);

        // 7. Logical Operations with Non-Boolean Types
        // Logical operations can also be applied to non-boolean types using bitwise operators.
        int x = 5; // 0101 in binary
        int y = 3; // 0011 in binary
        int bitwiseAnd = x & y; // Bitwise AND
        int bitwiseOr = x | y; // Bitwise OR
        int bitwiseNot = ~x; // Bitwise NOT
        System.out.println("\n7. Logical Operations with Non-Boolean Types:");
        System.out.println("Bitwise AND (x & y) = " + bitwiseAnd); // 0001 in binary (1 in decimal)
        System.out.println("Bitwise OR (x | y) = " + bitwiseOr); // 0111 in binary (7 in decimal)
        System.out.println("Bitwise NOT (~x) = " + bitwiseNot); // 1010 in binary (inverts bits of x)

        // 8. Logical Operations with Characters
        char char1 = 'A'; // 65 in ASCII
        char char2 = 'B'; // 66 in ASCII
        boolean charAnd = (char1 == 'A') && (char2 == 'B'); // true if both conditions are true
        System.out.println("\n8. Logical Operations with Characters:");
        System.out.println("char1 == 'A' && char2 == 'B' = " + charAnd); // true
        boolean charOr = (char1 == 'A') || (char2 == 'C'); // true if at least one condition is true
        System.out.println("char1 == 'A' || char2 == 'C' = " + charOr); // true
        boolean charNot = !(char1 == 'B'); // true if char1 is not 'B'
        System.out.println("!(char1 == 'B') = " + charNot); // true

        // 9. Logical Operations with Strings
        String str1 = "Hello";
        String str2 = "World";
        boolean stringAnd = str1.equals("Hello") && str2.equals("World"); // true if both strings match
        System.out.println("\n9. Logical Operations with Strings:");
        System.out.println("str1.equals('Hello') && str2.equals('World') = " + stringAnd); // true
        boolean stringOr = str1.equals("Hello") || str2.equals("Java"); // true if at least one string matches
        System.out.println("str1.equals('Hello') || str2.equals('Java') = " + stringOr); // true
        boolean stringNot = !str1.equals("Java"); // true if str1 is not "Java"
        System.out.println("!str1.equals('Java') = " + stringNot); // true

        // 10. Logical Operations with Mixed Types
        int num1 = 10;
        int num2 = 20;
        boolean mixedAnd = (num1 < num2) && (num2 > 15); // true if both conditions are true
        System.out.println("\n10. Logical Operations with Mixed Types:");
        System.out.println("num1 < num2 && num2 > 15 = " + mixedAnd); // true
        boolean mixedOr = (num1 > num2) || (num2 < 25); // true if at least one condition is true
        System.out.println("num1 > num2 || num2 < 25 = " + mixedOr); // true
        boolean mixedNot = !(num1 == num2); // true if num1 is not equal to num2
        System.out.println("!(num1 == num2) = " + mixedNot); // true

    }
}
