public class Student {
private String name;
private double[] grades;


public Student(String name, double[] grades) {
this.name = name;
this.grades = grades;
}


public String getName() {
return name;
}


public double[] getGrades() {
return grades;
}


public double getAverage() {
double sum = 0;
for (double g : grades) sum += g;
return sum / grades.length;
}


public double getHighest() {
double max = grades[0];
for (double g : grades) if (g > max) max = g;
return max;
}


public double getLowest() {
double min = grades[0];
for (double g : grades) if (g < min) min = g;
return min;
}
}
