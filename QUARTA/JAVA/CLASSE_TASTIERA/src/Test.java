public class Test {
    public static void main(String[] args) {
        Tastiera pulsanti = new Tastiera();
        int cInt=0;

        do {
            System.out.println("Input int");
            cInt=pulsanti.readInt();
        }while (cInt<0);

        System.out.println(cInt);

        float cFloat=0.0f;

        do {
            System.out.println("Input Float");
            cFloat=pulsanti.readFloat();
        }while (cFloat<0);

        System.out.println(cFloat);

        String cString=null;

        do {
            System.out.println("Input String");
            cString=pulsanti.readString();
        }while (cString==null);

        System.out.println(cString);
    }
}
