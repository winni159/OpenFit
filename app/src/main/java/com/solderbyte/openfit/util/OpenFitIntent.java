package com.solderbyte.openfit.util;

public class OpenFitIntent {
    public static final String INTENT_UI_ADDAPPLICATION = "com.solderbyte.openfit.ui.addapplication";
    public static final String INTENT_UI_DELAPPLICATION = "com.solderbyte.openfit.ui.delapplication";
    public static final String INTENT_UI_BT = "com.solderbyte.openfit.ui.bt";
    public static final String INTENT_SERVICE_START = "com.solderbyte.openfit.service.start";
    public static final String INTENT_SERVICE_STOP = "com.solderbyte.openfit.service.stop";
    public static final String INTENT_SERVICE_NOTIFICATION = "com.solderbyte.openfit.service.notification";
    public static final String INTENT_SERVICE_NOTIFICATION_APPLICATIONS = "com.solderbyte.openfit.service.notification.applications";
    public static final String INTENT_SERVICE_BT = "com.solderbyte.openfit.service.bt";
    public static final String INTENT_SERVICE_SMS = "com.solderbyte.openfit.service.sms";
    public static final String INTENT_SERVICE_MMS = "com.solderbyte.openfit.service.mms";
    public static final String INTENT_SERVICE_PHONE = "com.solderbyte.openfit.service.phone";
    public static final String INTENT_SERVICE_PHONE_IDLE = "com.solderbyte.openfit.service.phone.idle";
    public static final String INTENT_SERVICE_PHONE_OFFHOOK = "com.solderbyte.openfit.service.phone.offhook";
    public static final String INTENT_SERVICE_MEDIA = "com.solderbyte.openfit.service.media";
    public static final String INTENT_SERVICE_WEATHER = "com.solderbyte.openfit.service.weather";
    public static final String INTENT_SERVICE_LOCATION = "com.solderbyte.openfit.service.location";
    public static final String INTENT_SERVICE_CRONJOB = "com.solderbyte.openfit.service.cronjob";
    public static final String INTENT_NOTIFICATION = "com.solderbyte.openfit.notification";
    public static final String INTENT_ANDROID_SMS = "android.provider.Telephony.SMS_RECEIVED";
    public static final String INTENT_ANDROID_MMS = "android.provider.Telephony.WAP_PUSH_RECEIVED";
    public static final String INTENT_GOOGLE_FIT = "com.solderbyte.openfit.google.fit";
    public static final String INTENT_GOOGLE_FIT_SYNC = "com.solderbyte.openfit.google.fit.sync";
    public static final String INTENT_GOOGLE_FIT_SYNC_STATUS = "com.solderbyte.openfit.google.fit.sync.status";
    public static final String INTENT_BILLING = "com.solderbyte.openfit.billing";
    public static final String INTENT_BILLING_VERIFIED = "com.solderbyte.openfit.billing.verified";
    public static final String INTENT_BILLING_NO_PURCHASE = "com.solderbyte.openfit.billing.nopurchase";
    public static final String INTENT_SERVICE_CALENDAR = "com.android.calendar";

    public static final String INTENT_EXTRA_MSG = "message";
    public static final String INTENT_EXTRA_DATA = "data";
    public static final String INTENT_EXTRA_INFO = "info";

    public static final String ACTION_ENABLE = "enable";
    public static final String ACTION_DISABLE = "disable";
    public static final String ACTION_TRUE = "true";
    public static final String ACTION_FALSE = "false";
    public static final String ACTION_SCAN = "scan";
    public static final String ACTION_SET_DEVICE = "setDevice";
    public static final String ACTION_SET_ENTRIES = "setEntries";
    public static final String ACTION_CONNECT = "connect";
    public static final String ACTION_DISCONNECT = "disconnect";
    public static final String ACTION_UI_STATUS = "status";
    public static final String ACTION_PHONE = "phone";
    public static final String ACTION_SMS = "sms";
    public static final String ACTION_TIME = "time";
    public static final String ACTION_WEATHER = "weather";
    public static final String ACTION_FITNESS = "fitness";

    public static final String DEFAULT = "DEFAULT";
    public static final String NONE = "none";
    public static final String EXTRA_DEVICE_NAME = "deviceName";
    public static final String EXTRA_DEVICE_ADDRESS = "deviceName";
    public static final String EXTRA_PACKAGE_NAME = "packageName";
    public static final String EXTRA_APP_NAME = "appName";
    public static final String EXTRA_SMS = "sms";
    public static final String EXTRA_PHONE = "phone";
    public static final String EXTRA_TIME = "time";
    public static final String EXTRA_WEATHER = "weather";
    public static final String EXTRA_WEATHER_ENTRY = "weatherEntry";
    public static final String EXTRA_WEATHER_VALUE = "weatherValue";
    public static final String EXTRA_FITNESS = "fitness";
    public static final String EXTRA_IS_ENABLED = "isEnabled";
    public static final String EXTRA_IS_ENABLED_FAILED = "isEnabledFailed";
    public static final String EXTRA_IS_CONNECTED = "isConnected";
    public static final String EXTRA_IS_DISCONNCTED = "isDisconnected";
    public static final String EXTRA_IS_CONNECTED_FAILED = "isConnectedFailed";
    public static final String EXTRA_IS_CONNECTED_RFCOMM = "isConnectedRfcomm";
    public static final String EXTRA_IS_DISCONNECTED_RFCOMM = "isDisconnectedRfComm";
    public static final String EXTRA_IS_CONNECTED_RFCOMM_FAILED = "isConnectedRfcommFailed";
    public static final String EXTRA_SCAN_STOPPED = "scanStopped";
    public static final String EXTRA_BLUETOOTH = "bluetooth";
    public static final String EXTRA_BLUETOOTH_DATA = "bluetoothData";
    public static final String EXTRA_BLUETOOTH_DEVICE = "bluetoothDevice";
    public static final String EXTRA_BLUETOOTH_DEVICE_LIST = "bluetoothDevicesList";
    public static final String EXTRA_BLUETOOTH_ENTRIES = "bluetoothEntries";
    public static final String EXTRA_BLUETOOTH_ENTRIES_VALUES = "bluetoothEntryValues";
    public static final String EXTRA_PEDOMETER_TOTAL = "pedometerTotal";
    public static final String EXTRA_PEDOMETER_LIST = "pedometerArrayList";
    public static final String EXTRA_PEDOMETER_DAILY_LIST = "pedometerDailyArrayList";
    public static final String EXTRA_EXERCISE_LIST = "exerciseDataList";
    public static final String EXTRA_SLEEP_LIST = "sleepList";
    public static final String EXTRA_SLEEP_INFO_LIST = "sleepInfoList";
    public static final String EXTRA_HEARTRATE_LIST = "heartRateList";
    public static final String EXTRA_PROFILE_DATA = "profileData";
    public static final String EXTRA_APPLICATIONS = "applications";
    public static final String EXTRA_APPLICATIONS_PACKAGE_NAME = "packageName";
    public static final String EXTRA_APPLICATIONS_APP_NAME = "appName";
}
