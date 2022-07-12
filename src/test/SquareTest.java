import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    @DisplayName("Area should be 4 when side is two")

    public void AreaShouldBeFourWhenSideIsTwo(){
        Square square =new Square(2);
        int area = square.area();
        Assertions.assertEquals(4,area);
    }
    @DisplayName("Area should be 6 when side is three")
    public void AreaShouldBeSixWhenSideIsThree(){
        Square square =new Square(3);
        int area = square.area();
        Assertions.assertEquals(6,area);
    }
    @DisplayName("Perimeter should be 8 when side is 2")
    public void PerimeterShouldBeEightWhenSideIsTwo(){
        Square square =new Square(2);
        int perimeter = square.perimeter();
        Assertions.assertEquals(4,area);
    } */

}
