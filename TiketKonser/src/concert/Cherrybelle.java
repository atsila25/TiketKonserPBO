package concert;
import javax.swing.JOptionPane;

public class Cherrybelle extends Girlband implements LokalBand {

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
        JOptionPane.showMessageDialog(null,"Cherrybelle \nGenre musik POP");
    }

    @Override
    public void Jenistiket() {
        System.out.println("Cherrybelle");
    }

    @Override
    public void Harga() {
    }

    @Override
    public void lokal() {
        System.out.println("Anda mendapat diskon 50% musik lokal");
    }

    public static void TestCb() {
        Cherrybelle ch = new Cherrybelle();
        Cherrybelle ch1 = new Cherrybelle();
        Cherrybelle ch2 = new Cherrybelle();

        ch1.Jenistiket();
        ch1.Genre();
        ch2.setHarga(4000000);
        ch1.setJenisTiket("Tiket VIP");
        System.out.println(ch1.getJenisTiket() + " = " + ch2.getHarga());
        ch.setHarga(1000000);
        ch.setJenisTiket("Tiket Regular");
        System.out.println(ch1.getJenisTiket() + " = " + ch.getHarga());
        Object[] jenisTiket = {"VIP", "Reguler"};
        int pilih = JOptionPane.showOptionDialog(null,"VIP = " + ch2.getHarga() + "\n " + "Reguler = " + ch.getHarga(), "Pilih Jenis Tiket Anda", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, jenisTiket, jenisTiket[0]);
        switch (pilih) {
            case JOptionPane.YES_OPTION:
                {
                    String jumlahTiket = JOptionPane.showInputDialog(" Tiket VIP seharga " +ch2.getHarga()+ "\n Masukkan Jumlah Tiket yang akan dibeli: ");
                    int jumlah = Integer.parseInt(jumlahTiket);
                    int total_biaya = ch2.getHarga() * jumlah;
                    JOptionPane.showMessageDialog(null, "Biaya tiket Terkini \n" + total_biaya + "\n Anda mendapatkan diskon 50% karena memilih musik lokal");
                    ch1.lokal();
                    int total_biaya2 = (int) (ch2.getHarga() * jumlah* 0.5);
                    JOptionPane.showMessageDialog(null, "CHERRYBELLE \n Jenis Tiket: " +ch1.getJenisTiket()+"\n Harga: "+ch2.getHarga()+"\n Jumlah tiket: "+jumlah+ "\n Total Harga: "+total_biaya2, "Here's your struk", JOptionPane.INFORMATION_MESSAGE);                    
                    break;
                }
            case JOptionPane.NO_OPTION:
                {
                    String jumlahtiket = JOptionPane.showInputDialog(" Tiket Reguler seharga " +ch.getHarga()+ "\n Masukkan Jumlah Tiket yang akan dibeli: ");
                    int jumlah = Integer.parseInt(jumlahtiket);
                    int total_biaya = ch.getHarga() * jumlah;
                    JOptionPane.showMessageDialog(null, "Harga tiket Terkini \n" + total_biaya +"\n Anda mendapatkan diskon 50% karena memilih musik lokal");
                    ch1.lokal();
                    int total_biaya2 = (int) (ch.getHarga() * jumlah* 0.5);
                    JOptionPane.showMessageDialog(null, "CHERRYBELLE \n Jenis Tiket: " +ch.getJenisTiket()+"\n Harga: "+ch.getHarga()+"\n Jumlah tiket: "+jumlah+ "\n Total Harga: "+total_biaya2, "Here's your struk", JOptionPane.INFORMATION_MESSAGE);                    
                    break;
                }
            default:
                break;
        }
    }
}