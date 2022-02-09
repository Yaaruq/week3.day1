package week3.day1;

public class Students {

	public void getStudentInfo() {
		System.out.println("This is an example of Method Overloading with same Method name and different parameters");
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("The Id of the student is: "+id);
		System.out.println("The Name of the student is: " +name);
	}
	public void getStudentInfo(String email,int phoneNumber) {
		System.out.println("The Email Id of the student is: "+email);
		System.out.println("The Phone Nmumber of the student is: " +phoneNumber);
	}
	public static void main(String[] args) {
		Students a = new Students();
		a.getStudentInfo();
		String name = "Yaaruq";
		a.getStudentInfo(01, name);
		String email = "yaaruqmohammed@gmail.com";
		a.getStudentInfo(email,123456789);
		

		
	}
}

