package Poliformizm;

public class Test {
	void useCar(Car car) {
		car.driving();
		System.out.println(car.getNumOfSeets());
	}
// user2 add the comment1
	public static void main(String[] args) {
		Test main=new Test();
		main.useCar(new Car());
	}

}
