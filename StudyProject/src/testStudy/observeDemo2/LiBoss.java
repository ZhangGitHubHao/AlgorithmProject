package testStudy.observeDemo2;

public class LiBoss implements Boss {
    private String name;

    public LiBoss(String name) {
        this.name = name;
    }

    @Override
    public void update(String name, Boolean complete) {
        if (complete){
            System.out.println(this.name+":"+name+"干的不错");
            return;
        }
        System.out.println(this.name+":"+name+"下次努力");
    }
}
