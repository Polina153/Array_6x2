
public class Main {
    static int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++){
            System.out.print(i + "-" + array[i] + " | ");
        }
        dataOut();
    }
    private static void dataOut(){
        System.out.println("");
        for (int i = 0; i < array.length; i++){
            if (array[i] < 6){
                array[i] = array[i] * 2;
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(i + "-" + array[i] + " | ");
        }
    }
}