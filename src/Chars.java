public enum Chars {
    OPEN_BRACKET('('),
    CLOSE_BRACKET(')');

    private char value;

    Chars(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

}
