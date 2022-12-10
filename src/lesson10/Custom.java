package lesson10;

import javax.print.DocFlavor;
import java.util.*;

public class Custom {
    public static void main(String[] args) {

//1

        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        if (text.length() != 5) {
            throw new IllegalArgumentException("Your text is smaller or bigger than 5 letters.");
        }
        String[] arrStr = text.toUpperCase().split("");
        boolean lastAndFirst = Objects.equals(arrStr[0], arrStr[4]);
        boolean secondAndFourth = Objects.equals(arrStr[1], arrStr[3]);
        if (lastAndFirst && secondAndFourth) {
            System.out.println("It's really palindrome.");
        } else {
            System.out.println("It's not palindrome.");
        }

//2

        String[] vowelLetters = {"A", "E", "I", "O", "U"};
        StringBuilder builder = new StringBuilder();
        for (String let : vowelLetters) {
            builder.append(let);
        }

        String[] arrStr2 = text.split("");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrStr2.length; i++) {
            if (builder.indexOf(arrStr2[i].toUpperCase()) >= 0) {
                arrStr2[i] = "-";
            }
            result.append(arrStr2[i]);
        }
        String resultString = result.toString();
        System.out.println(resultString);

//3

        String sentence = "I'm a teacher of the year in Ukraine because i love to be teacher";
        int counter = 0;
        String[] arrSentence = sentence.split(" ");
        StringBuilder tempBuilder = new StringBuilder();
        for(String word : arrSentence) {
            if(word.length() > 3) {
                counter++;
                tempBuilder.append(word);
                tempBuilder.append(" ");
            }
        }
        System.out.println(counter);

//4

        Map<String, Integer> matcherMap = new HashMap<>();
        String fromBuilder = tempBuilder.toString();
        String[] onlyWordsArr = fromBuilder.split(" ");
        onlyWordsArr[onlyWordsArr.length - 1] = onlyWordsArr[onlyWordsArr.length - 1].trim();
        int matcher = 0;
        String matcherWord = "";
        for (String currentString : onlyWordsArr) {
            if (matcherMap.containsKey(currentString)) {
                int valueUpdated = matcherMap.get(currentString) + 1;
                if (valueUpdated > matcher) {
                    matcher = valueUpdated;
                    matcherWord = currentString;
                }
            } else {
                matcherMap.put(currentString, 1);
            }
        }
        System.out.println(matcherWord);
    }
}
