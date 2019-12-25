package testStudy.decorateDemo2;

public class Rice implements Food {
    @Override
    public float cost() {
        return 3.0F;
    }

    @Override
    public String description() {
        return "米饭";
    }
}
