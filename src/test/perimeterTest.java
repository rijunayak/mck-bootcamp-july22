import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class perimeterTest {

    @Test
    @DisplayName(" Perimeter should be ten when length is three and breadth is two ")
    public void testPerimeter(){

        Rectangle rectangle = new Rectangle(3,2);
        //Act
        int perimeter= rectangle.perimeter();
        //Assert
        Assertions.assertEquals(10,perimeter);

    }
}
