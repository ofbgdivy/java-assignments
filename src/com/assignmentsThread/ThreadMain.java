package com.assignmentsThread;

public class ThreadMain {


    public static void main(String[] args) {
        Thread t1 = new Thread(new InitialThread());
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread t2 = new Thread(new SecondThread());
        t2.start();

        Thread t3 = new Thread(new ThirdThread());
        t3.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t4 = new Thread(new LastThread());

/*------Zombie Thread Check-------  */

        if(!(t2.isAlive()&&t3.isAlive())){
            t4.start();
        }

    }
}
