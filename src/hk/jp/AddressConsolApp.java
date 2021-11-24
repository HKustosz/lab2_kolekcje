package hk.jp;

import java.util.Map.Entry;
import java.util.*;

public class AddressConsolApp {

    private static final String GREETING_MESSAGE =
            "Program Address - wersja konsolowa\n" +
                    "Autor: Hubert Kustosz\n" +
                    "Data:  23.11.2021r.\n" +
            "na podstawie programu Person autorstwa Pawła Rogalińskiego\n";

    private static final String CHOOSE_COLLECTION =
            "    W Y B I E R Z   K O L E K C J E  \n" +
                    "1 - HashSet\n" +
                    "2 - TreeSet\n" +
                    "3 - ArrayList\n" +
                    "4 - LinkedList\n" +
                    "5 - HashMap\n" +
                    "6 - TreeMap\n" +
                    "0 - Zakończ program\n"
            ;

    private static final String MENU =
            "            M E N U\n" +
                    "1 - Dodaj nowy adres\n" +
                    "2 - Dodaj dwukrotnie ten sam adres\n" +
                    "3 - Usuń adres\n" +
                    "4 - Wypisz zawartość kolekcji\n" +
                    "5 - Usuń zawartość kolekcji\n" +
                    "0 - Powróć do wyboru kolekcji\n"
            ;

    static Address createAddress(){
        String city = UI.enterString("Podaj miasto: ");
        String street = UI.enterString("Podaj nazwę ulicy: ");
        int houseNumber = UI.enterInteger("Podaj numer domu: ");
        Address address;
        address = new Address(city, street, houseNumber);

        return address;
    }

    private static final ConsolUserDialog UI = new ConsolUserDialog();

    HashSet<Address> zbior1 = new HashSet<>();
    TreeSet<Address> zbior2 = new TreeSet<>();
    ArrayList<Address> lista1 = new ArrayList<>();
    LinkedList<Address> lista2 = new LinkedList<>();
    HashMap<Integer, Address> mapa1 = new HashMap<>();
    TreeMap<Integer, Address> mapa2 = new TreeMap<>();

    public static void main(String[] args) {
        AddressConsolApp application = new AddressConsolApp();
        application.runMainLoop();
    }

    public void runMainLoop() {
        UI.printMessage(GREETING_MESSAGE);
        int j = 0;
        int i = 0;
        int end = 0;

        while (end == 0) {
            UI.clearConsole();

            switch (UI.enterInteger(CHOOSE_COLLECTION + "==>> ")) {
                case 1:
                    switch (UI.enterInteger(MENU + "==>> ")) {
                        case 1:
                            zbior1.add(createAddress()); break;
                        case 2:
                            Address address = createAddress();
                            zbior1.add(address);
                            zbior1.add(address);
                            break;
                        case 3:
                            zbior1.remove(createAddress()); break;
                        case 4:
                            System.out.println();
                            System.out.println("Zawartość HashSet: ");
                            for(Address a: zbior1){
                                System.out.println(a.getCity()+" "+a.getStreet()+" "+a.getHouseNumber());
                            }
                            break;
                        case 5:
                            zbior1.clear(); break;
                        case 0:
                            break;
                    }
                    break;
                case 2:
                    switch (UI.enterInteger(MENU + "==>> ")) {
                        case 1:
                            zbior2.add(createAddress()); break;
                        case 2:
                            Address address = createAddress();
                            zbior2.add(address);
                            zbior2.add(address);
                            break;
                        case 3:
                            zbior2.remove(createAddress()); break;
                        case 4:
                            System.out.println();
                            System.out.println("Zawartość TreeSet: ");
                            for(Address a: zbior2){
                                System.out.println(a.getCity()+" "+a.getStreet()+" "+a.getHouseNumber());
                            }
                            break;
                        case 5:
                            zbior2.clear(); break;
                        case 0:
                            break;
                    }
                    break;
                case 3:
                    switch (UI.enterInteger(MENU + "==>> ")) {
                        case 1:
                            lista1.add(createAddress()); break;
                        case 2:
                            Address address = createAddress();
                            lista1.add(address);
                            lista1.add(address);
                            break;
                        case 3:
                            lista1.remove(createAddress()); break;
                        case 4:
                            System.out.println();
                            System.out.println("Zawartość ArrayList: ");
                            for(Address a: lista1){
                                System.out.println(a.getCity()+" "+a.getStreet()+" "+a.getHouseNumber());
                            }
                            break;
                        case 5:
                            lista1.clear(); break;
                        case 0:
                            break;
                    }
                    break;
                case 4:
                    switch (UI.enterInteger(MENU + "==>> ")) {
                        case 1:
                            lista2.add(createAddress()); break;
                        case 2:
                            Address address = createAddress();
                            lista2.add(address);
                            lista2.add(address);
                            break;
                        case 3:
                            lista2.remove(createAddress()); break;
                        case 4:
                            System.out.println();
                            System.out.println("Zawartość LinkedList: ");
                            for(Address a: lista2){
                                System.out.println(a.getCity()+" "+a.getStreet()+" "+a.getHouseNumber());
                            }
                            break;
                        case 5:
                            lista2.clear(); break;
                        case 0:
                            break;
                    }
                    break;
                case 5:
                    switch (UI.enterInteger(MENU + "==>> ")) {
                        case 1:
                            mapa1.put(i, createAddress()); i++; break;
                        case 2:
                            Address address = createAddress();
                            mapa1.put(i, address);
                            mapa1.put(i, address);
                            i++; break;
                        case 3:
                            int key = UI.enterInteger("Numer adresu do usunięcia(widoczne przy wyświetleniu): ");
                            mapa1.remove(key); break;
                        case 4:
                            System.out.println();
                            System.out.println("Zawartość HashMap: ");
                            for(Entry<Integer, Address> entry : mapa1.entrySet()){
                                System.out.println(entry.getKey()+" "+entry.getValue().getCity()+" "+entry.getValue().getStreet()+" "+entry.getValue().getHouseNumber());
                            }
                            break;
                        case 5:
                            mapa1.clear(); i=0; break;
                        case 0:
                            break;
                    }
                    break;
                case 6:
                    switch (UI.enterInteger(MENU + "==>> ")) {
                        case 1:
                            mapa2.put(j, createAddress()); j++; break;
                        case 2:
                            Address address = createAddress();
                            mapa2.put(j, address);
                            mapa2.put(j, address);
                            break;
                        case 3:
                            int key = UI.enterInteger("Numer adresu do usunięcia(widoczne przy wyświetleniu): ");
                            mapa2.remove(key); break;
                        case 4:
                            System.out.println();
                            System.out.println("Zawartość TreeMap: ");
                            for(Entry<Integer, Address> entry : mapa2.entrySet()){
                                System.out.println(entry.getKey()+" "+entry.getValue().getCity()+" "+entry.getValue().getStreet()+" "+entry.getValue().getHouseNumber());
                            }
                            break;
                        case 5:
                            mapa2.clear(); j=0; break;
                        case 0:
                            break;
                    }
                    break;
                case 0:
                    UI.printInfoMessage("Program zakończył działanie");
                    end = 1;
                    System.exit(0);
            }
        }
    }
}
