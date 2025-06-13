public class _0_Exercise {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
//        In the code, ~a flips the bits of a, resulting in -4 when a is 3,
//        and ~b flips the bits of b, giving -7 when b is 6.
//        The expression (~a & b) and (a & ~b) combines these transformed values with bitwise AND and OR operations,
//        ultimately leading to a result of 5.
        int result = (~a & b) | (a & ~b);
        // This expression calculates the bitwise XOR of a and b.
        // The bitwise AND operator (&) compares each bit of a and b and returns 1 if both bits are 1, otherwise it returns 0.
        // The bitwise NOT operator (~) inverts the bits of a and b.
        System.out.println(result);
    }
}
