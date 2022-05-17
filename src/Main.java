public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(3, 2));
        System.out.println(intsCalc.mult(5, 5));
        System.out.println(intsCalc.pow(4, 2));
    }
}