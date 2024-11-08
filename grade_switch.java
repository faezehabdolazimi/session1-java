package ir.isc.training;

public class GRADE {

	public static void main(String[] args) {
		int key=76/10;
		char grade;

		switch (key) {
		    case 9:
			grade ='A';
			System.out.println("grade is"+grade);
			break;
		    case 8:
		    	grade ='B';
		    	System.out.println("grade is"+grade);
		    	break;
		    case 7:
		    	grade ='C';
		    	System.out.println("grade is"+grade);
		    	break;
		    	
		default:
			grade ='D';
			System.out.println("student grade is "+grade);
			break;
		}

	}

}

