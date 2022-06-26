package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Observable;
import java.util.Observer;

public class Darts extends Observable {
    private boolean dart1;

    public Darts(boolean dart1){
        this.dart1=dart1;
        isHetKoningsdag();
    }

    public boolean getDart1(){return dart1;}

    public void isHetKoningsdag(){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM");
        LocalDate nu = LocalDate.now();
        String strNu = df.format(nu);
        //if(strNu.equals("4/27")){
            setChanged();
            notifyObservers();
        //}
    }
}
