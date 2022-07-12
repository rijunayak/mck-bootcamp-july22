import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectanglePerimeterTest {

    @Test
    @DisplayName("The perimeter should be ten when length is two and breath is three")
    public void perimeterShouldBeTenWhenLengthTwoBreadthThree() {
        // Arrange
        RectanglePerimeter rectanglePerimeter = new RectanglePerimeter(2, 3);

        //Act
        int perimeter = rectanglePerimeter.perimeter();

        //Assert
        assertEquals(10, perimeter);
    }

    @Test
    @DisplayName("The perimeter should be Fourteen when length is three and breath is four")
    public void perimeterShouldBeFourteenWhenLengthThreeBreadthFour() {
        // Arrange
        RectanglePerimeter rectanglePerimeter = new RectanglePerimeter(3, 4);

        //Act
        int perimeter = rectanglePerimeter.perimeter();

        //Assert
        assertEquals(14, perimeter);
    }



}
