import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Person person;

  @Before 
  public void before() {
    bus = new Bus(11);
    person = new Person();
  }

  @Test
  public void hasNumber() {
    assertEquals(11, bus.getNumber()); 
  }

  @Test 
  public void busIsFull() {
    for(int i = 0; i < 20; i++) {
      bus.add(person);
    }
    assertEquals(true, bus.isBusFull());
  }

  @Test
  public void canAddPassenger() {
   bus.add(person);
   assertEquals(1, bus.passengersCount());
 }

 @Test
 public void cannotAddPassengerWhenBusFull() {
  for(int i = 0; i < 30; i++) {
    bus.add(person);
  }
  assertEquals(20, bus.passengersCount());
}

@Test
public void canEmptyBus() {
  bus.add(person);
  bus.empty();
  assertEquals(0, bus.passengersCount());
}

}