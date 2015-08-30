package nyc.c4q;

/**
 * Created by c4q-jorgereina on 8/30/15.
 */
public class Person2 {
    public String firstName;
    public String lastName;
    public House house;

    public Person2(String lastName, String firstName, House house) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.house     = house;
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
