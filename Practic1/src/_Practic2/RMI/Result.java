package Practic2.RMI;

import java.io.Serializable;

public class Result implements Serializable  {
    String msg;
    double res;

    public Result(String msg, double res) {
        this.msg = msg;
        this.res = res;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
}
