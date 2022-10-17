package com.nybsys.locationservice;

import android.app.Service;
import android.os.Binder;

import androidx.annotation.Nullable;

public class LocationServiceBinder extends Binder {
   private LocationService locationService;

    public LocationServiceBinder( LocationService locationService) {
        this.locationService = locationService;
    }

    public ILocationService getLocationService() {
        return locationService;
    }
}
