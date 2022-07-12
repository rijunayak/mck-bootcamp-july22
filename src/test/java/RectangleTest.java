import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    @DisplayName("perimeter should be 20 when length is 4 and breadth is 6")
    public void testRectanglePerimeter() {
        Rectangle rectangle = Rectangle.createRectangle(4,6);
        int perimeter = rectangle.perimeter();
        Assertions.assertEquals(20, perimeter);

    }

}
