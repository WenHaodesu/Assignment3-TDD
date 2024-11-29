package colourtable;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ColourTableTest {

    @Test
    void shouldThrowExceptionWhenPaletteSizeIsInvalid() {
        // Invalid size: not power of two, less than 2
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(3));
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(1));
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(-2));
    }
}
