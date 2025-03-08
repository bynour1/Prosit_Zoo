package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public abstract class Aquatic extends Animal {
    protected/*private*/ String habitat;

    public Aquatic() {}
    public Aquatic(String habitat ,String family,int age , boolean isMammal, String name) {
        super(family, age, isMammal, name);
        this.habitat = habitat;
    }

    public String toString() {
        return super.toString()+"habitat=" + habitat;
    }
    /*public void swim(){
        System.out.println("This aquatic animal is swimming.");
    }*/
    public float getSwimingDepth()
    {
        return 1;
    }
    public abstract void swim();
    /*public String gethabitat() {
        return habitat;
    }
    public void sethabitat(String habitat) {
        this.habitat = habitat;
    }*/

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aquatic aquatic = (Aquatic) o;
        return Objects.equals(habitat, aquatic.habitat)&&Objects.equals(name, aquatic.name)&&this.age == aquatic.age;

    }

    @Override
    public int hashCode() {
        return Objects.hashCode(habitat);
    }
}
