package players;

import enemies.Enemy;

public class Dwarf extends Fighter {

    private int beardLength;

    public Dwarf(String name, int hp, int beardLength) {
        super(name, hp);
        this.beardLength = beardLength;
    }

    public int getBeardLength(){
        return  this.beardLength;
    }
//
//    public int tickleEnemy(){
//        return enemy.getHp()
//    }


}
