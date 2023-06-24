package pl.agh.edu.dp.labirynth;

import pl.agh.edu.dp.labirynth.builder.MazeBuilder;
import pl.agh.edu.dp.labirynth.factory.MazeFactory;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MazeGame {
    MazeBuilder builder;
    MazeFactory factory;
    Maze maze;

    public MazeGame(MazeBuilder builder, MazeFactory factory){
        this.builder = builder;
        this.factory = factory;
        this.maze = createMaze();
    }
    public Maze createMaze() {
        MazeDirector director = new MazeDirector(factory, builder);
        return director.getMaze();
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        String input = "_";

        while (!input.equals("q")){
            input = scanner.nextLine();
            switch (input){
                case "w": {
                    System.out.println("Moved North");
                    break;
                }
                case "s": {
                    System.out.println("Moved South");
                    break;
                }
                case "a": {
                    System.out.println("Moved West");
                    break;
                }
                case "d": {
                    System.out.println("Moved East");
                    break;
                }
                case "q": {
                    System.out.println("Quit");
                    break;
                }
                default:{
                    System.out.println("Wrong Input!");
                    break;
                }

            }
        }
    }
}