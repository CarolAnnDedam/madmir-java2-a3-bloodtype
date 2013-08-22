
public class TestBloodType {

	public static void main(String[] args) {
		BloodType carol = new BloodType ("B", '-');
		BloodType josh = new BloodType ("A");
		BloodType carney = new BloodType ('-');
		BloodType junior = new BloodType ();
		
		
		//setting types
		carol.setBloodType("A");
		carol.setRhFactor('+');
		
		
			//Display Blood Types
		System.out.println( "Josh's blood type is " +josh.getBloodType() + josh.getRhFactor() );
		System.out.println( "carney's blood type is " +carney.getBloodType() + carney.getRhFactor() );
		System.out.println( "carol's blood type is " +carol.getBloodType() + carol.getRhFactor() );
		System.out.println( "Junior's blood type is " +junior.getBloodType() + junior.getRhFactor() );
	}
}