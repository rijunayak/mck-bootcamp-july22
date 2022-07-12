import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    @DisplayName("Perimeter should be 8 when the side is two")
    public void perimeterShouldBeEightWhenSideTwo() {
        //arrange
        Square sqaure = new Square(2);
        //act
        int perimeter = sqaure.perimeter();
        //assert
        assertEquals(8, perimeter);
    }
    @Test
    @DisplayName("Area should be 4 when the side is two")
    public void areaShouldBeFourWhenSideTwo() {
        //arrange
        Square sqaure = new Square(2);
        //act
        int area = sqaure.area();
        //assert
        assertEquals(4, area);
    }

}
