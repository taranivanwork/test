package global.util;

import global.geom.Circle;

public class Test {

    public static void main(String[] args) {
        new Circle(1, 2, 3).print();
        Circle.Printer printer = new Circle.Printer();
        printer.print(1, 2, 3);
    }
}



