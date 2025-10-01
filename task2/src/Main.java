
public class Main {
    public static void main(String[] args) {
        Cafe cafe =new Cafe();
        cafe.loadMenuData();

        System.out.println("Coffee menu");
        for (String coffee : cafe.getCoffeMenu()){
            system.out.println("-"+coffee);
        }

    }
}