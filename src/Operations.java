public enum Operations {
    MULTIPLY("*", 2) {
        @Override
        public double getResult(double a, double b) {
            return a * b;
        }
    },
    DIVISION("/", 2) {
        @Override
        public double getResult(double a, double b) {
            return a / b;
        }
    },
    ADDITION("+", 1) {
        @Override
        public double getResult(double a, double b) {
            return a + b;
        }
    },
    SUBTRACTION("-", 1) {
        @Override
        public double getResult(double a, double b) {
            return a - b;
        }
    };

    private String operation;
    private int priority;

    Operations(String operationValue, int priorityValue) {
        operation = operationValue;
        priority = priorityValue;
    }

    public String getOperation() {
        return operation;
    }

    public int getPriority() {
        return priority;
    }

    public abstract double getResult(double a, double b);

    public static String operationResult(String s, double a, double b) {
        for (Operations op : Operations.values())
            if (op.getOperation().equals(s)) {
                return "" + op.getResult(a, b);
            }
        return "";
    }

    public static int operationsCompare(String s1, String s2) {
        int s1Priority = 0;
        int s2Priority = 0;
        for (Operations op : Operations.values()) {
            if (op.getOperation().equals(s1)) {
                s1Priority = op.getPriority();
            }
            if (op.getOperation().equals(s2)) {
                s2Priority = op.getPriority();
            }
        }
        if (s1Priority == 0 || s2Priority == 0) {
            return 2;
        } else {
            return s1Priority - s2Priority;
        }
    }
}
