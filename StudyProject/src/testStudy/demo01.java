package testStudy;

public class demo01 {
    public static void main(String[] args) {

        char a = 'a';
        int b = 8;

        System.out.println(false ? a : b); //打印b，b是8，所以打印出8
        System.out.println(false ? a : 8); //打印8，但a是char型的，所以打印8的char字 //符，也就是backspace
        System.out.println(false ? 8 : a); //打印int型，也就是a
        System.out.println(false ? b : 'A'); //打印a的ASCII码

    }
}
