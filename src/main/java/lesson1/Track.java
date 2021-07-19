package lesson1;

public class Track implements CanComplete {
    private int length;

    public Track(int length) {
        this.length = length;
    }

    public void complete(CanRunAndJump competitor) {
        competitor.run(length);
    }
}
