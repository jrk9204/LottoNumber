package practiceLotto;


/*
로또 기계 기능
1~46의 번호를 갖는 공을 넣는다
섞는다
6개를 뽑는다.
interface 는 구현하기 전에 기능을 먼저 정리하는 영역
 */
public interface LottoMachine {

    int MAX_BALL_COUNT = 45;
    int RETURN_BALL_COUNT = 6;
    public void setBalls(LottoBall[] balls);
    public void mixBall();
    public LottoBall[] pickBall();

}
