
package com.jmcafferata.correlativas;

import android.os.Parcel;

public class UBA_EXACTAS_CQ extends Carrera{

    public static final Creator<Carrera> CREATOR = new Creator<Carrera>() {
        @Override
        public Carrera createFromParcel(Parcel in) {
            return new Carrera(in);
        }

        @Override
        public Carrera[] newArray(int size) {
            return new Carrera[size];
        }
    };


}