package week1Day1;

public class Car {
	Short noofdores=4;
	int carNumber = 1234;
	long chasisNumber = 9962066944L;
	float groundclaerence = 123.9876f;
	double engineNumber = 9.88047685354;
	char fueltype = 'D';
	boolean isAirbagsAvailble = true;
	String carmanufacturere = "Honda";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj = new Car();
		System.out.println("Number Of doors :"+obj.noofdores);
		System.out.println("Car Number :"+obj.carNumber);
		System.out.println("Car chasise Number :"+obj.chasisNumber);
		System.out.println("Car Ground clearence :"+obj.groundclaerence);
		System.out.println("Car Engine Number :"+obj.engineNumber);
		System.out.println("Car fueltype :"+obj.fueltype);
		System.out.println("Airbags Availability :"+obj.isAirbagsAvailble);
		System.out.println("Car Manufacturer :"+obj.carmanufacturere);

	}

}
