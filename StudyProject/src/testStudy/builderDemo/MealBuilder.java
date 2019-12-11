package testStudy.builderDemo;

import java.util.List;

public class MealBuilder {

//    public Meal createMeal(List<String> foodList) {
//        Meal meal = new Meal();
//        try {
//            for (String str : foodList) {
//                //创建Class对象的方式三：(forName():传入时只需要以字符串的方式传入即可)
//                //通过Class类的一个forName（String className)静态方法返回一个Class对象，className必须是全路径名称；
//                //Class.forName()有异常：ClassNotFoundException
//                Food food = null;
//                Class cl = Class.forName("testStudy.builderDemo." + str);
//                cl.newInstance();
//                meal.addFood(food);
//            }
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        return meal;
//    }

    //订单1
    public Meal order1() {
        Meal meal = new Meal();
        meal.addFood(new ChickenHamburger());
        meal.addFood(new ColaDrink());

        return meal;
    }

    //订单2
    public Meal order2() {
        Meal meal = new Meal();
        meal.addFood(new BeefHamburger());
        meal.addFood(new MilkDrink());

        return meal;
    }
}
