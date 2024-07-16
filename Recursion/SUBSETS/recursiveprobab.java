import java.util.Scanner;

public class recursiveprobab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double P = sc.nextDouble();
        double probability = calculateProbability(N, P);
        System.out.printf("%.2f", probability);
    }

    static double calculateProbability(int N, double P) {
        if (N == 0) {
            return 1.0;
        } else if (N < 0) {
            return 0.0;
        }
        double left = P * calculateProbability(N - 2, P);
        double right = (1 - P) * calculateProbability(N - 3, P);
        return left + right;
    }
}
