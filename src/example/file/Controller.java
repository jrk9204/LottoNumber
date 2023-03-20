package example.file;//Conteroller 종류 여러개
//초기, 마무리 는 항상 같은 코드가 쓰여짐

public abstract class Controller {

    public void init(){

        System.out.println("init code");
    }

    public void close(){
        System.out.printf("last code");
    }

    public abstract void run(); // this section will be changed everytime

    //내가 가지고잇는 메소드들을 순서를 갖고 실행함. 이런 메소드를 템플릿 메소드 라고한다. ( 정해신 순서대로 실행됨);
    public void execute(){
        //초기화
        //실행
        //마무리

        this.init();
        this.run();
        this.close();
    }

}
