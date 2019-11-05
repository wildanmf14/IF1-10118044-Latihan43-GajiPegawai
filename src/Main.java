
public class Main {

	public static void main(String[] args) {
		GajiPegawai gaji = new GajiPegawai();
        gaji.setNama("Rizki Adam Kurniawan");
        gaji.setAlamat("Jalan Semar dalam 4 No 72/66");
        gaji.setUangTransport(250000);
        gaji.setUangTunjangan(300000);
        gaji.setGajiPokok(4500000);

        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("--------------------");
        gaji.tampilData(gaji.getNama(), gaji.getAlamat(), gaji.getUangTransport(), gaji.getUangTunjangan(), gaji.getGajiPokok(), (int) gaji.totalGaji(gaji.getUangTunjangan(), gaji.getUangTransport(), gaji.getGajiPokok()));
    

	}

}
