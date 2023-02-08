package lesson20;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;
import static lesson20.MyThread.fibonacciFactory;

public class Main20 {
    public static void main(String[] args) throws InterruptedException {

//1

        MyThread myThread = new MyThread();
        myThread.start();
        myThread.join();

        RunnableThread runnableThread = new RunnableThread();
        Thread t = new Thread(runnableThread);
        t.start();
        t.join();

//2

        ExecutorService executable = Executors.newFixedThreadPool(2);
        executable.execute(() -> {
            System.out.println("How many Fibonacci numbers did you want to print with MyThread.class?");
            Scanner console = new Scanner(System.in);
            int i = 1;
            for (int num : fibonacciFactory(console.nextInt())) {
                System.out.println(i + " thread number is " + num);
                i++;
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        executable.shutdown();

        ExecutorService executable2 = Executors.newSingleThreadExecutor();
        executable2.execute(() -> {
            System.out.println("How many Fibonacci numbers did you want to print with RunnableThread.class?");
            Scanner console = new Scanner(System.in);
            int size = console.nextInt();
            for (int num : RunnableThread.fibonacciFactory(size)) {
                System.out.println(size + " thread number is " + num);
                size--;
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        executable2.shutdown();
    }
}
