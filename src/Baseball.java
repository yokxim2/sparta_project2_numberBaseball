import exceptions.BadInputException;
import grade.Grader;
import parse.Parser;

public class Baseball {

    Grader grader;
    Parser parser;

    public Baseball(Grader grader, Parser parser) {
        this.grader = grader;
        this.parser = parser;
    }

    public int hit(String userInput) {
        try {
            int inputInt = parser.parseNumber(userInput);
            return grader.grade(inputInt);
        } catch (BadInputException e) {
            System.out.println(e.getMessage());
        }
        return -1;
    }
}
