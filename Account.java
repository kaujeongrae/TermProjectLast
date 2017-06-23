package koreaaerospace.termproject;

/**
 * Created by jojeongrae on 2017-06-23.
 */

public class Account {
    protected double balance;

    public Account(){
        balance=0;
    }

    public void add(double money){
        balance=balance+money;
    }


}
