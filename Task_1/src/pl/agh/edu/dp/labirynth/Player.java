package pl.agh.edu.dp.labirynth;

import pl.agh.edu.dp.labirynth.entities.Direction;
import pl.agh.edu.dp.labirynth.entities.room.Room;

public class Player {
    private Room room;
    private int hp;

    Player(){
        this.hp = 100;
    }

    public void moveLeft(){
        room.getSide(Direction.West).Enter(this);
        System.out.println("Moved West, hp: "+this.hp);
    }

    public void moveRight(){
        room.getSide(Direction.East).Enter(this);
        System.out.println("Moved East, hp: "+this.hp);
    }

    public void moveUp(){
        room.getSide(Direction.North).Enter(this);
        System.out.println("Moved North, hp: "+this.hp);
    }

    public void moveDown(){
        room.getSide(Direction.South).Enter(this);
        System.out.println("Moved South, hp: "+this.hp);
    }

    public void removeHp(int x){
        this.hp -= x;
    }
    public void addHp(int x){
        this.hp = Math.max(0, this.hp+x);
    }
    public int getHp(){return this.hp;}


    public Room getRoom(){return this.room;}
    public void setRoom(Room room){this.room = room;}

    public boolean isAlive(){ return this.hp>0; }
}
