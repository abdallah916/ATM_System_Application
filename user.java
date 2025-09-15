package src;
public class user {
  private String name;
  private String address;
  private String job;
  private String lasttrans;
  private double balance;
  private int age;
  private String pin; // pin code

  public user(String name, String address, String job, String lasttrans, double balance, int age, String pin) {
    this.name = name;
    this.address = address;
    this.job = job;
    this.lasttrans = lasttrans;
    this.balance = balance;
    this.age = age;
    this.pin = pin;
  }

  public user() {

  }

  public boolean checkPin(String enteredPin) {
    return this.pin.equals(enteredPin);
  }

  public String getpin() {
    return pin;
  }

  public void setpin(String pin) {
    this.pin = pin;
  }

  public double getbalance() {
    return balance;
  }


  public void setbalance(double balance) {
    this.balance = balance;
  }

  public void setlasttrans(String lasttrans) {
    this.lasttrans = lasttrans;
  }

  public void displayinfo() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Job: " + job);
    System.out.println("Address: " + address);
    System.out.println("Balance: " + balance);
    System.out.println("Last Transaction: " + lasttrans);
    System.out.println("PIN: " + pin);
  }
}
