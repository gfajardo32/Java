package droidproject;

/*this is a project that builds a droid with certain attributes and behaviors
*the droid can perform tasks that drain its battery level also it can report its battery level
*the droid can only perform a task if it has enough battery level 
*author: Guido Fajardo
*date: 08/26/2025
*/

//Create a class named Droid
public class Droid {
  //State
  public String name;
  public int batteryLevel = 100;

    //Constructor
  @Override
  public String toString() {
    return "Hello I'm the droid: " + name + "!";
  }
    //Constructor method
  public Droid(String droidName) {
    name = droidName;
  }
  //Behavior
  public void performTask(String task){
    if (this.batteryLevel >= 10) {
      System.out.println(name + " is performing task: " + task + ".");
      this.batteryLevel -= 10;
    } else {
      System.out.println(name + " doesn't have enough battery to perform: " + task + ".");
    }
  }

  //Method that returns the battery level
  public String stateBatteryLevel(){
    return "The battery level is at " + this.batteryLevel + "%";
  }
 // Method that prints the battery level
  public void energyReport() {
    System.out.println(this.name + " has " + this.batteryLevel + "% of battery left!");
  }
 // Main method
  public static void main(String[] args) {
    Droid Codey = new Droid("Codey");

    System.out.println(Codey);
    Codey.performTask("dancing");
    Codey.performTask("running");
    Codey.performTask("jumping");
    Codey.performTask("hiding");
    Codey.energyReport();
    Codey.performTask("stretching");
    Codey.performTask("exercising");
    Codey.performTask("teaching");
    Codey.performTask("studying");
    Codey.performTask("coding");
    Codey.performTask("playing");
    Codey.performTask("sleeping");
    Codey.performTask("sitting");
    Codey.energyReport();

  }
}
