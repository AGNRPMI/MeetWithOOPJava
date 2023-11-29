package Seminar07.fabricMethod;

public class GoldGen implements ItemGen{

    @Override
    public IGameItem createItem() {
        return new GoldReward();
    }
}