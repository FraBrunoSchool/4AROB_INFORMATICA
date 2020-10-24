public class TempoNonControllato {
    private int ora;
    private int min;
    private int sec;

    public TempoNonControllato(){
        ora=0;
        min=0;
        sec=0;
    }

    public TempoNonControllato(int ora, int min) throws ErroreTempo{
        setOra(ora);
        setMin(min);
        sec=0;
    }

    public TempoNonControllato(int ora, int min, int sec) throws ErroreTempo{
        setOra(ora);
        setMin(min);
        setSec(sec);
    }

    public void setMin(int min) throws ErroreTempo{
        if (min>=0&&min<60){
            this.min=min;
        }else{
            throw new ErroreTempo("ErroreTempo\nMinuti non compresi tra 0 e 59");
        }
    }

    public void setOra(int ora) throws ErroreTempo {
        if (ora >= 0) {
            this.ora = ora;
        } else {
            throw new ErroreTempo("ErroreTempo\nOre minori di zero");
        }
    }

    public void setSec(int sec) throws ErroreTempo{
            if (sec>=0){
                this.sec=sec;
            }else{
                throw new ErroreTempo("ErroreTempo\nSecondi non compresi tra 0 e 59");
            }
    }
}
