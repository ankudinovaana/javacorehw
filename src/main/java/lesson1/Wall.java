package lesson1;

public class Wall implements CanComplete {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void complete(CanRunAndJump competitor) {
        competitor.jump(height);
    }
}
