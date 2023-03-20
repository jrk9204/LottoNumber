public class User {

    private String name;
    private int age;
    private String address;

    private String password;

    public User(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address =address;
    }


    public User(String name, int age, String address, String password){
        this.name = name;
        this.age = age;
        this.address =address;
        this.password = password;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
