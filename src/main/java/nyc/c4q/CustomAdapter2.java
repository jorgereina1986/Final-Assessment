package nyc.c4q;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by c4q-jorgereina on 8/30/15.
 */
public class CustomAdapter2 extends ArrayAdapter<Person> {

    Context context;

    public CustomAdapter2(Context context, int resourceId,
                         List<Person> persons) {
        super(context, resourceId, persons);
        this.context = context;
    }

    /*private view holder class*/
    private class ViewHolder {
        TextView txtName;
        TextView txtHouse;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        Person rowItem = getItem(position);

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.listitem_member, null);
            holder = new ViewHolder();
            holder.txtName = (TextView) convertView.findViewById(R.id.text_name);
            holder.txtHouse = (TextView) convertView.findViewById(R.id.text_house);
            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        holder.txtName.setText(rowItem.getFirstName() + " " + rowItem.getLastName());
        holder.txtHouse.setText(rowItem.getHouse().toString());

        Person person = getItem(position);
        convertView.setBackgroundColor(person.getHexValue());


        return convertView;

    }


}

