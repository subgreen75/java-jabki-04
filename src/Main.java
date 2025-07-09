import java.time.Month;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        System.out.println("*** Одномерные массивы ***");
        System.out.println("1. Создайте метод, который выводит массив в консоль.");
        int[] arrTask1 = getRandomArray(10);
        printArray(arrTask1);
        System.out.println();

        System.out.println("2. Напишите метод, который принимает массив целых чисел и возвращает сумму всех его элементов.");
        int[] arrTask2 = getRandomArray(20);
        System.out.print("Массив: ");
        printArray(arrTask2);
        System.out.printf("Сумма всех чисел: %s%s", getSum(arrTask2), System.lineSeparator());
        System.out.println();

        System.out.println("3. Реализуйте метод для поиска минимального элемента в одномерном массиве");
        int[] arrTask3 = getRandomArray(8);
        System.out.print("Массив: ");
        printArray(arrTask3);
        System.out.printf("Минимальный элемент: %s%s", getMin(arrTask3), System.lineSeparator());
        System.out.println();

        System.out.println("4. Создайте массив строк, инициализируйте его названиями месяцев года. Выведите все строки, начинающиеся на букву \"М\"");
        String[] months = getMonthsArray();
        System.out.print("Исходный массив месяцев: ");
        printArray(months);
        String startMonthSymbols = "М";
        System.out.printf("Массив месяцев, начинающийся с %s: ", startMonthSymbols);
        printArray(months, startMonthSymbols);
        System.out.println();

        System.out.println("5. Напишите метод, который инвертирует порядок элементов в одномерном массиве");
        int[] arrTask5 = getRandomArray(20);
        System.out.print("Исходный массив :        ");
        printArray(arrTask5);
        arrTask5 = getInvertedArray(arrTask5);
        System.out.print("Инвертированный массив : ");
        printArray(arrTask5);
        System.out.println();

        System.out.println("6. Напишите метод, который проверяет, есть ли в массиве повторяющиеся элементы");
        int[] arrTask6 = getRandomArray(20, 300);
        System.out.print("Исходный массив : ");
        printArray(arrTask6);
        int countRepeatingElements = countRepeatingElements(arrTask6);
        if (countRepeatingElements == 0) {
            System.out.println("Нет повторяющихся элементов");
        } else {
            System.out.printf("Количество повторяющихся элементов = %s, Индексы повторяющихся элементов : %s%s", countRepeatingElements, getIndexesRepeatingElements(arrTask6), System.lineSeparator());
        }
        System.out.println();

        System.out.println("7. Напишите метод, который заменяет все отрицательные числа в массиве на их абсолютные значения.");
        int[] arrTask7 = getRandomArray(20, -100, 100);
        System.out.print("Исходный массив :        ");
        printArray(arrTask7, 6);
        arrTask7 = replaceNegativeValuesArray(arrTask7);
        System.out.print("Массив с модулями числа: ");
        printArray(arrTask7, 6);
        System.out.println();

        System.out.println("*** Многомерные массивы ***");
        System.out.println("1. Создайте двумерный массив 3x3, заполните его единицами на главной диагонали и нулями в остальных ячейках. Выведите массив");
        int[][] arrTask2_1 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrTask2_1[i][j] = i == j ? 1 : 0;
            }
        }
        printArray(arrTask2_1, 2);
        System.out.println();

        System.out.println("2. Напишите метод, вычисляющий сумму всех элементов в двумерном массиве");
        int[][] arrTask2_2 = getRandomTwoDimArray(3, -5, 5);
        System.out.println("Исходный массив:");
        printArray(arrTask2_2, 3);
        System.out.printf("Сумма всех элементов: %s%s", getSum(arrTask2_2), System.lineSeparator());
        System.out.println();

        System.out.println("3. Реализуйте поиск максимального элемента в матрице и вывод его координат (строка, столбец)");
        int[][] arrTask2_3 = getRandomTwoDimArray(3, -5, 5);
        System.out.println("Исходный массив:");
        printArray(arrTask2_3, 3);
        int max = getMax(arrTask2_3); // значение максимального элемента
        System.out.printf("Максимальный эелемент = %s%s", max, System.lineSeparator());
        System.out.println("Координаты максимального элемента:");
        printIndexByMax(arrTask2_3, max);
        System.out.println();

        System.out.println("4. Реализуйте проверку, является ли двумерный массив квадратным (количество строк = количеству столбцов)");
        int[][] arrTask2_4 = new int[3][3];
        printArray(arrTask2_4,3);
        System.out.println(checkArrIsSqueare(arrTask2_4) ? "Массив квадратный" : "Массив не квадратный");

        System.out.println("5. Напишите метод, который находит сумму элементов каждой строки, минимальное и максимальное значение двумерного массива и выводит результаты");
        int[][] arrTask2_5 = getRandomTwoDimArray(3, -2, 7);
        System.out.println("Исходный массив:");
        printArray(arrTask2_5, 3);
        printSumOnLine(arrTask2_5);
        System.out.printf("Минимальное значение = %s, Максимальное значение = %s\n", getMin(arrTask2_5), getMax(arrTask2_5));

        System.out.println("6. Создайте двумерный массив, заполните его так, чтобы элементы на четных позициях были 0, на нечетных — 1.");
        int[][] arrTask2_6 = new int[5][5];
        for (int i = 0; i < arrTask2_6.length; i++) {
            for (int j = 0; j < arrTask2_6[i].length; j++) {
                arrTask2_6[i][j] = i % 2 == 0 && j % 2 == 0 ? 0 : 1;
            }
        }
        System.out.println("Результат заполнения матрицы:");
        printArray(arrTask2_6, 3);
    }

    /**
     * аналог функции space в sql (добавляет пробелы) к числу слева
     *
     * @param n          число
     * @param spaceCount - количество символов в результирующей строке (остаток от длины n добивается пробелом)
     * @param direct - показывает с какой стороны добавлять L - слева, R - справа
     * @return строка с пробелами
     */
    static String space(int n, int spaceCount, char direct) {
        String strNumber = Integer.toString(n);
        if (strNumber.length() >= spaceCount) {
            return strNumber;
        } else {
            for (int i = strNumber.length(); i < spaceCount; i++) {
                switch (direct) {
                    case 'L':
                        strNumber = " " + strNumber;
                        continue;
                    case 'R':
                        strNumber += " ";
                        continue;
                    default:
                        strNumber = " " + strNumber;
                        continue;
                }
            }
        }
        return strNumber;
    }

    /**
     * заполнение массива случайными числами
     *
     * @param size Размер массива
     * @return Массив, заполненный случайнами числами
     */
    static int[] getRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = RANDOM.nextInt(100);
        }
        return arr;
    }

    /**
     * заполнение массива случайными числами в дипазане от 0 до max
     *
     * @param size Размер массива
     * @param max  верхняя границы поиска случайных чисел
     * @return Массив, заполненный случайнами числами
     */
    static int[] getRandomArray(int size, int max) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = RANDOM.nextInt(max);
        }
        return arr;
    }

    /**
     * заполнение массива случайными числами в дипазане от min до max
     *
     * @param size Размер массива
     * @param min  нижняя граница поиска случайных чисел
     * @param max  верхняя граница поиска случайных чисел
     * @return Массив, заполненный случайнами числами
     */
    static int[] getRandomArray(int size, int min, int max) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = RANDOM.nextInt(min, max);
        }
        return arr;
    }

    /**
     * заполнение двумерного массива случайными числами в дипазане от min до max
     *
     * @param size Размер массива
     * @param min  нижняя граница поиска случайных чисел
     * @param max  верхняя граница поиска случайных чисел
     * @return Массив, заполненный случайнами числами
     */
    static int[][] getRandomTwoDimArray(int size, int min, int max) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = RANDOM.nextInt(min, max);
            }
        }
        return arr;
    }

    /**
     * воазращает название месяца по номеру
     *
     * @param monthNumber Номер месяца
     * @param style       Стиль
     * @param locale      локаль
     * @return название месяца
     */
    static String getMonthName(int monthNumber) {
        Month month = Month.of(monthNumber);
        String monthName = month.getDisplayName(TextStyle.FULL_STANDALONE, new Locale("ru", "RU"));
        return monthName.substring(0, 1).toUpperCase() + monthName.substring(1);
    }

    /**
     * заполнение массива названиями месяца
     *
     * @return Массив, заполненный названиями месяцев
     */
    static String[] getMonthsArray() {
        String[] arr = new String[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getMonthName(i + 1);
        }
        return arr;
    }

    /**
     * Выводит в консоль одномерный массив целых чисел в формате [n1,n2,...]
     *
     * @param arr Одномерный массив
     */
    static void printArray(int[] arr) {
        String arrStr = "[";
        for (int i = 0; i < arr.length; i++) {
            arrStr += arr[i];
            if (i != arr.length - 1) {
                arrStr += ",";
            } else {
                arrStr += "]";
            }
        }
        System.out.println(arrStr);
    }

    /**
     * Выводит в консоль одномерный массив целых чисел в формате [n1,n2,...]
     *
     * @param arr          Одномерный массив
     * @param spaceElement - заполняем пробелами до размера строки =  spaceElement
     */
    static void printArray(int[] arr, int spaceElement) {
        String arrStr = "[";
        for (int i = 0; i < arr.length; i++) {
            arrStr += space(arr[i], spaceElement,'L');
            if (i != arr.length - 1) {
                arrStr += ",";
            } else {
                arrStr += "]";
            }
        }
        System.out.println(arrStr);
    }

    /**
     * Выводит в консоль одномерный массив строк в формате [s1,s2,...]
     *
     * @param arr Одномерный массив
     */
    static void printArray(String[] arr) {
        System.out.println(Arrays.stream(arr).toList());
    }

    /**
     * Выводит в консоль одномерный массив строк в формате [s1,s2,...], начальные символы элемента =  startSymbols
     *
     * @param arr          Одномерный массив
     * @param startSymbols Начальные символы элемента массива
     */
    static void printArray(String[] arr, String startSymbols) {
        String arrStr = "[";
        for (int i = 0; i < arr.length; i++) {
            // сравним символы(upper) элемента c startSymbols(upper). если true добавляем к arrStr
            if (arr[i].toUpperCase().startsWith(startSymbols.toUpperCase())) {
                arrStr += (arrStr.length() == 1 ? "" : ",") + arr[i];
            }
        }
        arrStr += "]";
        System.out.println(arrStr);
    }

    /**
     * Выводит в консоль двумерный массив целых чисел
     *
     * @param arr          Одномерный массив
     * @param spaceElement - заполняем пробелами до размера строки =  spaceElement
     */
    static void printArray(int[][] arr, int spaceElement) {
        String arrStr;
        for (int i = 0; i < arr.length; i++) {
            arrStr = "";
            for (int j = 0; j < arr[i].length; j++) {
                arrStr += space(arr[i][j], spaceElement,'L');
            }
            System.out.println(arrStr);
        }
    }

    /**
     * Выводит в консоль индексы двумерного массива эелемент когорого = максимальному
     *
     * @param arr двумерный массив
     * @param max - максимальное значение
     */
    static void printIndexByMax(int[][] arr, int max) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == max) {
                    System.out.printf("(%s, %s)%s", i, j, System.lineSeparator());
                }
            }
        }
    }

    /**
     * Выводит в консоль сумму элементов каждой строки, минимальное и максимальное значение двумерного массива
     *
     * @param arr двумерный массив
     */
    static void printSumOnLine(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Сумма по строке %s = %s\n", i, getSum(arr[i]));
        }
    }

    /**
     * вычисляет сумму всех эелементов одномерного массива целых чисел
     *
     * @param arr Одномерный массив
     * @return Сумма всех элементов массива
     */
    static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * вычисляет сумму всех эелементов двумерного массива целых чисел
     *
     * @param arr Одномерный массив
     * @return Сумма всех элементов массива
     */
    static int getSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += getSum(arr[i]);
        }
        return sum;
    }

    /**
     * вычисляет минимальный элемент в одномерном массиве целых чисел
     *
     * @param arr Одномерный массив
     * @return Значение минимального эелмента массива
     */
    static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * вычисляет минимальный элемент в двумерном массиве целых чисел
     *
     * @param arr двумерный массив
     * @return значение минимального элемента
     */
    static int getMin(int[][] arr) {
        int minAll = arr[0][0];
        int minLine = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            minLine = getMin(arr[i]);
            if (minLine < minAll) {
                minAll = minLine;
            }
        }
        return minAll;
    }

    /**
     * вычисляет максимальный элемент в одномерном массиве целых чисел
     *
     * @param arr Одномерный массив
     * @return Значение максимального эелмента массива
     */
    static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * вычисляет максимальный элемент в двумерном массиве целых чисел
     *
     * @param arr двумерный массив
     * @return значение максимального элемента
     */
    static int getMax(int[][] arr) {
        int maxAll = arr[0][0];
        int maxLine = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            maxLine = getMax(arr[i]);
            if (maxLine > maxAll) {
                maxAll = maxLine;
            }
        }
        return maxAll;
    }

    /**
     * инвертирует одномерный массив
     *
     * @param arr Одномерный массив
     * @return Массив, заполненный инверитрованными значениями
     */
    static int[] getInvertedArray(int[] arr) {
        int[] arrInverted = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrInverted[i] = arr[arr.length - 1 - i];
        }
        return arrInverted;
    }

    /**
     * проверяет, есть ли в одномерном массиве повторяющиеся элементы
     *
     * @param arr Одномерный массив целых чисел
     * @return число повторяющихся элементов (0 если таковых нет)
     */
    static int countRepeatingElements(int[] arr) {
        int countByElement = 0; // кол-во совпадений по эелементу массива
        int countAll = 0; // счетчик совпадающих элементов
        for (int i = 0; i < arr.length; i++) {
            countByElement = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    countByElement++;
                }
            }
            countAll += countByElement > 0 ? 1 : 0;
        }
        return countAll;
    }

    /**
     * возвращает индексы повторяющихся элементов в одномерном массиве
     *
     * @param arr Одномерный массив целых чисел
     * @return список индексов повторяющихся элементов в одномерном массиве
     */
    static String getIndexesRepeatingElements(int[] arr) {
        int countByElement = 0; // кол-во совпадений по эелементу массива
        String arrIndexes = "[";
        for (int i = 0; i < arr.length; i++) {
            countByElement = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    countByElement++;
                }
            }
            if (countByElement > 0) {
                arrIndexes += (arrIndexes.length() == 1 ? "" : ",") + i;
            }
        }
        arrIndexes += "]";
        return arrIndexes;
    }

    /**
     * в одномерном массиве заменяет отрицательные числа на их абсолютные значения
     *
     * @param arr Одномерный массив
     * @return Массив с замененными элементами
     */
    static int[] replaceNegativeValuesArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = Math.abs(arr[i]);
            }
        }
        return arr;
    }

    /**
     * проверяет , является ли двумерный массив квадратным
     * Params: arr – Одномерный массив
     * Returns: true - массив квадратный, false - не квадратный
     */
    static boolean checkArrIsSqueare(int[][] arr) {
        return arr.length == arr[0].length;
    }
}