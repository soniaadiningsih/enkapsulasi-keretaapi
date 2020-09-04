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
class Keretaapi {
    //Variable (Private)
    private String gerbongkereta;
    private double harga;
    private boolean spesial;
    
    //Method Setter (Public) dengan Parameter
    public void setgerbongkereta(String gerbongkereta){
        this.gerbongkereta = gerbongkereta;
    }
    public void setharga(double harga){
        this.harga = harga;
    }
    public void setSpesial(boolean spesial){
        this.spesial = spesial;
    }
    
    //Method Getter (Public)
    public String getgerbongkereta(){
        return gerbongkereta;
    }
    public double getHarga(){
        return harga;
    }
    public boolean getSpesial(){
        return spesial;
    }
}
