package lab2_dohieu;

import lab2_dohieu.Cart;
import lab2_dohieu.DigitalVideoDisc;

public class AIMS {
    public static void main(String[] args) {
        Cart anOrder = new Cart();


        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 213.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 88, 193.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 24.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Avatar", "Science Fiction", "James Cameron", 162, 292.99f);
        anOrder.addDigitalVideoDisc(dvd4);

        DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 119.99f);
        anOrder.addDigitalVideoDisc(dvd5);

        DigitalVideoDisc dvd6 = new DigitalVideoDisc("Pulp Fiction", "Drama", "Quentin Tarantino", 154, 194.99f);
        anOrder.addDigitalVideoDisc(dvd6);

        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Forrest Gump", "Drama", "Robert Zemeckis", 142, 148.99f);
        anOrder.addDigitalVideoDisc(dvd7);

        DigitalVideoDisc dvd8 = new DigitalVideoDisc("The Matrix", "Science Fiction", "The Wachowskis", 136, 262.99f);
        anOrder.addDigitalVideoDisc(dvd8);

        DigitalVideoDisc dvd9 = new DigitalVideoDisc("Titanic", "Romance", "James Cameron", 195, 147.99f);
        anOrder.addDigitalVideoDisc(dvd9);

        DigitalVideoDisc dvd10 = new DigitalVideoDisc("Jurassic Park", "Adventure", "Steven Spielberg", 127, 155.99f);
        anOrder.addDigitalVideoDisc(dvd10);

        DigitalVideoDisc dvd11 = new DigitalVideoDisc("Finding Nemo", "Animation", "Andrew Stanton", 100, 162.99f);
        anOrder.addDigitalVideoDisc(dvd11);

        DigitalVideoDisc dvd12 = new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 281.99f);
        anOrder.addDigitalVideoDisc(dvd12);

        DigitalVideoDisc dvd13 = new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 225.99f);
        anOrder.addDigitalVideoDisc(dvd13);

        DigitalVideoDisc dvd14 = new DigitalVideoDisc("Gladiator", "Action", "Ridley Scott", 155, 213.99f);
        anOrder.addDigitalVideoDisc(dvd14);

        DigitalVideoDisc dvd15 = new DigitalVideoDisc("Braveheart", "Historical", "Mel Gibson", 178, 227.99f);
        anOrder.addDigitalVideoDisc(dvd15);

        DigitalVideoDisc dvd16 = new DigitalVideoDisc("The Avengers", "Action", "Joss Whedon", 143, 139.99f);
        anOrder.addDigitalVideoDisc(dvd16);

        DigitalVideoDisc dvd17 = new DigitalVideoDisc("Toy Story", "Animation", "John Lasseter", 81, 114.99f);
        anOrder.addDigitalVideoDisc(dvd17);

        DigitalVideoDisc dvd18 = new DigitalVideoDisc("Frozen", "Animation", "Jennifer Lee", 102, 146.99f);
        anOrder.addDigitalVideoDisc(dvd18);

        DigitalVideoDisc dvd19 = new DigitalVideoDisc("Spider-Man", "Action", "Sam Raimi", 121, 148.99f);
        anOrder.addDigitalVideoDisc(dvd19);

        DigitalVideoDisc dvd20 = new DigitalVideoDisc("The Lion King 2", "Animation", "Bradley Raymond", 80, 142.99f);
        anOrder.addDigitalVideoDisc(dvd20);
        
        anOrder.removeDigitalVideoDisc(dvd19);
        
        DigitalVideoDisc dvd21 = new DigitalVideoDisc("The Lord of the Rings: The Fellowship of the Ring", "Fantasy", "Peter Jackson", 178, 254.95f);
        anOrder.addDigitalVideoDisc(dvd21);

        DigitalVideoDisc dvd22 = new DigitalVideoDisc("Harry Potter and the Sorcerer's Stone", "Fantasy", "Chris Columbus", 152, 159.95f);
        anOrder.addDigitalVideoDisc(dvd22);

        DigitalVideoDisc dvd23 = new DigitalVideoDisc("The Silence of the Lambs", "Thriller", "Jonathan Demme", 118, 242.50f);
        anOrder.addDigitalVideoDisc(dvd23);

        DigitalVideoDisc dvd24 = new DigitalVideoDisc("The Social Network", "Drama", "David Fincher", 120, 146.99f);
        anOrder.addDigitalVideoDisc(dvd24);


       
        anOrder.print();

        anOrder.removeDigitalVideoDisc(dvd2);
        System.out.printf("Total cost is: %.2f", anOrder.totalCost());
    }
}
