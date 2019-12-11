package testStudy.observeDemo2;

import java.util.LinkedList;
import java.util.List;

public class WangStaff implements Staff{
    private String name;
    private Boolean complete;

    public WangStaff(String name) {
        this.name = name;
    }

    private List<Boss> bossList = new LinkedList<>();

    @Override
    public void addBoss(Boss boss) {
        bossList.add(boss);
    }

    @Override
    public void removeBoss(Boss boss) {
        bossList.remove(boss);
    }

    @Override
    public void report(Boolean complete) {
        for (Boss boss: bossList) {
            boss.update(name,complete);
        }
    }
}
