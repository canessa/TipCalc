package edu.galileo.android.tipcalc.activities;

import android.app.Application;

/**
 * Created by Zod on 10/06/2016.
 */
public class TipCalcApp extends Application{

    private final static String ABOUT_URL   =   "https://about.me/adriancatalan";

    public String getAboutUrl(){
        return ABOUT_URL;
    }
}
