package testStudy.builderDemo;

public abstract class Hamburger implements Food {
    @Override
    public Package getFoodPackage() {
        return new WarpPackage();
    }

    @Override
    public abstract float getPrice();
}
