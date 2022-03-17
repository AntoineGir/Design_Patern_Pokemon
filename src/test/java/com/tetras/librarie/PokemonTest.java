package com.tetras.librarie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.module.ModuleDescriptor.Builder;
import java.util.ArrayList;
import java.util.List;

import javax.lang.model.type.ArrayType;

public class PokemonTest {

    @Test
    public void testTest() {
        assertTrue(true);

        
        //init des pokemon
        Bulbizarre petitBulbizarre = new Bulbizarre();
        Herbizarre moyenhHerbizarre = new Herbizarre();

        Bulbizarre ListeBulbizarre = new Bulbizarre();
        Herbizarre ListehHerbizarre = new Herbizarre();
        Florizarre listeFlorizarre = new Florizarre();

        IMegaEvoluable Mega = new FlorizarreToMegaFlorizare();

        

        //Tests


        //un bulbizzare avec deux types
        assertTrue(ListeBulbizarre.getTypes().size() == 2 );

        //un bulbizzare avec deux types
        assertTrue(ListehHerbizarre.getTypes().size() == 2 );

        //un bulbizzare avec deux types
        assertTrue(listeFlorizarre.getTypes().size() == 2 );

        //un bulibizzare est il un bulibzarre
        assertTrue(petitBulbizarre instanceof Bulbizarre);


        
        //evolution de petitBulbizarre en bulbizarre
        assertTrue(petitBulbizarre.evoluer() instanceof Herbizarre);

        //evolution de moyenhHerbizarre en florizarre
        assertTrue(moyenhHerbizarre.evoluer() instanceof Florizarre);
        
        //creation d'un megaFlorizare
        assertTrue(Mega.faireunMega() instanceof MegaFlorizare);

        Bulbizarre bulbi = new Bulbizarre();
        Florizarre flo = new Florizarre();
        Herbizarre her = new Herbizarre();
        ObscurDecorator bubiDeux = new ObscurDecorator(bulbi);
        ObscurDecorator floObscur = new ObscurDecorator(flo);
        ObscurDecorator herObscur = new ObscurDecorator(her);

        
        assertTrue(bubiDeux.NewPokemon instanceof BulbizarreObscur);
        assertTrue(floObscur.NewPokemon instanceof FlorizarreObscur);
        assertTrue(herObscur.NewPokemon instanceof HerbizarreObscur);
        

        assertTrue(bubiDeux.purifier() instanceof Bulbizarre);
        assertTrue(floObscur.purifier() instanceof Florizarre);
        assertTrue(herObscur.purifier() instanceof Herbizarre);


    }


       

}