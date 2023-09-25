// 1. compile java (javac & java)
// ------------- First Java Program ------------
public class JavaBasicUtil{
    // public : publicly accessible
    // static: running the method without instantiation
    // void: no return
    // method name: main
    public static void main(String[] args){
        System.out.println("Hello World!!!");

        // 2. variables 
        // int, double, boolean, char, String
        String projectTitle = "Cafe Java";
        String developer = "Heidi";
        Integer totalFiles = 2; // 0.5 files doesn't make sense
        boolean isDone = true;
        char difficulty = 'B';

        System.out.println("Developer: " + developer);
        System.out.println("Project Title: "+ projectTitle);
        System.out.println("total files: " + totalFiles);
        System.out.println("Is completed?: " + isDone);
        System.out.println("Difficulty: " + difficulty);



        // 3. conditionals & ternary
        if(isDone){
            System.out.println("This assignment is complete");
        }else{
            System.out.println("This assignment is incomplete");
        }

        if(totalFiles > 1){
            System.out.println("Please zip your files before submission");
        }else{
            System.out.println("There is only 1 file for this assignment");
        }

        // ------------- Cafe Java ------------
        // 4. String (length, indexOf, format, trim(), .equals )
        System.out.println("Title length: " + projectTitle.length());
        String projectDetails1 = projectTitle.concat("--").concat(developer);
        System.out.println("Project Details: " + projectDetails1);

        String projectDetails2 = projectTitle + "--" + developer;
        System.out.println("Project Details: " + projectDetails2);

        String projectDetails3 = String.format("Project Title : %s | total files: %d", projectTitle, totalFiles);
        System.out.println("Project Details: " + projectDetails3);

        String name1 = "Heidi";
        String name2 = "Heidi";
        String name3 = new String("Heidi");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name3));
    }
}