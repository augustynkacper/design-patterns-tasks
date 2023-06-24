package pl.agh.edu.dp.labirynth.builder;

import pl.agh.edu.dp.labirynth.components.Direction;
import pl.agh.edu.dp.labirynth.Maze;
import pl.agh.edu.dp.labirynth.components.door.Door;
import pl.agh.edu.dp.labirynth.components.room.Room;
import pl.agh.edu.dp.labirynth.components.wall.Wall;

public interface MazeBuilder {
    void addRoom(Room room);
    void addWall(Wall wall, Room room1, Direction direction, Room room2);
    void addDoor(Door door);
    void initialize();
    Maze getMaze();
}
