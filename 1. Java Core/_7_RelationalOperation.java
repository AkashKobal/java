public class _7_RelationalOperation {
    public static void main(String[] args) {
        System.out.println("===== Relational Operations in Java =====");
        // 1. Equal to (==)
        int a = 10;
        int b = 20;
        boolean isEqual = (a == b); // Checks if a is equal to b
        System.out.println("1. Equal to (==):");
        System.out.println("Is a equal to b? " + isEqual);

        // 2. Not equal to (!=)
        boolean isNotEqual = (a != b); // Checks if a is not equal to b
        System.out.println("\n2. Not equal to (!=):");
        System.out.println("Is a not equal to b? " + isNotEqual);

        // 3. Greater than (>)
        boolean isGreaterThan = (a > b); // Checks if a is greater than b
        System.out.println("\n3. Greater than (>):");
        System.out.println("Is a greater than b? " + isGreaterThan);

        // 4. Less than (<)
        boolean isLessThan = (a < b); // Checks if a is less than b
        System.out.println("\n4. Less than (<):");
        System.out.println("Is a less than b? " + isLessThan);

        // 5. Greater than or equal to (>=)
        boolean isGreaterThanOrEqual = (a >= b); // Checks if a is greater than or equal to b
        System.out.println("\n5. Greater than or equal to (>=):");
        System.out.println("Is a greater than or equal to b? " + isGreaterThanOrEqual);

        // 6. Less than or equal to (<=)
        boolean isLessThanOrEqual = (a <= b); // Checks if a is less than or equal to b
        System.out.println("\n6. Less than or equal to (<=):");
        System.out.println("Is a less than or equal to b? " + isLessThanOrEqual);

        // 7. Relational Operations with Characters
        char ch1 = 'A';
        char ch2 = 'B';
        boolean isCharEqual = (ch1 == ch2); // Checks if ch1 is equal to ch2
        System.out.println("\n7. Relational Operations with Characters:");
        System.out.println("Is ch1 equal to ch2? " + isCharEqual);

        boolean isCharNotEqual = (ch1 != ch2); // Checks if ch1 is not equal to ch2
        System.out.println("Is ch1 not equal to ch2? " + isCharNotEqual);
        boolean isCharGreaterThan = (ch1 > ch2); // Checks if ch1 is greater than ch2
        System.out.println("Is ch1 greater than ch2? " + isCharGreaterThan);
        boolean isCharLessThan = (ch1 < ch2); // Checks if ch1 is less than ch2
        System.out.println("Is ch1 less than ch2? " + isCharLessThan);
        boolean isCharGreaterThanOrEqual = (ch1 >= ch2); // Checks if ch1 is greater than or equal to ch2
        System.out.println("Is ch1 greater than or equal to ch2? " + isCharGreaterThanOrEqual);
        boolean isCharLessThanOrEqual = (ch1 <= ch2); // Checks if ch1 is less than or equal to ch2
        System.out.println("Is ch1 less than or equal to ch2? " + isCharLessThanOrEqual);

        // 8. Relational Operations with Strings
        String str1 = "Hello";
        String str2 = "World";
        boolean isStringEqual = str1.equals(str2); // Checks if str1 is equal to str2
        System.out.println("\n8. Relational Operations with Strings:");
        System.out.println("Is str1 equal to str2? " + isStringEqual);
        boolean isStringNotEqual = !str1.equals(str2); // Checks if str1 is not equal to str2
        System.out.println("Is str1 not equal to str2? " + isStringNotEqual);
        boolean isStringGreaterThan = (str1.compareTo(str2) > 0); // Checks if str1 is greater than str2
        System.out.println("Is str1 greater than str2? " + isStringGreaterThan);
        boolean isStringLessThan = (str1.compareTo(str2) < 0); // Checks if str1 is less than str2
        System.out.println("Is str1 less than str2? " + isStringLessThan);
        boolean isStringGreaterThanOrEqual = (str1.compareTo(str2) >= 0); // Checks if str1 is greater than or equal to str2
        System.out.println("Is str1 greater than or equal to str2? " + isStringGreaterThanOrEqual);
        boolean isStringLessThanOrEqual = (str1.compareTo(str2) <= 0); // Checks if str1 is less than or equal to str2
        System.out.println("Is str1 less than or equal to str2? " + isStringLessThanOrEqual);

        // 9. Relational Operations with Booleans
        boolean bool1 = true;
        boolean bool2 = false;
        boolean isBoolEqual = (bool1 == bool2); // Checks if bool1 is equal to bool2
        System.out.println("\n9. Relational Operations with Booleans:");
        System.out.println("Is bool1 equal to bool2? " + isBoolEqual);
        boolean isBoolNotEqual = (bool1 != bool2); // Checks if bool1 is not equal to bool2
        System.out.println("Is bool1 not equal to bool2? " + isBoolNotEqual);
        boolean isBoolGreaterThan = (bool1 && !bool2); // Checks if bool1 is greater than bool2 (true > false)
        System.out.println("Is bool1 greater than bool2? " + isBoolGreaterThan);
        boolean isBoolLessThan = (!bool1 && bool2); // Checks if bool1 is less than bool2 (false < true)
        System.out.println("Is bool1 less than bool2? " + isBoolLessThan);
        boolean isBoolGreaterThanOrEqual = (bool1 || bool2); // Checks if bool1 is greater than or equal to bool2 (true >= false)
        System.out.println("Is bool1 greater than or equal to bool2? " + isBoolGreaterThanOrEqual);
        boolean isBoolLessThanOrEqual = (!bool1 || bool2); // Checks if bool1 is less than or equal to bool2 (false <= true)
        System.out.println("Is bool1 less than or equal to bool2? " + isBoolLessThanOrEqual);
        // 10. Relational Operations with Null
        String nullStr1 = null;
        String nullStr2 = null;
        boolean isNullEqual = (nullStr1 == nullStr2); // Checks if both nullStr1 and nullStr2 are null
        System.out.println("\n10. Relational Operations with Null:");
        System.out.println("Is nullStr1 equal to nullStr2? " + isNullEqual);
        boolean isNullNotEqual = (nullStr1 != nullStr2); // Checks if nullStr1 and nullStr2 are not null
        System.out.println("Is nullStr1 not equal to nullStr2? " + isNullNotEqual);
        boolean isNullGreaterThan = (nullStr1 != null && nullStr2 == null); // Checks if nullStr1 is greater than nullStr2
        System.out.println("Is nullStr1 greater than nullStr2? " + isNullGreaterThan);
        boolean isNullLessThan = (nullStr1 == null && nullStr2 != null); // Checks if nullStr1 is less than nullStr2
        System.out.println("Is nullStr1 less than nullStr2? " + isNullLessThan);
        boolean isNullGreaterThanOrEqual = (nullStr1 == null || nullStr2 == null); // Checks if either is null
        System.out.println("Is nullStr1 greater than or equal to nullStr2? " + isNullGreaterThanOrEqual);
        boolean isNullLessThanOrEqual = (nullStr1 == null && nullStr2 == null); // Checks if both are null
        System.out.println("Is nullStr1 less than or equal to nullStr2? " + isNullLessThanOrEqual);
    }
}
