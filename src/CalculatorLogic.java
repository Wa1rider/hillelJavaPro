import java.util.Stack;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CalculatorLogic {
    private static final String OPERATORS = "-+/*";
    private static Stack<String> stackOperations = new Stack<>();
    private static Stack<String> stackAnswer = new Stack<>();

    public static boolean countBracketIsRight(String str) {
        char[] charArr = str.toCharArray();
        int leftBracket = 0;
        int rightBracket = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == Chars.OPEN_BRACKET.getValue()) {
                leftBracket++;
            } else if (charArr[i] == Chars.CLOSE_BRACKET.getValue()) {
                if (++rightBracket > leftBracket) {
                    return false;
                }
            }
        }
        if (!(leftBracket == rightBracket)) {
            return false;
        }
        return true;
    }

    public static boolean expressionIsRight(String str) {
        if (!str.matches("[\\d()*/+-]+")) {
            return false;
        }
        Pattern p = Pattern.compile("[*/+-][*/+-]+");
        Matcher m = p.matcher(str);
        if (m.find()) {
            return false;
        }
        return true;
    }

    public static String mainLogic(String str) {
        str = str.replace(" ", "").replace("(-", "(0-");
        if (!expressionIsRight(str)) {
            return "Ошибка - введенно некорректное выражение";
        }
        if (!countBracketIsRight(str)) {
            return "Ошибка - введенно некорректное количество скобок в примере";
        }
        if (str.charAt(0) == '-') {
            str = "0" + str;
        }
        StringTokenizer st = new StringTokenizer(str, OPERATORS + "()", true);
        String stackTemp;
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (isNumber(token)) {
                stackAnswer.push(token);
            } else if (isOperator(token)) {
                if (!stackOperations.isEmpty()) {
                    while (!stackOperations.empty()) {
                        if (Operations.operationsCompare(token, stackOperations.peek()) < 1) {
                            stackTemp = stackAnswer.pop();
                            stackAnswer.push(Operations.operationResult(stackOperations.pop(), Double.parseDouble(stackAnswer.pop()), Double.parseDouble(stackTemp)));
                        } else {
                            break;
                        }
                    }
                }
                stackOperations.push(token);
            } else if (token.equals(Character.toString(Chars.CLOSE_BRACKET.getValue()))) {
                while (!(stackOperations.peek().equals(Character.toString(Chars.OPEN_BRACKET.getValue())))) {
                    stackTemp = stackAnswer.pop();
                    stackAnswer.push(Operations.operationResult(stackOperations.pop(), Double.parseDouble(stackAnswer.pop()), Double.parseDouble(stackTemp)));
                }
                stackOperations.pop();
            } else {
                stackOperations.push(token);
            }
        }
        if (stackOperations.empty() && stackAnswer.size() > 1) {
            return "Ошибка - введенно некорректное выражение";
        }
        while (!stackOperations.empty()) {
            stackTemp = stackAnswer.pop();
            stackAnswer.push(Operations.operationResult(stackOperations.pop(), Double.parseDouble(stackAnswer.pop()), Double.parseDouble(stackTemp)));
        }
        return "" + stackAnswer.pop();
    }

    private static boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private static boolean isOperator(String token) {
        return OPERATORS.contains(token);
    }
}