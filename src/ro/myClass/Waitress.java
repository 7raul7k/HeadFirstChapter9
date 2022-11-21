package ro.myClass;

import java.util.Iterator;

public class Waitress {
   PancakeHouseMenu pancakeHouseMenu;
   DinnerMenu dinnerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }
    public void printMenu(){
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinnerMenu.createIterator();
        System.out.println("MENU\n------------\nBREAKFAST");
        printMenu(pancakeIterator);
    }
    public void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + " ");
        }
    }
}
