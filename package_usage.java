import Bank.bank;

public class package_usage {
    public static void main(String args[]){

        Bank.bank EmpOne = new Bank.bank();
        EmpOne.Employee_name = "Ramesh";
        EmpOne.Age = 34;
        EmpOne.profession = "Software engineer.";
        EmpOne.printDetails();
    }
}
