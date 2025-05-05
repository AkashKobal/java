public class _2_0_Variables {
    public static void main(String[] args) {

        // byte variables (8 bit)
        byte minValueInByte = -127;
        byte maxValueInByte = 127;
        // byte maxValueInByte2 = 128; // This will cause an error because 128 is out of
        // range for byte

        System.out.println("Minimum value stored in byte is = " + minValueInByte);
        System.out.println("Maximum value stored in byte is = " + maxValueInByte);

        // short variables (16 bit)
        short minValueInShort = -32768;
        short maxValueInShort = 32767;
        System.out.println("Minimum value stored in short is = " + minValueInShort);
        System.out.println("Maximum value stored in short is = " + maxValueInShort);

        // int variables (32 bit)
        int minValueInInt = -2147483648;
        int maxValueInInt = 2147483647;
        System.out.println("Minimum value stored in int is = " + minValueInInt);
        System.out.println("Maximum value stored in int is = " + maxValueInInt);

        // long variables (64 bit)
        long minValueInLong = -9223372036854775808L;
        // Note the 'L' at the end to indicate that this is a long literal value
        // (optional), otherwise it will be treated as an int
        long maxValueInLong = 9223372036854775807L;
        System.out.println("Minimum value stored in long is = " + minValueInLong);
        System.out.println("Maximum value stored in long is = " + maxValueInLong);

        // float variables (32 bit)
        float minValueInFloat = -3.4028235E38f;
        // Note the 'f' at the end to indicate that this is a float literal value
        // (optional), otherwise it will be treated as a double
        float maxValueInFloat = 3.4028235E38f;
        System.out.println("Minimum value stored in float is =  (-3.4*10^38)" + minValueInFloat);
        System.out.println("Maximum value stored in float is =  (3.4*10^38)" + maxValueInFloat);

        // double variables (64 bit)
        double minValueInDouble = -1.7976931348623157E308;

        double maxValueInDouble = 1.7976931348623157E308;
        System.out.println("Minimum value stored in double is =  (-1.7*10^308) " + minValueInDouble);
        System.out.println("Maximum value stored in double is =  (1.7*10^308)" + maxValueInDouble);

        // char variables (16 bit)
        char minValueInChar = 0;
        // Note that char is an unsigned type, so it can only store positive values

        char maxValueInChar = 65535;
        System.out.println("Minimum value stored in char is = " + minValueInChar);
        System.out.println("Maximum value stored in char is = " + maxValueInChar);

        // char is UNICODE, so it can store characters from 0 to 65535
        // string characters are stored in char
        // 16-bit Unicode character, which means it can represent any character in the
        // Unicode standard using values from:
        char ch1 = '\u0041'; // Unicode for 'A'
        System.out.println("ch1 = " + ch1);

        // boolean variables (1 bit)
        boolean trueValue = true;
        boolean falseValue = false;
        System.out.println("True value is = " + trueValue);
        System.out.println("False value is = " + falseValue);

        // String variables
        String name = "Akash";
        System.out.println("Name is = : " + name);

    }

}
