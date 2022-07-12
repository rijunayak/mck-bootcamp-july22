import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    @DisplayName("Area should be Nine when side is Three")
    public void areaShouldBeNineWhenSideIsThree(){
        Square square = new Square(3);


        int area = square.area();

        Assertions.assertEquals(9,area);
    }

    public void perimeterShouldBeTwelveWhenSideIsThree(){
        Square square = new Square(3);

        int perimeter = square.perimeter();

        Assertions.assertEquals(12, perimeter);
    }

//    @DisplayName("Perimeter should be 8 when side is 2")
//    public void PerimeterShouldBeEightWhenSideIsTwo(){
//        Square square = new Square(2);
//        int perimeter = square.perimeter();
//        Assertions.assertEquals();
//
//    }
}
