public class Keyboard {
    private InputStreamReader input;
    private BufferedReader tastiera;

    public Keyboard(){
        input = new InputStreamReader(System.in);
        tastiera = new BufferedReader(input);
    }

    public int readInteger(){
        int app = 0;

        try {
            app = Integer.parseInt(tastiera.readLine());
        } catch (IOException e) {
            System.out.printf("errore di IO");
        }catch (NumberFormatException e) {
            System.out.println("Non hai inserito un numero corretto");
        }

        return app;
    }

    public int readInteger(String msg){
        int app = 0;
        System.out.println(msg)
        try {
            app = Integer.parseInt(tastiera.readLine());
        } catch (IOException e) {
            System.out.printf("errore di IO");
        }catch (NumberFormatException e) {
            System.out.println("Non hai inserito un numero corretto");
        }

        return app;
    }

    public int readInteger(String msg, int min, int max){
        int app = 0;

        try {
            app = Integer.parseInt(tastiera.readLine());
        } catch (IOException e) {
            System.out.printf("errore di IO");
        }catch (NumberFormatException e) {
            System.out.println("Non hai inserito un numero corretto");
        }

        return app;
    }

    public String readString(){
        String app = null;

        try {
            app = tastiera.readLine();
        } catch (IOException e) {
            System.out.printf("errore di IO");
        }

        return app;
    }

    public float readFloat(){
        float app = 0.0f;

        try {
            app = Float.parseFloat(tastiera.readLine());
        } catch (IOException e) {
            System.out.printf("errore di IO");
        }catch (NumberFormatException e) {
            System.out.println("Non hai inserito un numero corretto");
        }

        return app;
    }

    

    public double readDouble(){
        double app = 0.0;

        try {
            app = Double.parseDouble(tastiera.readLine());
        } catch (IOException e) {
            System.out.printf("errore di IO");
        }catch (NumberFormatException e) {
            System.out.println("Non hai inserito un numero corretto");
        }

        return app;
    }

    public char readChar(){
        char app = ' ';

        try {
            app = (char) tastiera.read();
        } catch (IOException e) {
            System.out.printf("errore di IO");
        }catch (NumberFormatException e) {
            System.out.println("Non hai inserito un numero corretto");
        }

        return app;
    }
}
