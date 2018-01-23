import java.util.ArrayList;
import java.util.Scanner;

public class MyMain
{

    public static void main(String[] args) {
        boolean menubreak =true;
        String menuvalg="";
        Scanner sc = new Scanner(System.in);


        while(menubreak) {

            System.out.println("Velkommen vælg");
            System.out.println(
                    "1. Lave ture" +
                    "2. XX" +
                    "3. XX" +
                    "4. XX");
            menuvalg=sc.next();
            switch (menuvalg)
            {
                case "1":
                    crudTur();
                    break;

                case "2":
                    System.out.println("Hej du har valgt noget der ikke er implementeret endnu");
                    break;

                case "3":
                    System.out.println("Hej du har valgt noget der ikke er implementeret endnu");


                case "4":
                    System.out.println("Hej du har valgt noget der ikke er implementeret endnu");

                    default:
                        menubreak = false;
                        break;


            }
            break;
        }
    }

    private static void seTur()
    {
        ArrayList<Tur> tempTur = new ArrayList<>();

    }

    private static void crudTur()
    {
        boolean subMenuBreak=true;
        String submenuvalg="";
        while(subMenuBreak) {
            System.out.println(
                    "1. Oprette en tur" +
                    "2. Se ture" +
                    "3. Ændre Ture" +
                    "4. Slette ture" +
                    "");

            switch (submenuvalg) {
                case "1":
                    opretTur();

                case "2":

                case "3":

                case "4":

                default:
                    subMenuBreak = false;
                    break;

            }
        }
    }

    private static void opretTur()
    {

        int antalPladser;

    }
}
