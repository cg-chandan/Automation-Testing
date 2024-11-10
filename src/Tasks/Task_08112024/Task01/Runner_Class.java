package Tasks.Task_08112024.Task01;

public class Runner_Class {
    public static void main(String[] args) {
        StudentATB s1 = new StudentATB("Chandan",10);
        StudentATB s2 = new StudentATB("Thejasvi",12);
        StudentATB s3 = new StudentATB("Anil", 2);

        StudentATB[] Students = {s1,s2,s3};

        for(StudentATB Student:Students){
            System.out.println(Student);
        }
    }

}

