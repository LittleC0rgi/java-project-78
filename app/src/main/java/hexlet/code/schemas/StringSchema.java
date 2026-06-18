package hexlet.code.schemas;

public class StringSchema extends BaseSchema<String> {

    private Integer minLength;
    private String contains;

    public StringSchema minLength(int length) {
        minLength = length;
        return this;
    }

    public StringSchema contains(String substring) {
        contains = substring;
        return this;
    }

    @Override
    protected boolean validate(String value) {

        if (value.isEmpty() && isRequired) {
            return false;
        }

        if (minLength != null && value.length() < minLength) {
            return false;
        }

        if (contains != null && !value.contains(contains)) {
            return false;
        }

        return true;
    }

    @Override
    public StringSchema required() {
        super.required();
        return this;
    }
}
