package pl.agh.edu.dp.main;

import pl.agh.edu.dp.builder.StandardBuilderMaze;
import pl.agh.edu.dp.labirynth.MazeGame;
import pl.agh.edu.dp.factory.EnchantedMazeFactory;

public class Main {

    public static void main(String[] args) {
        MazeGame mazeGame = new MazeGame(new StandardBuilderMaze(), new EnchantedMazeFactory());
        mazeGame.run();
    }
}



