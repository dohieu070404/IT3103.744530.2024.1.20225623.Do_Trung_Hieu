package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.store.Store;
import hust.soict.hedspi.aims.exception.LimitExceededException;

import java.util.Scanner;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();
    
    public static void updateStoreMenu(Scanner scanner) {
        System.out.println("Updating Store Menu...");
       
    }



    public static void main(String[] args) {
        initSetup();
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);

        // CLI loop
        while (!exit) {
            showMenu();
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    exit = true;
                    System.out.println("Good bye!");
                    break;
                case 1:
                    clearConsole();
                    storeMenu(scanner);
                    break;
                case 2:
                    clearConsole();
                    updateStoreMenu(scanner);
                    break;
                case 3:
                    clearConsole();
                    cartMenu(scanner);
                    break;
                default:
                    clearConsole();
                    System.out.println("Invalid option, please choose again.");
                    break;
            }
        }
    }

    public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void initSetup() {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);

        Book book = new Book("The Valley of Fear", "Detective", 20.00f);
        Book book1 = new Book("A Living Remedy: A Memoir", "Biography", 202.00f);
        Book book2 = new Book("On the Origin of Time: Stephen Hawking's Final Theory", "Science", 120.00f);
        store.addMedia(book);
        store.addMedia(book1);
        store.addMedia(book2);

        CompactDisc cd1 = new CompactDisc("Adele - 30", "Music", "Adele", 1500.98f);
        Track track1CD1 = new Track("All Night Parking (interlude)", 161);
        Track track2CD1 = new Track("To Be Loved", 403);
        Track track3CD1 = new Track("Woman Like Me", 300);
        cd1.addTrack(track1CD1);
        cd1.addTrack(track2CD1);
        cd1.addTrack(track3CD1);

        store.addMedia(cd1);
        store.addMedia(new CompactDisc("The Gods We Can Touch", "Music", "Aurora", 2000.22f));
        store.addMedia(new CompactDisc("Purpose", "Music", "Justin Bieber", 1000.98f));

        clearConsole();
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            store.print();
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a media's details");
            System.out.println("2. Add a media to cart");
            System.out.println("3. Play a media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");

            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    clearConsole();
                    back = true;
                    break;
                case 1:
                    viewMediaDetails(scanner);
                    break;
                case 2:
                    addMediaToCart(scanner);
                    break;
                case 3:
                    playMedia(scanner);
                    break;
                case 4:
                    clearConsole();
                    cartMenu(scanner);
                    break;
                default:
                    clearConsole();
                    System.out.println("Invalid option, please choose again.");
                    break;
            }
        }
    }

    private static void viewMediaDetails(Scanner scanner) {
        System.out.println("Enter the title of the media: ");
        String title = scanner.nextLine();
        Media media = store.search(title);
        if (media != null) {
            System.out.println(media);
        } else {
            System.out.println("Media not found.");
        }
    }

    private static void addMediaToCart(Scanner scanner) {
        System.out.println("Enter the title of the media to add to cart: ");
        String title = scanner.nextLine();
        Media media = store.search(title);
        if (media != null) {
            try {
                cart.addMedia(media);
                System.out.println("Media added to cart.");
            } catch (LimitExceededException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Media not found.");
        }
    }

    private static void playMedia(Scanner scanner) {
        System.out.println("Enter the title of the media to play: ");
        String title = scanner.nextLine();
        Media media = store.search(title);
        if (media != null && (media instanceof Disc || media instanceof CompactDisc)) {
            media.play();
        } else {
            System.out.println("This media cannot be played.");
        }
    }

    public static void cartMenu(Scanner scanner) {
        boolean back = false;
        while (!back) {
            cart.print();
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter medias in cart");
            System.out.println("2. Sort medias in cart");
            System.out.println("3. Remove media from cart");
            System.out.println("4. Play a media");
            System.out.println("5. Place order");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4-5");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    clearConsole();
                    back = true;
                    break;
                case 1:
                    filterMediasInCart(scanner);
                    break;
                case 2:
                    sortMediasInCart(scanner);
                    break;
                case 3:
                    removeMediaFromCart(scanner);
                    break;
                case 4:
                    playMediaFromCart(scanner);
                    break;
                case 5:
                    cart.empty();
                    System.out.println("Order placed successfully.");
                    break;
                default:
                    clearConsole();
                    System.out.println("Invalid option, please choose again.");
                    break;
            }
        }
    }
    

    private static void filterMediasInCart(Scanner scanner) {
        System.out.println("Filter by (1) ID or (2) Title:");
        int option = scanner.nextInt();
        scanner.nextLine();
        if (option == 1) {
            System.out.println("Enter media ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            Media media = cart.search(id);
            if (media != null) {
                System.out.println(media);
            } else {
                System.out.println("Media not found.");
            }
        } else if (option == 2) {
            System.out.println("Enter title: ");
            String title = scanner.nextLine();
            Media media = cart.search(title);
            if (media != null) {
                System.out.println(media);
            } else {
                System.out.println("Media not found.");
            }
        }
    }
    

    private static void sortMediasInCart(Scanner scanner) {
        System.out.println("Sort by (1) Title or (2) Price:");
        int option = scanner.nextInt();                                   
        scanner.nextLine();               
        if (option == 1) {
            cart.sortByTitle();
        } else if (option == 2) {
            cart.sortByPrice();
        }        
    }

    private static void removeMediaFromCart(Scanner scanner) {
        System.out.println("Enter the title of the media to remove: ");
        String title = scanner.nextLine();
        Media media = cart.search(title);
        if (media != null) {
            cart.removeMedia(media);
            System.out.println("Media removed from cart.");
        } else {
            System.out.println("Media not found.");
        }
    }

    private static void playMediaFromCart(Scanner scanner) {
        System.out.println("Enter the title of the media to play: ");
        String title = scanner.nextLine();
        Media media = cart.search(title);
        if (media != null) {
            media.play();
        } else {
            System.out.println("Media not found.");
        }
    }
}
