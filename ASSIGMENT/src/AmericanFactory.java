
public class AmericanFactory implements Factory {

	@Override
	public Car createCar() {
	System.out.println("American Factory created Lincolin.");
	return new Lincolin();
	}

}
