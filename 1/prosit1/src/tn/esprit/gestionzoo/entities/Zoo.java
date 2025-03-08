package tn.esprit.gestionzoo.entities;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages=25;
    int cc=0;
    Aquatic [] aquatics;
    int nbrAquatic=0;

    public Zoo ( String name, String city /*,int nbrCages*/) {
        if(name!=""){
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.aquatics = new Aquatic[nbrCages];
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

    public int getCc() {
        return cc;
    }


        public void addAnimal (Animal animal)throws ZooFullException, InvalidAgeException{
            if (isZooFull()){
                throw new ZooFullException("Zoo Full");
            }
            if (animal.getAge()<0){
                throw new InvalidAgeException("age (-)");
            }

            if (searchAnimal(animal)!=-1)
                System.out.println("Erreur ajout ");
            animals[cc] = animal;
            cc++;
            System.out.println("ajout avec succes");

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


    public void addAquaticAnimal(Aquatic aquatic){

        if (aquatic == null || searchAquatic(aquatic)!=-1||isAquaticFull()){
            System.out.println("Erreur lors de l'ajout ");
        }
        else{
            aquatics[nbrAquatic]=aquatic;
            nbrAquatic++;
            System.out.println("Aquatic bien  ajouté");
        }



    }
    public int searchAquatic(Aquatic aquatic){
        if (aquatic == null || aquatic.name == null){
            return -1;
        }
        for (int i =0; i<10; i++){
            if (aquatics[i]!=null && aquatics[i].name.equals(aquatic.name)){
                return i;
            }
        }
        return -1;
    }
    public boolean isAquaticFull(){
        if (nbrAquatic==10){
            return true;
        }
        return false;
    }

    public void swimming (){
        for (int i =0; i<nbrAquatic; i++){
            aquatics[i].swim();
        }
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = -1;
        boolean foundPenguin = false;

        for (int i = 0; i <nbrAquatic; i++) {
            if (aquatics[i].getClass() == Penguin.class) {
                if (!foundPenguin || aquatics[i].getSwimingDepth() > maxDepth) {
                    maxDepth = aquatics[i].getSwimingDepth();
                    foundPenguin = true;
                }
            }
        }
        return maxDepth;
    }
    public void displayNumberOfAquaticsByType(){
        int Penguin=0;
        int Daulphin=0;
        for (int i = 0; i <nbrAquatic; i++){
            if (aquatics[i].getClass() == Penguin.class) {
                Penguin++;
            }
            else {
                Daulphin++;
            }
        }
        System.out.println("le nombre des Pneguin est: "+Penguin);
        System.out.println("le nombre des Daulphin est: "+Daulphin);
    }



}
