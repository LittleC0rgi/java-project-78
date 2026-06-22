package hexlet.code.schemas;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public abstract class BaseSchema<T> {
    protected Map<String, Predicate<T>> checks = new HashMap<>();
    protected boolean required = false;

    protected final void addCheck(String name, Predicate<T> validate) {
        checks.put(name, validate);
    }

    public BaseSchema<T> required() {
        required = true;
        return this;
    }

    public final boolean isValid(Object value) {
        if (value == null) {
            return !required;
        }

        try {
            @SuppressWarnings("unchecked")
            T typed = (T) value;
            return checks.values().stream().allMatch(p -> p.test(typed));
        } catch (ClassCastException e) {
            return false;
        }
    }
}
