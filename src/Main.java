import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // your current weight, you give this amount in console with scanner in prev line
        System.out.print("Input your weight: ");
        float weightNasennik = in.nextFloat();
        // console return your weight at mars
        System.out.printf("Your weight at mars: " + (weightNasennik * 0.38));
        // created double
        double weightDoubleNasennik = weightNasennik * 0.38;
        // .0000 for double
        String formattedDoubleNasennik = new DecimalFormat("0.0000").format(weightDoubleNasennik);
        System.out.printf("Your weight at Mars(double XD): " + weightDoubleNasennik);
        int valueIntNasennik = (int) weightDoubleNasennik;


    }
}