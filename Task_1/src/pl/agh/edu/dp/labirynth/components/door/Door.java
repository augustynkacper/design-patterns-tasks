package pl.agh.edu.dp.labirynth.components.door;

import pl.agh.edu.dp.labirynth.components.Direction;
import pl.agh.edu.dp.labirynth.components.MapSite;
import pl.agh.edu.dp.labirynth.components.room.Room;

public class Door extends MapSite {
    private Room room1;
    private Room room2;

    public Door(Room r1, Room r2){
        this.room1 = r1;
        this.room2 = r2;
    }


    @Override
    public void Enter(){

    }

    public Direction getCommonDirection(){
        for (Direction dir: Direction.values()){
            if (room1.getSide(dir).equals(room2.getSide(dir.opposite()))){
                return dir;
            }
        }
        throw new IllegalArgumentException("No common wall between rooms!");
    }

    public Room getRoom1() {
        return room1;
    }

    public void setRoom1(Room room1) {
        this.room1 = room1;
    }

    public Room getRoom2() {
        return room2;
    }

    public void setRoom2(Room room2) {
        this.room2 = room2;
    }
}
