import java.util.ArrayList;

class Developer{
    // 1. private member variables
    private String name;
    private ArrayList<String> skills;
    // ** Null Pointer Exception if it is not instantiated
    private int braincell;
    private double salary;

    // 2. constructors
    public Developer(){
        this.name = "Anonymous Hacker";
        this.skills = new ArrayList<String>();
        this.skills.add("Java");
        this.braincell = 5;
        this.salary = 90000;
    }

    public Developer(String name, int braincell, double salary){
        this.name = name;
        this.braincell = braincell;
        this.salary = salary;
        this.skills = new ArrayList<String>();
        skills.add("Break some code");
        skills.add("Fix some bugs");
    }


    // 3. methods
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

    // 4. getters & setters
    // getters (with return, on parameters )
    public String getName(){
        return this.name;
    }

    // setters (no return, with parameters)
    public void setName(String name){
        this.name = name; 
        // this.name: referring name of the instance
        // name : referring to the closest variable "name", from parameters
    }

    public ArrayList<String> getSkills(){
        return this.skills;
    }

    public void setSkills(ArrayList<String> skills){
        this.skills = skills;
    }

    public int getBraincell(){
        return this.braincell;
    }

    public void setBraincell(int braincell){
        this.braincell = braincell;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

}