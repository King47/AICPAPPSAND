package com.example.ramadan;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.preference.PreferenceManager;

public class Notifi_Adhan extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent arg1) {

		SharedPreferences getPrefs = PreferenceManager
				.getDefaultSharedPreferences(context);
		boolean AdhanNotifi = getPrefs.getBoolean("check", true);
		if (AdhanNotifi == true) {

			NotificationManager notificationManager = (NotificationManager) context
					.getSystemService(Context.NOTIFICATION_SERVICE);
			Intent iNot = new Intent(context, Notifi_Adhan.class);
			PendingIntent piNot = PendingIntent
					.getActivity(context, 0, iNot, 0);

			Notification n = new Notification(R.drawable.backi, "اذان المغرب",
					System.currentTimeMillis());
			n.setLatestEventInfo(
					context,
					"اذان المغرب",
					"حان الآن موعد اذان المغرب حسب التوقيت المحلي لمدينة بيروت",
					piNot);
			n.sound = Uri.parse("android.resource://"
					+ context.getPackageName() + "/"
					+ R.raw.athan_muhammad_elkheir);
			n.flags = Notification.FLAG_AUTO_CANCEL;
			notificationManager.notify(0, n);
		}
	}
}