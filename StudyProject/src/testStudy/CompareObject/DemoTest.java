package testStudy.CompareObject;

public class DemoTest {
    public static void main(String[] args) {
        User user1 = new User("张三",12);
        User user2 = new User("张三",15);
        System.out.println(user1.equals(user2));
    }
}
