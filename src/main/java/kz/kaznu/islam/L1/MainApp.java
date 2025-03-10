package kz.kaznu.islam.L1;


import java.sql.Array;

public class MainApp {
   static int total = 0;

    public static void main(String[] args) {
        String[][] array = {
                {"1", "error", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            sumArray(array);
            System.out.println("Sum of the elements " + total);
        }  catch (AppArraySizeException e) {
            System.out.println("Size of this array is more than 4x4");
        } catch (AppArrayDataException e) {
            System.out.println(e.getMessage());

        }
    }

    public static void sumArray(String[][] arr) throws AppArraySizeException, AppArrayDataException {
        if (arr.length > 4) throw new AppArraySizeException();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    int a = Integer.parseInt(arr[i][j]);
                    total += a;
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Некорректные данные в ячейке (" + i + ", " + j + "): " + arr[i][j]);
                }

            }
            if (arr[i].length > 4) throw new AppArraySizeException();
        }
    }

}
