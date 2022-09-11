package com.javapro.lesson7;

import java.util.Random;
import java.util.Scanner;

public class Main {

  private static String[] words = null;

  public static void main(String[] args) {
    findSymbolOccurance(null, 'a');
    findSymbolOccurance("america", 'b');
    System.out.println(findWordPosition("Apollo", "pollo"));
    System.out.println(findWordPosition("Apollo", null));
    System.out.println(findWordPosition("Apollo", "Plant"));
    System.out.println(stringReverse("Hello"));
    System.out.println(stringReverse(null));
    System.out.println(isPalindrome("ERE"));
    System.out.println(isPalindrome("Allo"));
    System.out.println(isPalindrome(null));
    createWordsArray();
    guessWord();
  }

  public static void findSymbolOccurance(String str, char ch) {
    if (str != null) {
      char[] chars = str.toCharArray();
      int count = 0;
      for (char a : chars) {
        if (a == ch) {
          count++;
        }
      }
      System.out.println(count);
    } else {
      System.out.println("String is null");
    }
  }

  public static int findWordPosition(String source, String target) {
    int position = 0;
    if (source != null && target != null) {
      position = source.indexOf(target);
    } else {
      System.out.print("String is null ");
    }
    return position;
  }

  public static String stringReverse(String str) {
    String srtRevers = null;
    if (str != null) {
      srtRevers = new StringBuilder(str).reverse().toString();
    } else {
      System.out.print("String is ");
    }
    return srtRevers;
  }

  public static boolean isPalindrome(String str) {
    boolean isPalidrome = false;
    if (str != null) {
      isPalidrome = new StringBuilder(str).reverse().toString().equals(str);
    } else {
      System.out.print("String is ");
    }
    return isPalidrome;
  }

  public static void createWordsArray() {
    words = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
        "carrot",
        "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
        "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
  }

  public static String randomWord() {
    Random random = new Random();
    int n = random.nextInt(words.length);
    return words[n];
  }

  public static void guessWord() {
    String word = randomWord();
    System.out.println("Secret word: " + word);
    String guess = null;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Guess word. This can be any fruit or any vegetable. ");

    while (!word.equals(guess)) {
      System.out.println("Enter word:");
      guess = scanner.next();
      for (int i = 0; i < 15; i++) {
        if (i < word.length() && i < guess.length() &&
            word.charAt(i) == guess.charAt(i)) {
          System.out.print(word.charAt(i));
        } else if (word.equals(guess)) {
          break;
        } else {
          System.out.print("#");
        }
      }
      System.out.println();
    }
  }
}

