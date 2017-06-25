package koreaaerospace.termproject;

/**
 * Created by jojeongrae on 2017-06-23.
 */

public class InOutAccount extends Account {

    public InOutAccount(){
        super();
    }

    public void add(double money){
        balance=balance+money;
    }

    public void str(){
        System.out.println("입금할 금액을 알려주세요.");
    }

    public double getbalance(){
        return balance;
    }
}
