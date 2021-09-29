package Practic1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class main {

    static class PingWritter implements Runnable{
        private Object locker;

        public PingWritter(Object locker) {
            this.locker = locker;
        }

        @Override
        public void run() {
            int i = 0;
            synchronized (locker) {
                while(i < 100) {
                    System.out.println("Ping");
                    i++;
                    locker.notify();
                    try {
                        locker.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                locker.notify();
            }

        }
    }

    static class PongWritter implements Runnable{
        private Object locker;

        public PongWritter(Object locker) {
            this.locker = locker;
        }
        @Override
        public void run() {
            int i = 0;
            synchronized (locker) {
                while(i < 100) {

                    System.out.println("Pong");
                    i++;

                    locker.notifyAll();

                    try {
                        locker.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                locker.notify();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Object locker = new Object();
        PingWritter pingWritter = new PingWritter(locker);
        PongWritter pongWritter = new PongWritter(locker);
        Thread th = new Thread(pingWritter);
        Thread th2 = new Thread(pongWritter);

        th.start();
        th2.start();
    }
}
