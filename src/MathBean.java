public class MathBean {

    private MathBean(){

        System.out.println("this is MathBean Constructor");
    }

    String currClassname = "MathBean";

    public void printClassName(){
        System.out.println(this.currClassname);
    }

    public void printNumber(int x){

        System.out.println(x);
    }

    public int getOne(){

        return 1;
    }

    public int plus(int x, int y){

        return x+y;

    }

    public static void printVersion(){

        System.out.println("Version 1.0");

    }

}
