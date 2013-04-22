package fitnessapps.acceltest.activity;



import java.util.Date;

import fitnessapps.acceltest.activity.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AccelerometerTestingActivity extends Activity {

	private boolean started;
	//EditText inputField;
	
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		started = false;
		/*manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		manager.requestLocationUpdates(LocationManager.GPS_PROVIDER,
				MINIMUM_TIME_BETWEEN_UPDATES,
				MINIMUM_DISTANCE_CHANGE_FOR_UPDATES, new MyLocationListener());*/
	}
	
	public void startButtonClicked(View view) {
		if (started) {
			Toast.makeText(AccelerometerTestingActivity.this, "Service already started", Toast.LENGTH_SHORT).show();
		}
	
		Intent serviceIntent = new Intent();
		serviceIntent.putExtra("IDNUMBER", String.valueOf(System.currentTimeMillis()));
		serviceIntent.setClassName("fitnessapps.acceltest.activity", "fitnessapps.acceltest.activity.AccelerometerService");
		startService(serviceIntent);
		started = true;
	}
	
	public void stopButtonClicked(View view) {
		if (!started) {
            Toast.makeText(AccelerometerTestingActivity.this, "Service not yet started", Toast.LENGTH_SHORT).show();
      } else {
            Intent serviceIntent = new Intent();
            serviceIntent.setClassName("fitnessapps.acceltest.activity", "fitnessapps.acceltest.activity.AccelerometerService");
            stopService(serviceIntent);
            started = false;
      }
	}
	
	/* Function to include in any game checking for service
	 * private boolean isAccelServiceRunning() {
	    ActivityManager manager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
	    for (RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
	        if ("fitnessapps.acceltest.activity.AccelerometerService".equals(service.service.getClassName())) {
	        	return true;
	        }
	    }
	    return false;
	}
	 */

	/*
	private class MyLocationListener implements LocationListener {

		public void onLocationChanged(Location loc) {
			Location location = manager
					.getLastKnownLocation(LocationManager.GPS_PROVIDER);

			if (location != null) {
				TextView view = (TextView) findViewById(R.id.gpsstats);
				double lat = location.getLatitude();
				double longitude = location.getLongitude();
				float accuracy = location.getAccuracy();;
				
				view.setText("Current Location \n Longitude: " + longitude + "\n Latitude: " + lat + "\n Accuracy: " + accuracy);
			}

		}

		public void onProviderDisabled(String arg0) {
			// TODO Auto-generated method stub

		}

		public void onProviderEnabled(String provider) {
			// TODO Auto-generated method stub

		}

		public void onStatusChanged(String provider, int status, Bundle extras) {
			// TODO Auto-generated method stub

		}
	} */
	
	public void onBackPressed() {
		moveTaskToBack(true);
	}
	
}