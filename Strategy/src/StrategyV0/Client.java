package StrategyV0;
/*
    Issues -
    1. Single Responsibility Principle(SRP) is violated. As there should only be one reason to change a code unit i.e., class/package/methood. But we can see that there are 3 reasons to change the class - GoogleMaps. Meaning if tomorrow, there is any change in the implementation of "Car travelmode", then we go to the class GoogleMaps, and inside it, we have to change it. And same goes for "Bike travelmode" and "Walk travelmode".

    2. Open Closed Principle(OCP) is violated. As there are multiple if-else blocks in the GoogleMaps class, which means if tomorrow, any new categorisations comes, then we have to modify the class. And the principle, open for extension and closed for modification.
 */
public class Client {
    public static void main(String[] args) {
        GoogleMaps g = new GoogleMaps();
        g.findPathByMode(TravelMode.BIKE);
        g.findPathByMode(TravelMode.WALK);
    }
}
