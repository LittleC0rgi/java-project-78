package hexlet.code.schemas;

public class StringSchema {
    private boolean isRequired;
    private Integer minLength;
    private String contains;

    public StringSchema required() {
        isRequired = true;
        return this;
    }

    public StringSchema minLength(int length) {
        minLength = length;
        return this;
    }

    public StringSchema contains(String substring) {
        contains = substring;
        return this;
    }

    public boolean isValid(String value) {

        if (value == null) {
            return !isRequired;
        }

        if (value.isEmpty()) {
            return !isRequired;
        }

        if (minLength != null && value.length() < minLength) {
            return false;
        }

        if (contains != null && !value.contains(contains)) {
            return false;
        }

        return true;
    }
}
