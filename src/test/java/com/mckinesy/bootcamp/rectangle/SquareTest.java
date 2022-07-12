package com.mckinesy.bootcamp.rectangle;

import com.mckinesy.bootcamp.rectangle.Rectangle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SquareTest {

    @Test
    @DisplayName("Area four when side is two")

    public void areaFourWhenSideIsTwo() {
        Rectangle square = Rectangle.createSquare(2);
        int area = square.area();
        assertEquals(4, area);
    }

    @Test
    @DisplayName("Area sixteen when side is four")

    public void areaSixteenWhenSideIsFour() {
        Rectangle square = Rectangle.createSquare(4);
        int area = square.area();
        assertEquals(16, area);
    }


    @Test
    @DisplayName("Perimeter Eight when side is two")

    public void perimeterEightWhenSideIsTwo() {
        Rectangle square = Rectangle.createSquare(2);
        int perimeter = square.perimeter();
        assertEquals(8, perimeter);
    }

    @Test
    @DisplayName("Perimeter sixteen when side is three")

    public void perimeterTwelveWhenSideIsThree() {
        Rectangle square = Rectangle.createSquare(3);
        int perimeter = square.perimeter();
        assertEquals(12, perimeter);
    }
}
