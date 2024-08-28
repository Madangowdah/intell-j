package com.xworkz.practise;
import com.xworkz.assignment.Bull;
import com.xworkz.thursday.CattleMan;
public class PetRunner {

    public static void main(String[] args) {

        Bull pet = new CattleMan();
        pet.name="Rukh";
        pet.color="Black";
        pet.gender="Male";
        pet.cost=85635;
        pet.display();

        Bull muscularMan = new CattleMan();
        muscularMan.name="Valor";
        muscularMan.color="Blackish brown";
        muscularMan.gender="Male";
        muscularMan.cost=75649;
        muscularMan.display();

        Bull bulkyMan  = new CattleMan();
        bulkyMan.name="Caspian";
        bulkyMan.color="White";
        bulkyMan.gender="Male";
        bulkyMan.cost=56372;
        bulkyMan.display();

        Bull farmer = new CattleMan();
        farmer.name="Gollath";
        farmer.color="Brown";
        farmer.gender="Male";
        farmer.cost=94762;
        farmer.display();

        CattleMan cattleMan= new CattleMan();
        cattleMan.name="Thor";
        cattleMan.color="Black";
        cattleMan.gender="Male";
        cattleMan.cost=85736;
        cattleMan.display();

        Bull bull = new CattleMan();
        bull.name="Blaze";
        bull.color=" Brownish Black";
        bull.gender="Male";
        bull.cost=98435;
        bull.display();

    }
}
