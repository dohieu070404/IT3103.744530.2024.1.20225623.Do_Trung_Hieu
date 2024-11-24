package test;

import lab2_dohieu.DigitalVideoDisc;

public class TestPassingParameter {

    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        // Tạo mảng chứa hai đối tượng
        DigitalVideoDisc[] dvds = {jungleDVD, cinderellaDVD};

        // Hoán đổi hai đối tượng
        swap(dvds);

        // Kiểm tra kết quả
        System.out.println("jungle dvd title: " + dvds[0].getTitle()); // Cinderella
        System.out.println("cinderella dvd title: " + dvds[1].getTitle()); // Jungle
    }

    // Phương thức hoán đổi hai đối tượng trong mảng
    public static void swap(DigitalVideoDisc[] dvds) {
        if (dvds.length >= 2) {
            DigitalVideoDisc temp = dvds[0];
            dvds[0] = dvds[1];
            dvds[1] = temp;
        }
    }
}
