class Main implements Interf.IntIn {
    public static void main(String[] args) {


        Astronavt astronavt = new Astronavt("Yra", 18, 70,3);

        SpaceModule spaceModule = new SpaceModule("Apolo", 70, 1000);

        SpaceStation spaiseStation = new SpaceStation("Станція",1000,1000,3,4);
        //SpaceStation spaiseStation1 = new SpaceStation("Stanciya",100,1111, 45, 3);


        spaiseStation.metod(1000);



        spaceModule.helloH();
        spaiseStation.helloH();

        spaceModule.bul(1);
        spaiseStation.bul(1.1);


        Dispetchering dispetchering=new Dispetchering();
        dispetchering.menu(7);
        dispetchering.menu(1);












        //        Experement experement =new Experement(1);
//
//        experement.test();


//        astronavt.demoMetod();












//
//        astronavt.hello();
//        System.out.println(astronavt.suma(1, 2));
//        System.out.println(astronavt.suma(1.2, 2.4));
//        System.out.println(astronavt.faktor(3));
//        astronavt.demo(spaceModule,spaiseStation);
//
//
//        spaceModule.helloH();
//      System.out.println(spaceModule.aBoolean(100.2));
//        System.out.println(spaceModule.bBoolean(100));
//
//        spaiseStation.hello();
//        System.out.println(spaiseStation.metod());
//        System.out.println(spaiseStation.metod(spaiseStation1));



    }
}
