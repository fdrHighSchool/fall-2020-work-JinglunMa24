public class Food {
  private String name;
  private double wholesaleCost;
  private double retailCost;
  private double calories;

  public Food(String n, double w, double r, double c) {
    this.name = n;
    this.wholesaleCost = w;
    this.retailCost = r;
    this.calories = c;
  } //end Food()

  public String getName() {
    return this.name;
  } //end getName()

  public double getWholesaleCost() {
    return this.wholesaleCost;
  } //end getExpiredDate()

  public double getRetailCost() {
    return this.retailCost;
  } //end getWholesaleCost()

  public double getCalories() {
    return this.calories;
  } //end getRetailCost()

  public void getTotalPrice() {
    double totalPrice = this.retailCost * 0.08875;
    System.out.println("The total price of this product is $" + totalPrice);
  } //end getTatolPrice()

  public void calculateIncome() {
    double totalPrice = this.retailCost + this.retailCost * 0.08875;
    System.out.println("The income of this food product would be $" + (totalPrice - this.wholesaleCost));
  } //end calculateIncome()

  public String toString() {
    return "Food: " + this.name + ". The wholesale cost is $" + this.wholesaleCost + ". The retial cost is $" + this.retailCost + ". The calories it contains is " + this.calories + "kcal.";
  } //end toString()

} //end class
