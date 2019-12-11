package testStudy.observeDemo;

public class OldPolice implements Police {
    private String name = "老警察";
    @Override
    public void update(String message, String name) {
        if ("小偷".equals(name)){
            System.out.println(this.name+":"+name+"那里有情况,"+message);
        }
        if ("杀人犯".equals(name)){
            System.out.println(name+message+",老警察请求支援");
        }
    }
}
