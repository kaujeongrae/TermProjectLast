package koreaaerospace.termproject;

/**
 * Created by jojeongrae on 2017-06-23.
 */

public class HouseAccount extends Account {
    private int month;
    private final double interest=0.03;

    public HouseAccount(){
        super();
    }


    public void add(){//Account 클래스의 add 함수 Overloading
            balance=balance+100000;
    }

    public void setmonth(){
        month=month+1;
    }

    public double getbalance(){
        if (month>12) {
            return balance * Math.pow(1 + interest, month / 12);
        } else {
            return balance;
        }
    }

    public int getmonth(){
        return month;
    }



}
