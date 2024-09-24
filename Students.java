package week6.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println(id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student id : " + id + "\n" + "Student name : " + name);
	}

	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Email : " + email + "\n" + "PhoneNumber : " + phoneNumber);
	}

	public static void main(String[] args) {
		Students obj=new Students();
		obj.getStudentInfo(20200625);
		obj.getStudentInfo(20200625, "Jayaprakash");
		obj.getStudentInfo("jayaprakash@gmail.com", 880250250l);
	}

}

