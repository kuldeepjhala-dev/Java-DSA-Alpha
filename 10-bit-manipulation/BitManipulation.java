import java.util.*;

public class BitManipulation {

    public static void convertDecimalToBinary(int n) {
        String result = "";
        while (n != 0) {
            if (n % 2 == 1) {
                result = result + "1";
            } else {
                result = result + "0";
            }
            n = n / 2;
        }
        StringBuilder reverseString = new StringBuilder();
        reverseString.append(result);
        reverseString.reverse();
        System.out.println("binary output: " + reverseString);
    }

    public static void convertBinaryToDecimal(String n) {
        int exponentPower = 1;
        double decimalNo = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            if (n.charAt(i) == '1') {
                decimalNo = decimalNo + exponentPower;
            }
            exponentPower = exponentPower * 2;
        }
        System.out.println("Decimal output: " + decimalNo);
    }

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println(n + " is even no");
        } else {
            System.out.println(n + " is odd no");
        }
    }

    public static void getIthBit(int n, int i) {
        int bitMask = (1 << i);
        if ((n & bitMask) == 0) {
            System.out.println(i + " bit for no " + n + " is 0");
        } else {
            System.out.println(i + " bit for no " + n + " is 1");
        }
    }

    public static void setIthBit(int n, int i) {
        int bitMask = (1 << i);
        System.out.println("Before setting ith bit " + n);
        n = n | bitMask;
        System.out.println("After setting ith bit " + n);
        System.out.println(i + " Ith bit set to " + n);
    }

    public static void clearIthBit(int n, int i) {
        int bitMask = (~(1 << i));
        System.out.println("Before clearing ith bit " + n);
        n = n & bitMask;
        System.out.println("After clearing ith bit " + n);
        System.out.println(i + " Ith bit cleared of " + n);
    }

    public static void updateIthBitMethod1(int n, int i, int newBit) {
        if (newBit == 0) {
            int bitMask = (~(1 << i));
            n = n & bitMask;
        } else {
            int bitMask = (1 << i);
            n = n | bitMask;
        }
        System.out.println("After updating ith bit n = " + n);
    }

    public static void updateIthBitMethod2(int n, int i, int newBit) {
        int bitMask = (~(1 << i));
        n = n & bitMask;
        int newBitMask = newBit << i;
        n = n | newBitMask;
        System.out.println("After updating ith bit n = " + n);
    }

    public static void clearLastIthBits(int n, int i) {
        int bitMask = ((~0) << i);
        n = n & bitMask;
        System.out.println("After clearing " + i + " bits from end, value on n is " + n);
    }

    public static void isPowerOfTwo(int n) {
        if ((n & (n - 1)) == 0) {
            System.out.println(n + " is power of 2");
        } else {
            System.out.println(n + " is not the power of 2");
        }
    }

    public static void countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        System.out.println("set bits in no is " + count);
    }

    public static void fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        System.out.println("Answer is " + ans);
    }

    public static void swapNosWithoutThirdVariable(int a, int b) {
        System.out.println("Before Swapping: x=" + a + " y= " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Before After: x=" + a + " y= " + b);
    }

    public static void convertUppercaseToLowercaseChar(char character) {
        System.out.println((char) (character | ' '));
    }

    public static void main(String[] args) {

        // --------------------bitwise-operator--------------------
        // System.out.println(5 & 6);
        // System.out.println(5 | 6);
        // System.out.println(~5);
        // System.out.println(~0);
        // System.out.println((5<<2));
        // System.out.println((6>>1));

        // --------------------bitwise-convert-decimal-to-binary--------------------
        // convertDecimalToBinary(15);

        // --------------------bitwise-convert-binary-to-decimal--------------------
        // convertBinaryToDecimal("01100001");

        // --------------------bitwise-odd-or-even--------------------
        // oddOrEven(3);
        // oddOrEven(4);
        // oddOrEven(14);

        // --------------------bitwise-getIthBit--------------------
        // getIthBit(15, 3);
        // getIthBit(15, 4);

        // --------------------bitwise-setIthBit--------------------
        // setIthBit(10, 2);

        // --------------------bitwise-clearIthBit--------------------
        // clearIthBit(10, 1);

        // --------------------bitwise-updateIthBit--------------------
        // updateIthBitMethod1(10, 1, 0);
        // updateIthBitMethod1(10, 2, 1);
        // updateIthBitMethod2(10, 1, 0);
        // updateIthBitMethod2(10, 2, 1);

        // --------------------bitwise-clearLastIthBits--------------------
        // clearLastIthBits(15, 2);

        // --------------------bitwise-check-if-no-is-pow-of-2-or-not--------------------
        // isPowerOfTwo(16);

        // --------------------bitwise-count-total-no-of-set-bits--------------------
        // countSetBits(12);

        // --------------------bitwise-fast-Exponential--------------------
        // fastExpo(3, 5);

        // --------------------bitwise-swap-two-numbers-without-using-third-variable--------------------
        // swapNosWithoutThirdVariable(10, 20);

        // ---------------------bitwise-convert-Uppercase-To-Lowercase-Character---------------------
        // convertUppercaseToLowercaseChar('D');
    }
}