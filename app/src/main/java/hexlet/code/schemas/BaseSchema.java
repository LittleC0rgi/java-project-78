package hexlet.code.schemas;

public abstract class BaseSchema<T> {
    protected boolean isRequired;

    public BaseSchema<T> required() {
        isRequired = true;
        return this;
    }

    public boolean isValid(Object value) {
        if (value == null) {
            return !isRequired;
        }

        return validate(cast(value));
    }

    private T cast(Object value) {
        return (T) value;
    }

    protected abstract boolean validate(T value);
}
