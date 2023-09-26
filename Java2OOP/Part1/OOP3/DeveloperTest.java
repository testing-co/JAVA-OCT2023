class DeveloperTest{
    public static void main(String[] args){
        System.out.println("Dev count: " + Developer.getDevCount());
        System.out.println("Total Salary: " + Developer.getTotalSalary());

        Developer michael = new Developer("Michael", 2,200000 );
        michael.display();
        michael
            .goToBootcamp("html")
            .goToBootcamp("Python");
        michael.display();

        Developer dev1 = new Developer();
        dev1.display();

        System.out.println("Dev count: " + Developer.getDevCount());
        System.out.println("Total Salary: " + Developer.getTotalSalary());

        
    }
}