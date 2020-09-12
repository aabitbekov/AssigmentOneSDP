
class CarAbstractFactory {
  Factory CreateCarFactory(String Country) {
	  switch (Country) {
	  case "Russian" : return new RussianFactory();
	  case "Germany" : return new GermanyFactory();
	  case "American" : return new AmericanFactory();
	  default : return null;
	  }
  }
  
  public static void main(String args[]) {
	Factory factory =  new CarAbstractFactory().CreateCarFactory("American");
	factory.createCar();
	

  }
}
