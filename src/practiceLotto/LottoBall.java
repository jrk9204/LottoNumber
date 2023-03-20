package practiceLotto;


/*
로또 공에 대한 정보를 입력 공에는 숫자가 세겨져야한다.
 */

public class LottoBall {

    private int number;

    // 공 생성자를 오버라이딩 하여 초기숫자를 넣어준다.
    LottoBall(int ballNumber){
        this.number = ballNumber;
    }

    // 전달 받은 공 숫자를 리턴해주는 값.
    public int lottoBallNumber(){
        return this.number;
    }


}
