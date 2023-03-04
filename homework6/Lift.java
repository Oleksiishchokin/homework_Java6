package homework6;

public class Lift {
    public static int numberOfLifts(int floors, int stepUp, int stepDown) {
        int currentFloor = 0;
        int count = 0;
        while (true) {
            currentFloor += stepUp;
            count++;
            if (currentFloor >= floors) {
                return count;
            }
            currentFloor -= stepDown;
        }
    }

}
