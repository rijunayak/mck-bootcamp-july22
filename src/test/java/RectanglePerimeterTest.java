import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RectanglePerimeterTest {

    @Test
    @DisplayName("The perimeter should be ten when length is two and breath is three")
    public void perimeterShouldBeTenWhenLengthTwoBreadthThree(){
        // Arrange
        RectanglePerimeter rectanglePerimeter = new RectanglePerimeter(2,3);

        //Act
        int perimeter = rectanglePerimeter.perimeter();

        //Assert
        Assertions.assertEquals(10,perimeter);
    }
}
