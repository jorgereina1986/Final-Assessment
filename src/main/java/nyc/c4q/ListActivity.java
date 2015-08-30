package nyc.c4q;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;


public class ListActivity extends Activity {

    public ListView list;
    Button nameButton;
    TextView txtName;
    TextView txtHouse;
    ArrayList<Person> person;

//    public static final Person[] PEOPLE = {
//            new Person("Hannah", "Abbott", House.Hufflepuff),
//            new Person("Katie", "Bell", House.Gryffindor),
//            new Person("Susan", "Bones", House.Hufflepuff),
//            new Person("Terry", "Boot", House.Ravenclaw),
//            new Person("Lavender", "Brown", House.Gryffindor),
//            new Person("Cho", "Chang", House.Ravenclaw),
//            new Person("Michael", "Corner", House.Ravenclaw),
//            new Person("Colin", "Creevey", House.Gryffindor),
//            new Person("Marietta", "Edgecombe", House.Ravenclaw),
//            new Person("Justin", "Finch-Fletchley", House.Hufflepuff),
//            new Person("Seamus", "Finnigan", House.Gryffindor),
//            new Person("Anthony", "Goldstein", House.Ravenclaw),
//            new Person("Hermione", "Granger", House.Gryffindor),
//            new Person("Angelina", "Johnson", House.Gryffindor),
//            new Person("Lee", "Jordan", House.Gryffindor),
//            new Person("Neville", "Longbottom", House.Gryffindor),
//            new Person("Luna", "Lovegood", House.Ravenclaw),
//            new Person("Ernie", "Macmillan", House.Hufflepuff),
//            new Person("Parvati", "Patil", House.Gryffindor),
//            new Person("Padma", "Patil", House.Ravenclaw),
//            new Person("Harry", "Potter", House.Gryffindor),
//            new Person("Zacharias", "Smith", House.Hufflepuff),
//            new Person("Alicia", "Spinnet", House.Gryffindor),
//            new Person("Dean", "Thomas", House.Gryffindor),
//            new Person("Fred", "Weasley", House.Gryffindor),
//            new Person("George", "Weasley", House.Gryffindor),
//            new Person("Ginny", "Weasley", House.Gryffindor),
//            new Person("Ron", "Weasley", House.Gryffindor)
//    };

    public static final Person[] PEOPLE = {
            new Person("Hannah", "Abbott", House.Hufflepuff, Color.parseColor("#990000")),
            new Person("Katie", "Bell", House.Gryffindor, Color.parseColor("#d32f2f")),
            new Person("Susan", "Bones", House.Hufflepuff, Color.parseColor("#d32f2f")),
            new Person("Terry", "Boot", House.Ravenclaw, Color.parseColor("#d32f2f")),
            new Person("Lavender", "Brown", House.Gryffindor, Color.parseColor("#d32f2f")),
            new Person("Cho", "Chang", House.Ravenclaw, Color.parseColor("#d32f2f")),
            new Person("Michael", "Corner", House.Ravenclaw, Color.parseColor("#d32f2f")),
            new Person("Colin", "Creevey", House.Gryffindor, Color.parseColor("#d32f2f")),
            new Person("Marietta", "Edgecombe", House.Ravenclaw, Color.parseColor("#d32f2f")),
            new Person("Justin", "Finch-Fletchley", House.Hufflepuff, Color.parseColor("#d32f2f")),
            new Person("Seamus", "Finnigan", House.Gryffindor, Color.parseColor("#d32f2f")),
            new Person("Anthony", "Goldstein", House.Ravenclaw, Color.parseColor("#d32f2f")),
            new Person("Hermione", "Granger", House.Gryffindor, Color.parseColor("#d32f2f")),
            new Person("Angelina", "Johnson", House.Gryffindor, Color.parseColor("#d32f2f")),
            new Person("Lee", "Jordan", House.Gryffindor, Color.parseColor("#d32f2f")),
            new Person("Neville", "Longbottom", House.Gryffindor, Color.parseColor("#d32f2f")),
            new Person("Luna", "Lovegood", House.Ravenclaw, Color.parseColor("#d32f2f")),
            new Person("Ernie", "Macmillan", House.Hufflepuff, Color.parseColor("#d32f2f")),
            new Person("Parvati", "Patil", House.Gryffindor, Color.parseColor("#d32f2f")),
            new Person("Padma", "Patil", House.Ravenclaw, Color.parseColor("#d32f2f")),
            new Person("Harry", "Potter", House.Gryffindor, Color.parseColor("#d32f2f")),
            new Person("Zacharias", "Smith", House.Hufflepuff, Color.parseColor("#d32f2f")),
            new Person("Alicia", "Spinnet", House.Gryffindor, Color.parseColor("#d32f2f")),
            new Person("Dean", "Thomas", House.Gryffindor, Color.parseColor("#d32f2f")),
            new Person("Fred", "Weasley", House.Gryffindor, Color.parseColor("#d32f2f")),
            new Person("George", "Weasley", House.Gryffindor, Color.parseColor("#d32f2f")),
            new Person("Ginny", "Weasley", House.Gryffindor, Color.parseColor("#d32f2f")),
            new Person("Ron", "Weasley", House.Gryffindor, Color.parseColor("#d32f2f"))
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        populateList();

    }

    public void populateList() {

        person = new ArrayList<>(Arrays.asList(PEOPLE));
        final CustomAdapter adapter = new CustomAdapter(this, R.layout.listitem_member, person);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

    }

//    public void switchName() {
//        person = new ArrayList<>(Arrays.asList(PEOPLE2));
//        CustomAdapter2 adapter = new CustomAdapter2(this, R.layout.listitem_member, person);
//        list = (ListView) findViewById(R.id.list);
//        list.setAdapter(adapter);
//    }

}
