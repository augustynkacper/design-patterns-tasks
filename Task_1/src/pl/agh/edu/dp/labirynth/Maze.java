package pl.agh.edu.dp.labirynth;

import pl.agh.edu.dp.labirynth.entities.room.Room;

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

    public Room getStartRoom(){
        for(Room r: rooms){
            if (r.getRoomNumber()==1) return r;
        }
        return null;
    }

    public Room getEndRoom(){
        for(Room r: rooms){
            if (r.getRoomNumber()==rooms.size()){
                return r;
            }
        }
        return null;
    }
}
