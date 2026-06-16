package hexlet.code;

import hexlet.code.schemas.StringSchema;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ValidatorTest {
    @Test
    void testReturnStringSchema() {
        var v = new Validator();
        var schema = v.string();

        assertInstanceOf(StringSchema.class, schema);
    }

    @Test
    void testSecondValidator() {
        var v = new Validator();
        var schema = v.string();
        assertTrue(schema.minLength(10).minLength(4).isValid("Hexlet")); // true
    }
}
