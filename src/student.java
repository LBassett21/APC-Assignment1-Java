public class student extends user{
    public String searchCourse(String crn){
        return crn;
    }
    public void addDropCourse(String crn, boolean ad){
        if (ad == true){
            System.out.println("You added course: " + crn);
        } else {
            System.out.println("You removed course: " + crn);
        }
    }
    public String printSchedule(){
        return "Printed schedule... kinda";
    }
}
