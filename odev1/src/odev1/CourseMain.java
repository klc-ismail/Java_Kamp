package odev1;

public class CourseMain {

	public static void main(String[] args) {
		Course course1 = new Course(1,"Java Kamp�","Engin Demiro�","java.jpeg");
		course1.courseid = 1;
		course1.coursename = "Java Kamp�";
		course1.mentor = "Engin Demiro�";
		course1.image = "java.jpeg";
		
		Course course2 = new Course(2,"C# Kamp�","Engin Demiro�","c#.jpeg");
		course2.courseid = 2;
		course2.coursename = "C# Kamp�";
		course2.mentor = "Engin Demiro�";
		course2.image = "c#.jpeg";
		
		Course[] courses = {course1,course2};
		
		for(Course course: courses) {
			System.out.println(course.coursename +" "+ course.mentor);
		}
		
		System.out.println("\n"+course1.courseid+". Kurs: " + course1.coursename+"\nE�itmen: " + course1.mentor+ "\n" + course1.image+"\n");
		System.out.println("\n"+course2.courseid+". Kurs: " + course2.coursename+"\nE�itmen: " + course2.mentor+ "\n" + course2.image+"\n");
		
		
		
		CourseCategory category1 = new CourseCategory();
		category1.coursementor = 1;
		category1.mentorName = "Engin Demiro�";
		
		CourseManager courseManager = new CourseManager();
		courseManager.join(course1);
		courseManager.join(course2);	
	}

}
