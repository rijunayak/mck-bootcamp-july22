public class RectanglePerimeter {

    private int length;
    private int breadth;

    public RectanglePerimeter(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int perimeter() {
        return 2*(length + breadth);
    }
}
