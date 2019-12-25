package testStudy.observeDemo;

public interface Offender {
    void addObserve(Police police);
    void removeObserve(Police police);
    void notifyObserve(String message);
}
