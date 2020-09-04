/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keretaapi;
/**
 *
 * @author win10
 */
public class perjalanan {
    public static void main(String[] args){
        //Membuat Instence/Objek dari Class restoran
        Keretaapi data = new Keretaapi();
        
        //Memasukan Data pada Variable
        data.setgerbongkereta("ekonomi");
        data.setharga(1200000.0);
        data.setSpesial(true);
        
        //Memanggil Method Get dari Class restoran dan Menampilkannya
        System.out.println("gerbong kereta api: "+data.getgerbongkereta());
        System.out.println("Harga tiket: Rp."+data.getHarga());
        System.out.println("paket makanan: "+data.getSpesial());
    }
}