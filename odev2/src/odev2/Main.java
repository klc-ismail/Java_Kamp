package odev2;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor();
		instructor1.setId(1); 
		instructor1.setFirstname("Engin ");
		instructor1.setLastname("Demiro?");
		
		
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstname("?smail");
		student1.setLastname("K?l??");
		
		
		
		StudentManager students = new StudentManager();
		students.add(student1);
		
		InstructorManager ?nstructors = new InstructorManager();
		?nstructors.add(instructor1);
		
	}

}
