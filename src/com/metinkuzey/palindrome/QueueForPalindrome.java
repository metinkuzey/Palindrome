package com.metinkuzey.palindrome;

public class QueueForPalindrome {
    Node front;     // front node of queue
    Node rear;      // rear node of queue
    int counter;    // queue process counter
    int size;       // queue sie

    //constructor of our queue
    public QueueForPalindrome(int size) {
        this.size = size;
        front = null;
        rear = null;
        counter = 0;
    }

    //adding new member to queue
    void enQueue(char ch) {
        if (!isFull()) {
            Node member = new Node(ch);
            if (isEmpty()) {
                front = member;
            } else {
                rear.next = member;
            }
            rear = member;
            counter++;
        }
    }

    //removing member from the queue
    char deQueue() {
        if (!isEmpty()) {
            char deQueuedChar = front.ch;
            front = front.next;
            counter--;
            return deQueuedChar;
        } else
            return '!';
    }

    //this function returns the front node of queue
    char peek() {
        if (isEmpty()) {
            System.out.println("Underflow... Program Terminated.");
            System.exit(-1);
        }
        return front.ch;
    }

    int size() {
        return counter;
    }

    boolean isEmpty() {
        return counter == 0;
    }

    boolean isFull() {
        return counter == size;
    }
}
