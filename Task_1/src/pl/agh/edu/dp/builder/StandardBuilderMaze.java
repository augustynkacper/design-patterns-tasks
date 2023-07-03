package pl.agh.edu.dp.builder;

import pl.agh.edu.dp.labirynth.entities.Direction;
import pl.agh.edu.dp.labirynth.Maze;
import pl.agh.edu.dp.labirynth.entities.door.Door;
import pl.agh.edu.dp.labirynth.entities.room.Room;
import pl.agh.edu.dp.labirynth.entities.wall.Wall;

public class StandardBuilderMaze implements MazeBuilder {

    private Maze currentMaze;
    public StandardBuilderMaze(){
        initialize();
    }
    @Override
    public void initialize(){
        this.currentMaze = new Maze();
    }
    @Override
    public void addRoom(Room room) {
        currentMaze.addRoom(room);
    }
    @Override
    public void addWall(Wall wall, Room room1, Direction direction, Room room2) {
        room1.setSide(direction, wall);
        room2.setSide(direction.opposite(), wall);
    }
    @Override
    public void addDoor(Door door) {
        Direction dir = door.getCommonDirection();
        door.getRoom1().setSide(dir, door);
        door.getRoom2().setSide(dir.opposite(), door);
    }
    @Override
    public Maze getMaze(){ return this.currentMaze; }
}
