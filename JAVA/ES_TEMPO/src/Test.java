public class Test {
    public static void main(String[] args) {

        try {
            TempoNonControllato tNC=new TempoNonControllato(-60,-80);
        } catch (ErroreTempo e) {
            System.out.println(e.getMessage());
        }
        TempoControllato tC=new TempoControllato(-20,-90);
    }
}
