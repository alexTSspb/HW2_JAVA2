import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class TwoDimensionalArray {
    private static final int ROWS = 4;
    private static final int COLUMNS = 4;
    private static Random random = new Random();
    private static final int RAND_RANGE = 50;

    //Создаем и заполняем массив типа String числами "0..RAND_RANGE"
    public static String[][] createArray(int rows, int cols) {
        String[][] arr = new String[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++)
                arr[i][j] = "" + random.nextInt(RAND_RANGE);
        }
        try {
            isSize(cols, rows);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        return arr;
    }

    //Выведем массив на экран
    public static void printArray(String[][] arr)
    {
        for(int j = 0; j < arr.length; j++)
        {
            System.out.println(Arrays.toString(arr[j]));
        }
    }

    //Проверка требуемого размера массива
    public static void isSize(int a, int b) throws MyArraySizeException {
        if (a != ROWS || b != COLUMNS)
            throw new MyArraySizeException("Вы создали массив не требуемого значения");
    }

    // Проверка на возможность приведения String TO Int
    public static boolean isInteger(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //Вычисление суммы массива
    public static int sumArray(String[][] array) {
        int sum = 0;
        int cols = array.length;
        int rows = array[0].length;

        int i = 0;
        int j = 0;

        for (i = 0; i < cols; i++)
            for (j = 0; j < rows; j++) {
                try {
                    if (isInteger(array[i][j])) {
                        sum += Integer.parseInt(array[i][j]);
                    }
                    else
                    {
                        throw new MyArrayDataException("Найден символ, отличный от числового ", i, j);
                    }
                } catch (MyArrayDataException e) {
                   e.printStackTrace();
                }

            }

        return sum;
    }
}
