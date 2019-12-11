package testStudy.observeDemo;

public class WomanPolic implements Police{
    private String name = "女警官";
    @Override
    public void update(String message, String name) {
        System.out.println(this.name+":"+name+"那里有情况,"+message);
    }
}
