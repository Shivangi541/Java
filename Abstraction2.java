abstract class Restaurant {
    abstract void acceptOrder();

    abstract void prepareFood();

    abstract void deliverFood();
}

class IndianRestaurant extends Restaurant {
    @Override
    void acceptOrder() {
        System.out.println("Accepting order for Indian cuisine.");
    }

    @Override
    void prepareFood() {
        System.out.println("Preparing Indian food.");
    }

    @Override
    void deliverFood() {
        System.out.println("Delivering Indian food.");
    }
}

class ItalianRestaurant extends Restaurant {
    @Override
    void acceptOrder() {
        System.out.println("Accepting order for Italian cuisine.");
    }

    @Override
    void prepareFood() {
        System.out.println("Preparing Italian food.");
    }

    @Override
    void deliverFood() {
        System.out.println("Delivering Italian food.");
    }
}

class ChineseRestaurant extends Restaurant {
    @Override
    void acceptOrder() {
        System.out.println("Accepting order for Chinese cuisine.");
    }

    @Override
    void prepareFood() {
        System.out.println("Preparing Chinese food.");
    }

    @Override
    void deliverFood() {
        System.out.println("Delivering Chinese food.");
    }
}

public class Abstraction2 {
    public static void main(String[] args) {
        Restaurant indianRestaurant = new IndianRestaurant();
        indianRestaurant.acceptOrder();
        indianRestaurant.prepareFood();
        indianRestaurant.deliverFood();

        System.out.println();

        Restaurant italianRestaurant = new ItalianRestaurant();
        italianRestaurant.acceptOrder();
        italianRestaurant.prepareFood();
        italianRestaurant.deliverFood();

        System.out.println();

        Restaurant chineseRestaurant = new ChineseRestaurant();
        chineseRestaurant.acceptOrder();
        chineseRestaurant.prepareFood();
        chineseRestaurant.deliverFood();
    }
}
