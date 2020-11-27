public abstract class BangunRuang {
    public float jariJari;

    public BangunRuang(float jariJari) {
        this.jariJari = jariJari;
    }

    public abstract float menghitungVolume();

    public void tampilVolume(){
        System.out.println("Hasil V : " + menghitungVolume());
        System.out.print("\n");
    }

}
