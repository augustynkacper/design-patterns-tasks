package pl.agh.edu.dp.labirynth.entities.door;

import pl.agh.edu.dp.labirynth.Player;
import pl.agh.edu.dp.labirynth.entities.room.Room;

import java.util.Random;

public class BombedDoor extends Door{
    public BombedDoor(Room r1, Room r2) {
        super(r1, r2);
    }

    @Override
    public void Enter(Player player){
        Random rand = new Random();
        int max = 50;
        int min = 0;
        int hp = rand.nextInt(max-min+1) + min;
        player.addHp(-hp);
        super.Enter(player);
    }
}
