package testStudy.decorateDemo2;

public class EggFoodDecorator extends FoodDecorator{

    public EggFoodDecorator(Food foodDecorator) {
        super(foodDecorator);
    }

    @Override
    public float cost() {
        return foodDecorator.cost()+6.0F;
    }

    @Override
    public String description() {
        return foodDecorator.description()+"+鸡蛋";
    }
}
