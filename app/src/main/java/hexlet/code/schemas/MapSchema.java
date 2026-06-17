package hexlet.code.schemas;

import java.util.Map;

public class MapSchema extends BaseSchema<Map<?, ?>> {
    private Integer size;

    public MapSchema sizeof(int num) {
        size = num;
        return this;
    }

    @Override
    protected boolean validate(Map<?, ?> value) {
        if (size != null) {
            return value.size() == size;
        }

        return true;
    }
}
