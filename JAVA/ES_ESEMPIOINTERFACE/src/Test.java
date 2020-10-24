import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Vector <Solido> solidi = new Vector<Solido>();
        solidi.add(new Cubo(1.0, 3.0));
        solidi.add(new Sfera(1.0, 3.0));

        for (int i = 0; i < solidi.size(); i++) {
            System.out.println(solidi.get(i).volume() + " | " + solidi.get(i).superficie());
        }
    }
}
