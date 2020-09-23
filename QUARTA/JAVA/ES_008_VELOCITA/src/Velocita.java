public class Velocita {
    private float vel;

    public Velocita() {
        vel = 0f;
    }

    public void setVelKmH(float vel) {
        this.vel = vel;
    }

    public float getVelKmH() {
        return vel;
    }

    public void setVelMS(float vel) {
        this.vel = (float) (vel * 3.6);
    }

    public float getVelMS() {
        return (float) (vel/3.6);
    }
}
