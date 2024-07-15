public class Main {
    interface Food {
        public String getType();
    }

    class Pizza implements Food {
        public String getType() {
            return "Someone ordered a Fast Food!";
        }
    }

    class Cake implements Food {

        public String getType() {
            return "Someone ordered a Dessert!";
        }
    }

    class FoodFactory {
        public Food getFood(String order) {


            if (order.equals("cake")) {
                return new Cake();
            } else {
                return new Pizza();
            }

        }
    }
}