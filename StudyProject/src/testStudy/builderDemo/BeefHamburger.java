package testStudy.builderDemo;

public class BeefHamburger extends Hamburger {

    @Override
    public String getFoodName() {
        return "牛肉汉堡";
    }

    @Override
    public float getPrice() {
        return 15.9F;
    }
}
