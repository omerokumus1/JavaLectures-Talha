package Ch10_ObjectOrientedThinking.Ch10_3_ThinkingInObjects;

public class Transporter {
    public void transportGoods() {
        loadGoodsIntoVehicle();
        driveVehicleToStore();
        unloadGoodsFromVehicle();
    }

    private void unloadGoodsFromVehicle() {
        System.out.println("Goods are unloaded");
    }

    private void driveVehicleToStore() {
        System.out.println("Vehicle is driven into the store.");
    }

    private void loadGoodsIntoVehicle() {
        System.out.println("Goods are loaded");
    }
}
