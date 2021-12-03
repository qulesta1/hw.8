package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero {
    private int reflection;// рефлекшин это он перенял часть урона босса и добавил к своему урону


    public Berserk(int health, int damage,int reflection) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    public int getReflection() {
        return reflection;
    }

    public void setReflection(int reflection) {
        this.reflection = reflection;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes[3].getDamage(); i++) {
            if(heroes[3].getDamage() ==10 && heroes[3].getHealth() > 0) {
                int Trololo = RPG_Game.random.nextInt(3) + 2;
                heroes[3].setDamage((getDamage()) + this.reflection + Trololo);
                System.out.println("Berserk raflection" + " "+ this.reflection);
            }
        }
    }
}






