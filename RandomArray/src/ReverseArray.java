import java.util.Random;

public class ReverseArray {
    public static void main(String[] args) {
        int size = 10;
        int maxRandom=100;
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(maxRandom);
        }

        for (int i = 0, j=0; i <= (size*2)-1; i++) {

            if (i < size) {
                System.out.print(array[i]);
                System.out.print(" ");
            } else {
                System.out.print(array[i-1-j]);
                j+=2;
                if (i!=(size*2)-1){
                    System.out.print(" ");
                }
            }
        }
    }
}



