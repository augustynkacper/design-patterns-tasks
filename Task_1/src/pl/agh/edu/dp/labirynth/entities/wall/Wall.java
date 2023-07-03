package pl.agh.edu.dp.labirynth.entities.wall;

import pl.agh.edu.dp.labirynth.Player;
import pl.agh.edu.dp.labirynth.entities.MapSite;

public class Wall extends MapSite {
    public Wall(){

    }

    @Override
    public void Enter(Player player){
        System.out.println("you hit the wall");
    }
}
