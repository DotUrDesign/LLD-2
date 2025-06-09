package StrategyV1;

public class GoogleMaps {
    void findPathByMode(TravelMode travelMode) {
        PathCalcStrategy p = PathCalcStrategyFactory.getTravelMode(travelMode);
        p.findPath();
    }
}
