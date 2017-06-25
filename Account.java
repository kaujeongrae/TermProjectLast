package koreaaerospace.termproject;

/**
 * Created by jojeongrae on 2017-06-23.
 */

public abstract class Account {
    protected double balance;

    public Account(){
        balance=0;
    }

    public void add(){}
    public void add(double money){}

    public abstract double getbalance();

}
