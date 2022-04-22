package com.example.cetakfotoku2;

public class KatalogFoto {

    private int resId;
    private String filename;

    public KatalogFoto(int _resID, String _filename){
        resId = _resID;
        filename = _filename;
    }
    public int getResId() {

        return resId;
    }

    public void setResId(int resId) {

        this.resId = resId;
    }

    public String getFilename() {

        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    };
}
