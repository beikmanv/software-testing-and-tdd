package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompassTest {

    @Test
    @DisplayName("Turn RIGHT")
    void rotateRight() {
        // Arrange
        Compass.Point north = Compass.Point.NORTH;
        Compass.Point east = Compass.Point.EAST;
        Compass.Point south = Compass.Point.SOUTH;
        Compass.Point west = Compass.Point.WEST;
        Compass.Direction right = Compass.Direction.RIGHT;

        // Act
        Compass compass = new Compass();
        Compass.Point result1 = compass.rotate(north, right);
        Compass.Point result2 = compass.rotate(east, right);
        Compass.Point result3 = compass.rotate(south, right);
        Compass.Point result4 = compass.rotate(west, right);

        // Assert
        assertAll(
                "Grouped Assertions of Points",
                () -> assertEquals(east, result1),
                () -> assertEquals(south, result2),
                () -> assertEquals(west, result3),
                () -> assertEquals(north, result4)
        );
    }

    @Test
    @DisplayName("Turn LEFT")
    void rotateLeft() {
        // Arrange
        Compass.Point north = Compass.Point.NORTH;
        Compass.Point east = Compass.Point.EAST;
        Compass.Point south = Compass.Point.SOUTH;
        Compass.Point west = Compass.Point.WEST;
        Compass.Direction left = Compass.Direction.LEFT;

        // Act
        Compass compass = new Compass();
        Compass.Point result5 = compass.rotate(north, left);
        Compass.Point result6 = compass.rotate(east, left);
        Compass.Point result7 = compass.rotate(south, left);
        Compass.Point result8 = compass.rotate(west, left);

        // Assert
        assertAll(
                "Grouped Assertions of Points",
                () -> assertEquals(west, result5),
                () -> assertEquals(north, result6),
                () -> assertEquals(east, result7),
                () -> assertEquals(south, result8)
        );
    }
}