package pl.agh.edu.dp.builder;

import pl.agh.edu.dp.labirynth.entities.Direction;
import pl.agh.edu.dp.labirynth.Maze;
import pl.agh.edu.dp.labirynth.entities.door.Door;
import pl.agh.edu.dp.labirynth.entities.room.Room;
import pl.agh.edu.dp.labirynth.entities.wall.Wall;

public interface MazeBuilder {
    void addRoom(Room room);
    void addWall(Wall wall, Room room1, Direction direction, Room room2);
    void addDoor(Door door);
    void initialize();
    Maze getMaze();
}
