package pl.agh.edu.dp.factory;

import pl.agh.edu.dp.labirynth.entities.door.Door;
import pl.agh.edu.dp.labirynth.entities.room.Room;
import pl.agh.edu.dp.labirynth.entities.wall.Wall;

public interface MazeFactory {
    Room createRoom(int n);
    Wall createWall();
    Door createDoor(Room r1, Room r2);
}
