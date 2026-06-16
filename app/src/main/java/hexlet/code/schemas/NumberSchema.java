package hexlet.code.schemas;

public class NumberSchema {
    private boolean isPositive;
    private boolean isRequired;
    private Integer minRange;
    private Integer maxRange;

    public NumberSchema required() {
        isRequired = true;
        return this;
    }

    public NumberSchema positive() {
        isPositive = true;
        return this;
    }

    public NumberSchema range(int min, int max) {
        minRange = min;
        maxRange = max;
        return this;
    }

    public boolean isValid(Integer value) {
        if (value == null) {
            return !isRequired;
        }

        if (isPositive) {
            return value > 0;
        }

        if (minRange != null && maxRange != null) {
            return minRange <= value && maxRange >= value;
        }

        return true;
    }
}
