import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    @DisplayName("The perimeter should be ten when length is two and breath is three")
    public void perimeterShouldBeTenWhenLengthTwoBreadthThree() {
        // Arrange
        Rectangle rectangle = new Rectangle(2, 3);

        //Act
        int perimeter = rectangle.perimeter();

        //Assert
        assertEquals(10, perimeter);
    }

    @Test
    @DisplayName("The perimeter should be Fourteen when length is three and breath is four")
    public void perimeterShouldBeFourteenWhenLengthThreeBreadthFour() {
        // Arrange
        Rectangle rectangle = new Rectangle(3, 4);

        //Act
        int perimeter = rectangle.perimeter();

        //Assert
        assertEquals(14, perimeter);
    }

    @Test
    @DisplayName("The area should be six when length is two and breadth is three")
    public void areaShouldSixWhenLengthTwoBreadthIsThree() {
        // Arrange
        Rectangle rectangle = new Rectangle(3, 4);

        //Act
        int area = rectangle.area();

        //Assert
        assertEquals(12, area);
    }


}
