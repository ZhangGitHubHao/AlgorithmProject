package testStudy.decorateDemo2;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Noodles noodles = new Noodles();
        FoodDecorator foodDecorator = new EggFoodDecorator(noodles);
        FoodDecorator foodDecorator1 = new ChickenFoodDecorator(foodDecorator);

        System.out.println("本次购买:"+foodDecorator1.description()+",总共消费:"+foodDecorator1.cost()+"元.");

        Rice rice = new Rice();
        foodDecorator1 = new ChickenFoodDecorator(rice);
        System.out.println("本次购买:"+foodDecorator1.description()+",总共消费:"+foodDecorator1.cost()+"元.");

    }
}
