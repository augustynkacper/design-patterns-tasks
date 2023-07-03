package pl.agh.edu.dp.labirynth.entities.wall;

import pl.agh.edu.dp.labirynth.Player;

public class BombedWall extends Wall{

    @Override
    public void Enter(Player player){
        int hp = player.getHp();
        player.addHp(hp);
        super.Enter(player);
    }
}
