package testStudy.observeDemo2;

public class Demo {
    public static void main(String[] args) {
        WangStaff wang = new WangStaff("小王");
        WangStaff zhang = new WangStaff("小张");

        LiBoss li = new LiBoss("李老板");
        LiBoss zhao = new LiBoss("赵老板");
        LiBoss qian = new LiBoss("钱老板");

        wang.addBoss(li);
        wang.addBoss(zhao);
        zhang.addBoss(li);
        zhang.addBoss(qian);

        wang.report(true);
        zhang.report(false);
    }
}
