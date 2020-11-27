public class Bola extends BangunRuang {

    public Bola(float jariJari) {
        super(jariJari);
    }

    @Override
    public float menghitungVolume() {
        return (float) (4/3f * Math.PI * Math.pow(jariJari, 3));
    }
}
