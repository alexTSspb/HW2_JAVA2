public class MyArrayDataException extends Exception {
    public MyArrayDataException(String msg, int i , int j)
    {
        super(msg);
        System.out.println("НЕ числовой символ в "+"столбец " + i+ " строка " + j);
    }


}
