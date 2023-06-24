package pl.agh.edu.dp.main;

import pl.agh.edu.dp.labirynth.builder.MazeBuilder;
import pl.agh.edu.dp.labirynth.builder.StandardBuilderMaze;
import pl.agh.edu.dp.labirynth.Maze;
import pl.agh.edu.dp.labirynth.MazeGame;
import pl.agh.edu.dp.labirynth.factory.EnchantedMazeFactory;
import pl.agh.edu.dp.labirynth.factory.MazeFactory;

public class Main {

    public static void main(String[] args) {
        MazeGame mazeGame = new MazeGame(new StandardBuilderMaze(), new EnchantedMazeFactory());
        mazeGame.run();
    }
}



