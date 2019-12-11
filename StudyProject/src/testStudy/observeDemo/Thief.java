package testStudy.observeDemo;

import java.util.ArrayList;
import java.util.List;

public class Thief implements Offender {
    private String name ="小偷";
    private List<Police> observerList = new ArrayList<Police>();
    @Override
    public void addObserve(Police police) {
        if (!observerList.contains(police)){
            observerList.add(police);
        }
    }

    @Override
    public void removeObserve(Police police) {
        if (observerList.contains(police)){
            observerList.remove(police);
        }
    }

    @Override
    public void notifyObserve(String message) {
        for (Police police:observerList) {
            police.update(message,name);
        }
    }
}
