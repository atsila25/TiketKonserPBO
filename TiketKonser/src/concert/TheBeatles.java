package concert;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TheBeatles extends Idol {

    private int Harga;
    private String jenisTiket;
    
    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public String getJenisTiket() {
        return jenisTiket;
    }

    public void setJenisTiket(String jenisTiket) {
        this.jenisTiket = jenisTiket;
    }

    @Override
    public void Genre() {
        JOptionPane.showMessageDialog(null,"The Beatles \nGenre musik ROCK");
    }

    @Override
    public void Jenistiket() {
        System.out.println("The Beatles");
    }

    @Override
    public void Harga() {
    }
    
public static void TestTheBeatles(){
        TheBeatles bt = new TheBeatles();
        TheBeatles bt2 = new TheBeatles();
        TheBeatles bt1 = new TheBeatles();
        bt1.Jenistiket();
        bt1.Genre();
        bt2.setHarga(8000000);
        bt1.setJenisTiket("VIP");
        System.out.println(bt1.getJenisTiket() + " = " + bt2.getHarga());
        bt.setHarga(6000000);
        bt.setJenisTiket("Regular");
        System.out.println(bt.getJenisTiket() + " = " + bt.getHarga());
        Object[] typeticket = {"VIP", "REGULER"}; 
        int pilih = JOptionPane.showOptionDialog(null,"VIP = " + bt2.getHarga() + "\n " +  "Reguler = " + bt.getHarga(), "Pilih Jenis Tiket Anda", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, typeticket, typeticket[0]);
        switch (pilih) {
            case JOptionPane.YES_OPTION:
            {
                String input = JOptionPane.showInputDialog(" Tiket VIP seharga " +bt2.getHarga()+ "\n Masukkan Jumlah Tiket yang akan dibeli: ");
                int jumlah = Integer.parseInt(input);
                int total_biaya = bt2.getHarga() * jumlah;
                JOptionPane.showMessageDialog(null, "THE BEATLES \n Jenis Tiket: " +bt1.getJenisTiket()+"\n Harga: "+bt2.getHarga()+"\n Jumlah tiket: "+jumlah+ "\n Total Harga: "+total_biaya, "Here's your struk", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            case JOptionPane.NO_OPTION:
            {
                String input = JOptionPane.showInputDialog(" Tiket Reguler seharga " +bt.getHarga()+ "\n Masukkan Jumlah Tiket yang akan dibeli: ");
                int jumlah = Integer.parseInt(input);
                int total_biaya = bt.getHarga() * jumlah;
                JOptionPane.showMessageDialog(null, "THE BEATLES \n Jenis Tiket: " +bt.getJenisTiket()+"\n Harga: "+bt.getHarga()+"\n Jumlah tiket: "+jumlah+ "\n Total Harga: "+total_biaya, "Here's your struk", JOptionPane.INFORMATION_MESSAGE);
                break;
            }                
            default:
                break;
        }
    }
}