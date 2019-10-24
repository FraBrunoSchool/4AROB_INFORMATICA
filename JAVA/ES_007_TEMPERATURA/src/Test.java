/*
    Dichiarare una classe di nome “temperatura” che ha come attributo la temperatura in gradi centigradi (temp e i
    metodi getGradiC e setGradiC). Definire un costruttore per inizializzare la temperatura, e un metodo (getGradiF)
    per convertire la temperatura da gradi centigradi a Fahrenheit, sapendo che: F = 32 + ( 9 * C / 5)
*/

public class Test {
    public static void main(String[] args) {

        Temperatura t = new Temperatura(20f);
        System.out.println(t.toString());
        System.out.println("In gradi Fahrenheit: " + t.getGradiF());
    }
}
