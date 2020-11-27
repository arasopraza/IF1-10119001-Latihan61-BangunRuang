public class Kerucut extends BangunRuang {
    private float tinggi;

    public Kerucut(float jariJari, float tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    @Override
    public float menghitungVolume() {
        return (float) (1/3f * Math.PI* Math.pow(jariJari, 2) * tinggi);
    }
}
