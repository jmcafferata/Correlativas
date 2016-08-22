
package com.jmcafferata.correlativas;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class UBA_FIUBA_INDUSTRIAL extends Carrera {

    public static final Parcelable.Creator<Carrera> CREATOR = new Parcelable.Creator<Carrera>() {
        @Override
        public Carrera createFromParcel(Parcel in) {
            return new Carrera(in);
        }

        @Override
        public Carrera[] newArray(int size) {
            return new Carrera[size];
        }
    };

    Materia _8101 = new Materia(1,0);
    Materia _8301 = new Materia(2,0);
    Materia _8201 = new Materia(3,0);
    Materia _9203 = new Materia(4,0);
    Materia _8102 = new Materia(5,0);
    Materia _9501 = new Materia(6,0);
    Materia _8302 = new Materia(7,0,_8301);
    Materia _8202 = new Materia(8,0,_8201,_8101);
    Materia _8207 = new Materia(9,0,_8102,_8202);
    Materia _8538 = new Materia(10,0,_8102,_8202);
    Materia _8713 = new Materia(11,0);
    Materia _8405 = new Materia(12,0,_8101,_8102,_8201);
    Materia _8917 = new Materia(13,0,_8101,_8102,_8201);
    Materia _8109 = new Materia(14,0,_8101);
    Materia _9513 = new Materia(15,0,_9501,_8202,_8405);
    Materia _8712 = new Materia(16,0,_8713,_8405);
    Materia _8714 = new Materia(17,0,_8202);
    Materia _9201 = new Materia(18,0,_8405,_8302);
    Materia _9103 = new Materia(19,0,_8109,_9203);
    Materia _8717 = new Materia(20,0,_8714);
    Materia _9133 = new Materia(21,0,_8109);
    Materia _9202 = new Materia(22,0,_8714,_8917,_9201);
    Materia _9110 = new Materia(23,0,_8109,_9203);
    Materia _e1 = new Materia(24,0,_9203);
    Materia _9130 = new Materia(25,0,_9103,_9110);
    Materia _9701 = new Materia(26,0,_9110,_9202);
    Materia _9218 = new Materia(27,0,_9202);
    Materia _9124 = new Materia(28,0,_9133);
    Materia _9112 = new Materia(29,0,_9110,_9103);
    Materia _9107 = new Materia(30,0,_9112,_9513);
    Materia _9207 = new Materia(31,0,_8917,_9218);
    Materia _9204 = new Materia(32,0,_8712,_9201);
    Materia _9136 = new Materia(33,0,_9112);
    Materia _9128 = new Materia(34,0,_9124,_9112,_9202);
    Materia _e2 = new Materia(35,30);
    Materia _9131 = new Materia(36,0,_9107,_9130);
    Materia _9206 = new Materia(37,0,_9218,_8538);
    Materia _9205 = new Materia(38,0,_9110,_9701,_9204);
    Materia _9117 = new Materia(39,0,_9112);
    Materia _9120 = new Materia(40,0,_9128,_9130);
    Materia _e3 = new Materia(41,36);
    Materia _9219 = new Materia(42,0,_9204,_9206);
    Materia _9129 = new Materia(43,0,_9128);
    Materia _9127 = new Materia(44,0,_9131);
    Materia _9705 = new Materia(45,0,_9701,_9207);
    Materia _9200 = new Materia(46,0,_9120,_9207);
    Materia _e4 = new Materia(47,41);
    Materia _9134 = new Materia(48,0,_9129);
    Materia _9108 = new Materia(49,0,_9117);
    Materia _9122 = new Materia(50,0,_9128);
    Materia _e5 = new Materia(51,45);

    public UBA_FIUBA_INDUSTRIAL(String nombre){
        materias = new Materia[] {
                _8101, _8301, _8201, _9203, _8102, _9501, _8302, _8202, _8207, _8538, _8713, _8405, _8917, _8109, _9513, _8712, _8714, _9201, _9103, _8717, _9133, _9202, _9110, _e1, _9130, _9701, _9218, _9124, _9112, _9107, _9207, _9204, _9136, _9128, _e2, _9131, _9206, _9205, _9117, _9120, _e3, _9219, _9129, _9127, _9705, _9200, _e4, _9134, _9108, _9122, _e5,
        };
        materiasTodas = new Materia[] {
                _8101, _8301, _8201, _9203, _8102, _9501, _8302, _8202, _8207, _8538, _8713, _8405, _8917, _8109, _9513, _8712, _8714, _9201, _9103, _8717, _9133, _9202, _9110, _e1, _9130, _9701, _9218, _9124, _9112, _9107, _9207, _9204, _9136, _9128, _e2, _9131, _9206, _9205, _9117, _9120, _e3, _9219, _9129, _9127, _9705, _9200, _e4, _9134, _9108, _9122, _e5,
        };
        orientaciones = new Orientacion[]{

        };
        addToArrays();
        this.nombre = nombre;
    }





}
