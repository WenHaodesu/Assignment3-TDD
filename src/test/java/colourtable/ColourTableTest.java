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

    @Test
    void shouldThrowExceptionWhenAddingBeyondCapacity() {
        ColourTable table = new ColourTable(2); // Palette size is 2
        table.add(0xFFFFFF); // Adding first color (valid 24-bit RGB)
        table.add(0x000000); // Adding second color (valid 24-bit RGB)

        // This should throw an exception as it exceeds the palette size
        assertThrows(IllegalStateException.class, () -> table.add(0x123456));
    }
}
