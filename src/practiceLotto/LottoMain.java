package practiceLotto;

/*
Java는 무조건 객체지향적
객체 단위로 작성되어야하고
기능먼저 구현해야함
로또메인에는 로또 기계를 배치하고
배치된 기계에 공을 넣는다 공은 1부터 46개의 숫자를 갖고있다.
기계에 들어있는 공을 섞는다.
섞인 공 6개를 뽑는다.
 */


/*

자바 초기 실행부분은 기계를 인스턴스화 하여 생성
1부터 46까지 적힌 공들을 넣어준다.
공들을 섞어준다.
공들을 6개를 랜덤으로 뽑는다.


interface로 전달받은 객체는 static 으로 생성하고
 자바는 배열생성이 동적으로 발생하지않기때문에 사이즈를 미리 지정해줘야한다.

 */

import java.util.Arrays;

public class LottoMain {

    public static void main(String[] args) {

        LottoMachineFunc firstMachine = new LottoMachineFunc();

        LottoBall[] lottoBalls = new LottoBall[45];

        for (int i = 0; i < lottoBalls.length; i++) {
            lottoBalls[i] = new LottoBall(i + 1);
        }

        firstMachine.setBalls(lottoBalls);

        firstMachine.mixBall();
        LottoBall[] result = firstMachine.pickBall();

        for(int i=0; i< result.length; i++){
            System.out.println(result[i].lottoBallNumber());
        }


    }

}
