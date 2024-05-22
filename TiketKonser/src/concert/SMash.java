package concert;
import javax.swing.JOptionPane;

public class SMash extends Boyband implements LokalBand {

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
        JOptionPane.showMessageDialog(null,"SMASH \nGenre musik POP");
    }

    @Override
    public void Jenistiket() {
        System.out.println("Smash");
    }

    @Override
    public void Harga() {

    }

    @Override
    public void lokal() {
        JOptionPane.showMessageDialog(null,"SELAMAT! \n Anda mendapatkan diskon 50%");
    }

    public static void TestSmash(){
        SMash sm = new SMash();
        SMash sm1 = new SMash();
        SMash sm2 = new SMash();
        
        sm1.Jenistiket();
        sm1.Genre();
        sm2.setHarga(3000000);
        sm1.setJenisTiket("VIP");
        System.out.println(sm1.getJenisTiket() + " = " + sm2.getHarga());
        sm.setHarga(1000000);
        sm.setJenisTiket("Regular");
        System.out.println(sm1.getJenisTiket() + " = " + sm.getHarga());
        Object[] jenisTiket = {"VIP", "Reguler"};
        int pilih = JOptionPane.showOptionDialog(null,"VIP = " + sm2.getHarga() + "\n " + "Reguler = " + sm.getHarga(), "Pilih Jenis Tiket Anda", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, jenisTiket, jenisTiket[0]);
        switch (pilih) {
            case JOptionPane.YES_OPTION:
                {
                    String jumlahTiket = JOptionPane.showInputDialog(" Tiket VIP seharga " +sm2.getHarga()+ "\n Masukkan Jumlah Tiket yang akan dibeli: ");
                    int jumlah = Integer.parseInt(jumlahTiket);
                    int total_biaya = sm2.getHarga() * jumlah;
                    JOptionPane.showMessageDialog(null, "Biaya tiket Terkini \n" + total_biaya);
                    sm1.lokal();
                    int total_biaya2 = (int) (sm2.getHarga() * jumlah* 0.5);
                    JOptionPane.showMessageDialog(null, "SMASH \n Jenis Tiket: " +sm1.getJenisTiket()+"\n Harga: "+sm2.getHarga()+"\n Jumlah tiket: "+jumlah+ "\n Total Harga: "+total_biaya2, "Here's your struk", JOptionPane.INFORMATION_MESSAGE);                                       
                    break;
                }
            case JOptionPane.NO_OPTION:
                {
                    String jumlahtiket = JOptionPane.showInputDialog(" Tiket Reguler seharga " +sm.getHarga()+ "\n Masukkan Jumlah Tiket yang akan dibeli: ");
                    int jumlah = Integer.parseInt(jumlahtiket);
                    int total_biaya = sm.getHarga() * jumlah;
                    JOptionPane.showMessageDialog(null, "Harga tiket Terkini \n" + total_biaya);
                    sm1.lokal();
                    int total_biaya2 = (int) (sm.getHarga() * jumlah* 0.5);
                    JOptionPane.showMessageDialog(null, "SMASH \n Jenis Tiket: " +sm.getJenisTiket()+"\n Harga: "+sm.getHarga()+"\n Jumlah tiket: "+jumlah+ "\n Total Harga: "+total_biaya2, "Here's your struk", JOptionPane.INFORMATION_MESSAGE);                    
                    break;
                }
            default:
                break;
        }
    }
}        