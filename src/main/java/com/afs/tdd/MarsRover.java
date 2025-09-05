package com.afs.tdd;

public class MarsRover {

    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public String executeCommand(Command command) {
        if (command == Command.M){
            move(location);
        }

        StringBuilder result = new StringBuilder();
        result.append(location.getLocationX()).append(":")
                .append(location.getLocationY()).append(":")
                .append(location.getDirection());
        return result.toString();
    }

    public void move(Location location) {
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




}
