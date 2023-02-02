class SpaceStation extends SpaceModule {
    private int crew;
    private int age;
    private String functional;

    public SpaceStation(String name, double weight, int sizeCargo, int crew, int age, String functional) {
        super(name, weight, sizeCargo);
        this.crew = crew;
        this.age = age;
        this.functional = functional;
    }

    public SpaceStation(String name, double weight, int sizeCargo, int crew, int age) {
        super(name, weight, sizeCargo);
        this.crew = crew;
        this.age = age;
        functional = "MeltiFynksioonal";
    }



    void helloH() {
        System.out.println("Привіт я космічна станція " + getName());
    }


    void metod(int crew){

        if(super.bul(crew)){
            System.out.println("Так");
        }else {
            System.out.println("Ні");
        }


    }

    boolean bul(double cargo) {
        if (cargo <= getSizeCargo()) {
            return true;
        } else return false;
    }




//    int metod() {
//
//        return crew * age;
//    }
//
//    double metod(SpaceStation spaiseStation) {
//
//        return spaiseStation.crew * spaiseStation.age;
//    }




    public void setCrew(int crew) {
        this.crew = crew;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFunctional(String functional) {
        this.functional = functional;
    }



    public int getCrew() {
        return crew;
    }

    public int getAge() {
        return age;
    }

    public String getFunctional() {
        return functional;
    }
}
