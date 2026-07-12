interface DeliverySevice {
    void start();

    void deliverPackage();

    void stop();
}

class BikeDeliveryService implements DeliverySevice {
    @Override
    public void start() {
        System.out.println("Bike delivery service started.");
    }

    @Override
    public void deliverPackage() {
        System.out.println("Delivering package by bike.");
    }

    @Override
    public void stop() {
        System.out.println("Bike delivery service stopped.");
    }
}

class TruckDeliveryService implements DeliverySevice {
    @Override
    public void start() {
        System.out.println("Truck delivery service started.");
    }

    @Override
    public void deliverPackage() {
        System.out.println("Delivering package by truck.");
    }

    @Override
    public void stop() {
        System.out.println("Truck delivery service stopped.");
    }
}

class DroneDeliveryService implements DeliverySevice {
    @Override
    public void start() {
        System.out.println("Drone delivery service started.");
    }

    @Override
    public void deliverPackage() {
        System.out.println("Delivering package by drone.");
    }

    @Override
    public void stop() {
        System.out.println("Drone delivery service stopped.");
    }
}

class ManualDeliveryService implements DeliverySevice {
    @Override
    public void start() {
        System.out.println("Manual delivery service started.");
    }

    @Override
    public void deliverPackage() {
        System.out.println("Delivering package manually.");
    }

    @Override
    public void stop() {
        System.out.println("Manual delivery service stopped.");
    }
}

class DeliveryServiceManager {
    private DeliverySevice deliveryService;

    public DeliveryServiceManager(DeliverySevice deliveryService) {
        this.deliveryService = deliveryService;
    }

    public void startDelivery() {
        deliveryService.start();
        deliveryService.deliverPackage();
        deliveryService.stop();
    }
}

public class LSP {
    public static void main(String[] args) {
        DeliveryServiceManager bikeManager = new DeliveryServiceManager(new BikeDeliveryService());
        bikeManager.startDelivery();

        DeliveryServiceManager truckManager = new DeliveryServiceManager(new TruckDeliveryService());
        truckManager.startDelivery();

        DeliveryServiceManager droneManager = new DeliveryServiceManager(new DroneDeliveryService());
        droneManager.startDelivery();

        DeliveryServiceManager manualManager = new DeliveryServiceManager(new ManualDeliveryService());
        manualManager.startDelivery();
    }
}