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


        System.out.println("가계부를 이용해주셔서 감사합니다.");
        System.out.println("사용하실 기능을 선택해주세요.");
        System.out.println("1. 지출 내역 입력 2. 계좌 입금");
    }
}
