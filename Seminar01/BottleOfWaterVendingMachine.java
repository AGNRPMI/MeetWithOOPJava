package Seminar01;

import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine{
    List<BottleOfWater> bottleOfWater;

    public BottleOfWaterVendingMachine(List<BottleOfWater> products) {
        this.bottleOfWater = products;
    }

    public List<BottleOfWater> getBottleOfWatters() {
        return bottleOfWater;
    }

    public void setBottleOfWatters(List<BottleOfWater> bottleOfWater) {
        this.bottleOfWater = bottleOfWater;
    }

    @Override
    public Product getProduct(String name) {
        for (BottleOfWater item : bottleOfWater) {
            if(item.getName().equals(name))
                return item;
        }
        return null;
    }
    public Product getProduct(String name, double volume){
        for (BottleOfWater bottle : bottleOfWater) {
            if(bottle.getName().equals(name) && bottle.getVolume() == volume)
                return bottle;
        }
        return null;
    }
    public void addBottleOfWater(BottleOfWater bottleOfWatter){
        this.bottleOfWater.add(bottleOfWatter);
    }
}