public class Dispetchering {
    SpaceModule sM = new SpaceModule("Disper", 70, 1000);

    SpaceStation sS = new SpaceStation(sM.getName(), sM.getWeight(), sM.getSizeCargo(), 10, 4);

    SpaceModule spaceModule;

    void menu(int number) {
        if (number == 1) {
            spaceModule = sM;
            spaceModule.helloH();
        } else {
            spaceModule = sS;
            spaceModule.helloH();
        }


    }
}
