package com.metinkuzey.palindrome;

public class StackForPalindrome {
    Node top;    // top node of our stack
    int counter; // process counter
    int size;    // stack size

    public StackForPalindrome(int size) {
        this.size = size;
        counter = 0;
        top = null;
    }
    //adding new member to top of stack
    void push(char ch){
        Node member = new Node(ch);
        if(!isFull()){
            if (!isEmpty()) {
                member.next = top;
            }
            top = member;
            counter++;
        }
    }
    //removing the top member of stack
    char pop(){
        if (!isEmpty()){
           char popChar = top.ch;
           top = top.next;
           counter--;
           return popChar;
        }else {
            System.out.println("Stack is empty");
            return '!';
        }
    }
    boolean isEmpty(){
        return counter == 0;
    }

    boolean isFull(){
        return counter == size;
    }
}
