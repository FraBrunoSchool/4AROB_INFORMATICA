public class Test {
    public static void main(String[] args) {
    Telecomando fra = new Telecomando();
    System.out.println(fra.toString());

    fra.setAcceso("si");
    System.out.println(fra.toString());

    fra.setCanaleDown();
    System.out.println("Canale: "+ fra.getCanale());
    fra.setCanaleDown();
    System.out.println("Canale: "+ fra.getCanale());
    fra.setCanale(-1);
    System.out.println("Canale: "+ fra.getCanale());
    fra.setCanale(5);
    System.out.println("Canale: "+ fra.getCanale());
    fra.setCanale(50);
    System.out.println("Canale: "+ fra.getCanale());

    fra.setVolumeDown();
    System.out.println("Volume: "+ fra.getVolume());
    fra.setVolumeDown();
    System.out.println("Volume: "+ fra.getVolume());
    fra.setVolumeUp();
    System.out.println("Volume: "+ fra.getVolume());
    fra.setVolumeUp();
    System.out.println("Volume: "+ fra.getVolume());
    fra.setVolumeUp();
    System.out.println("Volume: "+ fra.getVolume());

    System.out.println(fra.toString());

    fra.setAcceso("no");
    System.out.println(fra.toString());

    }
}
