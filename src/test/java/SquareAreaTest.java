import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SquareAreaTest {

    @Test
    @DisplayName(" Area should be Four whe side is 2  ")
    public void areaShouldBeFourWhenSideTwo() {
        //Arrange
        SquareArea squareArea = new SquareArea(2);
        //Act
        int area = squareArea.area();

    }
}
