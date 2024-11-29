package colourtable;

public class ColourTable {
    private final int size;

    public ColourTable(int size) {

        if (size <= 1) {
            throw new IllegalArgumentException("Invalid palette size: " + size);
        }
        if ((size & (size - 1)) != 0) {
            throw new IllegalArgumentException("Invalid palette size: " + size);
        }
        this.size = size;
    }
}