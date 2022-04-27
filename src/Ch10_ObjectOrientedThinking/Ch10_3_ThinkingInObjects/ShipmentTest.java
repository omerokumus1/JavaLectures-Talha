package Ch10_ObjectOrientedThinking.Ch10_3_ThinkingInObjects;

public class ShipmentTest {
    public static void main(String[] args) {
        ShipmentManager manager = new ShipmentManager(new QualityController(), new Transporter(), new Worker());
        manager.shipGoods();
    }
}
