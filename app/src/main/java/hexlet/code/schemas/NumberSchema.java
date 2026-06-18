package hexlet.code.schemas;

public class NumberSchema extends BaseSchema<Integer> {

    private boolean isPositive;
    private Integer minRange;
    private Integer maxRange;

    public NumberSchema positive() {
        isPositive = true;
        return this;
    }

    public NumberSchema range(int min, int max) {
        minRange = min;
        maxRange = max;
        return this;
    }

    @Override
    public NumberSchema required() {
        super.required();
        return this;
    }

    @Override
    protected boolean validate(Integer value) {

        if (isPositive && value <= 0) {
            return false;
        }

        if (minRange != null && maxRange != null) {
            return value >= minRange && value <= maxRange;
        }

        return true;
    }
}
