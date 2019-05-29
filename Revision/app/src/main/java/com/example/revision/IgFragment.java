package com.example.revision;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class IgFragment extends Fragment {


    public IgFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View z= inflater.inflate(R.layout.fragment_ig, container, false);
        WebView a;
        a=(WebView)z.findViewById(R.id.web);

        String url="https://www.instagram.com";

        a.getSettings().setJavaScriptEnabled(true);
        a.getSettings().setLoadsImagesAutomatically(true);
        a.getSettings().setLoadWithOverviewMode(true);
        a.getSettings().setUseWideViewPort(true);
        a.getSettings().setBuiltInZoomControls(true);
        a.setWebViewClient(new WebViewClient());
        a.loadUrl(url);



        return z;
    }

}
