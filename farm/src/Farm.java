import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> DanhSach;

    Farm() {
        DanhSach = new ArrayList<>();
    }

    public void add(Animal animal) {
        DanhSach.add(animal);
    }

    public void in() {
        System.out.println("Danh sách động vật có thể bơi hoặc chạy là:");
        for (Animal animal : DanhSach) {
            if (animal.boi() || animal.chay()) {
                System.out.println(animal.getName());
            }
        }
    }

    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.add(new Pig("Pig number 1"));
        farm.add(new Pig("Pig number 2"));
        farm.add(new Duck("Duck number 1"));
        farm.add(new Duck("Duck number 2"));
        farm.add(new fish("Fish number 1"));
        farm.add(new fish("Fish number 2"));
        farm.in();
    }
}
