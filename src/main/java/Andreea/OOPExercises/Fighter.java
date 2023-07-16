package Andreea.OOPExercises;

public interface Fighter {

    int damage(Fighter fighter);

    default boolean isVulnerable() {
        return false;
    }
}

class Warrior implements Fighter {

    @Override
    public int damage(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;

    }


    @Override
    public String toString() {
//        return "FIGHTER IS A WARRIOR"; // hard code
        return "Fighter is a " + this.getClass().getSimpleName();

    }
}

class Wizard implements Fighter {

    public int getSpell() {
        return spell;
    }

    private int spell;

    public void prepareSpell(){
        spell++;
    }

    @Override
    public String toString() {
        return "Fighter is a " + this.getClass().getSimpleName();
    }

    @Override
    public boolean isVulnerable() {
        return spell == 0;
    }

    @Override
    public int damage(Fighter fighter) {
        if(spell ==0){
            return 3;
        }
        return 12;
    }
}

class TestMyFighter {
    public static void main(String[] args) {
        Fighter warrior =  new Warrior();
        String myFighther = warrior.toString();
        Fighter wizard = new Wizard();
        System.out.println("Prepared spells: " + ((Wizard) wizard).getSpell());

        System.out.println("Wizard damage: " + wizard.damage(warrior));
        ((Wizard) wizard).prepareSpell();
        System.out.println("Prepared spells: " + ((Wizard) wizard).getSpell());
        System.out.println("Wizard damage: " + wizard.damage(warrior));





//        String esteGol = new String("");
//        char[] listaMea = {'a', 'e', 'r'};
//        for (char c : listaMea) {
//            esteGol += c;
//            System.out.println((System.identityHashCode(esteGol)));
//        }
//        System.out.println(esteGol);
//        System.out.println(System.identityHashCode(esteGol));


    }
}


