package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    private float swimingSpeed;

public Dolphin() {}
public Dolphin(String family ,int age , boolean isMammal, String name,String habitat,float swimingSpeed) {
    super(habitat,family,age,isMammal,name);
    this.swimingSpeed = swimingSpeed;

}

    @Override
    public void swim() {
    System.out.println("This dolphin is swimming.");
    }

    public String toString() {
        return super.toString()+"SwimingSpeed: "+swimingSpeed;
    }

    public float getSwimingSpeed() {
        return swimingSpeed;
    }

    public void setSwimingSpeed(float swimingSpeed) {
        this.swimingSpeed = swimingSpeed;
    }
}
