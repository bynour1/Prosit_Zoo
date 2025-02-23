package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    private int nbrLegs;

public Terrestrial() {}
    public Terrestrial(String family ,int age , boolean isMammal, String name,int nbrLegs) {
        super(family,age,isMammal,name);
        this.nbrLegs = nbrLegs;
    }
        public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public String toString(){
    return super.toString()+"nbrLegs: "+nbrLegs;
    }
}
