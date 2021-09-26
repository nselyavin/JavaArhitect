package Practic2.Server;

import Practic2.RMI.Coefficients;
import Practic2.RMI.QuadraticEqu;
import Practic2.RMI.Result;

import java.rmi.RemoteException;

public class RemoteQuadEquServer implements QuadraticEqu {
    @Override
    public Result calculate(Coefficients coefficients, double x) throws RemoteException {

        double a = coefficients.getA();
        double b = coefficients.getB();
        double c = coefficients.getC();

        System.out.println("Calculation: {" + a + ", " + b + ", " + c + ", " + x + "} ");

        return new Result("Result", a * x * x + b * x  + c);
    }
}
