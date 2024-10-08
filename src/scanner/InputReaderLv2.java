package scanner;

import control.Controller;
import exceptions.BadInputException;

import java.util.Scanner;

public class InputReaderLv2 implements InputReader {

    Controller controller;

    public InputReaderLv2(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void scan() {
        int digitInput = 3; // default
        Scanner scanner = new Scanner(System.in);
        System.out.println(" < 환영합니다! 원하시는 번호를 입력해주세요. > ");
        boolean gameEnd = false;
        while (!gameEnd) {
            System.out.println();
            System.out.println("1. 게임 시작하기 2. 게임 기록 보기 3. 종료하기 >>");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    try {
                        while (true) {
                            System.out.println("숫자를 입력하세요: " );
                            String userInput = scanner.nextLine();

                            if (!controller.checkAndScore(userInput, digitInput)) {
                                break;
                            }
                        }
                    } catch (BadInputException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "2":
                    System.out.println("지원하지 않는 기능입니다. 다른 옵션을 선택해 주세요.");
                    break;
                case "3":
                    gameEnd = true;
            }
        }
    }
}
