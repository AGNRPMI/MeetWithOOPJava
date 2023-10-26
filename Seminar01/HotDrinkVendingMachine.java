package Seminar01;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    List<HotDrink> hotDrinks;

    public HotDrinkVendingMachine(List<HotDrink> products) {
        this.hotDrinks = products;
    }

    public List<HotDrink> getHotDrinks() {
        return hotDrinks;
    }

    public void setHotDrink(List<HotDrink> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    @Override
    public Product getProduct(String name) {
        for (HotDrink item : hotDrinks) {
            if (item.getName().equals(name))
                System.out.printf("По запросу %s  найдено: ", name);
            return item;
        }
        return null;
    }

    public Product getProduct(String name, double volume) {
        for (HotDrink item : hotDrinks) {
            if (item.getName().equals(name) && item.getVolume() == volume) {
                System.out.printf("По запросу %s / %s найдено: ", name, volume);
                return item;
            }
        }
        return null;
    }

    public Product getProduct(String name, double volume, int temperature) {
        for (HotDrink item : hotDrinks) {
            if (item.getName().equals(name) && item.getVolume() == volume && item.getTemperature() == temperature) {
                System.out.printf("По запросу %s / %s / %s найдено: ", name, volume, temperature);
                return item;
            }
        }
        return null;
    }

    public Product getProduct(int temperature) {
        for (HotDrink item : hotDrinks) {
            if (item.getTemperature() == temperature) {
                System.out.printf("По запросу %s найдено: ", temperature);
                return item;
            }
        }
        return null;
    }

    public void addHotDrink(HotDrink hotDrink) {
        this.hotDrinks.add(hotDrink);
    }
}
