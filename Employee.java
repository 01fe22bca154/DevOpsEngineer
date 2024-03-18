public class Employee {
    public String name;
    public int EmpId;
    public double salary;

    public Employee(String name, int EmpId, double salary) {
        this.name = name;
        this.EmpId = EmpId;
        this.salary = salary;
    }
    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("Employee ID: "+ EmpId);
        System.out.println("Salary: "+ salary); 
    }
    // public double getSalary(){
    //     return salary;
    // }

    public static void main(String[] args){
        Employee emp1 = new Employee("Aishwarya", 103, 520000);
        emp1.display();

        DevOps_Engineer d1 = new DevOps_Engineer("Aishwarya", 103,520000,700);
        d1.display();
    }
}







public class DevOps_Engineer extends Employee {
    public int bonus;
    public DevOps_Engineer(String name, int EmpId, double salary,int bonus) {
        super(name, EmpId, salary);
        this.bonus=bonus;
    }

    @override
    public void display(){
        System.out.println("Bonus: "+ bonus);
        System.out.println("Total salary: "+ (salary+bonus));
    }
    
}