package OverridingConcept;

public class OverridingClass extends OverridingExample{

	public void rateOfInterest() {
		System.out.println("Yes 6%");
	}
	public void cheqBooks() {
		System.out.println("unlimited");
	}
	
	public static void main(String[] args) {
		OverridingClass over=new OverridingClass();
		over.onlineBanking();
		over.rateOfInterest();
		over.cheqBooks();
		
		System.out.println("___________________________________________");
		
		OverridingExample exam=new OverridingExample();
		exam.onlineBanking();
		exam.rateOfInterest();
		exam.cheqBooks();
	}
}
