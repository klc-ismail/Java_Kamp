package odev1;

public class CourseMain {

	public static void main(String[] args) {
		Course course1 = new Course(1,"Java Kampı","Engin Demiroğ","java.jpeg");
		course1.courseid = 1;
		course1.coursename = "Java Kampı";
		course1.mentor = "Engin Demiroğ";
		course1.image = "java.jpeg";
		
		Course course2 = new Course(2,"C# Kampı","Engin Demiroğ","c#.jpeg");
		course2.courseid = 2;
		course2.coursename = "C# Kampı";
		course2.mentor = "Engin Demiroğ";
		course2.image = "c#.jpeg";
		
		Course[] courses = {course1,course2};
		
		for(Course course: courses) {
			System.out.println(course.coursename +" "+ course.mentor);
		}
		
		System.out.println("\n"+course1.courseid+". Kurs: " + course1.coursename+"\nEğitmen: " + course1.mentor+ "\n" + course1.image+"\n");
		System.out.println("\n"+course2.courseid+". Kurs: " + course2.coursename+"\nEğitmen: " + course2.mentor+ "\n" + course2.image+"\n");
		
		
		
		CourseCategory category1 = new CourseCategory();
		category1.coursementor = 1;
		category1.mentorName = "Engin Demiroğ";
		
		CourseManager courseManager = new CourseManager();
		courseManager.join(course1);
		courseManager.join(course2);	
	}

}
