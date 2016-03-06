package com.solderbyte.openfit;

import android.os.Parcel;
import android.os.Parcelable;

public class SleepResultRecord implements Parcelable {

    private long startTimeStamp;
    private long endTimeStamp;
    private float efficiency;
    private int index;
    private int len;

    public SleepResultRecord(long st, long et, float e, int i, int l) {
        startTimeStamp = st;
        endTimeStamp = et;
        efficiency = e;
        index = i;
        len = l;
    }

    public SleepResultRecord(Parcel source) {
        startTimeStamp = source.readLong();
        endTimeStamp = source.readLong();
        efficiency = source.readFloat();
        index = source.readInt();
        len = source.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel source, int flags) {
        source.writeLong(startTimeStamp);
        source.writeLong(endTimeStamp);
        source.writeFloat(efficiency);
        source.writeInt(index);
        source.writeInt(len);
    }

    public static final Creator<SleepResultRecord> CREATOR = new Creator<SleepResultRecord>() {
        public SleepResultRecord createFromParcel(Parcel source) {
            return new SleepResultRecord(source);
        }

        @Override
        public SleepResultRecord[] newArray(int size) {
            return new SleepResultRecord[size];
        }
    };

    public long getStartTimeStamp() {
        return startTimeStamp;
    }

    public long getEndTimeStamp() {
        return endTimeStamp;
    }

    public float getEfficiency() { return efficiency; }

    public int getIndex() {
        return index;
    }

    public int getLen() {
        return len;
    }
}
