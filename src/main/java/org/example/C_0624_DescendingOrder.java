package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Your task is to make a function that can take any non-negative integer as an argument and
return it with its digits in descending order.
Essentially, rearrange the digits to create the highest possible number.

Examples:
Input: 42145 Output: 54421

Input: 145263 Output: 654321

Input: 123456789 Output: 987654321
 */
public class C_0624_DescendingOrder {
    public static void main(String[] args) {
        System.out.println(sortDesc(42145));
        System.out.println(sortDesc(145263));
        System.out.println(sortDesc(123456789));
    }

    public static int sortDesc(final int num) {
        if (num < 10) {
            return num;
        }
        List<Integer> list = new ArrayList<>();
        int tmpNumber = num;
        while (tmpNumber > 0) {
            list.add(tmpNumber % 10);
            tmpNumber /= 10;
        }
        Collections.sort(list);
        Collections.reverse(list);
        StringBuilder stringBuilder = new StringBuilder();
        list.forEach(stringBuilder::append);
        return Integer.parseInt(stringBuilder.toString());
    }
}
