public class Main {
    public static void main(String[] args) {
        Calculator calc = new IntsCalculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );
    }
}
