package pl.agh.edu.dp.labirynth.builder;

import pl.agh.edu.dp.labirynth.components.Direction;
import pl.agh.edu.dp.labirynth.Maze;
import pl.agh.edu.dp.labirynth.components.door.Door;
import pl.agh.edu.dp.labirynth.components.room.Room;
import pl.agh.edu.dp.labirynth.components.wall.Wall;

public class CountingMazeBuilder implements MazeBuilder{

    private int rooms, allWalls, commonWalls, doors;

    @Override
    public void addRoom(Room room) {
        rooms ++;
        allWalls += 4;
    }

    @Override
    public void addWall(Wall wall, Room room1, Direction direction, Room room2) {
        allWalls--;
        commonWalls++;
    }

    @Override
    public void addDoor(Door door) {
        allWalls--;
        commonWalls--;
        doors++;
    }

    @Override
    public void initialize() {
        rooms = 0;
        commonWalls = 0;
        allWalls = 0;
        doors = 0;
    }

    @Override
    public Maze getMaze() {
        return null;
    }

    public void getCounts(){
        System.out.println("Rooms: " + rooms);
        System.out.println("Doors: " + doors);
        System.out.println("All Walls: " + allWalls);
        System.out.println("Common Walls: " + commonWalls);
    }
}
