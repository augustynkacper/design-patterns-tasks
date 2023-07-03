package pl.agh.edu.dp.labirynth;

import pl.agh.edu.dp.builder.MazeBuilder;
import pl.agh.edu.dp.factory.BombedMazeFactory;
import pl.agh.edu.dp.labirynth.entities.room.Room;
import pl.agh.edu.dp.labirynth.entities.wall.Wall;
import pl.agh.edu.dp.factory.MazeFactory;
import pl.agh.edu.dp.labirynth.entities.Direction;
import pl.agh.edu.dp.factory.EnchantedMazeFactory;

public class MazeDirector {
    MazeFactory factory;
    MazeBuilder builder;
    public MazeDirector(MazeFactory factory, MazeBuilder builder){
        this.factory = factory;
        this.builder = builder;
    }
    public Maze getMaze(){
        /*      | r1 : r2 |
                - .. ------
                | r4 : r3 |
                ------ .. -
                     | r5 |
                     ------    dots are doors;  - or | are walls     */
        Room r1 = factory.createRoom(1); r1.setSides(new Wall());
        Room r2 = factory.createRoom(2); r2.setSides(new Wall());
        Room r3 = factory.createRoom(3); r3.setSides(new Wall());
        Room r4 = factory.createRoom(4); r4.setSides(new Wall());
        Room r5 = factory.createRoom(5); r5.setSides(new Wall());

        builder.addRoom(r1);
        builder.addRoom(r2);
        builder.addRoom(r3);
        builder.addRoom(r4);
        builder.addRoom(r5);

        builder.addWall(factory.createWall(), r1, Direction.East, r2);
        builder.addWall(factory.createWall(), r1, Direction.South, r4);
        builder.addWall(factory.createWall(), r4, Direction.East, r3);
        builder.addWall(factory.createWall(), r3, Direction.South, r5);

        builder.addDoor(factory.createDoor(r1,r2));
        builder.addDoor(factory.createDoor(r1,r4));
        builder.addDoor(factory.createDoor(r4,r3));
        builder.addDoor(factory.createDoor(r5,r3));

        System.out.println("Created a maze, rooms number: "+builder.getMaze().getRoomsNumber());
        return builder.getMaze();
    }

    public void checkSingletons() {
        MazeFactory enchFact1 = EnchantedMazeFactory.getInstance();
        MazeFactory enchFact2 = EnchantedMazeFactory.getInstance();

        MazeFactory bombFact1 = BombedMazeFactory.getInstance();
        MazeFactory bombFact2 = BombedMazeFactory.getInstance();

        if (enchFact1.equals(enchFact2) && bombFact1.equals(bombFact2)){
            System.out.println("it is singleton");
        }
    }
}
