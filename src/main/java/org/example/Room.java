package org.example;

public class Room {
    public int roomNo;
    public String roomType;
    public float roomArea;
    public boolean acMachine;

    public void setData(int roomNo, String roomType, float roomArea, boolean acMachine) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.acMachine = acMachine;
    }


    public void displayData() {
        System.out.println(
                "roomNo=" + roomNo +
                ", roomType='" + roomType + '\'' +
                ", roomArea=" + roomArea +
                ", acMachine=" + acMachine );
    }

    public static void main(String[] args) {
        Room myRoom = new Room();
        myRoom.setData(1,"Kingsize",999,true);
        myRoom.displayData();
    }


}
