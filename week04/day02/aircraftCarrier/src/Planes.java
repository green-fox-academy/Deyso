public class Planes {
    String type;
    int ammo;
    int damage;
    int maxAmmo;
    boolean priority;


    public int fight() {
        int allDamage = damage * ammo;
        ammo = 0;
        System.out.println("Your " + type + " damaged: " + allDamage);
        return allDamage;
    }

    public boolean isPriority() {
        if (type == "F16") {
            System.out.println(priority);
            return priority;
        }
        System.out.println(priority);
        return priority;

    }

    public void getStatus() {
        System.out.println("Type " + type + ", Ammo: " + ammo + ", Base Damage: " + damage + ", All Damage: " + (ammo * damage));
    }

    public int refill(int numberOfRefill) {

        if (type == "F16") {
            maxAmmo = 8;
        } else {
            maxAmmo = 12;
        }
        if (numberOfRefill >= maxAmmo) {
            ammo += (maxAmmo - ammo);
        } else {
            ammo += numberOfRefill;
            numberOfRefill = 0;
        }
       return (numberOfRefill - ammo);
    }

    public String toString(){
        return "Type " + type + ", Ammo: " + ammo + ", Base Damage: " + damage + ", All Damage: " + (ammo * damage);
    }
}
