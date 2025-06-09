package StrategyV1;

public class PathCalcStrategyFactory {
    public static PathCalcStrategy getTravelMode(TravelMode travelMode) {
        if(travelMode.equals(TravelMode.WALK)) {
            return new WalkPathCalcStrategy();
        } else if(travelMode.equals(TravelMode.BIKE)) {
            return new BikePathCalcStrategy();
        } else if(travelMode.equals(TravelMode.CAR)) {
            return new CarPathCalcStrategy();
        }
        return null;
    }
}
