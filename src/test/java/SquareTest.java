import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    @DisplayName("Perimeter should be 8 when the side is two")
    public void perimeterShouldBeEightWhenSideTwo() {
        //arrange
        Square square = new Square(2);
        //act
        int perimeter = square.perimeter();
        //assert
        assertEquals(8, perimeter);
    }
    @Test
    @DisplayName("Perimeter should be 20 when the side is 5")
    public void perimeterShouldBeTwentyWhenSideFive() {
        //arrange
        Square square = new Square(5);
        //act
        int perimeter = square.perimeter();
        //assert
        assertEquals(20, perimeter);
    }



    @Test
    @DisplayName("Area should be 4 when the side is two")
    public void areaShouldBeFourWhenSideTwo() {
        //arrange
        Square square = new Square(2);
        //act
        int area = square.area();
        //assert
        assertEquals(4, area);
    }

}
