public class TempoControllato {
    private int ora;
    private int min;
    private int sec;

    public TempoControllato(){
        ora=0;
        min=0;
        sec=0;
    }

    public TempoControllato(int ora, int min) throws ErroreTempoControllato{
        setOra(ora);
        setMin(min);
        sec=0;
    }

    public TempoControllato(int ora, int min, int sec) throws ErroreTempoControllato{
        setOra(ora);
        setMin(min);
        setSec(sec);
    }

    public void setMin(int min) throws ErroreTempoControllato{
        if (min>=0&&min<60){
            this.min=min;
        }else{
            throw new ErroreTempoControllato("ErroreTempoControllato\nMinuti non compresi tra 0 e 59");
        }
    }

    public void setOra(int ora) throws ErroreTempoControllato {
        if (ora >= 0) {
            this.ora = ora;
        } else {
            throw new ErroreTempoControllato("ErroreTempoControllato\nOre minori di zero");
        }
    }

    public void setSec(int sec) throws ErroreTempoControllato{
        if (sec>=0){
            this.sec=sec;
        }else{
            throw new ErroreTempoControllato("ErroreTempoControllato\nSecondi non compresi tra 0 e 59");
        }
    }
}


