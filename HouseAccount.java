package koreaaerospace.termproject;

/**
 * Created by jojeongrae on 2017-06-23.
 */

public class HouseAccount extends Account {
    private int month;
    private final double interest=0.03;

    public HouseAccount(){
        super();
        month=0;
    }


    public void add(){
            balance=balance+100000;
            month=month+1;
    }

    public double getbalance(){
        if (month>12) {
            return balance * Math.pow(1 + interest, month / 12);
        } else {
            return balance;
        }
    }


}
