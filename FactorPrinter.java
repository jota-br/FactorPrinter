public class FactorPrinter {
    static public void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {

            int x, i = 1;
            while (true) {
                x = number % i;
                if (x == 0) {
                    System.out.println(i);
                }
                i++;
                if (i > number) {
                    break;
                }
            }
        }
    }
}