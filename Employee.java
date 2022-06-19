import java.util.Scanner;
import java.util.Random;

public class Employee {
      String firstName;
      String lastName;
      String password;
      String department;
      String email;
      String companydomain="company.com";
      
    public Employee(String firstName, String lastName) {
          this.firstName = firstName;
          this.lastName = lastName;
            }
        
        
        String department(){
            Scanner obj = new Scanner(System.in);
            System.out.println("Select the department of the new employee:");
            System.out.println("1. Technical\n2. Admin\n3. Human Resource\n4. Legal\n");
            System.out.print("Enter your choice: ");
            int choice = obj.nextInt();
            if (choice == 1)
            { return "@tech.";}
          else if (choice == 2)
            { return "@admin.";}
          else if (choice == 3)
            { return "@hr.";}
          else if (choice==4)
            { return "@legal.";}
          else
            { return "@invalid.";}
          }
    
    String randomPassword()
        {
     String mixedValue = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
     StringBuilder sb = new StringBuilder();
     Random random = new Random();
     int length = 10;;
     for (int i = 0;i<length;i++)
     {
         int p = random.nextInt(mixedValue.length());
         char randcharacter = mixedValue.charAt(p);
         sb.append(randcharacter);
     }
     String randomPassword = sb.toString();
     return randomPassword;
        }
    
    public static void main(String[] args) {

    while(true)
    {
      Employee obj = new Employee("sonam","phelgay");
      Scanner obj1 = new Scanner(System.in);
      System.out.print("\n");
      obj.department=obj.department();
      obj.email = obj.firstName+obj.lastName+obj.department+obj.companydomain;
      System.out.print("Dear "+ obj.firstName +" your generated credentials are as follows\n");
      System.out.print("Email: "+obj.email);
      System.out.print("\nPassword: "+obj.randomPassword());
    }
    }
}