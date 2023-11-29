package Seminar07.fabricMethod;

public class GemGen implements ItemGen{
    @Override
    public IGameItem createItem() {
        return new GemReward();
    }
}