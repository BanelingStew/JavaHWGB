/**
 * Java1. Homework 7
 *
 * @author Yury Fesechka
 * @version 01 .06.2022
 */
public class Lesson7HW {
    public static void main(String[] args) {

        FeedCat[] cats =
                {new FeedCat("Snowball", 20), new FeedCat("Lasik", 50), new FeedCat("Masik", 50)
                };
        FeedCat.Plate plate = new FeedCat.Plate(30, 120);
        for (FeedCat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        System.out.println(plate);
        plate.add(100);
        System.out.println(plate);

        for (FeedCat cat : cats) {
            cat.setFullness(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }

}


class FeedCat {
    private final String name;
    private final int appetite;
    private boolean fullness;

    FeedCat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    void setFullness(boolean status) {
        fullness = status;
    }

    void eat(Plate plate) {
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }

    }

    @Override
    public String toString() {
        return "(name=" + name + ", appetite=" + appetite + ",fullness =" + fullness + ")";
    }

    static class Plate {
        private final int volume;
        private int food;

        Plate(int food, int volume) {
            this.food = food;
            this.volume = volume;
        }

        boolean decreaseFood(int portion) {
            if (food < portion) {
                return false;
            }
            food -= portion;
            return true;
        }

        void add(int food) {
            if (this.food + food <= volume) {
                this.food += food;
            }
        }

        @Override
        public String toString() {
            return "plate" + food;
        }
    }
}





