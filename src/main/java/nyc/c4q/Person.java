package nyc.c4q;

/**
 * Created by c4q-jorgereina on 8/30/15.
 */
public class Person {
    public String firstName;
    public String lastName;
    public House house;
    public int hexValue;

    public Person(String firstName, String lastName, House house, int hexValue) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.house = house;
        this.hexValue = hexValue;

    }


    public int getHexValue() {
        return hexValue;
    }

    public void setHexValue(int hexValue) {
        this.hexValue = hexValue;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }


}
