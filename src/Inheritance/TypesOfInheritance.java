package Inheritance;

class Employee {
    protected String name;
    protected int employeeId;

    public Employee(String empName, int empId) {
        this.name = empName;
        this.employeeId = empId;
    }
    public void display(){
        System.out.println("Employee:" + name +", ID:" + employeeId);
    }
}
//Single Inheritance
class Developer extends Employee {
    private String programmingLanguage;
    //ctor
    public Developer(String empName, int empId, String lang){
        super(empName, empId);// isme hum dekh rhe hai ki empName bhi aarha hai or empId bhi aarahi hai kyun --> kyunki yeh Developer Employee ki sub-class hai to properties inherit karega or properties inherit karne ke lie hum super()method ka use kar rhe hai usme wahi same parameters pass kar ke
        this.programmingLanguage = lang;
    }
    public void show(){
        display();
        System.out.println("Specializaiton: Developer, Programming Language: " + programmingLanguage);
    }
}
//Interface for Multiple Inheritance



interface ProjectManager {
    void manageProject();
}

interface TeamLead {
        void leadTeam();
}
//Multiple inheritance using interfaces

class TechLead extends Employee implements ProjectManager, TeamLead {
    private String projectManaged;
    private int teamSize;

    public TechLead(String empName, int empId, String Project, int teamSize) {
        super(empName, empId);
        this.projectManaged = Project;
        this.teamSize= teamSize;
    }
    public void displayInfo(){
        display();
        manageProject();
        leadTeam();
    }
    public void manageProject(){
        System.out.println("project manager managed project:" + projectManaged);}
        public void leadTeam(){
            System.out.println("Team lead leading a team of " + teamSize + "members.");
        }
}
// MULTILEVEL INHERITANCE






public class TypesOfInheritance {
    static void main(String[] args) {
//        Developer dev = new Developer("Ramu kaka", 101, "Java");
//    dev.show();


//    TechLead techLead = new TechLead("Anna Dev",202,"Project X",5);
//    techLead.displayInfo();




    }
}

