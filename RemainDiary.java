package koreaaerospace.termproject;

/**
 * Created by jojeongrae on 2017-06-23.
 */

public class RemainDiary extends Diary {
    public RemainDiary(){
        super();
    }

    public void addcost(double money){
        cost=cost+money;
    }

    public void String(){
        System.out.println("기타 등에 얼마를 쓰셨나요? ");
    }

    public double getcost(){
        return cost;
    }
}
