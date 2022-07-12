//import java.awt.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    @Test
    @DisplayName("Perimeter should be 10 when the length is two and the breadth is three")
    public void perimeterShouldBeTenWhenLengthTwoBreadthThree() {
        //arrange
        Rectangle rectangle = new Rectangle(2, 3);
        //act
        int perimeter = rectangle.perimeter();
        //assert
        assertEquals(10, perimeter);
    }

}
