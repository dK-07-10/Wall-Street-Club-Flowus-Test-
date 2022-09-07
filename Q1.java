
public class Q1 {

    static int simulation(int N, int balance) {

        for (int i = 1; i <= N; i++) {
            // generates random integer 0 or 1
            int number = (int) (Math.random() * 2);

            if (number == 0) {
                balance += 1; // 1$ profit for getting heads
            } else if (number == 1) {
                balance -= 0.5; // 0.5$ loss for getting tails
            }
        }
        return balance;

    }

    public static void main(String[] args) {

        int balance = 1; // initial balance 1$
        double variance = 0;

        // simulation for different N values

        balance += simulation(10, balance);
        System.out.println("Expected balance after 1st simulation : N = 10 is " + balance);
        variance = 10 * (0.5) * (0.5);
        System.out.println("Variance for the trial N=10 is " + variance);

        balance += simulation(20, balance);
        System.out.println("Expected balance after 2nd simulation : N = 20 is " + balance);
        variance = 20 * (0.5) * (0.5);
        System.out.println("Variance for the trial N=20 is " + variance);

        balance += simulation(400, balance);
        System.out.println("Expected balance after 3rd simulation : N = 400 is " + balance);
        variance = 400 * (0.5) * (0.5);
        System.out.println("Variance for the trial N=400 is " + variance);

        balance += simulation(10000, balance);
        System.out.println("Expected balance after 4th simulation : N = 10000 is " + balance);
        variance = 10000 * (0.5) * (0.5);
        System.out.println("Variance for the trial N=10000 is " + variance);

        balance += simulation(100000, balance);
        System.out.println("Expected balance after 5th simulation : N = 100000 is " + balance);
        variance = 100000 * (0.5) * (0.5);
        System.out.println("Variance for the trial N=100000 is " + variance);

        variance = (100000 + 10000 + 400 + 20 + 10) * (0.5) * (0.5);
        System.out.println("Variance for the entire trial is " + variance);

    }
}
