package com.company;

public class Beurt1 {
    Darts dart1;
    Darts dart2;
    Darts dart3;

    public Beurt1(Darts dart1, Darts dart2, Darts dart3){
        this.dart1=dart1;
        this.dart2=dart2;
        this.dart3=dart3;
    }

    public Darts getDart1() {return dart1;}

    public Darts getDart2() {return dart2;}

    public Darts getDart3() {return dart3;}

    //Voor testontwerp opdracht OPT3 coverages
    public boolean isAllesRaak(Beurt1 huidigBeurt){
        boolean result = false;
        if(huidigBeurt.getDart1().getDart1()){
            if(huidigBeurt.getDart2().getDart1()){
                if(huidigBeurt.getDart3().getDart1()){
                    result = true;
                }
            }
        }
        return result;
    }
}
