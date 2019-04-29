import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class DartGameSolution
{
    public static void main(String[] args)
    {
        Scanner dartCordinates = new Scanner(System.in);

        int playerPoints = 0;

        double dartPosition;

        DartPositionImpl dartPositions = new DartPositionImpl();

        System.out.println("Please enter the Dart x Cordinates");

        double xCordinate = dartCordinates.nextDouble();

        System.out.println("Please enter the Dart y Cordinates");

        double yCordinate = dartCordinates.nextDouble();

        dartPosition = dartPositions.dartPositionIdentify(xCordinate,yCordinate);

        playerPoints = Math.toIntExact(Math.round(dartPositions.dbPlayerPoints(dartPosition)));

        System.out.println("The Player earned "+ playerPoints+" points");
    }
}
