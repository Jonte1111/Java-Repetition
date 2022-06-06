public class Conversation {
    private int source;
    private int destination;
    private int start;
    private int duration;

    public Conversation(int source, int destination, int start, int duration) {
        this.source = source;
        this.destination= destination;
        this.start= start;
        this.duration= duration;
    }
    public int getDestination() {
        return destination;
    }
    public int getDuration() {
        return duration;
    }
    public int getSource() {
        return source;
    }
    public int getStart() {
        return start;
    }
    public String print() {
        String phoneString = String.valueOf(source) + " " + String.valueOf(destination)+ " " + String.valueOf(start)+ " " + String.valueOf(duration);
        return phoneString;
    }
}
