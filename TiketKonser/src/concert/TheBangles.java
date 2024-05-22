package concert;
import javax.swing.JOptionPane;

public class TheBangles extends Idol {

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
        JOptionPane.showMessageDialog(null,"The Bangles \nGenre musik ROCK");
    }

    @Override
    public void Jenistiket() {
        System.out.println("The Bangles");
    }

    @Override
    public void Harga() {
    }
    public static void TestTheB() {
        TheBangles tb = new TheBangles();
        TheBangles tb2 = new TheBangles();
        TheBangles tb1 = new TheBangles();
        tb1.Jenistiket();
        tb1.Genre();
        tb.setHarga(9000000);
        tb.setJenisTiket("Tiket VIP");
        System.out.println(tb1.getJenisTiket() + " = " + tb.getHarga());
        tb2.setHarga(5000000);
        tb1.setJenisTiket("Tiket Regular");
        System.out.println(tb1.getJenisTiket() + " = " + tb2.getHarga());
        Object[] typeticket = {"VIP", "REGULER"}; 
        int pilih = JOptionPane.showOptionDialog(null,"VIP = " + tb.getHarga() + "\n " +  "Reguler = " + tb2.getHarga(), "Pilih Jenis Tiket Anda", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, typeticket, typeticket[0]);
        switch (pilih) {
            case JOptionPane.YES_OPTION:
            {
                String input = JOptionPane.showInputDialog(" Tiket VIP seharga " +tb.getHarga()+ "\n Masukkan Jumlah Tiket yang akan dibeli: ");
                int jumlah = Integer.parseInt(input);
                int total_biaya = tb.getHarga() * jumlah;
                JOptionPane.showMessageDialog(null, "THE BANGLES \n Jenis Tiket: " +tb.getJenisTiket()+"\n Harga: "+tb.getHarga()+"\n Jumlah tiket: "+jumlah+ "\n Total Harga: "+total_biaya, "Here's your struk", JOptionPane.INFORMATION_MESSAGE);                    
                break;
            }
            case JOptionPane.NO_OPTION:
            {
                String input = JOptionPane.showInputDialog(" Tiket Reguler seharga " +tb2.getHarga()+ "\n Masukkan Jumlah Tiket yang akan dibeli: ");
                int jumlah = Integer.parseInt(input);
                int total_biaya = tb2.getHarga() * jumlah;
                JOptionPane.showMessageDialog(null, "THE BANGLES \n Jenis Tiket: " +tb1.getJenisTiket()+"\n Harga: "+tb2.getHarga()+"\n Jumlah tiket: "+jumlah+ "\n Total Harga: "+total_biaya, "Here's your struk", JOptionPane.INFORMATION_MESSAGE);                    
                break;
            }                
            default:
                break;
        }
    }
}