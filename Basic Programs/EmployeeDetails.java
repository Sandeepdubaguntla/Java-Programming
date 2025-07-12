import java.util.Scanner;

class EmployeeDetails 
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the EmployeeDetails.........");
        System.out.println("Enter the EmployeeName.........");
        String Employee_Name=sc.next();
        System.out.println("Enter the EmployeeId.........");
        int Employee_Id=sc.nextInt();
        System.out.println("Enter the EmployeeAge.........");
        int Employee_Age=sc.nextInt();
        System.out.println("Enter the EmployeeGender.........");
        String Employee_Gender=sc.next();
        System.out.println("Enter the designation.........");
        String designation=sc.next();
        System.out.println("Enter the Salary.........");
        double Salary=sc.nextDouble();
        System.out.println("Enter the CompanyName.........");
        String Company_Name=sc.next();

        System.out.println("Name:-"+Employee_Name);
        System.out.println("Id:-"+Employee_Id);
        System.out.println("Age:-"+Employee_Age);
        System.out.println("Gender:-"+Employee_Gender);
        System.out.println("designation:-"+designation);
        System.out.println("Salary:-"+Salary);
        System.out.println("CompanyName:-"+Company_Name);

        
    }
    
}
