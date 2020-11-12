package pendataanmahasiswa;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
public class PendataanMahasiswa {
     ArrayList <bagasputra07157_mahasiswaEntity> dataMahasiswa = new ArrayList();
     Scanner bagas07157_input = new Scanner (System.in);
    
   
    public static void main(String[] args) {
        int pil, jurusan;
      //  String npm, nama, notelp, password, alamat;
        //Date tglLahir;
        PendataanMahasiswa Dataku = new PendataanMahasiswa();
        System.out.println("Selamat Datang Diaplikasi Pendataan Mahasiswa");
        do{
            System.out.println("1. Pendaftaran Mahasiswa");
            System.out.println("2. Lihat data Mahasiswa");
            System.out.println("3. Edit data Mahasiswa");
            System.out.println("4. Hapus data Mahasiswa");
            System.out.println("5. Exit");
            System.out.print("Masukkan angka yang dipilih = ");
            pil = Dataku.bagas07157_input.nextInt();
            switch(pil) {
                case 1 : 
                    Dataku.Pendaftaran();
                    break;
                case 2 : 
                    Dataku.LihatDataMahasiswa();
                    break;
                case 3 : 
                    Dataku.EditDataMahasiswa();
                     break;
                case 4 : 
                    Dataku.HapusDataMahasiswa();
                     break;
            }
        }while(pil != 5);
    }
    
     void Pendaftaran() {
        System.out.println("=============||============");
        System.out.print("Input NPM = ");
       String npm = bagas07157_input.next();
        System.out.print("Input Nama = ");
       String nama = bagas07157_input.next();
        System.out.print("Input Tanggal Lahir = ");
       Date tglLahir = new Date(bagas07157_input.next());
        System.out.print("Input No.Telp = ");
       String notelp = bagas07157_input.next();
        System.out.print("Input Alamat = ");
       String alamat = bagas07157_input.next();
        System.out.print("Input Password = ");
       String password = bagas07157_input.next();
        for (int i = 0; i < bagasputra07157_jurusanEntity.jurusan.length; i++) {
            System.out.println(i+". "+bagasputra07157_jurusanEntity.jurusan [i]);
            }
            System.out.print("Pilih Jurusan = ");
           int jurusan = bagas07157_input.nextInt();
            dataMahasiswa.add(new bagasputra07157_mahasiswaEntity(npm, nama, password,
                    notelp, alamat,jurusan,tglLahir));
            System.out.println("==============||==============");
            System.out.println("Data Berhasil Ditambahkan");
            
        }
     void LihatDataMahasiswa(){
         for(int i = 0; i < dataMahasiswa.size(); i++){
             System.out.println(i+". "+dataMahasiswa.get(i).getNpm()+","+
                     dataMahasiswa.get(i).getNama()+","+ bagasputra07157_jurusanEntity.jurusan[
                             dataMahasiswa.get(i).getJurusan()]);
             
         }
     }
      void EditDataMahasiswa(){
         for (int i = 0; i < dataMahasiswa.size(); i++) {
             System.out.println(i+". "+dataMahasiswa.get(i).getNpm()+" "+
                     dataMahasiswa.get(i).getNama()+""+ bagasputra07157_jurusanEntity.jurusan[
                             dataMahasiswa.get(i).getJurusan()]);
             
             
         }
         System.out.println("Pilih Angka Untuk Edit Data : ");
        int pil = bagas07157_input.nextInt();
         for (int i = 0; i < dataMahasiswa.size(); i++) {
             System.out.println("============||===============");
             System.out.println("1. NPM : "+dataMahasiswa.get(i).getNpm());
             System.out.println("2. NAMA : "+dataMahasiswa.get(i).getNama());
             System.out.println("3. Tanggal Lahir : "+new SimpleDateFormat("dd/mm/yyyy").format(dataMahasiswa.get(i).getTanggallahir()));
             System.out.println("4. No.Telp : "+dataMahasiswa.get(i).getNotelp());
             System.out.println("5. Alamat : "+dataMahasiswa.get(i).getAlamat());
             System.out.println("6. Password : "+dataMahasiswa.get(i).getPassword());
             System.out.println("7. Jurusan : "+bagasputra07157_jurusanEntity.jurusan[dataMahasiswa.get(i).getJurusan()]);
             System.out.print("Pilih Angka untuk Data yang ingin diubah : ");
             pil = bagas07157_input.nextInt();
             switch(pil){
                case 1 : 
                     System.out.println("NPM Sekarang : "+dataMahasiswa.get(i).getNpm());
                     System.out.print("Masukkan NPM Baru : ");
                     String npm = bagas07157_input.next();
                     dataMahasiswa.get(i).npm_mahasiswa = npm;
                     break;
                case 2 :
                     System.out.println("Nama Sekarang : "+dataMahasiswa.get(i).getNama());
                     System.out.print("Masukkan Nama Baru : ");
                     String nama = bagas07157_input.next();
                     dataMahasiswa.get(i).nama_mahasiswa = nama;
                     break;
                case 3 :
                     System.out.println("Tanggal Lahir Sekarang : "+dataMahasiswa.get(i).getTanggallahir());
                     System.out.print("Masukkan Tanggal Lahir Baru : ");
                     Date tglLahir = new Date (bagas07157_input.next());
                     dataMahasiswa.get(i).tanggallahir = tglLahir;
                     break;
                case 4 :
                     System.out.println("NO.Telp Sekarang : "+dataMahasiswa.get(i).getNotelp());
                     System.out.print("Masukkan NO.Telp Baru : ");
                     String notelp = bagas07157_input.next();
                     dataMahasiswa.get(i).notelp_mahasiswa = notelp;
                     break;
                case 5 :
                     System.out.println("Alamat Sekarang : "+dataMahasiswa.get(i).getAlamat());
                     System.out.print("Masukkan Alamat Baru : ");
                     String alamat = bagas07157_input.next();
                     dataMahasiswa.get(i).alamat_mahasiswa = alamat;
                     break;
                case 6 :
                     System.out.println("Password Sekarang : "+dataMahasiswa.get(i).getPassword());
                     System.out.print("Masukkan Password Baru : ");
                     String password = bagas07157_input.next();
                     dataMahasiswa.get(i).password = password;
                     break;
                case 7 :
                    for (int j = 0; j < bagasputra07157_jurusanEntity.jurusan.length; j++){
                        System.out.println(j+". "+bagasputra07157_jurusanEntity.jurusan[j]);
                        
                    }
                     System.out.println("Jurusan Sekarang : "+bagasputra07157_jurusanEntity.jurusan[dataMahasiswa.get(i).getJurusan()]);
                     System.out.print("Pilih Jurusan : ");
                     int jurusan = bagas07157_input.nextInt();
                     dataMahasiswa.get(i).jurusan_mahasiswa = jurusan;
                     break;
                    }
             System.out.println("Data Berhasil Diedit");
             
         }
     }
     
      void HapusDataMahasiswa(){
         for (int i = 0; i < dataMahasiswa.size(); i++) {
             System.out.println(i+". "+dataMahasiswa.get(i).getNpm()+""+dataMahasiswa.get(i).getNama()
             +""+bagasputra07157_jurusanEntity.jurusan[dataMahasiswa.get(i).getJurusan()]);
             
         }
         System.out.print("Pilih angka untuk hapus data : ");
         int pil = bagas07157_input.nextInt();
         dataMahasiswa.remove(dataMahasiswa.get(pil));
         System.out.println("data berhasil dihapus :");
     }
}


    
        
    
                     
                
            
            
        
   
    

