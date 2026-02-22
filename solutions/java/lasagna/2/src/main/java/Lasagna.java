public class Lasagna {
     private static final int EXPECTED_MINUTES_IN_OVEN = 40;
     private static final int EACH_LAYER_PREP_TIME = 2;
     public int expectedMinutesInOven(){
         return EXPECTED_MINUTES_IN_OVEN;
     }

     public int remainingMinutesInOven(int minutesInOven) {
         return expectedMinutesInOven() - minutesInOven;
     }

    public int preparationTimeInMinutes(int numOfLayers) {
        return EACH_LAYER_PREP_TIME*numOfLayers;
    }
   
    public int totalTimeInMinutes(int numOfLayers, int minutesInOven) {
        return preparationTimeInMinutes(numOfLayers) + minutesInOven;
    }
}
