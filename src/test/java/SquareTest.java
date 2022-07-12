
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SquareTest {

    @Test
    @DisplayName("Area four when side is two")

    public void areaFourWhenSideIsTwo(){
        Square square = new Square(2);
        int area = square.area();
        assertEquals(4,area);
    }
    @Test
    @DisplayName("Area sixteen when side is four")

    public void areaSixteenWhenSideIsFour(){
        Square square = new Square(4);
        int area = square.area();
        assertEquals(16,area);
    }

    
}
