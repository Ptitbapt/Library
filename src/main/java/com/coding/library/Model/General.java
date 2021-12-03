package com.coding.library.Model;

public class General extends Army {


    public General(String name, String nbrDeSoldat) {
        super(name);
        this.nbrDeSoldat = nbrDeSoldat;
    }

    public String getNbrDeSoldat() {
        return nbrDeSoldat;
    }

    public void setNbrDeSoldat(String nbrDeSoldat) {
        this.nbrDeSoldat = nbrDeSoldat;
    }

    private String nbrDeSoldat;

    @Override
    public String toString() {
        return "General : " + getName() +

                "";
    }
}
