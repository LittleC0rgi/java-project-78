package hexlet.code.schemas;

import java.util.Map;

public class MapSchema extends BaseSchema<Map<?, ?>> {
    @Override
    public MapSchema required() {
        super.required();
        return this;
    }

    public MapSchema sizeof(int num) {
        addCheck("sizeof", value -> value.size() == num);
        return this;
    }

    public MapSchema shape(Map<String, ? extends BaseSchema<?>> schemas) {
        addCheck("shape", value -> {
            for (var entry : schemas.entrySet()) {
                var schema = entry.getValue();
                var mapValue = value.get(entry.getKey());
                if (!schema.isValid(mapValue)) {
                    return false;
                }
            }
            return true;
        });
        return this;
    }
}
