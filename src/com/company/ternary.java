package com.company;

public class ternary {
    public static void main(String[] args) {
        int age = 17;
        String  s= age<18 ? "denied":"legalise";
        System.out.println(s);
        System.out.printf("%d,%d,%d,%d", (int)'a',(int) 'z' ,(int) 'A', (int) 'Z' );
        char ch = 'b';
        String answer = (int) ch>=97 && (int) ch<=122? "lowercase": (int) ch>=65 && (int) ch<=90? "Uppercase": "not a letter";
        System.out.println(answer);
    }
}
