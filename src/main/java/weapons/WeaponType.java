package weapons;

public enum WeaponType {
    SWORD(15),
    AXE(10),
    CLUB(5),
    ;
    private final int damageValue;

    WeaponType(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getDamageValue(){
        return this.damageValue;
    }
}
