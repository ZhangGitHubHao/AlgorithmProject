package testStudy.decorateDemo2;

public class Noodles implements Food {
    @Override
    public float cost() {
        return 5.0F;
    }

    @Override
    public String description() {
        return "面条";
    }
}
