/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan54.koordinat;

/**
 *
 * @author ACER
 */
public class PBOLat54 {
    private int x;
    private int y;

    public PBOLat54(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

// WarnaKoordinat.java
class WarnaKoordinat extends PBOLat54 {
    private String namaWarna;

    public WarnaKoordinat(int x, int y, String namaWarna) {
        super(x, y);
        this.namaWarna = namaWarna;
    }

    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
}

// ContohPenggunaan.java
class ContohPenggunaan {
    public static void main(String[] args) {
        WarnaKoordinat titikA = new WarnaKoordinat(10, 4, "Jingga");
        
        System.out.println("Warna Koordinat : " + titikA.getNamaWarna());
        System.out.println("Koordinat sumbu x : " + titikA.getX() + "," + " y : " + titikA.getY());
    }
}