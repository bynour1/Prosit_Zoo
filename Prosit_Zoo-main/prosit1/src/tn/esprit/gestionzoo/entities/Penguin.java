package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    private float swimingDepth;

    public Penguin() {}
    public Penguin(String family ,int age , boolean isMammal, String name,String habitat,float swimingDepth) {
        super(habitat,family,age,isMammal,name);
        this.swimingDepth = swimingDepth;

    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }

    @Override
    public String toString() {
        return super.toString()+"swimingDepth=" + swimingDepth ;
    }

    public float getSwimingDepth() {
        return swimingDepth;
    }

    public void setSwimingDepth(float swimingDepth) {
        this.swimingDepth = swimingDepth;
    }
}
