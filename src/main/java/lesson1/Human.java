package lesson1;

public class Human implements CanRunAndJump {
    private int jumpHeight;
    private int runLength;

    public Human(int jumpHeight, int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    @Override
    public void jump(int height) {
        if (height > jumpHeight) {
            System.out.println("Человек не перепрыгнул.");
        } else {
            System.out.println("Человек перепрыгнул.");
        }
    }

    @Override
    public void run(int length) {
        if (length > runLength) {
            System.out.println("Человек не пробежал.");
        } else {
            System.out.println("Человек пробежал.");
        }
    }
}
