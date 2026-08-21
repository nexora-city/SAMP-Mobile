package com.rockstargames.oswrapper;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public abstract class DownloaderActivityBase extends AppCompatActivity {

    protected abstract DownloaderConfig getConfig();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onDownloadComplete();
    }

    private void onDownloadComplete() {
        finish();
    }
}
