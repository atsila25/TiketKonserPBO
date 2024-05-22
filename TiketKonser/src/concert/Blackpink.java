package concert;
import javax.swing.JOptionPane;
public class Blackpink extends Girlband {
    private int Harga;
    private String jenisTiket;

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public void setJenisTiket(String jenisTiket) {
        this.jenisTiket = jenisTiket;
    }

    public String getJenisTiket() {
        return jenisTiket;
    }

    @Override
    public void Genre() {
        JOptionPane.showMessageDialog(null,"BlackPink \nGenre musik POP");
    }

    @Override
    public void Jenistiket() {
        System.out.println("Blackpink");
    }

    @Override
    public void Harga() {

    }
    public static void TestBp () {
        Blackpink bp = new Blackpink();
        Blackpink bp2 = new Blackpink();
        Blackpink bp1 = new Blackpink();
        bp1.Jenistiket();
        bp1.Genre();
        bp2.setHarga(7000000);
        bp1.setJenisTiket("Tiket VIP");
        System.out.println(bp1.getJenisTiket() + " = " + bp2.getHarga());
        bp.setHarga(4000000);
        bp.setJenisTiket("Tiket Regular");
        System.out.println(bp1.getJenisTiket() + " = " + bp.getHarga());
        Object[] typeticket = {"VIP", "REGULER"}; 
        int pilih = JOptionPane.showOptionDialog(null,"VIP = " + bp2.getHarga() + "\n " +  "Reguler = " + bp.getHarga(), "Pilih Jenis Tiket Anda", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, typeticket, typeticket[0]);
        switch (pilih) {
            case JOptionPane.YES_OPTION:
            {
                String input = JOptionPane.showInputDialog(" Tiket VIP seharga " +bp2.getHarga()+ "\n Masukkan Jumlah Tiket yang akan dibeli: ");
                int jumlah = Integer.parseInt(input);
                int total_biaya = bp2.getHarga() * jumlah;
                JOptionPane.showMessageDialog(null, "BLACKPINK \n Jenis Tiket: " +bp1.getJenisTiket()+"\n Harga: "+bp2.getHarga()+"\n Jumlah tiket: "+jumlah+ "\n Total Harga: "+total_biaya, "Here's your struk", JOptionPane.INFORMATION_MESSAGE);                    
                break;
            }
            case JOptionPane.NO_OPTION:
            {
                String input = JOptionPane.showInputDialog(" Tiket Reguler seharga " +bp.getHarga()+ "\n Masukkan Jumlah Tiket yang akan dibeli: ");
                int jumlah = Integer.parseInt(input);
                int total_biaya = bp.getHarga() * jumlah;
                JOptionPane.showMessageDialog(null, "BLACKPINK \n Jenis Tiket: " +bp.getJenisTiket()+"\n Harga: "+bp.getHarga()+"\n Jumlah tiket: "+jumlah+ "\n Total Harga: "+total_biaya, "Here's your struk", JOptionPane.INFORMATION_MESSAGE);                    
                break;
            }                
            default:
                break;
        }
    }
}        