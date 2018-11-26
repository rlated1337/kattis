import java.util.Arrays;
import java.util.Scanner;
public class Ants {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();


        while (cases-- > 0)// automatic cases--
        {
            int len = sc.nextInt();
            int n = sc.nextInt();
            int min = 0;
            int[] ants = new int[n];

            for (int i = 0; i < n; i++)
            {
                ants[i] = sc.nextInt();
                min = Math.max(Math.min(ants[i], len - ants[i]), min);
            }
            Arrays.sort(ants);
            int[] max = {ants[0], ants[n - 1], len - ants[0], len - ants[n - 1]};

            Arrays.sort(max);
            System.out.println(min + " " + max[3]);
        }

    }
}
