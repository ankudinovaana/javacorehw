package lesson1;

public class Cat implements CanRunAndJump {
    private int jumpHeight;
    private int runLength;

    public Cat(int jumpHeight, int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    @Override
    public void jump(int height) {
        if (height > jumpHeight) {
            System.out.println("Кот не перепрыгнул.");
        } else {
            System.out.println("Кот перепрыгнул.");
        }
    }

    @Override
    public void run(int length) {
        if (length > runLength) {
            System.out.println("Кот не пробежал.");
        } else {
            System.out.println("Кот пробежал.");
        }
    }
}
