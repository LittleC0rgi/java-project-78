package hexlet.code.schemas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class NumberSchemaTest {
    @Test
    void testRequired() {
        var schema = new NumberSchema();

        assertTrue(schema.isValid(5));

        assertTrue(schema.isValid(null));
        assertTrue(schema.positive().isValid(null));

        schema.required();

        assertFalse(schema.isValid(null));
        assertTrue(schema.isValid(10));
    }

    @Test
    void testPositive() {
        var schema = new NumberSchema();
        schema.positive();

        assertFalse(schema.isValid(-10));
        assertFalse(schema.isValid(0));
    }

    @Test
    void testRange() {
        var schema = new NumberSchema();
        schema.range(5, 10);

        assertTrue(schema.isValid(5));
        assertTrue(schema.isValid(10));
        assertFalse(schema.isValid(4));
        assertFalse(schema.isValid(11));
    }
}
