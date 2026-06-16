package hexlet.code.schemas;

public abstract class BaseSchema<T> {
    protected boolean isRequired;

    public BaseSchema<T> required() {
        isRequired = true;
        return this;
    }

    public boolean isValid(T value) {
        if (value == null) {
            return !isRequired;
        }

        return validate(value);
    }

    protected abstract boolean validate(T value);
}
