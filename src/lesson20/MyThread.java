package lesson20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("How many Fibonacci numbers did you want to print with MyThread.class?");
        Scanner console = new Scanner(System.in);
        int i = 1;
        for(int num : fibonacciFactory(console.nextInt())){
            System.out.println(i + " thread number is " + num);
            i++;
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
            }
            default -> {
                resultList.add(0);
                resultList.add(1);
                for (int i = 1; i < size - 1; i++) {
                    resultList.add(i + 1 + resultList.get(i));
                }
            }
        }
        return resultList;
    }
}
