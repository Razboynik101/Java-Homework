import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] ch = new char[]{'a','e','i','o','u','y'};
        int n = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i < num ; i++) {
            String z = sc.nextLine();
            for (int j = 0; j < z.length() ; j++) {
                for (int k = 0; k <ch.length ; k++) {
                    if (z.charAt(j)==ch[k]){
                        n++;
                    }
                }
            }
            System.out.println(n);
            n=0;
        }
    }
}
