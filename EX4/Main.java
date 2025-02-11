package EX4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Създаване на звезда и планета
        List<SpaceObject> orbiters = new ArrayList<>();
        Star sun = new Star("Sun", 0, 0, 0, 1.989E30, orbiters);

        Planet earth = new Planet("Earth", 1, 0, 0, 5.972E24, new ArrayList<>()) {
            @Override
            public void displayInfo() {
                super.displayInfo();
                printResources();
            }
        };

        // Добавяне на Земята като обект, който орбитира Слънцето
        sun.addOrbiter(earth);

        // Създаване на сателит и задаване на орбита
        Satellite moon = new Satellite("Moon", 1.00257, 0, 0, 7.34767309E22);
        try {
            moon.orbit(earth);
        } catch (NotValidSpaceObjectException e) {
            System.out.println(e.getMessage());
        }

        // Добавяне на сателита като обект, който орбитира планетата Земя
        earth.addOrbiter(moon);

        // Създаване на сграда (метална мина) и добавянето ѝ към планетата
        MetalMine metalMine = new MetalMine();
        earth.addBuilding(metalMine);
        metalMine.applyEffect(earth);

        // Извеждане на информация за планетата и нейните ресурси
        earth.displayInfo();

        // Създаване на скаутски кораб и задаване на дестинация
        Scout scoutShip = new Scout("Scout One", 50000, 100, 1.5, 1.0, 0.0, 2.0E5);
        scoutShip.explore();
        scoutShip.flyTo(sun);
        scoutShip.reportResources(earth);

        // Извеждане на информация за всички обекти
        System.out.println("\nDisplaying information about all objects:");
        sun.displayInfo();
        earth.displayInfo();
        moon.displayInfo();
        scoutShip.displayInfo();
    }
}