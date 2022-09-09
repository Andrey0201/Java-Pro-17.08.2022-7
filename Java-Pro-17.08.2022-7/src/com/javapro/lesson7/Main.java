package com.javapro.lesson7;

public class Main {
    public static void main(String[] args) {
        findSymbolOccurance("america", 'a');
        System.out.println(findWordPosition("Apollo", "pollo"));
        System.out.println(findWordPosition("Apollo", "Plant"));
        System.out.println(stringReverse("Hello"));
        System.out.println(isPalindrome("ERE"));
        System.out.println(isPalindrome("Allo"));

    }

    public static void findSymbolOccurance(String str, char ch) {
        char[] chars = str.toCharArray();
        int count = 0;
        for (char a : chars)
            if (a == ch) {
                count++;
            }
        System.out.println(count);
    }

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);

    }

    public static String stringReverse(String str) {
        return new StringBuilder(str).reverse().toString();


    }

    public static boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}

