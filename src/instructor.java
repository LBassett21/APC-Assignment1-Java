public class instructor extends user {
    public String printSchedule(){
        return "Printed schedule... kinda";
    }

    public String printClassList(){
        return "Printed class list... kinda";
    }

    public void searchCourse(String crn){
        System.out.println("You searched for course: " + crn);
    }

}
