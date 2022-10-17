package com.nybsys.locationservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LocationService extends Service implements ILocationService{
    public LocationService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new LocationServiceBinder(this);
    }

    @Override
    public void startLocationTracking() {

    }

    @Override
    public void stopLocationTracking() {

    }
}