package hw4;

public class Phone<T> {
    private T brand;
    private T model;

    public Phone(T brand, T model) {
        this.brand = brand;
        this.model = model;
    }

    public T getBrand() {
        return brand;
    }

    public void setBrand(T brand) {
        this.brand = brand;
    }

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }

    public <T> void getInfo(T obj) {
        System.out.println("Информация о объекте: " + obj);
    }

    public <T> void sendMessage(T obj) {
        System.out.println("Вы отправили сообщение: " + obj);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand = " + brand +
                ", model = " + model +
                '}';
    }
}
