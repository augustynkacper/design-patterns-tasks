package pl.agh.edu.dp.labirynth.entities.room;

import pl.agh.edu.dp.labirynth.Player;

import java.util.Random;

public class BombedRoom extends Room{
    public BombedRoom(int n){
        super(n);
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