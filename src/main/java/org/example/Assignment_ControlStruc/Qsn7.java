package org.example.Assignment_ControlStruc;

public class Qsn7 {
    public static void main(String[] args) {
        Box square = new Box(2,4,4);
        Box rectangle = new Box(88,43,12);
        int squareVol = square.getVolume();
        int rectangleVol = rectangle.getVolume();
        System.out.println("area of rectangle: " + rectangleVol);
        System.out.println("area of square: " + squareVol);
    }

}

class Box{
    private int width , height, depth;

    Box(int width, int height,int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;

    }
    public int getVolume() {
        return this.width * this.height * this.depth;
    }
}
