import  java.util.Scanner;

public class admin extends user{

    public void addRemoveCourse(String crn, boolean ar){
        if (ar == true){
            Scanner userInput = new Scanner(System.in);
            System.out.println("You added course: " + crn);
            System.out.println("What is the course name?");
            String cn = userInput.nextLine();
            System.out.println("Your course name is: " + cn);
            System.out.println("What is the course description?");
            String cd = userInput.nextLine();
            System.out.println("Your course description is: " + cd);
        } else {
            System.out.println("You removed course: " + crn);
        }
    }

    public void addRemoveUser(String id, boolean ar){
        if (ar == true){
            Scanner userInput = new Scanner(System.in);
            System.out.println("You added user: " + id);
            System.out.println("What is the students first name?");
            String fn = userInput.nextLine();
            System.out.println("What is the students last name?");
            String ln = userInput.nextLine();
            student newStudent = new student();
            newStudent.setFirstname(fn);
            newStudent.setLastname(ln);
            newStudent.setId(id);
            System.out.println("You successfully added student: " + newStudent.getFirstname() + newStudent.getLastname() + " (ID#: " + newStudent.getId() + ")");
        } else {
            System.out.println("You removed user: " + id);
        }
    }

    public void addRemoveStudentCourse(String id, String crn, boolean ar){
        if (ar == true){
            System.out.println("You added course: " + crn + " for student: " + id);
        } else {
            System.out.println("You removed course: " + crn + " for student: " + id);
        }
    }

    public String printRoster(){
        return "Printer roster... kinda";
    }

    public String printSchedule(){
        return "Printed schedule... kinda";
    }
}
