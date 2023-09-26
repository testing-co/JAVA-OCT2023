class DeveloperTest{
    public static void main(String[] args){
        Developer michael = new Developer();
        michael.name="Michael";
        michael.braincell = 2;
        michael.salary = 200000;
        michael.skills.add("Java");

        michael.display();
        michael
            .goToBootcamp("html")
            .goToBootcamp("Python");
        michael.display();
    }
}