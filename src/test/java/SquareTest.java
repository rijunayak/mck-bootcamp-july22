import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    @DisplayName("area should be 25 when the side of square is 5")
    public void areaOfSquareShouldBe_25_WhenSideIs_5() {
        Rectangle rectangle = Rectangle.createSquare(5);
        int area = rectangle.area();
        assertEquals(25, area);
    }

    @Test
    @DisplayName("area should be 49 when the side of square is 7")
    public void areaOfSquareShouldBe_49_WhenSideIs_7() {
        Rectangle rectangle = Rectangle.createSquare(7);
        int area = rectangle.area();
        assertEquals(49, area);
    }


    @Test
    @DisplayName("Perimeter should be 28 when the side of square 7")
    public void perimeterOfSquareShouldBe_28_WhenSideIs_7() {
        Rectangle rectangle = Rectangle.createSquare(7);
        int perimeter = rectangle.perimeter();
        assertEquals(28, perimeter);
    }

    @Test
    @DisplayName("Perimeter should be 25 when the side of square 5")
    public void perimeterOfSquareShouldBe_25_WhenSideIs_5() {
        Rectangle rectangle = Rectangle.createSquare(5);
        int perimeter = rectangle.perimeter();
        assertEquals(20, perimeter);
    }
}
