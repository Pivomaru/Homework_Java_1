public class Dz1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 4, 5};
        int max = array[0];
        int min = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
            else if (array[i] < min){
                min = array[i];
            }
            
        } 
        System.out.println("\n Задание 12");
        System.out.println("Минимальный элемент " + min ); 
        System.out.println("Максимальный элемент " + max );   
        }
    }