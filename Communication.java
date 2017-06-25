package koreaaerospace.termproject;

/**
 * Created by jojeongrae on 2017-06-25.
 */

public class Communication {
    public void start(){
        System.out.println("사용하실 기능을 선택해주세요.");
        System.out.println("1. 지출 내역 입력 2. 계좌 입금 3. 주택청약 입금 0. 종료");
    }

    public void diary(){
        System.out.println("입력할 지출 종류는? 1. 식사 2. 교통 3. 취미 4. 기타");
    }

    public void error(){
        System.out.println("잘못 입력하셨습니다.");
    }

    public void str1(){
        System.out.println("입금할 금액을 알려주세요.");
    }

    public void str2(){
        System.out.println("청약저축 계좌에 10만원을 추가 입금하겠습니다.");
    }

    public void end(){
        System.out.println("입력을 종료합니다.");
    }


}
