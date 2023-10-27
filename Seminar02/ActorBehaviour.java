package Seminar02;

public interface ActorBehaviour {
    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean pickUpOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
}