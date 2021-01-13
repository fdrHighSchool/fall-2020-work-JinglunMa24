public class FoodDriver {
  public static void main(String[] args) {
    Food cereal = new Food("Cereal", 7.89, 8.99, 307);
    System.out.println(cereal);
    System.out.println(cereal.getName());
    System.out.println(cereal.getWholesaleCost());
    System.out.println(cereal.getRetailCost());
    System.out.println(cereal.getCalories());

    cereal.getTotalPrice();
    cereal.calculateIncome();

    Food milk = new Food("Milk", 4.39, 5.49, 150);
    System.out.println("\n" + milk);
    System.out.println(milk.getName());
    System.out.println(milk.getWholesaleCost());
    System.out.println(milk.getRetailCost());
    System.out.println(milk.getCalories());

    milk.getTotalPrice();
    milk.calculateIncome();

  } //end main

} //end class
