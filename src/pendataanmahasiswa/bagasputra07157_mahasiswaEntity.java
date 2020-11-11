package pendataanmahasiswa;
import java.util.Date;
public class bagasputra07157_mahasiswaEntity {
    String npm_mahasiswa,nama_mahasiswa,password,notelp_mahasiswa,alamat_mahasiswa;
    int jurusan_mahasiswa;
    Date tanggallahir;
    public bagasputra07157_mahasiswaEntity(String npm, String nama, String password, String notelp,String alamat, int jurusan, Date tanggallahir) {
        this.npm_mahasiswa = npm;
        this.nama_mahasiswa = nama;
        this.password = password;
        this.notelp_mahasiswa = notelp;
        this.alamat_mahasiswa = alamat;
        this.jurusan_mahasiswa = jurusan;
        this.tanggallahir = tanggallahir;
    }
 public String getNpm() {
        return npm_mahasiswa;
    }

    public String getNama() {
        return nama_mahasiswa;
    }

    public String getPassword() {
        return password;
    }

    public String getNotelp() {
        return notelp_mahasiswa;
    }
    public String getAlamat(){
        return alamat_mahasiswa;
    }
    public int getJurusan(){
        return jurusan_mahasiswa;
    }

    public Date getTanggallahir() {
        return tanggallahir;
    }
    
}
    

