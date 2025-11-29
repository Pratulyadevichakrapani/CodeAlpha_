import java.util.ArrayList;
import java.util.Scanner;


public class GradeTracker {


private ArrayList<Student> students = new ArrayList<>();


public void addStudent(Student student) {
students.add(student);
}


public void displayReport() {
System.out.println("\n===== STUDENT GRADE REPORT =====");
for (Student s : students) {
System.out.println("\nStudent: " + s.getName());
System.out.println("Average: " + s.getAverage());
System.out.println("Highest: " + s.getHighest());
System.out.println("Lowest: " + s.getLowest());
}
System.out.println("==================================");
}


public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
GradeTracker tracker = new GradeTracker();


System.out.print("Enter number of students: ");
int n = sc.nextInt();
sc.nextLine();


for (int i = 0; i < n; i++) {
System.out.print("\nEnter student name: ");
String name = sc.nextLine();


System.out.print("Enter number of subjects: ");
int subCount = sc.nextInt();


double[] grades = new double[subCount];
for (int j = 0; j < subCount; j++) {
System.out.print("Enter grade for subject " + (j + 1) + ": ");
grades[j] = sc.nextDouble();
}
sc.nextLine();


tracker.addStudent(new Student(name, grades));
}


tracker.displayReport();
}
}
