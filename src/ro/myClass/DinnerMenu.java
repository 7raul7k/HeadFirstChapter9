package ro.myClass;

import ro.myClass.IteratorPattern.DinerMenuIterator;

import java.util.Iterator;

public class DinnerMenu {
    static final int MaxItems = 6;
    int numberofItems = 0;
    MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MaxItems];
        addItem("Vegetarian BLT","(Fakin') Bacon with lettuce && tomato on whole wheat",true,2.99);
    }
    public void addItem(String name, String description, boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberofItems > MaxItems){
            System.err.println("Sorry,menu is full! can't add item to menu");
        }else{
            menuItems[numberofItems] = menuItem;
            numberofItems += 1;
        }
    }

    public MenuItem[] getMenuItems() {
        DinnerMenu dinnerMenu = new DinnerMenu();
        MenuItem[] lunchItems = dinnerMenu.getMenuItems();

       for(int i = 0;i < lunchItems.length;i++){
           MenuItem menuItem = lunchItems[i];
           System.out.println(menuItem.getName() +" ");
           System.out.println(menuItem.getPrice() + " ");
           System.out.println(menuItem.getDescription() + " ");
           return new MenuItem[]{menuItem};
       }
       return null;

    }

    public Iterator createIterator(){
        return (Iterator) new DinerMenuIterator(menuItems);
    }

    public void setMenuItems(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public int getNumberofItems() {
        return numberofItems;
    }



    public void setNumberofItems(int numberofItems) {
        this.numberofItems = numberofItems;
    }
}
