/*Kirat Singh
APCS
31 October 2022
*/
public class Student {

    private String name = "";
    private double gpa = 0.0;
    private int numOfClass = 0;

    public Student(String nameofstudent, double gpaofsrudent, int classesnum) {
        name = nameofstudent;
        gpa = gpaofsrudent;
        numOfClass = classesnum;

    }

    public double getGPA() {
        return gpa;
    }

    public double getnumberofclasses() {
        return numOfClass;
    }

    public String nameofstudent() {
        return name;
    }


    public String takeClass(int grade, String apornot) {
        if (apornot.equals("not")) {
            //A grade
            if (grade >= 80) {
                double grades = (double) ((gpa * numOfClass) + 4.00);
                gpa = grades / (numOfClass + 1);
                int d = numOfClass + 1;
                numOfClass = d;

            }
            //B grade
            else if (grade >= 60 && grade < 80) {
                double grades = (double) ((gpa * numOfClass) + 3.00);
                gpa = grades / (numOfClass + 1);
                int d = numOfClass + 1;
                numOfClass = d;
            }
            //C grade
            else if (grade >= 40 && grade < 60) {
                double grades = (double) ((gpa * numOfClass) + 2.00);
                gpa = grades / (numOfClass + 1);
                int d = numOfClass + 1;
                numOfClass = d;
            }
            //D grade
            else {
                double grades = (double) ((gpa * numOfClass) + 1.00);
                gpa = grades / (numOfClass + 1);
                int d = numOfClass + 1;
                numOfClass = d;
            }
        }

        if (apornot.equals("ap")) {
            //A grade
            if (grade >= 80) {
                double grades = (double) ((gpa * numOfClass) + 4.00);
                gpa = grades / (numOfClass + 1);
                int d = numOfClass + 1;
                numOfClass = d;

            }
            //B grade
            else if (grade >= 60 && grade < 80) {
                double grades = (double) ((gpa * numOfClass) + 3.00);
                gpa = grades / (numOfClass + 1);
                int d = numOfClass + 1;
                numOfClass = d;
            }
            //c grade
            else if (grade >= 40 && grade < 60) {
                double grades = (double) ((gpa * numOfClass) + 2.00);
                gpa = grades / (numOfClass + 1);
                int d = numOfClass + 1;
                numOfClass = d;
            }
            //D grade
            else {
                double grades = (double) ((gpa * numOfClass) + 1.00);
                gpa = grades / (numOfClass + 1);
                int d = numOfClass + 1;
                numOfClass = d;
            }
        }
        return null;
    }

    public String evalArea() {
        return gpa + "" + numOfClass;
    }

    public Student(String stone, String sttwo) {
    }

    public Student classnewtake(Student other) {
        String stone =  gpa + "" + numOfClass;
        String sttwo = other.gpa + "" + other.numOfClass;
        return new Student(stone, sttwo);
    }

    public boolean equals(Object ob) {
        Student other = (Student) ob;
        return evalArea() == other.evalArea();

    }


    public String toString() {
        return "Name: " + name + ", GPA: " + gpa + ", Number of Classes:" + numOfClass;
    }

    public static void main(String args[]) {

        Student s = new Student("Tim", 4.0, 2);
        System.out.println("Original gpa- " + s);
        s.takeClass(70, "not");
        System.out.println("Modified gpa- " + s);

        Student s2 = new Student("Tim", 4.0, 2);
        s2.takeClass(70, "not");
        if (s.equals(s2)) {

            System.out.println("Yes, same stats.");

        } else {

            System.out.println("No, not the same stats.");

        }


    }
}
