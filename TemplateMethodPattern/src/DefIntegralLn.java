public class DefIntegralLn extends ADefiniteIntegral{
    private double a,b;
    private int c;

    public DefIntegralLn(double a, double b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    protected double geta() {
        return a;
    }

    @Override
    protected double getb() {
        return b;
    }

    @Override
    protected int getc() {
        return c;
    }

    @Override
    protected double fuction(double x) {
        return Math.log(x);
    }
}
