package com.afs.tdd;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @ParameterizedTest
    @CsvSource({
            "0, 0, N, 0:1:N",
            "1, 1, E, 2:1:E",
            "2, 2, S, 2:1:S",
            "3, 3, W, 2:3:W"
    })
    void should_move_when_executeCommand_given_M(int x, int y, Direction direction, String expected) {
        Location location = new Location(x, y, direction);

        MarsRover marsRover = new MarsRover(location);

        String result = marsRover.executeCommand(Command.M);

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0, N, 0:0:W",
            "1, 1, W, 1:1:S",
            "2, 2, S, 2:2:E",
            "3, 3, E, 3:3:N"
    })
    void should_turnLeft_when_executeCommand_given_L(int x, int y, Direction direction, String expected) {
        Location location = new Location(x, y, direction);

        MarsRover marsRover = new MarsRover(location);

        String result = marsRover.executeCommand(Command.L);

        assertEquals(expected, result);

    }


}
