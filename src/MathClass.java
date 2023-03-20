public class MathClass {

     MathClass(){
        System.out.println("this is constructor");
    }


    public static void main(String[] arg){

        int integer = Math.abs(-5);

        System.out.println(integer);

    }

}


//static 이 붙친 클래스는 인스턴스를 사용하지않아도된다. 메모리상에 추가되지않아도 사용해도 된다는 말이다.
//인스턴스가 생성되면 메모리 힙에 저장되어 사용된다.
// 자바에서는 생성자 constructor 는 기본적으로 public 클래스명 으로 되어있다.
// 만약 constructor 가 private 로 되어있으면 생성자, 다른말로 인스턴스를 생성하지못하고 static class 만 사용할 수 있다.
// 메모리를 사용하지않게하기 위함이다. static 은 인스턴스별로 메모리에 따로 저장되는 형식이아니고 정적 메모리에 저장되기때문에 모든 인스턴스들의
// static 값들이 공유되어진다.