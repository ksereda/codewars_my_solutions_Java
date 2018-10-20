/*

"Convert number to a String"

We need a function that can transform a number into a string.

Examples:
Kata.numberToString(123); // returns "123"
Kata.numberToString(999); // returns "999"

*/


public class ConvertNumberToAString {
    public static String numberToString(int num) {
        return  num + "";
    }

    public static void main(String[] args) {
        System.out.println(numberToString(333));
    }
}
