import java.util.Scanner;
public class patren5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j ;

        for (i = 5; i>0; i--) {
            for (j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
