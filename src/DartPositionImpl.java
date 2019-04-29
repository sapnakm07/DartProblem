
public class DartPositionImpl implements DartPosition
{

        double dartPosition;

        double iPlayerPoints;

        int CIRCLE_ONE_MAX_VALUE=1;
        int CIRCLE_ONE_MIN_VALUE=0;

        int CIRCLE_TWO_MAX_VALUE=5;
        int CIRCLE_TWO_MIN_VALUE=1;

        int CIRCLE_THREE_MAX_VALUE=10;
        int CIRCLE_THREE_MIN_VALUE=5;

        int CIRCLE_ONE_DART_POINT=10;
        int CIRCLE_TWO_DART_POINT=5;
        int CIRCLE_THREE_DART_POINT=1;
        int CIRCLE_OUT_DART_POINT=0;

        public double dartPositionIdentify(double xCordinates,double yCordinates)
        {
            System.out.println("X cordinate = "+xCordinates+" && Y cordinate = "+yCordinates);

            dartPosition = Math.sqrt(Math.pow(xCordinates,2)+Math.pow(yCordinates,2));

            System.out.println("Dart Position "+dartPosition);

            return  dartPosition;
        }

        public double dbPlayerPoints(double dbdartPosition)
        {

            if (dbdartPosition > CIRCLE_ONE_MIN_VALUE && dbdartPosition <= CIRCLE_ONE_MAX_VALUE)
            {
                iPlayerPoints = CIRCLE_ONE_DART_POINT;
            }

            else if (dbdartPosition > CIRCLE_TWO_MIN_VALUE && dbdartPosition <= CIRCLE_TWO_MAX_VALUE )
            {
                iPlayerPoints = CIRCLE_TWO_DART_POINT;
            }
            else if ((dbdartPosition > CIRCLE_THREE_MIN_VALUE && dbdartPosition <= CIRCLE_THREE_MAX_VALUE ))
            {
                iPlayerPoints = CIRCLE_THREE_DART_POINT;
            }
            else if (dbdartPosition > CIRCLE_THREE_MAX_VALUE)
            {
                System.out.println("Sorry no points for the Player");
                iPlayerPoints = CIRCLE_OUT_DART_POINT;
            }

            return iPlayerPoints;
        }
}



