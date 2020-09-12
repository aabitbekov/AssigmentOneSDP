public class RussianFactory implements Factory {
	@Override
	public Car createCar() {
		System.out.println("Russian Factory created Lada.");
		return new Lada();
	}

}
