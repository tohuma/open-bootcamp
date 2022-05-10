public class Main
{
    public static void main(String[] args)
    {
        Client client = new Client();
        client.setAge(37);
        client.setName("Lucas Art");
        client.setPhone("+51 941814253");
        client.setCredit(45000);

        Employee employee = new Employee();
        employee.setAge(26);
        employee.setName("Korina Alvarez");
        employee.setPhone("+51 94034343");
        employee.setSalary(2500);

        System.out.println("Client is:");
        System.out.println("Name :" + client.getName());
        System.out.println("Age :" + client.getAge());
        System.out.println("Phone :" + client.getPhone());
        System.out.println("Credit :" + client.getCredit());

        System.out.println("\n");

        System.out.println("Employee is:");
        System.out.println("Name :" + employee.getName());
        System.out.println("Age :" + employee.getAge());
        System.out.println("Phone :" + employee.getPhone());
        System.out.println("Salary :" + employee.getSalary());
    }
}
