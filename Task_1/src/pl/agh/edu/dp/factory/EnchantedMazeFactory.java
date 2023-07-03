package pl.agh.edu.dp.factory;

import pl.agh.edu.dp.labirynth.entities.door.Door;
import pl.agh.edu.dp.labirynth.entities.door.EnchantedDoor;
import pl.agh.edu.dp.labirynth.entities.room.EnchantedRoom;
import pl.agh.edu.dp.labirynth.entities.room.Room;
import pl.agh.edu.dp.labirynth.entities.wall.Wall;

public class EnchantedMazeFactory implements MazeFactory {
    @Override
    public Room createRoom(int n) {
        return new EnchantedRoom(n);
    }

    @Override
    public Wall createWall() {
        return new Wall();
    }

    @Override
    public Door createDoor(Room r1, Room r2) {
        return new EnchantedDoor(r1, r2);
    }
}
