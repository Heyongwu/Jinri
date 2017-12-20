package bwei.com.jinri;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUrl {
    public String getpp(String ss){
        URL url = null;
        HttpURLConnection httpURLConnection = null;
        String pp = "";
        try {
            url= new URL(ss);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            int code = httpURLConnection.getResponseCode();
            if (code == 200){
                InputStream inputStream = httpURLConnection.getInputStream();
                byte [] b = new byte[1024];
                int len = 0;
                while ((len = inputStream.read(b))!=-1){
                    pp += new String(b,0,len);
                }
                inputStream.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return pp;
    }
}