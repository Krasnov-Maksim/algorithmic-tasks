package org.example;

/*

 */
public class C_0619_DisemvowelTrolls {

    public static void main(String[] args) {
        System.out.println(disemVowel("This website is for losers LOL!"));
    }

    private static String disemVowel(String data) {
        StringBuilder stringBuilder = new StringBuilder(data);
        for (int i = stringBuilder.length() - 1; i >= 0; i--) {
            if (stringBuilder.charAt(i) == 'a' || stringBuilder.charAt(i) == 'e' ||
                    stringBuilder.charAt(i) == 'i' || stringBuilder.charAt(i) == 'o' ||
                    stringBuilder.charAt(i) == 'u' ||
                    stringBuilder.charAt(i) == 'A' || stringBuilder.charAt(i) == 'E' ||
                    stringBuilder.charAt(i) == 'I' || stringBuilder.charAt(i) == 'O' ||
                    stringBuilder.charAt(i) == 'U') {
                stringBuilder.deleteCharAt(i);
            }
        }
        return stringBuilder.toString();
    }
}
