public class Test {
    public static void main(String[] args) {
        Animale[] a = new Animale[3];
        a[0]=new Scoiattolo("cioppi");
        a[1]=new Scoiattolo("cippi");
        a[2]=new Leone("fufi");
        for (int i = 0; i < 3; i++) {
            a[i].presentati();
        }

    }
}
