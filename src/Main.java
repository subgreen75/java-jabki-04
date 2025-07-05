import java.util.Random;
//import java.util.Scanner;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] names = {"Первый", "Второй", "Третий"};
        System.out.println(names);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (int number : numbers) {
            System.out.println(numbers[number]);
        }

        System.out.println(names.length);
        System.out.printf("Среднее = %s%s",average(10),System.lineSeparator());


        int[][] matrix = new int[10][10];
        int[][] grid = {{1,2},{3,4}};
        print(matrix);
        print(grid);
        printIndex(grid);
        printIndex(matrix);
        int[][] data = createMatrix(2);
        print(data);

        System.out.println(space(3,5));

        sum(data);
    }
    static String space(int n, int spaceCount) {
        String strNumber = Integer.toString(n);
        if (strNumber.length() >= spaceCount) {
            return strNumber;
        } else {
            for (int i = strNumber.length(); i <= spaceCount; i++) {
                strNumber += " ";
            }
        }
        return strNumber;
    }

    static int average(int size) {
        int[] arr = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = RANDOM.nextInt(100);
            sum += arr[i] ;
        }
        return sum / size;
    }

    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(space(arr[i][j],3));
            }
            System.out.println();
        }
    }

    static void printIndex(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("(%s, %s) ",i,j);
            }
            System.out.println();
        }
    }

    static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = RANDOM.nextInt(100);
            }
        }
        return matrix;
    }

    static void sum(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            System.out.printf("Сумма по строке %s = %s%s", i, sum, System.lineSeparator());
        }
    }
}