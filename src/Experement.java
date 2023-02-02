class Experement implements Interf{
    private int a;

    public Experement(int a) {
        this.a = a;
    }

    final void testT() {
        System.out.println("Final test");
    }


    void test() {
        ExpererentDemo expererentDemo = new ExpererentDemo();
        expererentDemo.hello();

    }
    public void hello(){

    }

    class ExpererentDemo {


        void hello() {
            System.out.println("демо експеремент");
            System.out.println(a);
        }


    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
