package Laba2.task2;

import Laba2.task2.Ball;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(100, 100);
        System.out.println(ball);
        ball.move(20, 100);
        System.out.println(ball);
    }
}
