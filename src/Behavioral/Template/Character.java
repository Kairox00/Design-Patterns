package Behavioral.Template;

public abstract class Character {

    public void pickUpWeapon() {
        System.out.println("Pick up weapon");
    }

    public void defenseAction() {
        System.out.println("Defend with weapon");
    }

    public void moveToSafety() {
        System.out.println("Return to safety");
    }

    public void defendAgainstAttack() {
        pickUpWeapon();
        defenseAction();
        moveToSafety();
        System.out.println();
    }
}
