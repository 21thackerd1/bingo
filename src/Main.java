import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] possibilities = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        String[][] card = new String[3][3];
        Random random = new Random();
        for(int i=0; i < 3; i++) {
            for(int j=0; j < 3; j++) {
                int random_num = random.nextInt(1,30);
                card[i][j] = String.valueOf(random_num);
                //System.out.println(card[i][j]);
            }
        }

        for(int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                System.out.print(" ");
                System.out.print(card[a][b]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }



    }
}
