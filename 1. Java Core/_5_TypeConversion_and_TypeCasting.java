public class _5_TypeConversion_and_TypeCasting {
    public static void main(String[] args) {
        System.out.println("===== Type Conversion and Type Casting in Java =====");
        // 1. Widening Casting / Conversion (Automatic)
        // if you assign a smaller type to a larger type, Java automatically converts it
        // to the larger type without any explicit cast. so this is called widening conversion / implicit conversion / type conversion
        // byte -> short -> char -> int -> long -> float -> double
        // byte converted to short, short to int, etc.
        byte b = 10;
        short s = b; // byte to short
        int i = s; // short to int
        long l = i; // int to long
        float f = l; // long to float
        double d = f; // float to double
        System.out.println("1. Widening Conversion:// Implicit Conversion://Type conversion");
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);

        // 2. Narrowing Casting / Casting (Explicit)
        // if you assign a larger type to a smaller type, you must explicitly cast it.
        // This is called narrowing conversion / explicit conversion / type casting.
        // double -> float -> long -> int -> char -> short -> byte
        double d2 = 9.78;
        float f2 = (float) d2; // double to float
        long l2 = (long) f2; // float to long
        int i2 = (int) l2; // long to int
        short s2 = (short) i2; // int to short
        byte b2 = (byte) s2; // short to byte
        System.out.println("\n2. Narrowing Conversion:// Explicit Conversion://Type Casting");
        System.out.println("Double: " + d2);
        System.out.println("Float: " + f2);
        System.out.println("Long: " + l2);
        System.out.println("Int: " + i2);
        System.out.println("Short: " + s2);
        System.out.println("Byte: " + b2);
        // 3. Type Casting with Characters
        // Characters can also be cast to integers and vice versa.
        char c = 'A'; // Character literal
        int charToInt = c; // char to int (ASCII value)
        char intToChar = (char) charToInt; // int to char
        System.out.println("\n3. Type Casting with Characters:");
        System.out.println("Character: " + c);
        System.out.println("Character to Int: " + charToInt);
        System.out.println("Int to Character: " + intToChar);
        // 4. Type Casting with Strings
        // Strings cannot be directly cast to numeric types, but you can convert them using methods.
        String str = "123";
        int strToInt = Integer.parseInt(str); // String to int
        double strToDouble = Double.parseDouble(str); // String to double
        System.out.println("\n4. Type Casting with Strings:");
        System.out.println("String: " + str);
        System.out.println("String to Int: " + strToInt);
        System.out.println("String to Double: " + strToDouble);
        // 5. Type Casting with Booleans
        // Booleans cannot be cast to numeric types or vice versa.
        boolean bool = true; // Boolean literal
        // boolean to int or double is not allowed in Java
        // int boolToInt = (int) bool; // Error
        // double boolToDouble = (double) bool; // Error
        System.out.println("\n5. Type Casting with Booleans:");
        System.out.println("Boolean: " + bool);
        // Note: In Java, you cannot cast boolean to numeric types or vice versa.

        //Type Promotion
        // In Java, when you perform arithmetic operations with mixed types,
        // the smaller type is promoted to the larger type to avoid loss of precision.
        // For example, if you add an int and a float, the int is promoted to a float before the operation is performed.
        int x = 10;
        float y = 5.5f;
        float result = x + y; // int is promoted to float
        System.out.println("\nType Promotion:");
        System.out.println("Int: " + x);
        System.out.println("Float: " + y);
        System.out.println("Result of Int + Float: " + result);


    }
}
