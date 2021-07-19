package lesson1;

public class Robot implements CanRunAndJump {
    private int jumpHeight;
    private int runLength;

    public Robot(int jumpHeight, int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }


    @Override
    public void jump(int height) {
        if (height > jumpHeight) {
            System.out.println("Робот не перепрыгнул.");
        } else {
            System.out.println("Робот перепрыгнул.");
        }
    }

    @Override
    public void run(int length) {
        if (length > runLength) {
            System.out.println("Робот не пробежал.");
        } else {
            System.out.println("Робот пробежал.");
        }
    }
}
