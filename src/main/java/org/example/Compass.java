package org.example;

public class Compass {

    String point;

    public enum Point {
        NORTH, EAST, SOUTH, WEST
    }

    public enum Direction {
        RIGHT, LEFT
    }

    public Point rotate(Point point, Direction direction){
        if (point == Point.NORTH && direction == Direction.RIGHT) {
            return Point.EAST;
        }
        if (point == Point.EAST && direction == Direction.RIGHT) {
            return Point.SOUTH;
        }
        if (point == Point.SOUTH && direction == Direction.RIGHT) {
            return Point.WEST;
        }
        if (point == Point.WEST && direction == Direction.RIGHT) {
            return Point.NORTH;
        }

        if (point == Point.NORTH && direction == Direction.LEFT) {
            return Point.WEST;
        }
        if (point == Point.EAST && direction == Direction.LEFT) {
            return Point.NORTH;
        }
        if (point == Point.SOUTH && direction == Direction.LEFT) {
            return Point.EAST;
        }
        if (point == Point.WEST && direction == Direction.LEFT) {
            return Point.SOUTH;
        }
        return null;
    }
}
