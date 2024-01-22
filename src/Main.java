import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int dailyHighs[] = {32, 25, 27, 40, 45};
        double tempTotal = dailyHighs[0] + dailyHighs[1] + dailyHighs[2] + dailyHighs[3] +dailyHighs[4];
        double tempAvg= tempTotal/dailyHighs.length;
        String city = "Columbus";
        int zipCode = 43215;
        System.out.println("City: " + city + ", The zipcode is " + zipCode + " The average temperature for this week is " + tempAvg);
    }
}