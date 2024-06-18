import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Strings {

    public static void checkPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                System.out.print("String not palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.print("String is palindrome");
        return;
    }

    public static void checkPalindromeAlpha(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
        return;
    }

    public static void shortestPath(String str) {
        double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'n') {
                y2++;
            } else if (str.charAt(i) == 's') {
                y2--;
            } else if (str.charAt(i) == 'e') {
                x2++;
            } else if (str.charAt(i) == 'w') {
                x2--;
            } else {
                System.out.println("please enter proper direction");
                return;
            }
        }
        System.out.println("[x1, y1] = [" + x1 + ", " + y1 + "]");
        System.out.println("[x2, y2] = [" + x2 + ", " + y2 + "]");

        double shortestPath = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

        System.out.println("Shorted path is : " + shortestPath);
    }

    public static void subString(String str, int startingIndex, int endingIndex) {
        String subStr = "";
        for (int i = startingIndex; i < endingIndex; i++) {
            subStr += str.charAt(i);
        }
        System.out.println("Substing of " + str + " is " + subStr);
    }

    public static void printLargestStringBasedOnLexicographicOrder(String arr[]) {
        String largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (largest.compareTo(arr[i]) < 0) {
                largest = arr[i];
            }
        }
        System.out.println("Largest string based on lexicographical order is : " + largest);
    }

    public static void firstWordsToUppercase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }

    public static void stringCompression(String str) {
        // String newStr = "";
        StringBuilder newStr = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if (count > 1) {
                newStr.append(count.toString());
            }
        }
        System.out.println("Original String: " + str);
        System.out.println("Compressed String: " + newStr);
    }

    public static void countLowerCaseVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Total " + count + " lover case vowels are present in string");
    }

    public static void isAnagram(StringBuilder str1, StringBuilder str2) {

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    str2.setCharAt(j, '0');
                }
            }
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str2.charAt(i) != '0') {
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("String is Anagram!");
        return;
    }

    public static void isAnagtamAlpha(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        char[] s1CharArray = s1.toCharArray();
        char[] s2CharArray = s2.toCharArray();
        Arrays.sort(s1CharArray);
        Arrays.sort(s2CharArray);
        if (Arrays.equals(s1CharArray, s2CharArray)) {
            System.out.println("String is Anagram!");
            return;
        } else {
            System.out.println("Not Anagram");
            return;
        }

    }

    public static void main(String[] args) {

        // ------------------declaration-and-initilization------------------
        // String str = "abc";
        // String str2 = new String("abc")
        // System.out.println(str);
        // System.out.println(str2);

        // ------------------taking-input-in-string------------------
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println(name);
        // String bio = sc.nextLine();
        // System.out.println(bio);

        // ------------------printing-length-of-string------------------
        // String fullname = "Tony Stark";
        // System.out.println(fullname.length()); //op: 10

        // ------------------String-concatination------------------
        // String firstName = "kuldeep ";
        // String lastName = "Jhala";
        // String fullName = firstName + lastName;
        // System.out.println(fullName + " is the full name");

        // ------------------accessing-each-char-of-string-using-charAt(index)------------------
        // String firstName = "kuldeep";
        // System.out.println(firstName.charAt(0)); //op: k

        // ------------------printing-individual-character-of-string------------------
        // String name = "kuldeep";
        // for (int i = 0; i < name.length(); i++) {
        // System.out.print(name.charAt(i) + " ");
        // }

        // ------------------check-if-string-is-Palindrome------------------
        // checkPalindrome("racecar");
        // checkPalindromeAlpha("racecar");

        // ------------------reach-the-shortest-path-to-reach-destination-(north-south-east-west)------------------
        // shortestPath("wnenesennn");

        // ------------------equals()-function------------------
        // String s1 = "abc";
        // String s2 = "abc";
        // String s3 = new String("abc");
        // if (s1 == s2) {
        // System.out.println("matched");
        // } else {
        // System.out.println("Not matched");
        // } // op: matched
        // if (s1 == s3) {
        // System.out.println("matched");
        // } else {
        // System.out.println("Not matched");
        // } // op: Not matched
        // if (s1.equals(s3)) {
        // System.out.println("matched");
        // } else {
        // System.out.println("Not matched");
        // } // op: matched

        // -----------------fetch-substring-based-on-startingIndex-and-endingIndex-------------------
        // subString("helloWorld", 0, 4);

        // ------------------substring()-function------------------
        // System.out.println("helloWorld".substring(0, 4));

        // ------------------print-largest-string-in-lexocpgraphical-order------------------
        // String fruits[] = { "apple", "mango", "banana" };
        // printLargestStringBasedOnLexicographicOrder(fruits);

        // ------------------StringBuilder------------------
        // StringBuilder sb = new StringBuilder("");
        // for (char ch = 'a'; ch <= 'z'; ch++) {
        // sb.append(ch);
        // }
        // System.out.println(sb);

        // ------------------Convert-first-letter-of-every-word-in-string-to-uppercase------------------
        // String str = "hello, i am kuldeep ";
        // firstWordsToUppercase(str);

        // ------------------String-compression------------------
        // String str = "aaabbcccdd";
        // String str2 = "abc";
        // stringCompression(str);

        // ------------------Count-how-many-times-lowercase-vowels-occurred-in-a-String-generated-by-the-user.------------------
        // String str = "hello world, name is kuldeepEE";
        // countLowerCaseVowels(str);

        // ------------------check-if-two-strings-are-anagrams-or-not------------------
        // StringBuilder str1 = new StringBuilder("race");
        // StringBuilder str2 = new StringBuilder("care");
        // isAnagram(str1, str2);
        // String s1 = "race";
        // String s2 = "care";
        // isAnagtamAlpha(s1, s2);

    }
}