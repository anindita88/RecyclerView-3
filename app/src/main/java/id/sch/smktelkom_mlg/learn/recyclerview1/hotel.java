package id.sch.smktelkom_mlg.learn.recyclerview1.hotel;

import android.graphics.drawable.Drawable;

/**
 * Created by Smktelkom on 09-Nov-16.
 */
public class hotel {
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public hotel(String judul, String deskripsi, Drawable foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}
