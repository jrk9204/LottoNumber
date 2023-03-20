public class UserTest {

    public static void main(String[] arg){

        User p1 = new User("kim",31,"kyung gi do");
        User p2 = new User("kim",31,"kyung gi do", "asdf123");


        System.out.println(p1.getName());


        p1.setName("Jun Kim");

        System.out.println(p2);

    }
}

