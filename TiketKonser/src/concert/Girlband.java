package concert;
abstract public class Girlband extends Idol {
    String NamaBand;

    public  Girlband(String NamaBand) {
        this.NamaBand = NamaBand;
    }

    public Girlband() {
        NamaBand = "";
    }

    public String getGirlband() {
        NamaBand = "";
        return NamaBand;
    }

    @Override
    public abstract void Genre();
}