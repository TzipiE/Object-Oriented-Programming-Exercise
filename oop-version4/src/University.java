

import java.util.List;
public class University {

    public static void main(String[] args) {

        Student student1 = new Student("Moshe", 20, "123 Street", "S001");
        Student student2 = new Student("Alex", 22, "456 Oak St", "S1002");
        Professor professor1 = new Professor("Dr. Shor", 45, "456 Avenue", "Computer Science");


        UndergraduateCourse undergradCourse = new UndergraduateCourse("Intro to Programming", "C101");
        GraduateCourse gradCourse = new GraduateCourse("Advanced AI", "CS202", "Artificial Intelligence");


        gradCourse.addParticipant(student1);
        undergradCourse.addParticipant(student2);
        gradCourse.addParticipant(professor1);


        printCourseParticipants(undergradCourse);
        printCourseParticipants(gradCourse);
    }
     public static void printCourseParticipants(Course course) {
         System.out.println("Participants in " + course.getCourseName() + " (" + course.getCourseCode() + "):");
         List<Person> participants = course.getParticipants();
         for (Person person : participants) {
             System.out.println(person.getName() + " is " + person.getAge() + " years old " +
                     " and lives in " + person.getAddress() + " - " + person.getRole());
         }
         System.out.println();
     }
}
