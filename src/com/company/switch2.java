package com.company;

public class switch2 {
    public static void main(String[] args) {
        Directs direct = Directs.RIGHT;
        switch (direct) {
            case LEFT:
                System.out.println("Left"); break;
            case RIGHT:
                System.out.println("Right");break;
            case UP:
                System.out.println("Up");break;
            case DOWN:
                System.out.println("Down"); break;
        }
    }
}
enum Directs{LEFT, RIGHT, UP, DOWN};