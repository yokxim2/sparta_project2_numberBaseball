package parse;

import exceptions.*;

import java.util.ArrayList;
import java.util.List;

public class ParserLv1 implements Parser {

    @Override
    public int parseNumber(String input) throws BadInputException {
        int number = pureNumberCheck(input);
        negativeCheck(number);
        digitsCheck(number);
        numberBoundCheck(number);
        numberDuplicateCheck(number);

        return number;
    }

    private int pureNumberCheck(String input) throws NotNumberException {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new NotNumberException();
        }
    }

    private void negativeCheck(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException();
        }
    }

    private void digitsCheck(int number) throws NotAllowedDigitsException {
        if (number < 100 || number > 1000) {
            throw new NotAllowedDigitsException(3);
        }
    }

    private void numberBoundCheck(int number) throws NumberOutOfBoundException {
        int num = number;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 0) {
                throw new NumberOutOfBoundException();
            }
            num /= 10;
        }
    }

    private void numberDuplicateCheck(int number) throws DuplicateNumberException {
        List numberList = new ArrayList();
        int num = number;
        while (num > 0) {
            int digit = num % 10;
            if (numberList.contains(digit)) {
                throw new DuplicateNumberException();
            } else {
                numberList.add(digit);
            }
            num /= 10;
        }
    }
}
