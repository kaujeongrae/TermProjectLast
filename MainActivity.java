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

        Account acc1=new Account();
        Account acc2=new HouseAccount();
        Diary dir1=new FoodDiary();
        Diary dir2=new TransportDiary();
        Diary dir3=new HobbyDiary();
        Diary dir4=new RemainDiary();

        System.out.println("가계부를 이용해주셔서 감사합니다.");
        System.out.println("사용하실 기능을 선택해주세요.");
        System.out.println("1. 지출 내역 입력 2. 계좌 입금 3. 주택청약 입금 4. 넘어가기");
        int con=sc.nextInt();
        switch (con){
            case 1:
                System.out.println("입력할 지출 종류는? 1. 식사 2. 교통 3. 취미 4. 기타");
                int con3=sc.nextInt();
                switch (con3){
                    case 1:
                        break;

                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
                        break;

                    default:

                }
                break;

            case 2:
                System.out.println("입금을 금액을 알려주세요.");
                double money=sc.nextDouble();
                acc1.add(money);
                break;

            case 3:
                System.out.println("청약저축 계좌에 10만원을 추가 입금하겠습니다.");
                acc2.add();
                acc2.add();

                System.out.println("지금까지의 저축 내역을 확인하시겠습니까? 1. 예 2. 아니오");
                int con2=sc.nextInt();
                switch (con2){
                    case 1:
                        System.out.println("당신의 주택청약저축 :"+acc2.getbalance()+"원 "+acc2.getmonth()+"개월");
                        break;

                    case 2:
                        break;
                }
                break;

            default:
                System.out.println("잘못 입력하셨습니다.");
        }




    }
}
