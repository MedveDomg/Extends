/**
 * Created by medvedomg on 27.01.16.
 */
public class Box {
    double width;
    double height;
    double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double depth) {
        width = w;
        height = h;
        depth = depth;
            }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
            }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }


}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = w;

    }


}

class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(10, 20, 15, 34.3);
        Box plainbox = new Box();
        double vol;

        vol = weightBox.volume();
        System.out.println("Oбъeм wei ghtbox равен " + vol);
        System.out.println(" Bec weightbox равен " +weightBox.weight);
        System.out.println();

        plainbox = weightBox;
        vol = plainbox.volume();
        System.out.println("Oбъeм plainbox равен " + vol);
//        System.out.println(" Bec plainbox равен " + plainbox.weight); ОШИБКАААААА
    }
}
