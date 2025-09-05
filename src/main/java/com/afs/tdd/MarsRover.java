package com.afs.tdd;

public class MarsRover {

    private final Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public String executeCommand(String commands) {
       commands.codePoints()
               .mapToObj(command -> (char) command)
               .forEach(this::processCommand);

        return location.getLocationX() + ":" +
                location.getLocationY() + ":" +
                location.getDirection();
    }

    private void processCommand(char command) {
        switch (Command.valueOf(String.valueOf(command))) {
            case M -> move();
            case L -> turnLeft();
            case R -> turnRight();
            case B -> moveBack();
        }

    }

    private void move() {
        switch (location.getDirection()) {
            case N -> location.setLocationY(location.getLocationY() + 1);
            case W -> location.setLocationX(location.getLocationX() - 1);
            case E -> location.setLocationX(location.getLocationX() + 1);
            case S -> location.setLocationY(location.getLocationY() - 1);
        }
    }

    private void turnLeft() {
        switch (location.getDirection()) {
            case N -> location.setDirection(Direction.W);
            case W -> location.setDirection(Direction.S);
            case E -> location.setDirection(Direction.N);
            case S -> location.setDirection(Direction.E);
        }
    }

    private void turnRight() {
        switch (location.getDirection()) {
            case N -> location.setDirection(Direction.E);
            case W -> location.setDirection(Direction.N);
            case E -> location.setDirection(Direction.S);
            case S -> location.setDirection(Direction.W);
        }
    }

    private void moveBack() {
        switch (location.getDirection()) {
            case N -> location.setLocationY(location.getLocationY() - 1);
            case W -> location.setLocationX(location.getLocationX() + 1);
            case E -> location.setLocationX(location.getLocationX() - 1);
            case S -> location.setLocationY(location.getLocationY() + 1);
        }
    }

}
