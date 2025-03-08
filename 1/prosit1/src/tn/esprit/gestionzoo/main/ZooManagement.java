package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {


    Animal animal1= new Animal("pitbull",18,true,"fox");
    Animal animalm= new Animal("pitbull",18,true,"fox");
    Animal animal2= new Animal("pitull",18,true,"fsdc");
    Animal animal3= new Animal("pbull",18,true,"foxsqdw");
    Animal animal4= new Animal("pil",18,true,"foxdqs");
    Animal animal5= new Animal("pdsfd",18,true,"fodsqwx");

    Aquatic houta= new Dolphin("9erch",26,true,"3awem","hay lamal",22);
        Aquatic batri9= new Penguin("natta",26,true,"naggez","hay lamal",29);

    Zoo zoo1=new Zoo("Myzoo1","Manouba"/*,4*/);
    System.out.println(zoo1);
    System.out.println(animal1);
        try {
            zoo1.addAnimal(animal1);

        } catch (ZooFullException | InvalidAgeException  e) {

            throw new RuntimeException(e);
        }finally {
            System.out.println("there are "+ zoo1.getCc()+" animals");
        }

        try {
            zoo1.addAnimal(animal3);
        } catch (ZooFullException | InvalidAgeException e ) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("there are "+ zoo1.getCc()+" animals");
        }
        try {
            zoo1.addAnimal(animalm);
        } catch (ZooFullException | InvalidAgeException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("there are "+ zoo1.getCc()+" animals");
        }
        try {
            zoo1.addAnimal(animal4);
        } catch (ZooFullException | InvalidAgeException  e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("there are "+ zoo1.getCc()+" animals");
        }
        try {
            zoo1.addAnimal(animal5);
        } catch (ZooFullException | InvalidAgeException  e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("there are "+ zoo1.getCc()+" animals");
        }
        zoo1.Display_Zoo();
    System.out.println(zoo1.searchAnimal(animalm));
    zoo1.DisplayAnimal();
    System.out.println("///////////////////");
    System.out.println("        " +zoo1.removeAnimal(animal1));
    System.out.println("///////////////////");
    zoo1.DisplayAnimal();
    System.out.println("///////////////////");
    System.out.println("        " +zoo1.isZooFull());


    Zoo zoo2=new Zoo("Myzoo2","Manouba"/*,4*/);
        try {
            zoo2.addAnimal(animal1);
        } catch (ZooFullException | InvalidAgeException  e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("there are "+ zoo1.getCc()+" animals");
        }
        try {
            zoo2.addAnimal(animal2);
        } catch (ZooFullException | InvalidAgeException  e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("there are "+ zoo1.getCc()+" animals");
        }
        try {
            zoo2.addAnimal(animal3);
        } catch (ZooFullException | InvalidAgeException  e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("there are "+ zoo1.getCc()+" animals");
        }

        System.out.println(Zoo.zoocomparezoo(zoo2,zoo1));
        /*Aquatic aquatic1=new Aquatic();
        aquatic1.sethabitat("Manouba");
        Dolphin dolphin1=new Dolphin();
        dolphin1.setSwimingSpeed(2555.2F);
        Penguin penguin1=new Penguin();
        penguin1.setSwimingDepth(266.2F);
        Terrestrial terrestrial1=new Terrestrial();
        terrestrial1.setNbrLegs(4);*/

        zoo1.addAquaticAnimal(houta);
        zoo1.addAquaticAnimal(batri9);

        System.out.println(zoo1.maxPenguinSwimmingDepth());
        zoo1.displayNumberOfAquaticsByType();
        System.out.println(houta.equals(batri9));

    }
}