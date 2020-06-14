package week1Day1;

public class Datatypes {

	//datatype variableName  = Value;
	Short ramSize=6;
	int number = 908765432;
	long phoneNumber = 9962066944L;
	float modelNumber = 123.9876f;
	double imei = 9.080406054;
	char version = 'P';
	boolean isMobilecharged = false;
		public static void main(String [] args) {
			Datatypes obj = new Datatypes();
			System.out.println("Ramsize :"+obj.ramSize);
			System.out.println("Number :"+obj.number);
			System.out.println("Phone Number :"+obj.phoneNumber);
			System.out.println("Model Number :"+obj.modelNumber);
			System.out.println("IMEI Number :"+obj.imei);
			System.out.println("Version :"+obj.version);
			System.out.println("Charging status :"+obj.isMobilecharged);
		}
}
