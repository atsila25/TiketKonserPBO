package concert;
abstract public class Boyband extends Idol {
    String NamaBand;
    
    public Boyband(String NamaBand) {
        this.NamaBand = NamaBand;
    }
    public Boyband() {
        NamaBand = "";
    }
    public String getBoyband() {
        NamaBand = "";
        return NamaBand;
    }
    @Override
    public abstract void Genre();    
}