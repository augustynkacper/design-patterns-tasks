package pl.agh.edu.dp.labirynth.entities.room;

import pl.agh.edu.dp.labirynth.Player;
import pl.agh.edu.dp.labirynth.entities.Direction;
import pl.agh.edu.dp.labirynth.entities.MapSite;

import java.util.EnumMap;
import java.util.Map;

public class Room extends MapSite
{
    private int roomNumber;
    private Map<Direction, MapSite> sides;


    public Room(int number){
        this.sides = new EnumMap<>(Direction.class);
        this.roomNumber = number;
    }

    public MapSite getSide(Direction direction){
        return this.sides.get(direction);
    }

    public void setSide(Direction direction, MapSite ms){
        this.sides.put(direction, ms);
    }

    public void setSides(MapSite mapSite) {
        for(Direction dir : Direction.values()){
            this.sides.put(dir, mapSite);
        }
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    @Override
    public void Enter(Player player){
        player.setRoom(this);
        //System.out.println("entered a new room");
    }
}
