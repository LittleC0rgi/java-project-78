package hexlet.code.schemas;

import java.util.Map;

public class MapSchema extends BaseSchema<Map<?, ?>> {
    private Integer size;
    private Map<String, ? extends BaseSchema<?>> shapeSchemas;

    public MapSchema sizeof(int num) {
        size = num;
        return this;
    }

    public MapSchema shape(Map<String, ? extends BaseSchema<?>> schemas) {
        shapeSchemas = schemas;
        return this;
    }

    @Override
    public MapSchema required() {
        super.required();
        return this;
    }

    @Override
    protected boolean validate(Map<?, ?> value) {
        if (size != null && value.size() != size) {
            return false;
        }

        if (shapeSchemas != null) {
            for (var entry : shapeSchemas.entrySet()) {
                var schema = entry.getValue();
                var mapValue = value.get(entry.getKey());

                if (!schema.isValid(mapValue)) {
                    return false;
                }
            }
        }


        return true;
    }
}
