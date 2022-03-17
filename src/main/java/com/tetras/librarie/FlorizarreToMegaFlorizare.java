package com.tetras.librarie;

public class FlorizarreToMegaFlorizare implements IMegaEvoluable{

    //private MegaFlorizare mega = new MegaFlorizare();
    
    @Override
    public MegaFlorizare faireunMega(){
        return new MegaFlorizare();
    }

}