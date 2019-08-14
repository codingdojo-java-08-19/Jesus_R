public class ProjectJava{
    
    //member variables: 
    private String name;
    private String description;
    
    // ---- getters: ----
    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    // ---- setters: ----
    public void setName(String nameOfProj){
        this.name = nameOfProj;
    }

    public void setDesc (String descrOfProj){
        this.description = descrOfProj;
    }

    // ---- methods: ----
    public String elevatorPitch(){
        return name + ":" + description;
    }

    // ---- constructors/overloads: ----
    public ProjectJava(){}

    public ProjectJava(String nameOfProj){
        this.name = nameOfProj;
    }

    public ProjectJava(String nameOfProj, String descOfProj){
        this.name = nameOfProj;
        this.description = descOfProj;
    }
}