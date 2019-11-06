/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118056.latihan47.nilaimahasiswa;

/**
 *
 * @author 
 * Nama : Mirraz Ibrahim
 * Nim : 10118056
 * Kelas: IF-2
 */
public final class Nilai {
    public double quiz,uts,uas;

    public Nilai(double quiz, double uts, double uas) {
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }
    
    public double nilaiAkhir(){
        return (quiz*0.2) + (uts*0.3) + (uas*0.5);
    }
    
    public String aturanIndex(){
        String index;
        if(nilaiAkhir()>=80 && nilaiAkhir()<= 100) index="A"; 
        else if(nilaiAkhir()>=68 && nilaiAkhir()<80) index="B";
        else if(nilaiAkhir()>=56 && nilaiAkhir()<68) index="C";
        else if(nilaiAkhir()>=45 && nilaiAkhir()<56) index="D";
        else if(nilaiAkhir()>=0 && nilaiAkhir()<45) index="E";
        else index="Nilai yang anda masukkan salah!";
        return index;
    }
     public String Keterangan(String index) {
        String ket = null;
        switch(index) {
            case "A": ket = "Sangat Baik";break;
            case "B": ket = "Baik";break;
            case "C": ket = "Cukup";break;
            case "D": ket = "Kurang";break;
            case "E": ket = "Sangat Kurang";break;
        }
        return ket;
     }
     public void tampilData(){
                 System.out.println("Quiz : " + quiz);
        System.out.println("UTS : " + uts);
        System.out.println("UAS : " + uas);
        System.out.println("");
        System.out.println("Nilai Akhir : " + nilaiAkhir() );
        System.out.println("");
        System.out.println("Index : " + aturanIndex());
        System.out.println("Keterngan : " + Keterangan(aturanIndex()));
         System.out.println(""); 

     }
}
