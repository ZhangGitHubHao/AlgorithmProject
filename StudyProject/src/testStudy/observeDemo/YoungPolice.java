package testStudy.observeDemo;

public class YoungPolice implements Police{
    private String name = "青年警察";
    @Override
    public void update(String message, String name) {
        System.out.println(this.name+":"+name+"那里有情况,"+message);
    }
}
