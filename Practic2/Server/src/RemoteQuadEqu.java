public class RemoteQuadEqu implements QuadEqu {
    @Override
    public Result countRes(Coefficients coefficent, double x) {
        double a = coefficent.getA();
        double b = coefficent.getB();
        double c = coefficent.getC();
        return new Result(a * x * x + b * x + c);
    }
}
