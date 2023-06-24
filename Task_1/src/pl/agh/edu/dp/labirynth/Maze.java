package pl.agh.edu.dp.labirynth;

import pl.agh.edu.dp.labirynth.components.room.Room;

import java.util.Vector;

public class Maze {
    private Vector<Room> rooms;

    public Maze() {
        this.rooms = new Vector<Room>();
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public void setRooms(Vector<Room> rooms) {
        this.rooms = rooms;
    }

    public Vector<Room> getRooms() { return rooms; }

    public int getRoomsNumber()
    {
        return rooms.size();
    }

    public boolean isEndRoom(int n) {return n==rooms.size();}
}
