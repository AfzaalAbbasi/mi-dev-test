package com.mi.afzaal.showcaseapplication;


import com.mi.afzaal.models.DeviceData;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by F ABBASI on 1/21/2016.
 */
public interface OnDataReceivedListener {

    void setNetworkError();
    void onsuccess();
    void setData(ArrayList<DeviceData> devicedata);
}
