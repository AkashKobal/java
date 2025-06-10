public class _6_ArithematicOprtaions {
    public static void main(String[] args) {
        System.out.println("===== Arithmetic Operations in Java =====");

        // 1. Addition
        int a = 10;
        int b = 5;
        int sum = a + b; // Addition
        System.out.println("1. Addition:");
        System.out.println("a + b = " + sum);

        // 2. Subtraction
        int difference = a - b; // Subtraction
        System.out.println("\n2. Subtraction:");
        System.out.println("a - b = " + difference);

        // 3. Multiplication
        int product = a * b; // Multiplication
        System.out.println("\n3. Multiplication:");
        System.out.println("a * b = " + product);

        // 4. Division
        double quotient = (double) a / b; // Division (cast to double for precision)
        System.out.println("\n4. Division:");
        System.out.println("a / b = " + quotient);

        // 5. Modulus (Remainder)
        int remainder = a % b; // Modulus
        System.out.println("\n5. Modulus:");
        System.out.println("a % b = " + remainder);

        // 6. Increment
        a++; // Increment by 1
        System.out.println("\n6. Increment:");
        System.out.println("After incrementing, a = " + a);

        // 7. Decrement
        b--; // Decrement by 1
        System.out.println("\n7. Decrement:");
        System.out.println("After decrementing, b = " + b);

        // 8. Compound Assignment Operators
        a += 5; // Equivalent to a = a + 5
        System.out.println("\n8. Compound Assignment (Addition):");
        System.out.println("After compound addition, a = " + a);

        b *= 2; // Equivalent to b = b * 2
        System.out.println("\nCompound Assignment (Multiplication):");
        System.out.println("After compound multiplication, b = " + b);
    }
}
