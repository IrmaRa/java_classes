public class Bus {
  private int number;
  private Person[] passengers;

  public Bus(int number) {
    this.number = number;
    this.passengers = new Person[20];
  }

  public int getNumber() {
    return this.number;
  }

  public int passengersCount() {
    int count = 0;
    for (Person person : passengers) {
      if (person != null) {
        count++;
      }
    }
    return count;
  }

  public boolean isBusFull() {
    return passengersCount() == passengers.length;
  }

  public void add(Person person) {
    if (isBusFull()) {
      return;
    }
    passengers[passengersCount()] = person;
  }

  public void empty() {
    for (int i = 0; i < passengers.length; i++) {
      passengers[i] = null;
    }
  }

}