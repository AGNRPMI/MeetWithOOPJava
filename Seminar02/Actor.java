package Seminar02;

public abstract class Actor implements ActorBehaviour { //абстрактный класс не реализует методы из интерфейса
    protected final String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();
}