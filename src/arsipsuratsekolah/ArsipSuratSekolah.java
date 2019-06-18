/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arsipsuratsekolah;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ArsipSuratSekolah {

    /**
     * @param args the command line arguments
     */
    static int pilihan                  = 0;
    static int indexinputSMHumas        = 0;
    static int indexinputSMTataUsaha    = 0;
    static int indexinputSKHumas        = 0;
    static int indexinputSKTataUsaha    = 0;
    static int indexinputSMK = 0;
    static int indexinputSKK = 0;
    static String SMHumas[][]       = new String[15][4];
    static String SKHumas[][]       = new String[15][4];
    static String SMTataUsaha[][]   = new String[15][4];
    static String SKTataUsaha[][]   = new String[15][4];
    static String SMKurikulum[][]   = new String[15][4];
    static String SKKurikulum[][]   = new String[15][4];
    static int Pilih_edit_hapus = 0;
    public static void main(String[] args) {
        login();
    }
    
    static void login(){
        System.out.println("|=========================================|");
        System.out.println("|----------------- Login -----------------|");
        System.out.println("|=========================================|");
        String username = "admin";
        String password = "password";
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Username : ");
        String usr  = input.nextLine();
        System.out.print("Masukkan Password : ");
        String pass = input.nextLine();
        if(usr.compareTo(username)!=0){
            System.out.println("Maaf username anda salah");
            login();
        }
        else if(pass.compareTo(password)!=0){
            System.out.println("Maaf password anda salah");
            login();
        }
        else{
            System.out.println("Login Berhasil");
            System.out.println("Selamat datang "+username+" :)");
            halaman_awal();
        }
        
    }
    static void halaman_awal(){
        Scanner masukan = new Scanner(System.in);
        System.out.println("----------------------------------------------------");
        System.out.println("==========-- Selamat Datang di Arsulah  --==========");
        System.out.println("----------------------------------------------------");   
        try{
            do{
                System.out.println("Menu :"); 
                System.out.println("1. Surat Masuk");
                System.out.println("2. Surat Keluar");
//                System.out.println("3. Lihat Semua Surat");
                System.out.println("0. Keluar");
                System.out.print("Pilih Menu : ");
                pilihan = masukan.nextInt(); //menginput data list yang akan dipilih
                switch(pilihan){
                    case 1 : SuratMasuk();break;
                    case 2 : SuratKeluar();break;
//                    case 3 : LihatSemuaSurat();break;
                }
            }while(pilihan > 2 || pilihan < 0);
        }catch(Exception e){
            System.out.println("Maaf inputan anda salah !");
            halaman_awal();
        }   
        System.out.println("");
    }
    
    static void SuratMasuk(){
        Scanner masukan = new Scanner(System.in);
        String menu;
        try{
            do{
                //System.out.println("==========-- Menu Surat Masuk  --==========");
                System.out.println("::::-.-:::: Menu Surat Masuk ::::-.-::::");
                System.out.println("Direksi :"); 
                System.out.println("1. Humas");
                System.out.println("2. Tatausaha");
                System.out.println("3. Kurikulum");
                System.out.println("0. Kembali");
                System.out.print("Pilih Direksi : ");
                pilihan = masukan.nextInt(); //menginput data list yang akan dipilih
                switch(pilihan){
                    case 1 : 
                        menu = "SMHumas";
                        SuratMasukHumas(menu);
                        break;
                    case 2 : 
                        menu = "SMTataUsaha";
                        SuratMasukTataUsaha(menu);
                        break;
                    case 3 : 
                        menu = "SMKurikulum";
                        SuratMasukKurikulum(menu);
                        break;
                    case 0 : halaman_awal();
                }
            }while(pilihan > 3 || pilihan < 0);
        }catch(Exception e){
            System.out.println("Maaf inputan anda salah !");
            SuratMasuk();
        }
        System.out.println("");
    }
    
    static void SuratMasukHumas(String menu){
        Scanner masukan = new Scanner(System.in);
        if(menu =="SMHumas"){
            menu = "Surat Masuk Humas";
        }
        try{
            do{
                System.out.println("==========-- Menu "+menu+"  --==========");
                System.out.println("Fitur :"); 
                System.out.println("1. Tambah");
                System.out.println("2. Lihat");
                System.out.println("0. Kembali");
                System.out.print("Pilihan : ");
                pilihan = masukan.nextInt(); //menginput data list yang akan dipilih
                switch(pilihan){
                    case 1 : 
                        System.out.println("==========-- Tambah "+menu+"  --==========");
                            TambahSuratMasukHumas(menu);
                        break;
                    case 2 : LihatSuratMasukHumas(menu);
                        break;
                    case 0 : SuratMasuk();break;
                }
            }while(pilihan > 2 || pilihan < 0);
        }catch(Exception e){
            System.out.println("Maaf inputan anda salah !");
            SuratMasukHumas(menu);
        }
        System.out.println("");
    }
    
    static void TambahSuratMasukHumas(String menu){
       // int Instruksi,jmlSurat;
        String data[] = new String[4];
        Scanner input = new Scanner(System.in);
        String NoSurat;
        String TanggalDiterima;
        String Pengirim;
        String IsiSurat;
        System.out.print("Masukkan, \n" );
        System.out.print("No. surat \t: ");
        NoSurat = input.nextLine();  //  NextLine untuk spasi - Next untuk NoSpace
        System.out.print("Tanggal Terima \t: " );
        TanggalDiterima = input.nextLine(); //input.nextLine();
        System.out.print("Pengirim \t: " );
        Pengirim = input.nextLine();
        System.out.print("Isi Surat \t: " );
        IsiSurat = input.nextLine();
        
        data[0]=NoSurat;
        data[1]=TanggalDiterima;
        data[2]=Pengirim;
        data[3]=IsiSurat;
        
        //CekNoSurat(data[0]);
        String TempCheck = CekNoSuratSMHumas(data[0]);
//        System.out.println("Temp "+TempCheck);
            if(TempCheck.equalsIgnoreCase("sama")){
                System.out.println("Maaf No Surat Tidak boleh kembar, Silahkan Isi no surat yang baru");
                TambahSuratMasukHumas(menu);
            }
            else{
                SMHumas[indexinputSMHumas]=data;
                indexinputSMHumas= indexinputSMHumas+1;
                System.out.println("--------------Data Berhasil Ditambahkan----------------");
                for (int i = 0; i < SMHumas.length; i++) {
                    for (int j = 0; j < SMHumas[i].length; j++) {
                        if(i==indexinputSMHumas-1){
                            if(j==0){
                                System.out.println("No. Surat \t: "+SMHumas[i][j]);
                            }
                            if(j==1){
                                System.out.println("Tanggal Terima  : "+SMHumas[i][j]);
                            }
                            if(j==2){
                                System.out.println("Pengirim \t: "+SMHumas[i][j]);
                            }
                            if(j==3){
                                System.out.println("Isi Surat \t: "+SMHumas[i][j]);
                            }
                        }else{
                            continue;
                        }     
                    }
                }
                SuratMasukHumas(menu);  
            }
    }
    
    static String CekNoSuratSMHumas(String data){
        String Checker = "";
        for (int i = 0; i < SMHumas.length; i++) {    
            if(data.equalsIgnoreCase(SMHumas[i][0])){
                System.out.println("Data Sama : "+SMHumas[i][0]);
                Checker = "sama";
                //System.out.println("Jika data "+Checker);
                break;
            }else{
                Checker = "tidak Sama";
                //System.out.println("Jika data "+Checker);
            }
        }
        return Checker;      
    }
    
    static void LihatSuratMasukHumas(String menu){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| No.\t|\t No Surat\t\t|\t Tanggal Terima \t|\t Pengirim\t\t|\t Isi Surat\t\t|\t");
        for (int i = 0; i < SMHumas.length; i++) {
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
            System.out.print("| "+(i+1)+"\t" );
            for (int j = 0; j < SMHumas[i].length; j++) {
                if(j==0 || j==1 || j==2){
                System.out.print("|\t "+SMHumas[i][j]+"\t\t");
                    if(SMHumas[i][j]==null){
                        System.out.print("Data Masih Kosong \t\t\t\t\t\t\t\t\t\t\t|");
                        break;
                    }
                }
                if(j==3){
                    System.out.print("|\t "+SMHumas[i][j]+"\t\t|");  
                }
            }
            System.out.println("");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------"+"\n");
        Scanner inputan = new Scanner(System.in);
        String fitur;
        try{
            do{
                System.out.println("Fitur :"); 
                System.out.println("1. Edit");
                System.out.println("2. Hapus");
                System.out.println("0. Kembali");
                System.out.print("Pilihan : ");
                pilihan = inputan.nextInt(); //menginput data list yang akan dipilih
                switch(pilihan){
                    case 1 : 
                        fitur ="Edit";
                        System.out.println("==========-- Daftar "+fitur+" "+menu+"  --==========");
                        DaftarDataSMHumas(menu,fitur);
                        break;
                    case 2 : 
                        fitur ="Hapus";
                        System.out.println("==========-- Daftar "+fitur+" "+menu+"  --==========");
                        DaftarDataSMHumas(menu,fitur);
                        break;
                    case 0 : SuratMasuk();break;
                }
            }while(pilihan > 2 || pilihan < 0);
        }catch(Exception e){
            System.out.println("Maaf inputan anda salah !");
            LihatSuratMasukHumas(menu);
        }
    }
    
    static void DaftarDataSMHumas(String menu, String fitur){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| No.\t|\t No Surat\t\t|\t Tanggal Terima \t|\t Pengirim\t\t|\t Isi Surat\t\t|\t");
        for (int i = 0; i < SMHumas.length; i++) {
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
            System.out.print("| "+(i+1)+"\t" );
            for (int j = 0; j < SMHumas[i].length; j++) {
                if(j==0 || j==1 || j==2){
                System.out.print("|\t "+SMHumas[i][j]+"\t\t");
                    if(SMHumas[i][j]==null){
                        System.out.print("Data Masih Kosong \t\t\t\t\t\t\t\t\t\t\t|");
                        break;
                    }
                }
                if(j==3){
                    System.out.print("|\t "+SMHumas[i][j]+"\t\t|");  
                }
            }
            System.out.println("");
        }
        Scanner inputan = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------"+"\n");
        System.out.print("Pilih data yang ingin "+fitur+", sesuai dengan nomor : ");
        Pilih_edit_hapus = inputan.nextInt(); //menginput data list yang akan dipilih
        int ID = ambil_ID_SM_Humas(Pilih_edit_hapus);
        String data[] = new String[5];          
        System.out.println("--------------Data Yang Ingin Di-"+fitur+"---------------");
        for (int i = 0; i < Pilih_edit_hapus; i++) {
            for (int j = 0; j < 4; j++) {
                if(i==ID){
                    if(j==0){
                        data[i]=SMHumas[i][j];    
                        System.out.println("No Surat \t: "+data[i]);
                    }
                    if(j==1){
                        data[i]=SMHumas[i][j];    
                        System.out.println("Tanggal Terima  : "+data[i]);
                    }
                    if(j==2){
                        data[i]=SMHumas[i][j];    
                        System.out.println("Pengirim \t: "+data[i]);
                    }
                    if(j==3){
                        data[i]=SMHumas[i][j];    
                        System.out.println("Isi \t\t: "+data[i]);
                    }
                }
                else{
                    continue;
                }
            }
        }
        if(fitur.equalsIgnoreCase("Edit")){
            EditDataSMHumas(menu);
        }
        else if(fitur.equalsIgnoreCase("Hapus")){
            HapusDataSMHumas(menu);
        }
        
    }
    
    static int ambil_ID_SM_Humas(int Pilih_ID){
        int ID = Pilih_ID - 1;
        return ID;
    }
    
    static void EditDataSMHumas(String menu){
        System.out.println("-----------------------------------------------------");
        System.out.println("--------------------- Edit Data ---------------------");
        System.out.println("-----------------------------------------------------");
        String NoSurat;
        String TanggalDiterima;
        String Pengirim;
        String IsiSurat;
        Scanner input = new Scanner(System.in);
        System.out.print("No. surat \t: ");
        NoSurat = input.nextLine();  //  NextLine untuk spasi - Next untuk NoSpace
        System.out.print("Tanggal Terima \t: " );
        TanggalDiterima = input.next();  input.nextLine();
        System.out.print("Pengirim \t: " );
        Pengirim = input.nextLine();
        System.out.print("Isi Surat \t: " );
        IsiSurat = input.nextLine();
        
        String data[] = new String[4];
        data[0]=NoSurat;
        data[1]=TanggalDiterima;
        data[2]=Pengirim;
        data[3]=IsiSurat;
        
        String TempCheck = CekNoSuratSMHumas(data[0]);
        if(TempCheck.equalsIgnoreCase("sama")){
                System.out.println("Maaf No Surat Tidak boleh kembar, Silahkan Isi no surat yang baru");
                EditDataSMHumas(menu);
        }
        else{
            int ID = ambil_ID_SM_Humas(Pilih_edit_hapus);
            SMHumas[ID]=data;
            System.out.println("--------------Data Berhasil diupdate----------------");
            for (int i = 0; i < ID+1; i++) {
                for (int j = 0; j < SMHumas[i].length; j++) {
                    if(i==ID){
                        if(j==0){
                            System.out.println("No. Surat \t: "+SMHumas[i][j]);
                        }
                        if(j==1){
                            System.out.println("Tanggal Terima  : "+SMHumas[i][j]);
                        }
                        if(j==2){
                            System.out.println("Pengirim \t: "+SMHumas[i][j]);
                        }
                        if(j==3){
                            System.out.println("Isi Surat \t: "+SMHumas[i][j]);
                        }
                    }else{
                        continue;
                    }
                }
            }
            LihatSuratMasukHumas(menu);  
        }
    }
    static void HapusDataSMHumas(String menu){
        
        int ID = ambil_ID_SM_Humas(Pilih_edit_hapus);
        System.out.println("-----------------Data Berhasil Dihapus-----------------");
        for (int i = ID+1; i < SMHumas.length; i++) {
            for (int j = 0; j < SMHumas[i].length; j++) {
                if(j==0){
//                    System.out.println("No. Surat \t: "+SMHumas[i][j]);
                    SMHumas[i-1][j] = SMHumas[i][j];
                }
                if(j==1){
//                    System.out.println("Tanggal Terima  : "+SMHumas[i][j]);
                    SMHumas[i-1][j] = SMHumas[i][j];
                }
                if(j==2){
//                    System.out.println("Pengirim \t: "+SMHumas[i][j]);
                    SMHumas[i-1][j] = SMHumas[i][j];
                }
                if(j==3){
//                    System.out.println("Isi Surat \t: "+SMHumas[i][j]);
                    SMHumas[i-1][j] = SMHumas[i][j];
                }
            }
        }
        LihatSuratMasukHumas(menu);  
//        Scanner input = new Scanner(System.in);
//        System.out.print("Apa anda yakin ingin menghapus data ini? [y|t] ");
//        String jawab = input.next();
        
    }
    
    static void SuratMasukTataUsaha(String menu){
        Scanner masukan = new Scanner(System.in);
        if(menu =="SMTataUsaha"){
            menu = "Surat Masuk TataUsaha";
        }
        System.out.println("==========-- Menu "+menu+"  --==========");
        System.out.println("Fitur :"); 
        System.out.println("1. Tambah");
        System.out.println("2. Lihat");
        System.out.println("0. Kembali");
        System.out.print("Pilihan : ");
        pilihan = masukan.nextInt(); //menginput data list yang akan dipilih
        switch(pilihan){
            case 1 : 
                System.out.println("==========-- Tambah "+menu+"  --==========");
                    SMTT(menu);
                break;
            case 2 : LihatSuratMasukTataUsaha(menu);
                break;
            case 0 : SuratMasuk();break;
        }System.out.println("");
    }
    
    static void SMTT(String menu){
        String data[] = new String[4];
        Scanner input = new Scanner(System.in);
        String NoSurat;
        String TanggalDiterima;
        String Pengirim;
        String IsiSurat;
        System.out.print("Masukkan, \n" );
        System.out.print("No. surat \t: ");
        NoSurat = input.nextLine();  //  NextLine untuk spasi - Next untuk NoSpace
        System.out.print("Tanggal Terima \t: " );
        TanggalDiterima = input.next(); input.nextLine();
        System.out.print("Pengirim \t: " );
        Pengirim = input.nextLine();
        System.out.print("Isi Surat \t: " );
        IsiSurat = input.next();
        
        data[0]=NoSurat;
        data[1]=TanggalDiterima;
        data[2]=Pengirim;
        data[3]=IsiSurat;
        
        String TempCheck = CekNoSuratSMTataUsaha(data[0]);
        if(TempCheck.equalsIgnoreCase("sama")){
            System.out.println("Maaf No Surat Tidak boleh kembar, Silahkan Isi no surat yang baru");
            SMTT(menu);
        }
        else{
            SMTataUsaha[indexinputSMTataUsaha]=data;
            indexinputSMTataUsaha= indexinputSMTataUsaha+1;
            System.out.println("____________________________________________________");
            System.out.println("-----::----:-Data Berhasil Ditambahkan-:-----::----");
            System.out.println("____________________________________________________");
            for (int i = 0; i < SMTataUsaha.length; i++) {
                for (int j = 0; j < SMTataUsaha[i].length; j++) {
                    if(i==indexinputSMTataUsaha-1){
                        if(j==0){
                            System.out.println("No. Surat \t: "+SMTataUsaha[i][j]);
                        }
                        if(j==1){
                            System.out.println("Tanggal Terima  : "+SMTataUsaha[i][j]);
                        }
                        if(j==2){
                            System.out.println("Pengirim \t: "+SMTataUsaha[i][j]);
                        }
                        if(j==3){
                            System.out.println("Isi Surat \t: "+SMTataUsaha[i][j]);
                        }
//                    if(SMTataUsaha[i][j]==null){
//                        break;
                    }else{
                        continue;
                    }
                }//System.out.println("");
            }
            SuratMasukTataUsaha(menu);  
        }
    }
    
    static String CekNoSuratSMTataUsaha(String data){
        String Checker = "";
        for (int i = 0; i < SMTataUsaha.length; i++) {    
            if(data.equalsIgnoreCase(SMTataUsaha[i][0])){
                System.out.println("Data Sama : "+SMTataUsaha[i][0]);
                Checker = "sama";
                System.out.println("Jika data "+Checker);
                break;
            }
        }
        return Checker;      
    }
    
    static void LihatSuratMasukTataUsaha(String menu){
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"+"\n");
        System.out.println("| No.\t|\t No Surat\t|\t Tanggal Terima\t|\t Pengirim\t|\t Isi Surat\t|\t");
        for (int i = 0; i < SMTataUsaha.length; i++) {
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"+"\n");
            System.out.print("| "+(i+1)+"\t" );
            for (int j = 0; j < SMTataUsaha[i].length; j++) {
                if(j==0 || j==1 || j==2){
                System.out.print("|\t "+SMTataUsaha[i][j]+"\t\t");
                    if(SMTataUsaha[i][j]==null){
                        System.out.print("Data Masih Kosong \t\t\t\t\t\t\t|");
                        break;
                    }
                }
                if(j==3){
                    System.out.print("|\t "+SMTataUsaha[i][j]+"\t\t|");  
                }
            }
            System.out.println("");
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"+"\n");
        Scanner inputan = new Scanner(System.in);
        System.out.println("Fitur :"); 
        System.out.println("1. Edit");
        System.out.println("2. Hapus");
        System.out.println("0. Kembali");
        System.out.print("Pilihan : ");
        pilihan = inputan.nextInt(); //menginput data list yang akan dipilih
        switch(pilihan){
            case 1 : 
                System.out.println("__________________ Daftar "+menu+" __________________");
                    DftrSuratMasukTataUsaha(menu);
                break;
            case 2 : //HpsSuratTataUsaha1(menu);
                break;
            case 0 : SuratMasuk();break;
        }
    }
    static void DftrSuratMasukTataUsaha(String menu){
        System.out.println("=======================================.:.=======================================");
        System.out.println("| No.\t|\t No Surat\t|\t Tanggal Terima\t|\t Pengirim\t|\t Isi Surat\t|\t");
        for (int i = 0; i < SMTataUsaha.length; i++) {
            System.out.println("=======================================.:.=======================================");
            System.out.print("| "+(i+1)+"\t" );
            for (int j = 0; j < SMTataUsaha[i].length; j++) {
                if(j==0 || j==1 || j==2){
                System.out.print("|\t "+SMTataUsaha[i][j]+"\t\t");
                    if(SMTataUsaha[i][j]==null){
                        System.out.print("Data Masih Kosong \t\t\t\t\t\t\t|");
                        break;
                    }
                }
                if(j==3){
                    System.out.print("|\t "+SMTataUsaha[i][j]+"\t\t|");  
                }
            }
            System.out.println("");
        }
        Scanner inputan = new Scanner(System.in);
        System.out.println("=======================================.:.=======================================");
        System.out.print("Pilih data yang ingin edit, sesuai dengan nomor : ");
        Pilih_edit_hapus = inputan.nextInt(); //menginput data list yang akan dipilih
        AmbilIDSMT(Pilih_edit_hapus);
        EditDataTataUsahaMasuk(menu);
    }
    
    static int AmbilIDSMT(int PilihID){
        int IDn = PilihID - 1;
        String data[] = new String[5];          
        for (int i = 0; i < PilihID; i++) {
            for (int j = 0; j < 4; j++) {
                if(i==IDn){
                    if(j==0){
                        data[i]=SMTataUsaha[i][j];    
                        System.out.println("No Surat \t: "+data[i]);
                    }
                    if(j==1){
                        data[i]=SMTataUsaha[i][j];    
                        System.out.println("Tanggal Terima  : "+data[i]);
                    }
                    if(j==2){
                        data[i]=SMTataUsaha[i][j];    
                        System.out.println("Pengirim \t: "+data[i]);
                    }
                    if(j==3){
                        data[i]=SMTataUsaha[i][j];    
                        System.out.println("Penerima \t: "+data[i]);
                    }
                }
                else{
                    continue;
                }
            }
        }
        return IDn;
    }
    
    static void EditDataTataUsahaMasuk(String menu){
        System.out.println("-----------------------------------------------------------");
        System.out.println("------------------------ Edit Data ------------------------");
        String NoSurat;
        String TanggalDiterima;
        String Pengirim;
        String IsiSurat;
        Scanner input = new Scanner(System.in);
        System.out.print("No. surat \t: ");
        NoSurat = input.nextLine();  //  NextLine untuk spasi - Next untuk NoSpace
        System.out.print("Tanggal Terima \t: " );
        TanggalDiterima = input.next(); input.nextLine();
        System.out.print("Pengirim \t: " );
        Pengirim = input.nextLine();
        System.out.print("Isi Surat \t: " );
        IsiSurat = input.next();
        
        String data[] = new String[4];
        data[0]=NoSurat;
        data[1]=TanggalDiterima;
        data[2]=Pengirim;
        data[3]=IsiSurat;
        
        String TempCheck = CekNoSuratSMTataUsaha(data[0]);
        System.out.println("Temp "+TempCheck);
        if(TempCheck.equalsIgnoreCase("sama")){
                System.out.println("Maaf No Surat Tidak boleh kembar, Silahkan Isi no surat yang baru");
                EditDataTataUsahaMasuk(menu);
        }
        else{
            int ID = AmbilIDSMT(Pilih_edit_hapus);
            SMTataUsaha[ID]=data;
            System.out.println("--------------Data Berhasil diupdate----------------");
            for (int i = 0; i < ID+1; i++) {
                for (int j = 0; j < SMTataUsaha[i].length; j++) {
                    if(i==ID){
                        if(j==0){
                            System.out.println("No. Surat \t: "+SMTataUsaha[i][j]);
                        }
                        if(j==1){
                            System.out.println("Tanggal Terima  : "+SMTataUsaha[i][j]);
                        }
                        if(j==2){
                            System.out.println("Pengirim \t: "+SMTataUsaha[i][j]);
                        }
                        if(j==3){
                            System.out.println("Isi Surat \t: "+SMTataUsaha[i][j]);
                        }
                    }else{
                       continue; 
                    }
                }
            }
            LihatSuratMasukTataUsaha(menu);  
        }
    }
    
    static void SuratMasukKurikulum(String menu3){
        Scanner masukan = new Scanner(System.in);
        if(menu3 =="SMKurikulum"){
            menu3 = "Surat Masuk Kurikulum";
        }
        System.out.println("==========-- Menu "+menu3+"  --==========");
        System.out.println("Fitur :"); 
        System.out.println("1. Tambah");
        System.out.println("2. Lihat");
        System.out.println("0. Kembali");
        System.out.print("Pilihan : ");
        pilihan = masukan.nextInt(); //menginput data list yang akan dipilih
        switch(pilihan){
            case 1 : 
                System.out.println("==========-- Tambah "+menu3+"  --==========");
                    SMKT(menu3);
                break;
            case 2 : LihatSuratMasukKurikulum(menu3);
                break;
            case 0 : SuratMasuk();break;
        }System.out.println("");
    }
    
    static void SMKT(String menu3){
//        int Instruksi,jmlSurat;
        String data[] = new String[4];
        Scanner input = new Scanner(System.in);
        String NoSurat;
        String TanggalDiterima;
        String Pengirim;
        String IsiSurat;
        System.out.print("Masukkan, \n" );
        System.out.print("No. surat \t: ");
        NoSurat = input.nextLine();  //  NextLine untuk spasi - Next untuk NoSpace
        System.out.print("Tanggal Terima \t: " );
        TanggalDiterima = input.next(); input.nextLine();
        System.out.print("Pengirim \t: " );
        Pengirim = input.nextLine();
        System.out.print("Isi Surat \t: " );
        IsiSurat = input.next();
        
        data[0]=NoSurat;
        data[1]=TanggalDiterima;
        data[2]=Pengirim;
        data[3]=IsiSurat;
        
        String TempCheck = CekNoSuratSMKK(data[0]);
//        System.out.println("Temp "+TempCheck);
            if(TempCheck.equalsIgnoreCase("sama")){
                System.out.println("Maaf No Surat Tidak boleh kembar, Silahkan Isi no surat yang baru");
                SMKT(menu3);
            }
            else{
                SMKurikulum[indexinputSMK]=data;
                indexinputSMK= indexinputSMK+1;
                System.out.println("____________________________________________________");
                System.out.println("-----::----:-Data Berhasil Ditambahkan-:-----::----");
                System.out.println("____________________________________________________");
                for (int i = 0; i < SMKurikulum.length; i++) {
                    for (int j = 0; j < SMKurikulum[i].length; j++) {
                        if(i==indexinputSMK-1){
                        if(j==0){
                            System.out.println("No. Surat \t: "+SMKurikulum[i][j]);
                        }
                        if(j==1){
                            System.out.println("Tanggal Terima  : "+SMKurikulum[i][j]);
                        }
                        if(j==2){
                            System.out.println("Pengirim \t: "+SMKurikulum[i][j]);
                        }
                        if(j==3){
                            System.out.println("Isi Surat \t: "+SMKurikulum[i][j]);
                        }
        //                if(SMHumas[i][j].equals("null") ){
        //                    break;
        //                }
//                        if(SMKurikulum[i][j]==null){
//                            break;
//                        }
                        }else{
                            continue;
                        }
                    }System.out.println("");
                }
                SuratMasukKurikulum(menu3);  
            }
    }
    
    static String CekNoSuratSMKK(String data){
        String Checker = "";
        for (int i = 0; i < SMKurikulum.length; i++) {    
            if(data.equalsIgnoreCase(SMKurikulum[i][0])){
                System.out.println("Data Sama : "+SMKurikulum[i][0]);
                Checker = "sama";
                System.out.println("Jika data "+Checker);
                break;
            }
        }
        return Checker;      
    }
    
    static void LihatSuratMasukKurikulum(String menu3){
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"+"\n");
        System.out.println("| No.\t|\t No Surat\t|\t Tanggal Terima\t|\t Pengirim\t|\t Isi Surat\t|\t");
        for (int i = 0; i < SMKurikulum.length; i++) {
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"+"\n");
            System.out.print("| "+(i+1)+"\t" );
            for (int j = 0; j < SMKurikulum[i].length; j++) {
                if(j==0 || j==1 || j==2){
                System.out.print("|\t "+SMKurikulum[i][j]+"\t\t");
                    if(SMKurikulum[i][j]==null){
                        System.out.print("Data Masih Kosong \t\t\t\t\t\t\t|");
                        break;
                    }
                }
                if(j==3){
                    System.out.print("|\t "+SMKurikulum[i][j]+"\t\t|");  
                }
            }
            System.out.println("");
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"+"\n");
        Scanner inputan = new Scanner(System.in);
        System.out.println("Fitur :"); 
        System.out.println("1. Edit");
        System.out.println("2. Hapus");
        System.out.println("0. Kembali");
        System.out.print("Pilihan : ");
        pilihan = inputan.nextInt(); //menginput data list yang akan dipilih
        switch(pilihan){
            case 1 : 
                System.out.println("__________________ Daftar "+menu3+" __________________");
                    DftrSuratMasukKurikulum(menu3);
                break;
            case 2 : //HpsSuratKurikulum1(menu3);
                break;
            case 0 : SuratMasuk();break;
        }
    }
    
    static void DftrSuratMasukKurikulum(String menu3){
        System.out.println("=======================================.:.=======================================");
        System.out.println("| No.\t|\t No Surat\t|\t Tanggal Terima\t|\t Pengirim\t|\t Isi Surat\t|\t");
        for (int i = 0; i < SMKurikulum.length; i++) {
            System.out.println("=======================================.:.=======================================");
            System.out.print("| "+(i+1)+"\t" );
            for (int j = 0; j < SMKurikulum[i].length; j++) {
                if(j==0 || j==1 || j==2){
                System.out.print("|\t "+SMKurikulum[i][j]+"\t\t");
                    if(SMKurikulum[i][j]==null){
                        System.out.print("Data Masih Kosong \t\t\t\t\t\t\t|");
                        break;
                    }
                }
                if(j==3){
                    System.out.print("|\t "+SMKurikulum[i][j]+"\t\t|");  
                }
            }
            System.out.println("");
        }
        Scanner inputan = new Scanner(System.in);
        System.out.println("=======================================.:.=======================================");
        System.out.print("Pilih data yang ingin edit, sesuai dengan nomor : ");
        Pilih_edit_hapus = inputan.nextInt(); //menginput data list yang akan dipilih
        AmbilIDSMK(Pilih_edit_hapus);
        EditDataKurikulumMasuk(menu3);
    }
    
    static int AmbilIDSMK(int PilihID){
        int IDn = PilihID - 1;
        String data[] = new String[5];          
        for (int i = 0; i < PilihID; i++) {
            for (int j = 0; j < 4; j++) {
                if(i==IDn){
                    if(j==0){
                        data[i]=SMKurikulum[i][j];    
                        System.out.println("No Surat \t: "+data[i]);
                    }
                    if(j==1){
                        data[i]=SMKurikulum[i][j];    
                        System.out.println("Tanggal Terima  : "+data[i]);
                    }
                    if(j==2){
                        data[i]=SMKurikulum[i][j];    
                        System.out.println("Pengirim \t: "+data[i]);
                    }
                    if(j==3){
                        data[i]=SMKurikulum[i][j];    
                        System.out.println("Penerima \t: "+data[i]);
                    }
                }
                else{
                    continue;
                }
            }
        }
        return IDn;
    }
    
    static void EditDataKurikulumMasuk(String menu3){
        System.out.println("-----------------------------------------------------------");
        System.out.println("------------------------ Edit Data ------------------------");
        String NoSurat;
        String TanggalDiterima;
        String Pengirim;
        String IsiSurat;
        Scanner input = new Scanner(System.in);
        System.out.print("No. surat \t: ");
        NoSurat = input.nextLine();  //  NextLine untuk spasi - Next untuk NoSpace
        System.out.print("Tanggal Terima \t: " );
        TanggalDiterima = input.next(); input.nextLine();
        System.out.print("Pengirim \t: " );
        Pengirim = input.nextLine();
        System.out.print("Isi Surat \t: " );
        IsiSurat = input.next();
        
        String data[] = new String[4];
        data[0]=NoSurat;
        data[1]=TanggalDiterima;
        data[2]=Pengirim;
        data[3]=IsiSurat;
        
        String TempCheck = CekNoSuratSMKK(data[0]);
        System.out.println("Temp "+TempCheck);
        if(TempCheck.equalsIgnoreCase("sama")){
                System.out.println("Maaf No Surat Tidak boleh kembar, Silahkan Isi no surat yang baru");
                EditDataKurikulumMasuk(menu3);
        }
        else{
            int ID = AmbilIDSMK(Pilih_edit_hapus);
//            System.out.println("ID nya "+ID);
            SMKurikulum[ID]=data;
            System.out.println("--------------Data Berhasil diupdate----------------");
            for (int i = 0; i < ID+1; i++) {
                for (int j = 0; j < SMKurikulum[i].length; j++) {
                    if(i==ID){
                        if(j==0){
                            System.out.println("No. Surat \t: "+SMKurikulum[i][j]);
                        }
                        if(j==1){
                            System.out.println("Tanggal Terima  : "+SMKurikulum[i][j]);
                        }
                        if(j==2){
                            System.out.println("Pengirim \t: "+SMKurikulum[i][j]);
                        }
                        if(j==3){
                            System.out.println("Isi Surat \t: "+SMKurikulum[i][j]);
                        }
                    }else{
                       continue; 
                    }
                }
            }
            LihatSuratMasukKurikulum(menu3);  
        }
    }
    
    static void SuratKeluar(){
        Scanner masukan = new Scanner(System.in);
        String menu;
        try{
            do{
                System.out.println("::::-.-:::: Menu Surat Keluar ::::-.-::::");
                System.out.println("Direksi :"); 
                System.out.println("1. Humas");
                System.out.println("2. Tatausaha");
                System.out.println("3. Kurikulum");
                System.out.println("0. Kembali");
                System.out.print("Pilih Direksi : ");
                pilihan = masukan.nextInt(); //menginput data list yang akan dipilih
                switch(pilihan){
                    case 1 : 
                        menu = "SKHumas";
                        SuratKeluarHumas(menu);
                        break;
                    case 2 : 
                        menu ="SKTataUsaha";
                        SuratKeluarTataUsaha(menu);
                        break;
                    case 3 : 
                        menu ="SKKurikulum";
                        SuratKeluarKurikulum(menu);
                        break;
                    case 0 : halaman_awal();
                }
            }while(pilihan > 3 || pilihan < 0);
        }catch(Exception e){
            System.out.println("Maaf inputan anda salah !");
            SuratKeluar();
        }
        System.out.println("");
    }
    
    static void TambahSuratKeluarHumas(String menu){
       // int Instruksi,jmlSurat;
        String data[] = new String[4];
        Scanner input = new Scanner(System.in);
        String NoSurat;
        String TanggalDiterima;
        String Pengirim;
        String IsiSurat;
        System.out.print("Masukkan, \n" );
        System.out.print("No. surat \t: ");
        NoSurat = input.nextLine();  //  NextLine untuk spasi - Next untuk NoSpace
        System.out.print("Tanggal Terima \t: " );
        TanggalDiterima = input.nextLine(); //input.nextLine();
        System.out.print("Pengirim \t: " );
        Pengirim = input.nextLine();
        System.out.print("Isi Surat \t: " );
        IsiSurat = input.nextLine();
        
        data[0]=NoSurat;
        data[1]=TanggalDiterima;
        data[2]=Pengirim;
        data[3]=IsiSurat;
        
        //CekNoSurat(data[0]);
        String TempCheck = CekNoSuratSKHumas(data[0]);
//        System.out.println("Temp "+TempCheck);
            if(TempCheck.equalsIgnoreCase("sama")){
                System.out.println("Maaf No Surat Tidak boleh kembar, Silahkan Isi no surat yang baru");
                TambahSuratKeluarHumas(menu);
            }
            else{
                SKHumas[indexinputSKHumas]=data;
                indexinputSKHumas= indexinputSKHumas+1;
                System.out.println("--------------Data Berhasil Ditambahkan----------------");
                for (int i = 0; i < SKHumas.length; i++) {
                    for (int j = 0; j < SKHumas[i].length; j++) {
                        if(i==indexinputSKHumas-1){
                            if(j==0){
                                System.out.println("No. Surat \t: "+SKHumas[i][j]);
                            }
                            if(j==1){
                                System.out.println("Tanggal Terima  : "+SKHumas[i][j]);
                            }
                            if(j==2){
                                System.out.println("Pengirim \t: "+SKHumas[i][j]);
                            }
                            if(j==3){
                                System.out.println("Isi Surat \t: "+SKHumas[i][j]);
                            }
                        }else{
                            continue;
                        }     
                    }
                }
                SuratKeluarHumas(menu);  
            }
    }
    
    static String CekNoSuratSKHumas(String data){
        String Checker = "";
        for (int i = 0; i < SKHumas.length; i++) {    
            if(data.equalsIgnoreCase(SKHumas[i][0])){
                System.out.println("Data Sama : "+SKHumas[i][0]);
                Checker = "sama";
                //System.out.println("Jika data "+Checker);
                break;
            }else{
                Checker = "tidak Sama";
                //System.out.println("Jika data "+Checker);
            }
        }
        return Checker;      
    }
    
    static void SuratKeluarHumas(String menu){
        Scanner masukan = new Scanner(System.in);
        if(menu =="SKHumas"){
            menu = "Surat Keluar Humas";
        }
        try{
            do{
                System.out.println("==========-- Menu "+menu+"  --==========");
                System.out.println("Fitur :"); 
                System.out.println("1. Tambah");
                System.out.println("2. Lihat");
                System.out.println("0. Kembali");
                System.out.print("Pilihan : ");
                pilihan = masukan.nextInt(); //menginput data list yang akan dipilih
                switch(pilihan){
                    case 1 : 
                        System.out.println("==========-- Tambah "+menu+"  --==========");
                            TambahSuratKeluarHumas(menu);
                        break;
                    case 2 : LihatSuratKeluarHumas(menu);
                        break;
                    case 0 : SuratMasuk();break;
                }
            }while(pilihan > 2 || pilihan < 0);
        }catch(Exception e){
            System.out.println("Maaf inputan anda salah !");
            SuratKeluarHumas(menu);
        }
        System.out.println("");
    }
    
    static void LihatSuratKeluarHumas(String menu){
        
//        String NoSurat         = "002/800-SDN1";
//        String TanggalDiterima = "17/06/2019";
//        String Pengirim        = "Kemendikbud";
//        String IsiSurat        = "testing aaaa";
//        
//        String data[] = {NoSurat,TanggalDiterima,Pengirim,IsiSurat};
//        SKHumas[0]= data;
        //Jika  butuh
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| No.\t|\t No Surat\t\t|\t Tanggal Terima \t|\t Pengirim\t\t|\t Isi Surat\t\t|\t");
        for (int i = 0; i < SKHumas.length; i++) {
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
            System.out.print("| "+(i+1)+"\t" );
            for (int j = 0; j < SKHumas[i].length; j++) {
                if(j==0 || j==1 || j==2){
                System.out.print("|\t "+SKHumas[i][j]+"\t\t");
                    if(SKHumas[i][j]==null){
                        System.out.print("Data Masih Kosong \t\t\t\t\t\t\t\t\t\t\t|");
                        break;
                    }
                }
                if(j==3){
                    System.out.print("|\t "+SKHumas[i][j]+"\t\t|");  
                }
            }
            System.out.println("");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------"+"\n");
        Scanner inputan = new Scanner(System.in);
        String fitur;
        try{
            do{
                System.out.println("Fitur :"); 
                System.out.println("1. Edit");
                System.out.println("2. Hapus");
                System.out.println("0. Kembali");
                System.out.print("Pilihan : ");
                pilihan = inputan.nextInt(); //menginput data list yang akan dipilih
                switch(pilihan){
                    case 1 : 
                        fitur ="Edit";
                        System.out.println("==========-- Daftar "+fitur+" "+menu+"  --==========");
                        DaftarDataSKHumas(menu,fitur);
                        break;
                    case 2 : 
                        fitur ="Hapus";
                        System.out.println("==========-- Daftar "+fitur+" "+menu+"  --==========");
                        DaftarDataSKHumas(menu,fitur);
                        break;
                    case 0 : SuratKeluar();break;
                }
            }while(pilihan > 2 || pilihan < 0);
        }catch(Exception e){
            System.out.println("Maaf inputan anda salah !");
            LihatSuratKeluarHumas(menu);
        }
    }
    
    static void DaftarDataSKHumas(String menu, String fitur){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| No.\t|\t No Surat\t\t|\t Tanggal Terima \t|\t Pengirim\t\t|\t Isi Surat\t\t|\t");
        for (int i = 0; i < SKHumas.length; i++) {
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
            System.out.print("| "+(i+1)+"\t" );
            for (int j = 0; j < SKHumas[i].length; j++) {
                if(j==0 || j==1 || j==2){
                System.out.print("|\t "+SKHumas[i][j]+"\t\t");
                    if(SKHumas[i][j]==null){
                        System.out.print("Data Masih Kosong \t\t\t\t\t\t\t\t\t\t\t|");
                        break;
                    }
                }
                if(j==3){
                    System.out.print("|\t "+SKHumas[i][j]+"\t\t|");  
                }
            }
            System.out.println("");
        }
        Scanner inputan = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------"+"\n");
        System.out.print("Pilih data yang ingin "+fitur+", sesuai dengan nomor : ");
        Pilih_edit_hapus = inputan.nextInt(); //menginput data list yang akan dipilih
        int ID = ambil_ID_SK_Humas(Pilih_edit_hapus);
        String data[] = new String[5];          
        System.out.println("--------------Data Yang Ingin Di-"+fitur+"---------------");
        for (int i = 0; i < Pilih_edit_hapus; i++) {
            for (int j = 0; j < 4; j++) {
                if(i==ID){
                    if(j==0){
                        data[i]=SKHumas[i][j];    
                        System.out.println("No Surat \t: "+data[i]);
                    }
                    if(j==1){
                        data[i]=SKHumas[i][j];    
                        System.out.println("Tanggal Terima  : "+data[i]);
                    }
                    if(j==2){
                        data[i]=SKHumas[i][j];    
                        System.out.println("Pengirim \t: "+data[i]);
                    }
                    if(j==3){
                        data[i]=SKHumas[i][j];    
                        System.out.println("Isi \t\t: "+data[i]);
                    }
                }
                else{
                    continue;
                }
            }
        }
        if(fitur.equalsIgnoreCase("Edit")){
            EditDataSKHumas(menu);
        }
        else if(fitur.equalsIgnoreCase("Hapus")){
            HapusDataSKHumas(menu);
        }   
    }
    
    static int ambil_ID_SK_Humas(int Pilih_ID){
        int ID = Pilih_ID - 1;
        return ID;
    }
    
    static void EditDataSKHumas(String menu){
        System.out.println("-----------------------------------------------------");
        System.out.println("--------------------- Edit Data ---------------------");
        System.out.println("-----------------------------------------------------");
        String NoSurat;
        String TanggalDiterima;
        String Pengirim;
        String IsiSurat;
        Scanner input = new Scanner(System.in);
        System.out.print("No. surat \t: ");
        NoSurat = input.nextLine();  //  NextLine untuk spasi - Next untuk NoSpace
        System.out.print("Tanggal Terima \t: " );
        TanggalDiterima = input.next();  input.nextLine();
        System.out.print("Pengirim \t: " );
        Pengirim = input.nextLine();
        System.out.print("Isi Surat \t: " );
        IsiSurat = input.nextLine();
        
        String data[] = new String[4];
        data[0]=NoSurat;
        data[1]=TanggalDiterima;
        data[2]=Pengirim;
        data[3]=IsiSurat;
        
        String TempCheck = CekNoSuratSKHumas(data[0]);
        if(TempCheck.equalsIgnoreCase("sama")){
                System.out.println("Maaf No Surat Tidak boleh kembar, Silahkan Isi no surat yang baru");
                EditDataSKHumas(menu);
        }
        else{
            int ID = ambil_ID_SK_Humas(Pilih_edit_hapus);
            SKHumas[ID]=data;
            System.out.println("--------------Data Berhasil diupdate----------------");
            for (int i = 0; i < ID+1; i++) {
                for (int j = 0; j < SKHumas[i].length; j++) {
                    if(i==ID){
                        if(j==0){
                            System.out.println("No. Surat \t: "+SKHumas[i][j]);
                        }
                        if(j==1){
                            System.out.println("Tanggal Terima  : "+SKHumas[i][j]);
                        }
                        if(j==2){
                            System.out.println("Pengirim \t: "+SKHumas[i][j]);
                        }
                        if(j==3){
                            System.out.println("Isi Surat \t: "+SKHumas[i][j]);
                        }
                    }else{
                        continue;
                    }
                }
            }
            LihatSuratKeluarHumas(menu);  
        }
    }
    
    static void HapusDataSKHumas(String menu){
        
        int ID = ambil_ID_SK_Humas(Pilih_edit_hapus);
        System.out.println("-----------------Data Berhasil Dihapus-----------------");
        for (int i = ID+1; i < SKHumas.length; i++) {
            for (int j = 0; j < SKHumas[i].length; j++) {
                SKHumas[i-1][j] = SKHumas[i][j];
            }
        }
        LihatSuratKeluarHumas(menu);  
//        Scanner input = new Scanner(System.in);
//        System.out.print("Apa anda yakin ingin menghapus data ini? [y|t] ");
//        String jawab = input.next();
        
    }
    
    static void SuratKeluarTataUsaha(String menu){
        Scanner masukan = new Scanner(System.in);
        if(menu =="SKTataUsaha"){
            menu = "Surat Keluar TataUsaha";
        }
        System.out.println("==========-- Menu "+menu+"  --==========");
        System.out.println("Fitur :"); 
        System.out.println("1. Tambah");
        System.out.println("2. Lihat");
        System.out.println("0. Kembali");
        System.out.print("Pilihan : ");
        pilihan = masukan.nextInt(); //menginput data list yang akan dipilih
        switch(pilihan){
            case 1 : 
                System.out.println("==========-- Tambah "+menu+"  --==========");
                    SKTT(menu);
                break;
            case 2 : LihatSuratKeluarTataUsaha(menu);
                break;
            case 0 : SuratKeluar();break;
        }System.out.println("");
    }
    
    static void SKTT(String menu){
//        int Instruksi,jmlSurat;
        String data[] = new String[4];
        Scanner input = new Scanner(System.in);
        String NoSurat;
        String TanggalDiterima;
        String Pengirim;
        String IsiSurat;
        System.out.print("Masukkan, \n" );
        System.out.print("No. surat \t: ");
        NoSurat = input.nextLine();  //  NextLine untuk spasi - Next untuk NoSpace
        System.out.print("Tanggal Terima \t: " );
        TanggalDiterima = input.next(); input.nextLine();
        System.out.print("Pengirim \t: " );
        Pengirim = input.nextLine();
        System.out.print("Isi Surat \t: " );
        IsiSurat = input.next();
        
        data[0]=NoSurat;
        data[1]=TanggalDiterima;
        data[2]=Pengirim;
        data[3]=IsiSurat;
        
        String TempCheck = CekNoSuratSKTataUsaha(data[0]);
//        System.out.println("Temp "+TempCheck);
            if(TempCheck.equalsIgnoreCase("sama")){
                System.out.println("Maaf No Surat Tidak boleh kembar, Silahkan Isi no surat yang baru");
                SKTT(menu);
            }
            else{
                SKTataUsaha[indexinputSKTataUsaha]=data;
                indexinputSKTataUsaha = indexinputSKTataUsaha+1;
                System.out.println("____________________________________________________");
                System.out.println("-----::----:-Data Berhasil Ditambahkan-:-----::----");
                System.out.println("____________________________________________________");
                for (int i = 0; i < SKTataUsaha.length; i++) {
                    for (int j = 0; j < SKTataUsaha[i].length; j++) {
                        if(i==indexinputSKTataUsaha-1){
                        if(j==0){
                            System.out.println("No. Surat \t: "+SKTataUsaha[i][j]);
                        }
                        if(j==1){
                            System.out.println("Tanggal Terima  : "+SKTataUsaha[i][j]);
                        }
                        if(j==2){
                            System.out.println("Pengirim \t: "+SKTataUsaha[i][j]);
                        }
                        if(j==3){
                            System.out.println("Isi Surat \t: "+SKTataUsaha[i][j]);
                        }
        //                if(SMHumas[i][j].equals("null") ){
        //                    break;
        //                }
//                        if(SKTataUsaha[i][j]==null){
//                            break;
//                        }
                        }else{
                            continue;
                        }
                    }//System.out.println("");
                }
                SuratKeluarTataUsaha(menu);  
            }
    }
    
    static String CekNoSuratSKTataUsaha(String data){
        String Checker = "";
        for (int i = 0; i < SKTataUsaha.length; i++) {    
            if(data.equalsIgnoreCase(SKTataUsaha[i][0])){
                System.out.println("Data Sama : "+SKTataUsaha[i][0]);
                Checker = "sama";
                System.out.println("Jika data "+Checker);
                break;
            }
        }
        return Checker;
    }
    
    static void LihatSuratKeluarTataUsaha(String menu){
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"+"\n");
        System.out.println("| No.\t|\t No Surat\t|\t Tanggal Terima\t|\t Pengirim\t|\t Isi Surat\t|\t");
        for (int i = 0; i < SKTataUsaha.length; i++) {
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"+"\n");
            System.out.print("| "+(i+1)+"\t" );
            for (int j = 0; j < SKTataUsaha[i].length; j++) {
                if(j==0 || j==1 || j==2){
                System.out.print("|\t "+SKTataUsaha[i][j]+"\t\t");
                    if(SKTataUsaha[i][j]==null){
                        System.out.print("Data Masih Kosong \t\t\t\t\t\t\t|");
                        break;
                    }
                }
                if(j==3){
                    System.out.print("|\t "+SKTataUsaha[i][j]+"\t\t|");  
                }
            }
            System.out.println("");
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"+"\n");
        Scanner inputan = new Scanner(System.in);
        System.out.println("Fitur :"); 
        System.out.println("1. Edit");
        System.out.println("2. Hapus");
        System.out.println("0. Kembali");
        System.out.print("Pilihan : ");
        pilihan = inputan.nextInt(); //menginput data list yang akan dipilih
        switch(pilihan){
            case 1 : 
                System.out.println("__________________ Daftar "+menu+" __________________");
                    DftrSuratKeluarTataUsaha(menu);
                break;
            case 2 : //HpsSuratTataUsaha2(menu);
                break;
            case 0 : SuratKeluar();break;
        }
    }
    
    static void DftrSuratKeluarTataUsaha(String menu){
        System.out.println("=======================================.:.=======================================");
        System.out.println("| No.\t|\t No Surat\t|\t Tanggal Terima\t|\t Pengirim\t|\t Isi Surat\t|\t");
        for (int i = 0; i < SKTataUsaha.length; i++) {
            System.out.println("=======================================.:.=======================================");
            System.out.print("| "+(i+1)+"\t" );
            for (int j = 0; j < SKTataUsaha[i].length; j++) {
                if(j==0 || j==1 || j==2){
                System.out.print("|\t "+SKTataUsaha[i][j]+"\t\t");
                    if(SKTataUsaha[i][j]==null){
                        System.out.print("Data Masih Kosong \t\t\t\t\t\t\t|");
                        break;
                    }
                }
                if(j==3){
                    System.out.print("|\t "+SKTataUsaha[i][j]+"\t\t|");  
                }
            }
            System.out.println("");
        }
        Scanner inputan = new Scanner(System.in);
        System.out.println("=======================================.:.=======================================");
        System.out.print("Pilih data yang ingin edit, sesuai dengan nomor : ");
        Pilih_edit_hapus = inputan.nextInt(); //menginput data list yang akan dipilih
        AmbilIDSKT(Pilih_edit_hapus);
        EditDataTataUsahaKeluar(menu);
    }
    
    static int AmbilIDSKT(int PilihID){
        int IDn = PilihID - 1;
        String data[] = new String[5];          
        for (int i = 0; i < PilihID; i++) {
            for (int j = 0; j < 4; j++) {
                if(i==IDn){
                    if(j==0){
                        data[i]=SKTataUsaha[i][j];    
                        System.out.println("No Surat \t: "+data[i]);
                    }
                    if(j==1){
                        data[i]=SKTataUsaha[i][j];    
                        System.out.println("Tanggal Terima  : "+data[i]);
                    }
                    if(j==2){
                        data[i]=SKTataUsaha[i][j];    
                        System.out.println("Pengirim \t: "+data[i]);
                    }
                    if(j==3){
                        data[i]=SKTataUsaha[i][j];    
                        System.out.println("Penerima \t: "+data[i]);
                    }
                }
                else{
                    continue;
                }
            }
        }
        return IDn;
    }
    
    static void EditDataTataUsahaKeluar(String menu){
        System.out.println("___________________________________________________________");
        System.out.println("----------------------- :Edit Data: -----------------------");
        System.out.println("===========================================================");
        String NoSurat;
        String TanggalDiterima;
        String Pengirim;
        String IsiSurat;
        Scanner input = new Scanner(System.in);
        System.out.print("No. surat \t: ");
        NoSurat = input.nextLine();  //  NextLine untuk spasi - Next untuk NoSpace
        System.out.print("Tanggal Terima \t: " );
        TanggalDiterima = input.next(); input.nextLine();
        System.out.print("Pengirim \t: " );
        Pengirim = input.nextLine();
        System.out.print("Isi Surat \t: " );
        IsiSurat = input.next();
        
        String data[] = new String[4];
        data[0]=NoSurat;
        data[1]=TanggalDiterima;
        data[2]=Pengirim;
        data[3]=IsiSurat;
        
        String TempCheck = CekNoSuratSKTataUsaha(data[0]);
        System.out.println("Temp "+TempCheck);
        if(TempCheck.equalsIgnoreCase("sama")){
                System.out.println("Maaf No Surat Tidak boleh kembar, Silahkan Isi no surat yang baru");
                EditDataTataUsahaKeluar(menu);
        }
        else{
            int ID = AmbilIDSKT(Pilih_edit_hapus);
//            System.out.println("ID nya "+ID);
            SKTataUsaha[ID]=data;
            System.out.println("--------------::Data Berhasil diupdate::----------------");
            for (int i = 0; i < ID+1; i++) {
                for (int j = 0; j < SKTataUsaha[i].length; j++) {
                    if(i==ID){
                        if(j==0){
                            System.out.println("No. Surat \t: "+SKTataUsaha[i][j]);
                        }
                        if(j==1){
                            System.out.println("Tanggal Terima  : "+SKTataUsaha[i][j]);
                        }
                        if(j==2){
                            System.out.println("Pengirim \t: "+SKTataUsaha[i][j]);
                        }
                        if(j==3){
                            System.out.println("Isi Surat \t: "+SKTataUsaha[i][j]);
                        }
                    }else{
                       continue; 
                    }
                }
                //System.out.println("");
            }
            LihatSuratKeluarTataUsaha(menu);  
        }
    }
    
    static void SuratKeluarKurikulum(String menu3){
        Scanner masukan = new Scanner(System.in);
        if(menu3 =="SKKurikulum"){
            menu3 = "Surat Keluar Kurikulum";
        }
        System.out.println("==========-- Menu "+menu3+"  --==========");
        System.out.println("Fitur :"); 
        System.out.println("1. Tambah");
        System.out.println("2. Lihat");
        System.out.println("0. Kembali");
        System.out.print("Pilihan : ");
        pilihan = masukan.nextInt(); //menginput data list yang akan dipilih
        switch(pilihan){
            case 1 : 
                System.out.println("==========-- Tambah "+menu3+"  --==========");
                    SKKT(menu3);
                break;
            case 2 : LihatSuratKeluarKurikulum(menu3);
                break;
            case 0 : SuratKeluar();break;
        }System.out.println("");
    }
    
    static void SKKT(String menu3){
//        int Instruksi,jmlSurat;
        String data[] = new String[4];
        Scanner input = new Scanner(System.in);
        String NoSurat;
        String TanggalDiterima;
        String Pengirim;
        String IsiSurat;
        System.out.print("Masukkan, \n" );
        System.out.print("No. surat \t: ");
        NoSurat = input.nextLine();  //  NextLine untuk spasi - Next untuk NoSpace
        System.out.print("Tanggal Terima \t: " );
        TanggalDiterima = input.next(); input.nextLine();
        System.out.print("Pengirim \t: " );
        Pengirim = input.nextLine();
        System.out.print("Isi Surat \t: " );
        IsiSurat = input.next();
        
        data[0]=NoSurat;
        data[1]=TanggalDiterima;
        data[2]=Pengirim;
        data[3]=IsiSurat;
        
        String TempCheck = CekNoSuratSKK(data[0]);
//        System.out.println("Temp "+TempCheck);
            if(TempCheck.equalsIgnoreCase("sama")){
                System.out.println("Maaf No Surat Tidak boleh kembar, Silahkan Isi no surat yang baru");
                SKKT(menu3);
            }
            else{
                SKKurikulum[indexinputSKK]=data;
                indexinputSKK= indexinputSKK+1;
                System.out.println("____________________________________________________");
                System.out.println("-----::----:-Data Berhasil Ditambahkan-:-----::----");
                System.out.println("____________________________________________________");
                for (int i = 0; i < SKKurikulum.length; i++) {
                    for (int j = 0; j < SKKurikulum[i].length; j++) {
                        if(j==0){
                            System.out.println("No. Surat \t: "+SKKurikulum[i][j]);
                        }
                        if(j==1){
                            System.out.println("Tanggal Terima  : "+SKKurikulum[i][j]);
                        }
                        if(j==2){
                            System.out.println("Pengirim \t: "+SKKurikulum[i][j]);
                        }
                        if(j==3){
                            System.out.println("Isi Surat \t: "+SKKurikulum[i][j]);
                        }
        //                if(SMHumas[i][j].equals("null") ){
        //                    break;
        //                }
                        if(SKKurikulum[i][j]==null){
                            break;
                        }
                    }System.out.println("");
                }
                SuratKeluarKurikulum(menu3);  
            }
    }
    
    static String CekNoSuratSKK(String data){
        String Checker = "";
        for (int i = 0; i < SKKurikulum.length; i++) {    
            if(data.equalsIgnoreCase(SKKurikulum[i][0])){
                System.out.println("Data Sama : "+SKKurikulum[i][0]);
                Checker = "sama";
                System.out.println("Jika data "+Checker);
                break;
            }
        }
        return Checker;
    }
    
    static void LihatSuratKeluarKurikulum(String menu3){
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"+"\n");
        System.out.println("| No.\t|\t No Surat\t|\t Tanggal Terima\t|\t Pengirim\t|\t Isi Surat\t|\t");
        for (int i = 0; i < SKKurikulum.length; i++) {
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"+"\n");
            System.out.print("| "+(i+1)+"\t" );
            for (int j = 0; j < SKKurikulum[i].length; j++) {
                if(j==0 || j==1 || j==2){
                System.out.print("|\t "+SKKurikulum[i][j]+"\t\t");
                    if(SKKurikulum[i][j]==null){
                        System.out.print("Data Masih Kosong \t\t\t\t\t\t\t|");
                        break;
                    }
                }
                if(j==3){
                    System.out.print("|\t "+SKKurikulum[i][j]+"\t\t|");  
                }
            }
            System.out.println("");
        }
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"+"\n");
        Scanner inputan = new Scanner(System.in);
        System.out.println("Fitur :"); 
        System.out.println("1. Edit");
        System.out.println("2. Hapus");
        System.out.println("0. Kembali");
        System.out.print("Pilihan : ");
        pilihan = inputan.nextInt(); //menginput data list yang akan dipilih
        switch(pilihan){
            case 1 : 
                System.out.println("__________________ Daftar "+menu3+" __________________");
                    DftrSuratKeluarKurikulum(menu3);
                break;
            case 2 : //HpsSuratKurikulum2(menu3);
                break;
            case 0 : SuratKeluar();break;
        }
    }
    
    static void DftrSuratKeluarKurikulum(String menu3){
        System.out.println("=======================================.:.=======================================");
        System.out.println("| No.\t|\t No Surat\t|\t Tanggal Terima\t|\t Pengirim\t|\t Isi Surat\t|\t");
        for (int i = 0; i < SKKurikulum.length; i++) {
            System.out.println("=======================================.:.=======================================");
            System.out.print("| "+(i+1)+"\t" );
            for (int j = 0; j < SKKurikulum[i].length; j++) {
                if(j==0 || j==1 || j==2){
                System.out.print("|\t "+SKKurikulum[i][j]+"\t\t");
                    if(SKKurikulum[i][j]==null){
                        System.out.print("Data Masih Kosong \t\t\t\t\t\t\t|");
                        break;
                    }
                }
                if(j==3){
                    System.out.print("|\t "+SKKurikulum[i][j]+"\t\t|");  
                }
            }
            System.out.println("");
        }
        Scanner inputan = new Scanner(System.in);
        System.out.println("=======================================.:.=======================================");
        System.out.print("Pilih data yang ingin edit, sesuai dengan nomor : ");
        Pilih_edit_hapus = inputan.nextInt(); //menginput data list yang akan dipilih
        AmbilIDSKK(Pilih_edit_hapus);
        EditDataKurikulumKeluar(menu3);
    }
    
    static int AmbilIDSKK(int PilihID){
        int IDn = PilihID - 1;
        String data[] = new String[5];          
        for (int i = 0; i < PilihID; i++) {
            for (int j = 0; j < 4; j++) {
                if(i==IDn){
                    if(j==0){
                        data[i]=SKKurikulum[i][j];    
                        System.out.println("No Surat \t: "+data[i]);
                    }
                    if(j==1){
                        data[i]=SKKurikulum[i][j];    
                        System.out.println("Tanggal Terima  : "+data[i]);
                    }
                    if(j==2){
                        data[i]=SKKurikulum[i][j];    
                        System.out.println("Pengirim \t: "+data[i]);
                    }
                    if(j==3){
                        data[i]=SKKurikulum[i][j];    
                        System.out.println("Penerima \t: "+data[i]);
                    }
                }
                else{
                    continue;
                }
            }
        }
        return IDn;
    }
    
    static void EditDataKurikulumKeluar(String menu3){
        System.out.println("___________________________________________________________");
        System.out.println("----------------------- :Edit Data: -----------------------");
        System.out.println("===========================================================");
        String NoSurat;
        String TanggalDiterima;
        String Pengirim;
        String IsiSurat;
        Scanner input = new Scanner(System.in);
        System.out.print("No. surat \t: ");
        NoSurat = input.nextLine();  //  NextLine untuk spasi - Next untuk NoSpace
        System.out.print("Tanggal Terima \t: " );
        TanggalDiterima = input.next(); input.nextLine();
        System.out.print("Pengirim \t: " );
        Pengirim = input.nextLine();
        System.out.print("Isi Surat \t: " );
        IsiSurat = input.next();
        
        String data[] = new String[4];
        data[0]=NoSurat;
        data[1]=TanggalDiterima;
        data[2]=Pengirim;
        data[3]=IsiSurat;
        
        String TempCheck = CekNoSuratSKK(data[0]);
        System.out.println("Temp "+TempCheck);
        if(TempCheck.equalsIgnoreCase("sama")){
                System.out.println("Maaf No Surat Tidak boleh kembar, Silahkan Isi no surat yang baru");
                EditDataKurikulumKeluar(menu3);
        }
        else{
            int ID = AmbilIDSKK(Pilih_edit_hapus);
//            System.out.println("ID nya "+ID);
            SKKurikulum[ID]=data;
            System.out.println("--------------::Data Berhasil diupdate::----------------");
            for (int i = 0; i < ID+1; i++) {
                for (int j = 0; j < SKKurikulum[i].length; j++) {
                    if(i==ID){
                        if(j==0){
                            System.out.println("No. Surat \t: "+SKKurikulum[i][j]);
                        }
                        if(j==1){
                            System.out.println("Tanggal Terima  : "+SKKurikulum[i][j]);
                        }
                        if(j==2){
                            System.out.println("Pengirim \t: "+SKKurikulum[i][j]);
                        }
                        if(j==3){
                            System.out.println("Isi Surat \t: "+SKKurikulum[i][j]);
                        }
                    }else{
                       continue; 
                    }
                }
                //System.out.println("");
            }
            LihatSuratKeluarKurikulum(menu3);  
        }
    }
    
    static void LihatSemuaSurat(){
        
    }
}















































































































































































































/**
 *
 *                                                                                                                                          //@Author Bima Reynaldi
 */