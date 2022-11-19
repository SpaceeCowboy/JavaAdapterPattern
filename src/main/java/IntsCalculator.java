public class IntsCalculator extends Calculator implements Ints {

    private Calculator calculator;

    @Override
    public int sum(int arg0, int arg1) {
        return (int) calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Operation.SUM)
                .result();

    }

    @Override
    public int mult(int arg0, int arg1) {
        return (int) calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Operation.MULT)
                .result();
    }

    @Override
    public int pow(int a, int b) {
        return (int) calculator.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Operation.POW)
                .result();
    }
}
