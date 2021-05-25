package Poliformizm;

public class Test {
	void useCar(Car car) {
		car.driving();
		System.out.println(car.getNumOfSeets());
	}

	public static void main(String[] args) {
		Test main=new Test();
		main.useCar(new Car());
	}

}
