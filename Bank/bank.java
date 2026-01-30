package Bank;

public class bank{
    public String Employee_name;
    public int Age;
    public String profession;

    public void setDetails(String name, int age, String prof){
         Employee_name = name;
         Age = age ;
         profession = prof;
    }

    public void printDetails(){
        System.out.println(Employee_name+", "+Age+", "+profession);
    }
}




