
public class Lab22_part2 {
	public static void main(String[] args)
	{
		vehicle vehi = new motorized_vehicle();
		motorized_vehicle moto = new motorized_vehicle();
		System.out.println(vehi.horsepower());
		System.out.println(moto.horsepower());
	}	
}

abstract class vehicle{
	private String owner;
	int num_of_wheels = 3;
	public abstract double horsepower();
	
}

class bicycle extends vehicle{
	public double horsepower() {
		return num_of_wheels;
	}
	
}
class motorized_vehicle extends vehicle{
	double enginevoldispl = 5;
	public double horsepower() {
		return enginevoldispl * num_of_wheels;
	}
	
}
