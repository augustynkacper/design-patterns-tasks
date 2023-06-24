package pl.agh.edu.dp.labirynth.components;

public enum Direction {
    North, South, East, West;

    public Direction opposite(){
        switch (this) {
            case North: return South;
            case South: return North;
            case West: return East;
            default: return West;
        }
    }

    public Direction next(){
        switch (this) {
            case North: return East;
            case South: return West;
            case West: return North;
            default: return South;
        }
    }
}