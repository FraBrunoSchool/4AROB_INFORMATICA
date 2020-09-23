public class Main {
    public static void main(String[] args) {
        int[] numClassi;
        int nClassi = (int)((Math.random()*10)+1);
        int totAlunni = 0;
        float mediaAlunni;
        int min  = 0;
        int max  = 0;
        numClassi = new int[nClassi];
        //System.out.println(numClassi.length);
        for (int i = 0; i < nClassi; i++) {
            numClassi[i]= (int)(random.nextInt(30)+1);
            //System.out.println(numClassi[i]);
        }
        for (int i = 0; i < nClassi; i++) {
            totAlunni = totAlunni + numClassi[i];
        }

        mediaAlunni = (float) totAlunni/nClassi;

        min = numClassi[0];
        for (int i = 1; i < nClassi; i++) {
            if (numClassi[i]<min){
                min = numClassi[i];
            }
        }

        max = numClassi[0];
        for (int i = 1; i < nClassi; i++) {
            if (numClassi[i]>max){
                max = numClassi[i];
            }
        }

        System.out.println("Numero di classi: " + nClassi +
                           "\nTotale alunni: " + totAlunni +
                           "\nMedia alunni per classe: " + mediaAlunni +
                           "\nMinimo per classe: " + min +
                           "\nMassimo per classe: " + max);

    }
}
