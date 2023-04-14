import java.util.Scanner;

public class ProgramParkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total;
        System.out.print("Masukan Jam Masuk :");
        int m = input.nextInt();
        System.out.print("Masukan Jam Keluar :");
        Scanner keluar =new Scanner(System.in);
        int k = input.nextInt();
        total = k - m;
        if (total == 1){
            System.out.println("Biaya Parkir Sejumlah Rp.2000");
        } else if (total ==	2){
            System.out.println("Biaya Parkir Sejumlah Rp.3000");
        }else {
            System.out.println("Biaya Parkir Sejumlah Rp.5000");
        }

    }
}
