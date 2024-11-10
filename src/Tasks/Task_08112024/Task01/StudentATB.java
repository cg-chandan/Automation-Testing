package Tasks.Task_08112024.Task01;

public class StudentATB {
    String name;
    int id;

    public StudentATB(String name,int id){
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString(){
        return "StudentATB[name= "+name+", id= "+id+"]";
    }

}
