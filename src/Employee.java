public class Employee {
    
    private String name;
    private double salary;

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(double salary){
        if (salary >= 0){
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary");
        }
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public static void main(String[] args){
        Employee newEmployee = new Employee();
        newEmployee.setName("David");
        System.out.println("My Name is: " + newEmployee.getName());
        newEmployee.setSalary(-5000.60);
        System.out.println("My Salary is: " + newEmployee.getSalary());
    }
}
