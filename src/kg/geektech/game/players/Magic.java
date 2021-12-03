package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero {
    private int boostDamage;

    public Magic(int health, int damage,int boostDamage) {
        super(health, damage, SuperAbility.BOOST);
        int boostDamage1 = this.boostDamage;


    }

    public int getBoostDamage() {
        return boostDamage;
    }

    public void setBoostDamage(int boostDamage) {
        this.boostDamage = boostDamage;

    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            int dororo = RPG_Game.random.nextInt(4) + 2;
            if (heroes[i].getHealth() > 0 && boss.getHealth() > 0){
                heroes[i].setDamage(heroes[i].getDamage() + dororo);
            }
                System.out.println("The magician added damage to other heroes" + " " + dororo);
            break;
            }
        }
    }

