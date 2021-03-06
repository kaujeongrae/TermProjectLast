package koreaaerospace.termproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //객체 선언

        Communication c=new Communication();
        Account acc1=new InOutAccount();
        Account acc2=new HouseAccount();
        Diary dir1=new FoodDiary();
        Diary dir2=new TransportDiary();
        Diary dir3=new HobbyDiary();
        Diary dir4=new RemainDiary();


        //스위치 문을 통해 세부 기능 연결
        int con=9;
        outer:
        while (con!=0){
            c.start();
            con=sc.nextInt();
            switch (con){
                case 1:
                    c.diary();
                    con=sc.nextInt();
                    switch (con){
                        case 1:
                            dir1.String();
                            double money=sc.nextDouble();
                            dir1.addcost(money);
                            break;

                        case 2:
                            dir2.String();
                            money=sc.nextDouble();
                            dir2.addcost(money);
                            break;

                        case 3:
                            dir3.String();
                            money=sc.nextDouble();
                            dir3.addcost(money);
                            break;

                        case 4:
                            dir4.String();
                            money=sc.nextDouble();
                            dir4.addcost(money);
                            break;

                        default:
                            c.error();
                    }
                    break;

                case 2:
                    c.str1();
                    double money=sc.nextDouble();
                    acc1.add(money);
                    break;

                case 3:
                    c.str2();
                    acc2.add();
                    break;

                case 0:
                    c.end();
                    break outer;

                default:
                    c.error();
            }
        }
        //내역 출력
        c.lastcom(dir1,dir2,dir3,dir4,acc1,acc2);
    }
}
