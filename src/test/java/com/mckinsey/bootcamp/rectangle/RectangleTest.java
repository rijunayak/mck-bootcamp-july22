package com.mckinsey.bootcamp.rectangle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    @DisplayName("Perimeter should be 14 for length 2 and breadth 5")
    public void perimeterForLengthTwoBreadthFive() {
        //Arrange
        Rectangle rectangle = Rectangle.createRectangle(2, 5);

        //Act
        int perimeter = rectangle.perimeter();

        //Assert
        assertEquals(14, perimeter);
    }

    @Test
    @DisplayName("Perimeter should be 24 for length 7 and breadth 5")
    public void perimeterForLengthSevenBreadthFive() {
        //Arrange
        Rectangle rectangle = Rectangle.createRectangle(7, 5);

        //Act
        int perimeter = rectangle.perimeter();

        //Assert
        assertEquals(24, perimeter);
    }

    @Test
    @DisplayName("Perimeter should be 20 for length 4 and breadth 6")
    public void perimeterForLengthFourBreadthSix() {
        //Arrange
        Rectangle rectangle = Rectangle.createRectangle(4, 6);

        //Act
        int perimeter = rectangle.perimeter();

        //Assert
        assertEquals(20, perimeter);
    }

    @Test
    @DisplayName("Area should be 25 for edge 5")
    public void areaShouldBeTwentyFiveForEdgeFive() {
        //Arrange
        Rectangle square = Rectangle.createSquare(5);

        //Act
        int area = square.area();

        //Assert
        assertEquals(25, area);
    }

    @Test
    @DisplayName("Area should be 49 for edge 7")
    public void areaShouldBeFortyNineForEdgeSeven() {
        //Arrange
        Rectangle square = Rectangle.createSquare(7);

        //Act
        int area = square.area();

        //Assert
        assertEquals(49, area);
    }

    @Test
    @DisplayName("Perimeter should be 25 for edge 5")
    public void perimeterShouldBeTwentyFiveForEdgeFive() {
        //Arrange
        Rectangle square = Rectangle.createSquare(5);

        //Act
        int perimeter = square.perimeter();

        //Assert
        assertEquals(20, perimeter);
    }
}
