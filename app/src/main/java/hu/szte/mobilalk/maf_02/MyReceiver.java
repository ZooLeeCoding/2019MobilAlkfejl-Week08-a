package hu.szte.mobilalk.maf_02;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        StringBuilder stb = new StringBuilder();
        stb.append("Action: " + intent.getAction());
        stb.append("URI: " + intent.toUri(Intent.URI_INTENT_SCHEME) + "\n");
        String log = stb.toString();
        Toast.makeText(context, log, Toast.LENGTH_SHORT).show();
    }
}
