package models;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Guest on 1/9/18.
 */
public class CD {

    private String CDNAME;
    private static ArrayList<CD> instances = new ArrayList<>();
    public CD(String cdName) {
        this.CDNAME = cdName;
        instances.add(this);
    }

    public static ArrayList<CD> getAllCD() {
        return instances;
    }

    public static void clearAllCDs(){
        instances.clear();
    }
    public String getContent (){
        return CDNAME;

    }
}
