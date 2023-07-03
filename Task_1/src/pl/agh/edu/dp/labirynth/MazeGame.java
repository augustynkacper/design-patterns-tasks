package pl.agh.edu.dp.labirynth;

import pl.agh.edu.dp.builder.MazeBuilder;
import pl.agh.edu.dp.labirynth.entities.room.Room;
import pl.agh.edu.dp.factory.MazeFactory;

import java.util.Scanner;

public class MazeGame {
    private MazeBuilder builder;
    private MazeFactory factory;
    private Maze maze;
    private Player player;

    public MazeGame(MazeBuilder builder, MazeFactory factory){
        this.builder = builder;
        this.factory = factory;
        this.maze = createMaze();
        this.player = new Player();
    }
    public Maze createMaze() {
        MazeDirector director = new MazeDirector(factory, builder);
        return director.getMaze();
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        String input = "_";

        Room startRoom = maze.getStartRoom();
        Room endRoom = maze.getEndRoom();
        player.setRoom(startRoom);

        while (!input.equals("q")){
            input = scanner.nextLine();
            switch (input){
                case "w": {
                    player.moveUp();
                    break;
                }
                case "s": {
                    player.moveDown();
                    break;
                }
                case "a": {
                    player.moveLeft();
                    break;
                }
                case "d": {
                    player.moveRight();
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

            if (!player.isAlive()){
                System.out.println("you lost");
                break;
            }

            if (player.getRoom().equals(endRoom)){
                System.out.println("you won");
                break;
            }
        }
    }
}