package testStudy.observeDemo;

public class DemoTest {
    public static void main(String[] args) {
        OldPolice oldPolice = new OldPolice();
        YoungPolice youngPolice = new YoungPolice();
        WomanPolic womanPolic = new WomanPolic();
        Thief thief = new Thief();
        thief.addObserve(oldPolice);
        thief.addObserve(youngPolice);
        thief.addObserve(womanPolic);
        thief.notifyObserve("偷走了夜明珠");
    }
}
