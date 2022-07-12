package com.mckinsey.bootcamp.rectangle;

//import com.mckinsey.bootcamp.rectangle.Rectangle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class perimeterTest {

    @Test
    @DisplayName(" Perimeter should be ten when length is three and breadth is two ")
    public void testPerimeter() {

        //Arrange
        Rectangle rectangle = new Rectangle(3, 2);
        //Act
        int perimeter = rectangle.perimeter();
        //Assert
        assertEquals(10, perimeter);

    }
}
