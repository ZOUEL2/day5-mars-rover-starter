package com.afs.tdd;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @Test
    void should_move_when_executeCommand_given_M() {
        Location location = new Location(0, 0, Direction.N);
        MarsRover marsRover = new MarsRover(location);

        marsRover.executeCommand(Command.M);

        Location nextLocation = new Location(0, 1, Direction.N);

        assertEquals(nextLocation.getLocationX(), marsRover.getLocation().getLocationX());
        assertEquals(nextLocation.getLocationY(), marsRover.getLocation().getLocationY());
        assertEquals(nextLocation.getDirection(), marsRover.getLocation().getDirection());
    }


}
