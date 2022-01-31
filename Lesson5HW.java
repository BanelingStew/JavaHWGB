public class Lesson5HW {
    public static void main (String [] args){
        Employee[] employees = new Employee[5];
        employees [0] = new Employee ("John" , "Lasov", "Programmer","LasovJ@apple.com","+8192212231",85, 25012);
        employees [1] = new Employee ("Mary" , "Sue", "Accountant","Mary@apple.com","+866765523",67, 8741232);
        employees [2] = new Employee ("Peter" , "Jackson", "CEO","Peter@apple.com","+855411247",57, 99989987);
        employees [3] = new Employee ("Stanley" , "Prasley", "CFO","Stanley@apple.com","+85411247",40, 1234567);
        employees [4] = new Employee ("Abigail" , "Newton", "Receptionist","Abigail@apple.com","+81911242",40, 54121);

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
     }

    }


class Employee {
    private String firstName;
    private String lastName;
    private String occupation;
    private String email;
    private String phone;
    private int salary;
    private int age;
    Employee(String firstName, String lastName, String occupation, String email, String phone, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.salary = salary;

    }
    public int getAge (){
        return age;
        }

    @Override
    public String toString() {
        return "Employee:" + firstName + "|" +  lastName + "|" + occupation + "|" + email + "|" +  phone + "|" + age + "|" + salary;
    }
}