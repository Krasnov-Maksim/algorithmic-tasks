package org.example;

/*
Description:
This time no story, no theory. The examples below show you how to write function accum:

Examples:
accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.
 */
public class C_0627_Mumbling {
    public static void main(String[] args) {
        System.out.println(accum("abcd"));
        System.out.println(accum("RqaEzty"));
        System.out.println(accum("cwAt"));
    }

    private static String accum(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0, sbPos = 0; i < s.length(); i++, sbPos++) {
            char currentChar = s.charAt(i);
            if (Character.isLowerCase(currentChar)){
                stringBuilder.replace(sbPos, sbPos + 1,
                        String.valueOf(Character.toUpperCase(currentChar)));
            } else {
                stringBuilder.append(currentChar);
            }
            repeatChar(currentChar, i, stringBuilder);
            stringBuilder.append('-');
            sbPos = sbPos +  i + 1;
        }
        stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        return stringBuilder.toString();
    }

    private static void repeatChar(char charToRepeat, int timesToRepeat, StringBuilder stringBuilder){
        if (timesToRepeat < 1) {
            return;
        }

        if (Character.isUpperCase(charToRepeat)){
            charToRepeat = Character.toLowerCase(charToRepeat);
        }
        for (int i = 1; i <= timesToRepeat; i++) {
            stringBuilder.append(charToRepeat);
        }
    }
}
