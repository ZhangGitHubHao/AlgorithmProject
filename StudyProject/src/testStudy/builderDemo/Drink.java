package testStudy.builderDemo;

public abstract class Drink implements Food{
    @Override
    public Package getFoodPackage() {
        return new BottlePackage();
    }

    @Override
    public abstract float getPrice();
}
