package lesson20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("How many Fibonacci numbers did you want to print with RunnableThread.class?");
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        for (int num : fibonacciFactory(size)) {
            System.out.println(size + " thread number is " + num);
            size--;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static List<Integer> fibonacciFactory(int size) {
        List<Integer> resultList = new ArrayList<>();
        switch (size) {
            case 0 -> resultList.add(0);
            case 1 -> {
                resultList.add(0);
                resultList.add(1);
                Collections.reverse(resultList);
            }
            default -> {
                resultList.add(0);
                resultList.add(1);
                for (int i = 1; i < size - 1; i++) {
                    resultList.add(i + 1 + resultList.get(i));
                }
                Collections.reverse(resultList);
            }
        }
        return resultList;
    }
}
