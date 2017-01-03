package com.mgabrynowicz.asynctaskexercisegsoncities;

import android.os.AsyncTask;

import com.google.gson.Gson;
import com.mgabrynowicz.asynctaskexercisegsoncities.Model.IpInfo;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by RENT on 2017-01-03.
 */

public class GetIpInfoAsyncTask extends AsyncTask<String, Void, IpInfo> {


    private InfoDownloadedListener infoDownloadedListener;
    private Gson gson;

    public GetIpInfoAsyncTask(InfoDownloadedListener infoDownloadedListener) {
        this.infoDownloadedListener = infoDownloadedListener;
        this.gson = new Gson();
    }

    @Override
    protected IpInfo doInBackground(String... strings) {
        String ip = strings[0];
        String url = getURLFromIp(ip);

        try {
            String json = getJsonFromUrl(url);
            IpInfo ipInfo = gson.fromJson(json, IpInfo.class);
            return ipInfo;



        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return null;
    }


    private String getURLFromIp(String ip) {

        StringBuilder url = new StringBuilder();
        url.append("http://geo.groupkt.com/ip/");
        url.append(ip);
        url.append("/json");
        return url.toString();


    }


    private String getJsonFromUrl(String urlText) throws MalformedURLException {

        URL url = new URL(urlText);
        try {
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream stream = connection.getInputStream();
            String jsonText = IOUtils.toString(stream);
            return jsonText;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;


    }

    @Override
    protected void onPostExecute(IpInfo ipInfo) {

        infoDownloadedListener.onInfoDownloaded(ipInfo);


    }

    public interface InfoDownloadedListener {

        void onInfoDownloaded(IpInfo ipInfo);
    }
}
