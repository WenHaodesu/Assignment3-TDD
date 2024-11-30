package colourtable;

import java.util.ArrayList;
import java.util.List;

public class ColourTable {
    private final int size;
    private final List<Integer> colors;

    public ColourTable(int size) {
        validateParameter(size);
        this.size = size;
        this.colors = new ArrayList<>(size);
    }

    // Parameter validation method, eliminating duplicate code
    private void validateParameter(int size) {
        if (size <= 1 || (size & (size - 1)) != 0) {
            throw new IllegalArgumentException("Invalid palette size: " + size);
        }
    }

    public void add(int rgb) {
        if (colors.size() >= size) {
            throw new IllegalStateException("Exceeded the capacity of the ColourTable");
        }
        colors.add(rgb);
    }
}
