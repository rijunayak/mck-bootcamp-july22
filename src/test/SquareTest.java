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
}
