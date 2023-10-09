public class PrintNumbersOneToHundredRecursion {

    // Output numbers from 1..100
    // using recursion

    static int input = 0;

    public static void main(String[] args) {
        if (input == 100) {
            return;
        }
        System.out.println("Value : " + ++input);
        main(null);
    }
}
