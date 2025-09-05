package com.afs.tdd;

public class MarsRover {

    private final Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public String executeCommand(Command command) {
        switch (command) {
            case M:
                move();
                break;
            case L:
                turnLeft();
                break;
            case R:
                turnRight();
                break;
            case B:
                moveBack();
                break;
        }

        return location.getLocationX() + ":" +
                location.getLocationY() + ":" +
                location.getDirection();
    }

    private void move() {
        switch (location.getDirection()) {
            case N:
                location.setLocationY(location.getLocationY() + 1);
                break;
            case W:
                location.setLocationX(location.getLocationX() - 1);
                break;
            case E:
                location.setLocationX(location.getLocationX() + 1);
                break;
            case S:
                location.setLocationY(location.getLocationY() - 1);
                break;
        }
    }

    private void turnLeft() {
        switch (location.getDirection()) {
            case N:
                location.setDirection(Direction.W);
                break;
            case W:
                location.setDirection(Direction.S);
                break;
            case E:
                location.setDirection(Direction.N);
                break;
            case S:
                location.setDirection(Direction.E);
                break;
        }
    }

    private void turnRight() {
        switch (location.getDirection()) {
            case N:
                location.setDirection(Direction.E);
                break;
            case W:
                location.setDirection(Direction.N);
                break;
            case E:
                location.setDirection(Direction.S);
                break;
            case S:
                location.setDirection(Direction.W);
                break;
        }
    }

    private void moveBack() {
        switch (location.getDirection()) {
            case N:
                location.setLocationY(location.getLocationY() - 1);
                break;
            case W:
                location.setLocationX(location.getLocationX() + 1);
                break;
            case E:
                location.setLocationX(location.getLocationX() - 1);
                break;
            case S:
                location.setLocationY(location.getLocationY() + 1);
                break;
        }
    }


}
