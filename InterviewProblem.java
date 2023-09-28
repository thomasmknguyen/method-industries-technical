public class InterviewProblem {
    public static String mathFunction(int number1, int number2, int number3) {
        StringBuilder result = new StringBuilder();

        if (number1 + number2 == number3)
            result.append("+");

        if (number1 - number2 == number3)
            result.append("-");

        if (number1 * number2 == number3)
            result.append("*");

        if (number2 != 0 && number1 / number2 == number3)
            result.append("/");

        if (result.length() == 0)
            return "None";

        return result.toString();
    }
}
