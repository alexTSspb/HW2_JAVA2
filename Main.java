public class Main {

    public static void main(String[] args)  {
        String [][] arr;
        int sum;
        int rows = 5;
        int cols = 4;

        arr = TwoDimensionalArray.createArray(cols,rows);
        System.out.println();
        TwoDimensionalArray.printArray(arr);
        sum = TwoDimensionalArray.sumArray(arr);
        System.out.println("Сумма чисел в массиве равна " + sum);
        int test_rows = (int) (Math.random()*rows);
        int test_cols = (int) (Math.random()*cols);
//        System.out.println("Символ который будем изменять равен  " + arr[test_cols][test_rows]);
        arr[test_cols][test_rows] = "SYMBOL";
        TwoDimensionalArray.printArray(arr);
        sum = TwoDimensionalArray.sumArray(arr);
        System.out.println("Сумма чисел в массиве равна " + sum);


        System.out.println("КОЛИЧЕСТВО РАБОЧИХ ЧАСОВ  " + DayOfWeek.getWorkingHours(DayOfWeek.FRIDAY));
    }

}
