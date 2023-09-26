import java.util.ArrayList;

class Developer{
    // 1. member variables
    public String name;
    public ArrayList<String> skills = new ArrayList<String>();
    // ** Null Pointer Exception if it is not instantiated
    public int braincell;
    public double salary;

    // 2. methods
    public void display(){
        System.out.println("########### DISPLAY DEVELOPER ###########");
        System.out.println("Name: "+ this.name);
        System.out.println("Skills: "+ this.skills);
        System.out.println("braincell: "+ this.braincell);
        System.out.println("Salary: "+ this.salary);
    }

    public Developer goToBootcamp(String learntSkill){
        this.braincell++;
        this.skills.add(learntSkill);
        this.salary *= 1.1;
        System.out.println(this.name + " went to the bootcamp and learnt " + learntSkill);
        return this;
    }
}