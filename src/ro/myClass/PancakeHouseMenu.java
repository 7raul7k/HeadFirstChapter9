package ro.myClass;

import ro.myClass.IteratorPattern.Iterator;

import java.util.ArrayList;

public class PancakeHouseMenu implements Iterator {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();
        addItem("K&B'S Pancake BreakFast","Pancakes with scrambled eggs and toast",true,2.99);
    }

    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
        for(int i = 0 ; i < breakfastItems.size();i++){
            MenuItem menuItem = breakfastItems.get(i);
            System.out.println(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice());
            System.out.println(menuItem.getDescription());
        return menuItem;
        }
        return null;
    }


    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Iterator createIterator(){
        return new PancakeHouseMenu();
    }



}
