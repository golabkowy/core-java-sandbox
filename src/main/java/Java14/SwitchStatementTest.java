package Java14;

import java.util.function.Function;

public class SwitchStatementTest {

    static Function<Integer, String> someFunction(Integer condition) {
        //function always returns result
//        Function fun example = (asd)-> "asd";
        return switch (condition) {
            case 1 -> (argInt) -> "case1Result";
            case 2 -> (argInt) -> "case2Result";
            case 3 -> (argInt) -> "case3Result";
            case 4 -> (argInt) -> "case4Result";
            default -> throw new IllegalStateException("Unexpected value: " + condition);
        };
    }

    private static Integer classicExample(String condition) {
        Integer switchExpressionResult = switch (condition) {
            case "A" -> 1;
            case "B" -> 2;
            case "C" -> 3;
            case "D" -> 4;
            default -> throw new IllegalStateException("Unexpected value: " + condition);
        };
        System.out.println("Check the result of switch expression: " + switchExpressionResult);
        return switchExpressionResult;
    }

    public static void main(String[] args) {
        classicExample("B");
    }
}
