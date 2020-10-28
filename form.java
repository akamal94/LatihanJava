public class form {
public static void main(String[] args){
    
    String Nama = "Ahmad Kamal";
    String Status = "Karyawan";
    String Alamat = "Depok";
    int Umur = 29;
    int Penghasilan = 2000000;
    int pengeluaran = 1000000;
    int TotalBulanan = Penghasilan - pengeluaran;
    
    String formBiodata = "Nama : "+Nama+", Status : "+Status+", Alamat :"+Alamat+", Umur : "+Umur+" (tahun), "+"Pendapatan : Rp."+TotalBulanan;
    System.out.println(formBiodata);
}
}