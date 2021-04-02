import java.util.Scanner;

public class MathSuperstar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] elements = scan.nextLine().split(",");
        double r1 = Double.parseDouble(elements[0]) / 10;
        double h1 = Double.parseDouble(elements[1]) / 10;
        double r2 = Double.parseDouble(elements[2]) / 10;
        double h2 = Double.parseDouble(elements[3]) / 10;

        double V1 = Math.PI * Math.pow(r1,2) * h1;
        double V2 = Math.PI * Math.pow(r2,2) * h2;

        if(Math.abs(V1 - V2) < 0.01 ){
            System.out.printf("V1 = V2 = %.2f\n", V1);
        }
        else{
            System.out.printf("Bigger volume = %.2f\n", Math.max(V1, V2));
        }
    }
}
