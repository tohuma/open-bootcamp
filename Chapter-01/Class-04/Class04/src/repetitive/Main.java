package repetitive;

public class Main
{
    public static void useWhile()
    {
        System.out.println("Using While");
        int numberWhile = 1;
        while( numberWhile < 3)
        {
            System.out.println("The numberWhile is "+ numberWhile);
            numberWhile++;
        }
    }

    public static void useDoWhile()
    {
        System.out.println("Using Do While");
        int numberWhile = 1;

        do {
            System.out.println("DoWhile runs only once");
            numberWhile++;
        } while( numberWhile < 2);
    }

    public static void useFor()
    {
        System.out.println("Using For");
        for(int numberFor = 0; numberFor <= 3; numberFor++)
        {
            System.out.println("The numberFor is "+ numberFor);
        }
    }

    public static void useSwitch(String season)
    {
        String message;
        switch (season)
        {
            case "verano":
                message = "Is Summer.";
                break;
            case "otoño":
                message = "Is Fall";
                break;
            case "invierno":
                message = "Is Winter";
                break;
            case "primavera":
                message = "Is Spring";
                break;
            default:
                 message = "Invalid season of the year.";
        }

        System.out.println(message);
    }

    public static void main(String[] args)
    {
        useWhile();
        System.out.println("\n");
        useDoWhile();
        System.out.println("\n");
        useFor();
        System.out.println("\n");
        useSwitch("verano");
        useSwitch("otoño");
        useSwitch("invierno");
        useSwitch("primavera");
        useSwitch("marte");
    }
}
