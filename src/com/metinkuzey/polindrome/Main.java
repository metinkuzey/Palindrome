package com.metinkuzey.polindrome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        boolean result = true;
        Scanner sc = new Scanner(System.in);
        String polindromeWord;
        StackForPolindrome myStack = new StackForPolindrome(100);
        QueueForPolindrome myQueue = new QueueForPolindrome(100);

        System.out.println("Please a word for checking is your word is polindrome: ");
        polindromeWord = sc.nextLine();
        int len = polindromeWord.length();
        char [] myChars = polindromeWord.toCharArray();

        while(i<len){
            myStack.push(myChars[i]);
            myQueue.enQueue(myChars[i]);
            i++;
        }

        while (!myQueue.isEmpty()){
            if(myStack.pop() != myQueue.deQueue()){
                result = false;
                break;
            }
        }

        if (result)
            System.out.println(polindromeWord + " is polindrome.");
        else
            System.out.println(polindromeWord + " is not polindrome.");
    }
}
