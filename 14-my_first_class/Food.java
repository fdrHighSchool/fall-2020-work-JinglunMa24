public class Food {
  // instance variables
  private String name;
  private double wholesaleCost;
  private double retailCost;
  private double calories;
  private double totalPrice;

  // constructor
  public Food(String n, double w, double r, double c) {
    this.name = n;
    this.wholesaleCost = w;
    this.retailCost = r;
    this.calories = c;
    this.totalPrice = 0.0;
  } //end Food()

  // attributes
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

  // behaviors
  public void getTotalPrice() {
    this.totalPrice = this.retailCost + this.retailCost * 0.08875;
    System.out.println("The total price after tax is $" + this.totalPrice);
  } //end getTatolPrice()

  public void calculateIncome() { // must follow by the previous behaviors method
    this.totalPrice = this.retailCost + this.retailCost * 0.08875;
    System.out.println("The income of this food product would be $" + (this.totalPrice - this.wholesaleCost));
  } //end calculateIncome()

  // print out datas
  public String toString() {
    return "Food: " + this.name + ". The wholesale cost is $" + this.wholesaleCost + ". The retial cost is $" + this.retailCost + ". The calories it contains is " + this.calories + "kcal.";
  } //end toString()

} //end class
