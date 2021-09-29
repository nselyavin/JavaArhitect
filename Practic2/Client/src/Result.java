import java.io.Serializable;

public class Result implements Serializable {
    double result;

    public Result() {
    }

    public Result(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
