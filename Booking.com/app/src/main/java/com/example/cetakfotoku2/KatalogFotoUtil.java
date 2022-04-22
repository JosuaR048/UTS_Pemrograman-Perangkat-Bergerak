package com.example.cetakfotoku2;

import java.util.ArrayList;
import java.util.List;

public class KatalogFotoUtil {

    private static int[] ridArray = {
        R.drawable.hotel,
            R.drawable.fasilitas1_1,
            R.drawable.fasilitas1_2,
            R.drawable.fasilitas1_3,
            R.drawable.hotel_2,
    };

    private static String[] filenameArray={
            "hotel",
            "fasilitas1_1",
            "fasilitas1_2",
            "fasilitas1_3",
            "hotel_2"
    };

    private static List<KatalogFoto> katalogFotoList;

    public static void init(){
        katalogFotoList = new ArrayList<>();
        int nArray = ridArray.length;
        for(int i=0 ; i<nArray ; i++){
            katalogFotoList.add(new KatalogFoto(ridArray[i], filenameArray[i]));
        }
    }

    public static List<KatalogFoto> getKatalogFotoList() {

        return katalogFotoList;
    }
}
