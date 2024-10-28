package lab2_dohieu;

import lab2_dohieu.DigitalVideoDisc;

public class Cart {
	//theo de so luong don hang toi da la 20
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;
//add DVD
    public int addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full. Can't add more discs");
            return 0;
        } else {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The DVD \"" + disc.getTitle() + "\" has been added!");
            return 1;
        }
    }
//remove DVD
    public int removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered[0] == null) {
            System.out.println("Your cart is empty!");
            return 0;
        }
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("Remove DVD \"" + disc.getTitle() + "\" successfully!");
                return 1;
            }
        }
        System.out.println("No DVD match!");
        return 0;
    }
//total last
    public float totalCost() {
        float sum = 0.00f;
        for (int i = 0; i < qtyOrdered; i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }

    public void print() {
        System.out.println("*********************CART**************************");
        System.out.println("Ordered items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". [" + itemsOrdered[i].getTitle() + "] - [" + itemsOrdered[i].getCategory() + "] - [" +
                    itemsOrdered[i].getDirector() + "] - [" + itemsOrdered[i].getLength() + "]: " + itemsOrdered[i].getCost() + "vnd");
        }
        System.out.println("Total: " + totalCost() + "vnd");
        System.out.println("***************************************************");
    }
}
