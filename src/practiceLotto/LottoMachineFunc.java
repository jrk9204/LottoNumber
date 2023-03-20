package practiceLotto;


//interface 된 로또 머신 객체를 여기서 상속받아 추상화된 기능들을 구현을 한다.

public class LottoMachineFunc implements LottoMachine {

    private LottoBall[] balls;

    @Override
    public void setBalls(LottoBall[] setBalls) {

        this.balls = setBalls;

    }

    @Override
    public void mixBall() {

        for(int i = 0; i< 10000; i++){
            int x1 = (int)(Math.random()*LottoMachine.MAX_BALL_COUNT);
            int x2 = (int)(Math.random()*LottoMachine.MAX_BALL_COUNT);

            if(x1 != x2){
                LottoBall tmp = balls[x1];
                balls[x1] = balls[x2];
                balls[x2] = tmp;
            }

        }

    }

    @Override
    public LottoBall[] pickBall() {

        LottoBall[] result = new LottoBall[LottoMachine.RETURN_BALL_COUNT];
        for(int i = 0; i< LottoMachine.RETURN_BALL_COUNT; i++){

            result[i] = balls[i];
        }
        return result;
    }
}
