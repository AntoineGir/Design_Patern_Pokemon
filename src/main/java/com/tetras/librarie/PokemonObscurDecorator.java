package com.tetras.librarie;

public abstract class PokemonObscurDecorator  {
    
    public Pokemon NewPokemon;

    public PokemonObscurDecorator(Pokemon LePokemon)
    {
        if(LePokemon instanceof Herbizarre)
        {
            NewPokemon = new HerbizarreObscur();
        }
        else if(LePokemon instanceof Bulbizarre){

            NewPokemon = new BulbizarreObscur();

        }else if(LePokemon instanceof Florizarre){
            
            NewPokemon = new FlorizarreObscur();
        }
    }

    public Pokemon purifier(){
        if(this.NewPokemon instanceof HerbizarreObscur)
        {
            NewPokemon = new Herbizarre();
        }
        else if(this.NewPokemon instanceof BulbizarreObscur){

            NewPokemon = new Bulbizarre();

        }else if(this.NewPokemon instanceof FlorizarreObscur){
            
            NewPokemon = new Florizarre();
        }
        return NewPokemon;
    }
}
