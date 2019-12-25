package testStudy.intercepter;

public class HelloWorldImpl implements  HelloWorld{
    @Override
    public void printHello(User user) {
        System.out.println("我叫"+user.getName()+"!今年"+user.getAge()+"岁了,爱好是"+user.getHobby());
    }
}
