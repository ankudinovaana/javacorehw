package lesson1;

public class Main {
    public static void main(String[] args) {
        CanRunAndJump[] competitors = {new Cat(5, 10), new Human(2, 20),
        new Robot(1, 15)};

        CanComplete[] completes = {new Track(10), new Wall(1)};

        for (CanRunAndJump canRunAndJump : competitors) {
            for (CanComplete canComplete : completes) {
                canComplete.complete(canRunAndJump);
            }
        }
    }
}
