package lesson2;

public class Main {
    public static void main(String[] args) {
        String[][] arr1 =
                {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};

        try {
            System.out.println(sumArray(arr1));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

        String[][] arr2 =
                {{"i", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};

        try {
            System.out.println(sumArray(arr2));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int sumArray(String[][] doubleArray) throws MyArraySizeException, MyArrayDataException {
        if (doubleArray.length != 4) {
            throw new MyArraySizeException("Длина массива не 4.");
        }

        for (String[] array : doubleArray) {
            if (array.length !=4) {
                throw new MyArraySizeException("Высота массива не 4.");
            }
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(doubleArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не int в " + i + "," + j);
                }
            }
        }
        return sum;
    }
}
