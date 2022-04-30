package conditional;

public class Main
{
    public static void typeNumber(double num)
    {
        if ( num > 0) {
            System.out.println("Number: "+num+" is positive");
        } else if (num < 0) {
            System.out.println("Number: "+num+" is negative");
        } else {
            System.out.println("Number is zero");
        }
    }

    public static void main(String[] args)
    {
        typeNumber(5);
        typeNumber(-5);
        typeNumber(0);
    }
}
