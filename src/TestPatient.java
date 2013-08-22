
public class TestPatient {

	public static void main(String[] args) {
		
		BloodType  FredBloodType = new  BloodType ( "B", '-');
		Patient  Bob = new Patient (321567,  45, FredBloodType);
		Patient  Michael = new Patient();
		Patient Alex = new Patient();
		
		
		System.out.println( "carol blood type is " + Bob.getBloodType() + " her age is " + Bob.getPatientAge() + "Her id number is " + Bob.getPatientIdNumber() );

	}
		//Display blood Types
	

	}


