public class Dz1_2 {
    public static void main(String[] args) {
        System.out.println("\n Задание 11");
        InitArr(7, 5);
        System.out.println("\n Задание 7");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        Array(arr);
        System.out.println("\n Задание 3");
        numbers(-12);
        System.out.println("\n Задание 4");
        System.out.println(Bool(12));
        System.out.println("\n Задание 2");
        System.out.println(number(2, 11));
        System.out.println("\n Задание 5");
        Task4("Hello", 5);
        System.out.println("\n Задание 9");
        int[] arr2 = {2, 4, 5, 7, 2, 4, 2, 9, 5, 6};
        Multiplic(arr2);
    }
    public static void InitArr(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
    }
    public static void Array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
    public static void numbers(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отрицательное");
    }
    }
    public static boolean Bool(int x) {
        if (x >= 0) {
            return true;
        }
        else {
           return false;
    }
    }
    public static boolean number(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        }
        return false;
    }
    public static void Task4(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + str);
        }
    }
    public static void Multiplic(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
}

