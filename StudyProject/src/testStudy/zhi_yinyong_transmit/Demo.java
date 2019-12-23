package testStudy.zhi_yinyong_transmit;

import java.util.Arrays;

public class Demo {
    static class User{
        public String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2};
        int x = 1;
        int y = 2;
        User user = new User("zhangsan");
        String string = "hello";
        String str = "hello";
        System.out.println("start");
        System.out.println("x:" + x);
        System.out.println("y:" + y);
        System.out.println("nums:" + Arrays.toString(nums));
        System.out.println("string:" + string);
        System.out.println("str:" + str);
        System.out.println(string == str);
        method1(x, y);
        method2(nums);
        method3(string);
        System.out.println("end");
        System.out.println("x:" + x);
        System.out.println("y:" + y);
        System.out.println("nums:" + Arrays.toString(nums));
        System.out.println("string:" + string);
        System.out.println("str:" + str);
        System.out.println(string == str);
    }

    static void method1(int x, int y) {
        x = 3;
        y = 4;
    }

    static void method2(int[] nums) {
        nums[0] = 3;
        nums[1] = 4;
    }

    static void method3(String string) {
        string = "world";
    }
//    static void method4(User user){
//        user.name
//    }
}
