package org.example;

/*
Description:
Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 9x9 is 81 and
1x1 is 1. (81-1-1-81)

Example #2: An input of 765 will/should return 493625 because 7x7 is 49, 6x6 is 36, and 5x5 is 25.
(49-36-25)

Note: The function accepts an integer and returns an integer.

Happy Coding!
 */
public class C_0620_SquareEveryDigit {
    public static void main(String[] args) {
        System.out.println(squareEveryDigit(9119));
        System.out.println(squareEveryDigit(765));
    }

    private static int squareEveryDigit(int number){
        String input = "" + number;
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            int digit = input.charAt(i) - '0';
            output.append(digit * digit);
        }
        return Integer.parseInt(output.toString());
    }
}
