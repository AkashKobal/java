public class _3_Datatypes {
    public static void main(String[] args) {
        System.out.println("===== Primitive Data Types in Java =====");
        // 1. boolean Data Type
        // Represents true or false values
        boolean trueValue = true;
        boolean falseValue = false;
        System.out.println("\n1. boolean Data Type:");
        System.out.println("True value is = " + trueValue);
        System.out.println("False value is = " + falseValue);

        // 2. byte Data Type (8-bit signed)
        byte minByte = -128;
        byte maxByte = 127;
        System.out.println("\n2. byte Data Type:");
        System.out.println("Minimum value in byte = " + minByte);
        System.out.println("Maximum value in byte = " + maxByte);

        // 3. short Data Type (16-bit signed)
        short minShort = -32768;
        short maxShort = 32767;
        System.out.println("\n3. short Data Type:");
        System.out.println("Minimum value in short = " + minShort);
        System.out.println("Maximum value in short = " + maxShort);

        // 4. int Data Type (32-bit signed)
        int minInt = -2147483648;
        int maxInt = 2147483647;
        System.out.println("\n4. int Data Type:");
        System.out.println("Minimum value in int = " + minInt);
        System.out.println("Maximum value in int = " + maxInt);

        // 5. long Data Type (64-bit signed)
        long minLong = -9223372036854775808L;
        long maxLong = 9223372036854775807L;
        System.out.println("\n5. long Data Type:");
        System.out.println("Minimum value in long = " + minLong);
        System.out.println("Maximum value in long = " + maxLong);

        // 6. float Data Type (32-bit IEEE 754)
        float floatVar1 = 3.14f;
        float floatVar2 = -1.23e-5f;
        System.out.println("\n6. float Data Type:");
        System.out.println("Example float values: " + floatVar1 + ", " + floatVar2);

        // 7. double Data Type (64-bit IEEE 754)
        double doubleVar1 = 3.14159265358979;
        double doubleVar2 = 1.23e100;
        System.out.println("\n7. double Data Type:");
        System.out.println("Example double values: " + doubleVar1 + ", " + doubleVar2);

        // 8. char Data Type (16-bit Unicode character)
        char charA = 'A';
        char charUnicode = '\u03A9'; // Ω (Greek capital letter Omega)
        char charSymbol = '$';
        System.out.println("\n8. char Data Type:");
        System.out.println("Characters: " + charA + ", " + charUnicode + ", " + charSymbol);

        System.out.println("===== Non-Primitive (Reference) Data Types in Java =====");

        
        // 1. String (Class type)
        String message = "Hello, Java!";
        System.out.println("\n1. String:");
        System.out.println("Message: " + message);
        System.out.println("Length of the string: " + message.length());

        // 2. Array (Object type)
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("\n2. Array:");
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
    
}
