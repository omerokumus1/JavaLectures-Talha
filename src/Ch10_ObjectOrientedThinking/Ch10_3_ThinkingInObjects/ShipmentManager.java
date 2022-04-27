package Ch10_ObjectOrientedThinking.Ch10_3_ThinkingInObjects;

public class ShipmentManager {
    private QualityController qualityController;
    private Transporter transporter;
    private Worker worker;

    public ShipmentManager(QualityController qualityController, Transporter transporter, Worker worker) {
        this.qualityController = qualityController;
        this.transporter = transporter;
        this.worker = worker;
    }

    public void shipGoods(){
        qualityController.checkDamagedGoods();
        transporter.transportGoods();
        worker.handleDamagedGoods();
    }
}
