package Interface;

public class pushWorkout implements Gym {
    public static void main(String[] arg) {
        Gym hardoi = new pushWorkout();
        hardoi.backExcise();
        hardoi.chestExcise();
        hardoi.tricepsExcise();
    }

    @Override
    public void chestExcise() {
        System.out.println("Monday");
    }

    @Override
    public void shoulderExcise() {
        System.out.println("Tuesday");
    }

    @Override
    public void backExcise() {
        System.out.println("Wednesday");
    }

    @Override
    public void tricepsExcise() {
        System.out.println("Thusday");
    }
}
