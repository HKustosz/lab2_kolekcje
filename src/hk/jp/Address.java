package hk.jp;

import java.util.Objects;

public class Address implements Comparable<Address>{

    private String city;
    private String street;
    private int houseNumber;

    public Address(String city, String street, int houseNumber){
        setCity(city);
        setStreet(street);
        setHouseNumber(houseNumber);
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return getHouseNumber() == address.getHouseNumber() && Objects.equals(getCity(), address.getCity()) && Objects.equals(getStreet(), address.getStreet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity(), getStreet(), getHouseNumber());
    }

    @Override
    public int compareTo(Address o) {
        return street.compareTo(o.street);
    }
}
