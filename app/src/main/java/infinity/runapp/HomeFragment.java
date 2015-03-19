package infinity.runapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ADC on 2/9/2015.
 */
public class HomeFragment extends Fragment
{
    TextView mWelcome;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.home_layout,container,false);

        // get User Info
        String fname = getUserFName();
        // set Welcome message on Home Fragment
        mWelcome = (TextView) v.findViewById(R.id.welcome);
        mWelcome.setText("Welcome, " + fname + "!");

        return v;
    }

    public String getUserFName(){
        InfinityDBHandler dbHandler = new InfinityDBHandler(getActivity(), null, null, 1);

        User myUser = dbHandler.setUser();

        return String.valueOf(myUser.getFname());
    }
}
