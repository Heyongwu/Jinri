package bwei.com.jinri;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

public class ChannelFragment extends Fragment {
    private String name;
    private String urlss;
    private ListView lv;

    private TextView tv;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        name = (String) bundle.get("name");
        urlss = (String) bundle.get("urlss");

    }

    @SuppressLint("StaticFieldLeak")
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item , null);
        tv = view.findViewById(R.id.tv);
//        new AsyncTask<String, Integer, String>() {
//            @Override
//            protected String doInBackground(String... params) {
//                String s = params[0];
//                String getpp = new HttpUrl().getpp(s);
//                return getpp;
//            }
//
//            @Override
//            protected void onPostExecute(String s) {
//                super.onPostExecute(s);
//                Bean bean = new Gson().fromJson(s, Bean.class);
//                String message = bean.getMessage();
//                tv.setText(message);
//            }
//        }.execute(urlss);
        return view;
    }
}
