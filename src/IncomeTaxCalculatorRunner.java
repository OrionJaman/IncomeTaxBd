public class IncomeTaxCalculatorRunner {
    public static void main(String[] args) {

        IncomeTaxCalculation user1 = new IncomeTaxCalculation(3000000);
        System.out.println( user1.getIncome());
        System.out.println(user1.calculateTax());
    }
}
