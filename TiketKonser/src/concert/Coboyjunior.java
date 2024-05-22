package concert;
import javax.swing.JOptionPane;
public class Coboyjunior extends Boyband implements LokalBand {

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
        JOptionPane.showMessageDialog(null,"Coboy Junior \nGenre musik POP");
    }

    @Override
    public void Jenistiket() {
        System.out.println("Coboyjunior");
    }

    @Override
    public void Harga() {

    }

    @Override
    public void lokal() {
        System.out.println("Anda mendapat diskon 50% musik lokal");
    }
    public static void TestCJR(){
        Coboyjunior cb = new Coboyjunior();
        Coboyjunior cb1 = new Coboyjunior();
        Coboyjunior cb2 = new Coboyjunior();
        cb1.Jenistiket();
        cb1.Genre();
        cb2.setHarga(5000000);
        cb1.setJenisTiket("Tiket VIP");
        System.out.println(cb1.getJenisTiket() + " = " + cb2.getHarga());
        cb.setHarga(2000000);
        cb.setJenisTiket("Tiket Regular");
        System.out.println(cb1.getJenisTiket() + " = " + cb.getHarga());
        Object[] jenisTiket = {"VIP", "Reguler"};
        int pilih = JOptionPane.showOptionDialog(null,"VIP = " + cb2.getHarga() + "\n " + "Reguler = " + cb.getHarga(), "Pilih Jenis Tiket Anda", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, jenisTiket, jenisTiket[0]);
        switch (pilih) {
            case JOptionPane.YES_OPTION:
                {
                    String jumlahTiket = JOptionPane.showInputDialog(" Tiket VIP seharga " +cb2.getHarga()+ "\n Masukkan Jumlah Tiket yang akan dibeli: ");
                    int jumlah = Integer.parseInt(jumlahTiket);
                    int total_biaya = cb2.getHarga() * jumlah;
                    JOptionPane.showMessageDialog(null, "Biaya tiket Terkini \n" + total_biaya + "\n Anda mendapatkan diskon 50% karena memilih musik lokal");
                    cb1.lokal();
                    int total_biaya2 = (int) (cb2.getHarga() * jumlah* 0.5);
                    JOptionPane.showMessageDialog(null, "COBOY JUNIOR \n Jenis Tiket: " +cb1.getJenisTiket()+"\n Harga: "+cb2.getHarga()+"\n Jumlah tiket: "+jumlah+ "\n Total Harga: "+total_biaya2, "Here's your struk", JOptionPane.INFORMATION_MESSAGE);                    
                    break;
                }
            case JOptionPane.NO_OPTION:
                {
                    String jumlahtiket = JOptionPane.showInputDialog(" Tiket Reguler seharga " +cb.getHarga()+ "\n Masukkan Jumlah Tiket yang akan dibeli: ");
                    int jumlah = Integer.parseInt(jumlahtiket);
                    int total_biaya = cb.getHarga() * jumlah;
                    JOptionPane.showMessageDialog(null, "Harga tiket Terkini \n" + total_biaya +"\n Anda mendapatkan diskon 50% karena memilih musik lokal");
                    cb1.lokal();
                    int total_biaya2 = (int) (cb.getHarga() * jumlah* 0.5);
                    JOptionPane.showMessageDialog(null, "COBOY JUNIOR \n Jenis Tiket: " +cb.getJenisTiket()+"\n Harga: "+cb.getHarga()+"\n Jumlah tiket: "+jumlah+ "\n Total Harga: "+total_biaya2, "Here's your struk", JOptionPane.INFORMATION_MESSAGE);                    
                    break;
                }
            default:
                break;
        }
    }
}  