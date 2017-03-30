package br.com.fiap.broadcastreceiverenotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MeuBroadcast extends BroadcastReceiver {
    public MeuBroadcast() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, R.string.broadcast_recebido, Toast.LENGTH_SHORT).show();

        //Log.i("MeuLOG", "dsadsadsadsa");
    }
}
