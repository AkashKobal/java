public class _4_Literals {
    public static void main(String[] args) {
        System.out.println("===== Literals in Java =====");
        // 1. Integer Literals
        int decimalInt = 100; // Decimal
        int octalInt = 0144; // Octal
        int hexaInt = 0x64; // Hexadecimal
        int binaryInt = 0b1100100; // Binary
        int numbers = 1_000_000; // Underscore for readability
        System.out.println("\n1. Integer Literals:");
        System.out.println("Decimal: " + decimalInt);
        System.out.println("Octal: " + octalInt);
        System.out.println("Hexadecimal: " + hexaInt);
        System.out.println("Binary: " + binaryInt);
        System.out.println("With Underscore: " + numbers);

        // 2. Floating-Point Literals
        float floatLiteral = 3.14f; // Float literal
        System.out.println("\n2. Floating-Point Literals:");
        System.out.println("Float: " + floatLiteral);

        // 3. Double Literals
        double doubleLiteral = 3.14159; // Double literal

        System.out.println("\n3. Double Literals:");
        System.out.println("Double: " + doubleLiteral);

        // 4. Character Literals
        char charLiteral = 'A'; // Character literal
        // in char literals are converted into int,
        // if we increase the value of charLiteral by 1, it will become 'B'

        charLiteral++;
        System.out.println("\n4. Character Literals:");
        System.out.println("Character: " + charLiteral);

        // 5. Boolean Literals
        boolean booleanLiteral = true; // Boolean literal
        System.out.println("\n5. Boolean Literals:");
        System.out.println("Boolean: " + booleanLiteral);

        // 6. String Literals
        String stringLiteral = "Hello, World!"; // String literal
        System.out.println("\n6. String Literals:");
        System.out.println("String: " + stringLiteral);

        // 7. Null Literal
        String nullLiteral = null; // Null literal
        System.out.println("\n7. Null Literal:");

        System.out.println("Null: " + nullLiteral);

        // 8. Special Floating-Point Values
        float positiveInfinity = Float.POSITIVE_INFINITY; // Positive infinity
        float negativeInfinity = Float.NEGATIVE_INFINITY; // Negative infinity
        float notANumber = Float.NaN; // Not a number (NaN)
        System.out.println("\n8. Special Floating-Point Values:");
        System.out.println("Positive Infinity: " + positiveInfinity);
        System.out.println("Negative Infinity: " + negativeInfinity);
        System.out.println("Not a Number (NaN): " + notANumber);

        // 9. Underscore in Numeric Literals
        int underscoreExample = 1_000_000; // Underscore for readability
        System.out.println("\n9. Underscore in Numeric Literals:");
        System.out.println("With Underscore: " + underscoreExample);
    }
}
