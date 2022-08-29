package io.antmedia.rtmp_client.test;

import android.app.Activity;
import android.os.Bundle;

import io.antmedia.rtmp_client.RTMPMuxer;

public class MainActivity extends Activity {

    private RTMPMuxer rtmpMuxer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rtmpMuxer = new RTMPMuxer();
        rtmpMuxer.open("rtmp://175.178.162.8/live/livestream?secret=7c497b06",540, 960);
        rtmpMuxer.isConnected();

    }
}
