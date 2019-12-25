package testStudy.singletonDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * 懒汉
 * @author 860118060
 */
public class MenuList {
    private static List<String> menus;
    private static MenuList menuList=null;

    private MenuList(){}
    public static MenuList getMenuList(){
        if (menus==null){
            menus = new ArrayList<>();
        }
        if (menuList==null){
            menuList = new MenuList();
        }
        return menuList;
    }

    public void addMenu(String menu){
        if (!menus.contains(menu)){
            menus.add(menu);
        }
    }
    public List<String> getMenus(){
        return menus;
    }
}
