package pl.agh.edu.dp.labirynth.factory;

import pl.agh.edu.dp.labirynth.components.door.BombedDoor;
import pl.agh.edu.dp.labirynth.components.door.Door;
import pl.agh.edu.dp.labirynth.components.room.BombedRoom;
import pl.agh.edu.dp.labirynth.components.room.Room;
import pl.agh.edu.dp.labirynth.components.wall.Wall;

public class BombedMazeFactory implements MazeFactory {
    @Override
    public Room createRoom(int n) {
        return new BombedRoom(n);
    }

    @Override
    public Wall createWall() {
        return new Wall();
    }

    @Override
    public Door createDoor(Room r1, Room r2) {
        return new BombedDoor(r1, r2);
    }
}
