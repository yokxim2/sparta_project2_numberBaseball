package grade;

import generate.Generator;
import generate.GeneratorLv1;

import java.util.ArrayList;
import java.util.List;

public class GraderLv1 implements Grader {

    private final int answer = (new GeneratorLv1()).generate();
    private int strikeCount = 0;
    private int ballCount = 0;

    @Override
    public int grade(int number) {
        ArrayList<Integer> answerToList = numberToList(answer);
        ArrayList<Integer> targetNumberToList = numberToList(number);
        for (int i = 0; i < targetNumberToList.size(); i++) {
            int targetNumber = targetNumberToList.get(i);
            if (answerToList.contains(targetNumber)) {
                if (answerToList.get(i) == targetNumber) {
                    strikeCount++;
                } else {
                    ballCount++;
                }
            }
        }
        printResult();
        return strikeCount;
    }

    private ArrayList<Integer> numberToList(int number) {
        ArrayList<Integer> list = new ArrayList<>();

        while (number > 0) {
            list.add(0, number % 10);
            number /= 10;
        }
        return list;
    }

    private void printResult() {
        if (strikeCount == 3) {
            System.out.println("정답입니다!");
        } else if (strikeCount == 0 && ballCount == 0) {
            System.out.println("아웃!");
        } else {
            System.out.println(strikeCount + " 스트라이크 " + ballCount + " 볼!");
        }
    }
}
