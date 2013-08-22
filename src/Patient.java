
public class Patient {
	
	
	private int patientIdNumber;
	private int patientAge;
	private BloodType patientBloodData;
	
	
	
	
	//Overloaded constructors
	public Patient( int id, int age,  BloodType BloodType){
		this.patientIdNumber = id;
		this.patientAge = age;
		this.patientBloodData = BloodType;
	
	}
	//Default constructor
	
	public Patient () {
		this(0,0, new BloodType());
	}
	

	//accessor method
	
	public int getPatientIdNumber() {
		return patientIdNumber;
	}
	public int getPatientAge () {
		return patientAge;
	}
	
	public String getBloodType() {
		return patientBloodData.getBloodType() + patientBloodData.getRhFactor() ;
	}
	

		
	//Mutator Methods
	public void setPatientIdNumber (int newId) {
		patientIdNumber = newId;
				
	}
	public void setPatientAge(int newAge) {
		patientAge = newAge;
	}
	public void setbloodType (BloodType newBloodType) {
		patientBloodData = newBloodType;
	}
}	
	
