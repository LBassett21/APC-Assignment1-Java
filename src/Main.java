public class Main {
    public static void main(String[] args) {

        admin Admin1 = new admin();
        Admin1.addRemoveUser("403388", true);
        Admin1.addRemoveUser("403388", false);
        Admin1.addRemoveCourse("1390141", true);
        Admin1.addRemoveCourse("1390141", false);
        Admin1.addRemoveStudentCourse("403388", "1390141", true);
        Admin1.addRemoveStudentCourse("403388", "1390141", false);
        System.out.println(Admin1.printRoster());
        System.out.println(Admin1.printSchedule());

        student Student1 = new student();
        Student1.setId("403388");
        Student1.setFirstname("Luke");
        Student1.setLastname("Bassett");
        Student1.searchCourse("1390141");
        Student1.printSchedule();
        Student1.addDropCourse("1390141", true);
        Student1.addDropCourse("1390141", false);

        instructor Instructor1 = new instructor();
        Instructor1.setId("111111");
        Instructor1.setFirstname("Marisha");
        Instructor1.setLastname("Rawlins");
        System.out.println(Instructor1.printSchedule());
        System.out.println(Instructor1.printClassList());
        Instructor1.searchCourse("1390141");

    }
}