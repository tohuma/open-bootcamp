public class Main
{
    public static void main(String[] args)
    {
        Person person = new Person();
        person.setAge(37);
        person.setName("Miguel");
        person.setPhone("+51 941814253");

        System.out.println("Person is:");
        System.out.println("Your Name is: " + person.getName());
        System.out.println("Your age is :" + person.getAge());
        System.out.println("Your phone is :" + person.getPhone());
    }
}
