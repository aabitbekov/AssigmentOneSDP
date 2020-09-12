 class Car {
  private String model;
  private String color;
  
  public String getModel() {
	  return model;
  }
  
  public String getColor() {
	  return color;
  }
  
  private Car(Builder builder) {
	  this.model = builder.model;
	  this.color = builder.color;
  }
  
  static class Builder {
		 private String model;
		 private String color;
		 
		 public Builder(String model) {
			 this.model = model; 
		 }

		 public Builder setColor(String color) {
			 this.color=color;
			 return this;
		 }
		 
		 public Car build() {
			return new Car(this);
		 }
	}

  
}
 
