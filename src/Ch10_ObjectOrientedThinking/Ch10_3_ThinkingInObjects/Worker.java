package Ch10_ObjectOrientedThinking.Ch10_3_ThinkingInObjects;

public class Worker {
    public void handleDamagedGoods() {
        separateDamagedGoods();
        loadDamagedGoods();
    }

    private void loadDamagedGoods() {
        System.out.println("Damaged goods are loaded back into the vehicle");
    }

    private void separateDamagedGoods() {
        System.out.println("Damaged goods are separated.");
    }


}
