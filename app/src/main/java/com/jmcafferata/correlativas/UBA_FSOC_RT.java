package com.jmcafferata.correlativas;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class UBA_FSOC_RT extends Carrera {

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

    Materia _901 = new Materia(1,0);
    Materia _925 = new Materia(2,0);
    Materia _926 = new Materia(3,0,_925);
    Materia _903 = new Materia(4,0);
    Materia _904 = new Materia(5,0,_903);
    Materia _905 = new Materia(6,0);
    Materia _927 = new Materia(7,0);
    Materia _928 = new Materia(8,0,_927);
    Materia _907 = new Materia(9,0,_926);
    Materia _908 = new Materia(10,0);
    Materia _909 = new Materia(11,0,_905);
    Materia _910 = new Materia(12,0,_904,_928);
    Materia _911 = new Materia(13,0,_910);
    Materia _912 = new Materia(14,0,_928);
    Materia _913 = new Materia(15,0,_903);
    Materia _914 = new Materia(16,0,_909);
    Materia _915 = new Materia(17,0,_908,_926,_928);
    Materia _916 = new Materia(18,0,_907,_914);
    Materia _917 = new Materia(19,0,_907,_909);
    Materia _918 = new Materia(20,0,_901);
    Materia _919 = new Materia(21,0,_911,_912,_913,_918);
    Materia _920 = new Materia(22,0,_901,_913,_928);
    Materia _921 = new Materia(23,0,_914,_916);
    Materia _922 = new Materia(24,0,_915);
    Materia _o1 = new Materia(25,0,_917,_919,_921,_922);
    Materia _o2 = new Materia(26,0,_917,_919,_921,_922);
    Materia _i = new Materia(27,6);
    public UBA_FSOC_RT(String nombre){
        materias = new Materia[] {
                _901, _925, _926, _903, _904, _905, _927, _928, _907, _908, _909, _910, _911, _912, _913, _914, _915, _916, _917, _918, _919, _920, _921, _922, _o1, _o2, _i,
        };
        materiasTodas = new Materia[] {
                _901, _925, _926, _903, _904, _905, _927, _928, _907, _908, _909, _910, _911, _912, _913, _914, _915, _916, _917, _918, _919, _920, _921, _922, _o1, _o2, _i,
        };
        orientaciones = new Orientacion[]{

        };
        addToArrays();
        this.nombre = nombre;
    }
}