
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

public class UBA_FADU_INDUSTRIAL extends Carrera {

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

    Materia _di1 = new Materia(1,0);
    Materia _t1 = new Materia(2,0);
    Materia _m = new Materia(3,0);
    Materia _mat = new Materia(4,0);
    Materia _f1 = new Materia(5,0);
    Materia _idam = new Materia(6,0);
    Materia _di2 = new Materia(7,0,_di1,_m,_t1);
    Materia _t2 = new Materia(8,0,_t1,_mat,_f1);
    Materia _me1 = new Materia(9,0,_di1,_m);
    Materia _hdi = new Materia(10,0,_di1,_m,_idam);
    Materia _f2 = new Materia(11,0,_mat,_f1);
    Materia _erg = new Materia(12,0,_di1,_f1);
    Materia _di3 = new Materia(13,0,_di2,_me1,_t2,_hdi,_erg);
    Materia _t3 = new Materia(14,0,_m,_t1,_mat,_f1,_idam,_t2,_f2);
    Materia _me2 = new Materia(15,0,_di2,_me1,_t1,_mat,_f1,_idam);
    Materia _ap = new Materia(16,0,_di2,_me1,_t1,_mat,_f1,_idam,_t2,_hdi,_erg);
    Materia _ia = new Materia(17,0,_di1,_t1,_m,_mat,_f1,_idam);
    Materia _mo1 = new Materia(18,0,_di2,_t1,_m,_mat,_f1,_idam);
    Materia _di4 = new Materia(19,0,_di3,_me2,_ap,_t2,_hdi,_f2,_erg,_t3,_mo1);
    Materia _di5 = new Materia(20,0,_di4);
    Materia _t4 = new Materia(21,0,_ap,_t2,_me1,_hdi,_f2,_erg,_t3,_ia);
    Materia _sad = new Materia(22,0,_di2,_t2,_me1,_hdi,_f2,_erg);
    Materia _met = new Materia(23,0,_di3,_t2,_ap,_hdi,_f2,_erg,_me1);
    Materia _l = new Materia(24,0,_di2,_t2,_me1,_hdi,_f2,_erg);
    Materia _mo2 = new Materia(25,0,_di3,_t2,_ap,_hdi,_f2,_erg,_me1,_mo1);
    public UBA_FADU_INDUSTRIAL(String nombre){
        materias = new Materia[] {
                _di1, _t1, _m, _mat, _f1, _idam, _di2, _t2, _me1, _hdi, _f2, _erg, _di3, _t3, _me2, _ap, _ia, _mo1, _di4, _di5, _t4, _sad, _met, _l, _mo2,
        };
        materiasTodas = new Materia[] {
                _di1, _t1, _m, _mat, _f1, _idam, _di2, _t2, _me1, _hdi, _f2, _erg, _di3, _t3, _me2, _ap, _ia, _mo1, _di4, _di5, _t4, _sad, _met, _l, _mo2,
        };
        orientaciones = new Orientacion[]{

        };
        addToArrays();
        this.nombre = nombre;
    }



}
