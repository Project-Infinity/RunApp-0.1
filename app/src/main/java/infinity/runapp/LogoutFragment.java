package infinity.runapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by adc on 3/9/15.
 */
public class LogoutFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.logout_layout,container,false);

        InfinityDBHandler infinityDB = new InfinityDBHandler(getActivity(), null, null, 1);

        infinityDB.restartUserTable();

        User user = new User();

        Intent intent = new Intent(getActivity(), LoginActivity.class);
        startActivity(intent);

        Toast.makeText(getActivity(), "Logged Out", Toast.LENGTH_LONG).show();

        return v;
    }

}
