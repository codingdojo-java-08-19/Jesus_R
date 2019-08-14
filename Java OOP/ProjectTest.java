public class ProjectTest {
    public static void main(String[] args){
        ProjectJava forniteProject = new ProjectJava("Fortnite");
        ProjectJava hectorPoroject  = new ProjectJava("Hector", "Helped me out");
        String fortniteName = forniteProject.getName();
        String hectString = hectorPoroject.getName();
        String hectDesc = hectorPoroject.getDescription();
        System.out.println("Project name is: " + fortniteName);
        System.out.println("Project Name: " + hectString);
        System.out.println("Description: " + hectDesc);
    }
}

