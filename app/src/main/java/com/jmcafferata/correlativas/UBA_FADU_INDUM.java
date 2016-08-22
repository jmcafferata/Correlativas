
package com.jmcafferata.correlativas;

import android.os.Parcel;

public class UBA_FADU_INDUM extends Carrera{

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

    Materia _dit = new Materia(1,0);
    Materia _me1 = new Materia(2,0);
    Materia _tp = new Materia(3,0);
    Materia _soc = new Materia(4,0);
    Materia _ifd = new Materia(5,0);
    Materia _di1 = new Materia(6,0,_dit,_me1);
    Materia _dt1 = new Materia(7,0,_dit,_me1);
    Materia _me2 = new Materia(8,0,_me1);
    Materia _tpi1 = new Materia(9,0,_dit,_me1,_tp);
    Materia _tpt1 = new Materia(10,0,_dit,_me1,_tp);
    Materia _h1 = new Materia(11,0,_soc,_ifd);
    Materia _h2 = new Materia(12,0,_h1,_soc,_ifd);
    Materia _mo1 = new Materia(13,0,_dit,_me1);
    Materia _di2 = new Materia(14,0,_di1,_me2,_soc,_tp,_ifd);
    Materia _dypi = new Materia(15,0,_di2);
    Materia _dt2 = new Materia(16,0,_dt1,_me2,_soc,_tp,_ifd);
    Materia _dypt = new Materia(17,0,_dt2);
    Materia _tpi2 = new Materia(18,0,_dit,_me1,_soc,_tp,_ifd,_tpi1);
    Materia _tpt2 = new Materia(19,0,_dit,_me1,_soc,_tp,_ifd,_tpi1);
    Materia _da = new Materia(20,0,_di1,_me1,_soc,_tp,_ifd,_tpi1,_h1,_h2);
    Materia _com1 = new Materia(21,0,_dit,_me1,_soc,_tp,_ifd,_h1,_h2);
    Materia _com2 = new Materia(22,0,_dit,_me1,_soc,_tp,_ifd,_com1);
    Materia _comyc = new Materia(23,0,_dit,_me1,_soc,_tp,_ifd,_h1,_h2);
    Materia _e = new Materia(24,0,_dit,_me1,_soc,_tp,_ifd,_h1,_h2);
    Materia _mo2 = new Materia(25,0,_dit,_me2);
    public UBA_FADU_INDUM(String nombre){
        materias = new Materia[] {
                _dit, _me1, _tp, _soc, _ifd, _di1, _dt1, _me2, _tpi1, _tpt1, _h1, _h2, _mo1, _di2, _dypi, _dt2, _dypt, _tpi2, _tpt2, _da, _com1, _com2, _comyc, _e, _mo2,
        };
        materiasTodas = new Materia[] {
                _dit, _me1, _tp, _soc, _ifd, _di1, _dt1, _me2, _tpi1, _tpt1, _h1, _h2, _mo1, _di2, _dypi, _dt2, _dypt, _tpi2, _tpt2, _da, _com1, _com2, _comyc, _e, _mo2,
        };
        orientaciones = new Orientacion[]{

        };
        addToArrays();
        this.nombre = nombre;
    }
}