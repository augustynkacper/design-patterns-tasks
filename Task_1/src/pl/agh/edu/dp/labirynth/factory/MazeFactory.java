package pl.agh.edu.dp.labirynth.factory;

import pl.agh.edu.dp.labirynth.components.door.Door;
import pl.agh.edu.dp.labirynth.components.room.Room;
import pl.agh.edu.dp.labirynth.components.wall.Wall;

public interface MazeFactory {
    Room createRoom(int n);
    Wall createWall();
    Door createDoor(Room r1, Room r2);
}
