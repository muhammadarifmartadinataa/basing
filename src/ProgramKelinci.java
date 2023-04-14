import java.util.Scanner;
public class ProgramKelinci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Position Rabbit 1 : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Position Rabbit 2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        if (y1 == y2) {
            if (x1 == x2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            double t = (x2 - x1) / (y1 - y2);
            if (t >= 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
