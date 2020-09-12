
public class GermanyFactory implements Factory {
    @Override
	public Car createCar() {
		System.out.println("GermanyFactory created BMW.");
		return new BMW();
	}
  

}
