package minggu9;

public class Main {
    private static String drinkType;

    public static void main(String[] args) {
        Actor avatar = new Avatar("Aang",
                100, 80);
        Enemy ninjaGaiden = new Ninja(true,
                1000, 50);
        Enemy warlock = new Warlock(true,
                800, 40);
        Actor actorWarlock = warlock;

//        System.out.println(actorWarlock instanceof Warlock);
        if(avatar instanceof Avatar){
            System.out.println("ya ini avatar asli");
            avatar.getInfo();
        }
    }

    private void declareDrink(String name, Main drink) {
        System.out.println(drink.drinkType + name);
    }
}
