package tn.esprit.gestionzoo.entities;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages=25;
    int cc;

    public Zoo ( String name, String city /*,int nbrCages*/) {
        if(name!=""){
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        ////this.nbrCages = nbrCages;
        }
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void Display_Zoo(){
        System.out.println(name + " " + city + " " + nbrCages);
    }
    public String toString(){
        return name + " " + city + " " + nbrCages;
    }

    public Boolean addAnimal (Animal animal){
        if (animal == null || searchAnimal(animal)!=-1||isZooFull()){
            return false;
        }
        else{
            for (int i = cc; i < nbrCages; i++){
                if (animals[i] == null){
                    animals[i] = animal;
                    cc++;
                    return true;
                }
            }
        }
        return false;
    }
    public void DisplayAnimal(){
        for (int i = 0; i < nbrCages; i++) {
            if (animals[i]!=null) {
                System.out.println(animals[i].toString());
            }
        }
    }

    public int searchAnimal(Animal animal){
        if (animal == null || animal.name == null){
            return -1;
        }
        for (int i =0; i<nbrCages; i++){
            if (animals[i]!=null && animals[i].name.equals(animal.name)){
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal){
        int Position=searchAnimal(animal);
        if (Position ==-1)
            return false;
        for (int i = Position; i < cc; i++)
            animals[i] = animals[i + 1];
        cc--;
        return true;
    }

    public boolean isZooFull(){
        if (cc==nbrCages){
            return true;
        }
        return false;
    }

    public static Zoo zoocomparezoo(Zoo zoo1, Zoo zoo2){
            if (zoo1.cc > zoo2.cc){
            return zoo1;
            }
            else if (zoo1.cc < zoo2.cc){
                return zoo2;
            }
            else
                return null;
        }



}
