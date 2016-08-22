
package com.jmcafferata.correlativas;

import android.os.Parcel;

public class UBA_EXACTAS_QUIMICA extends Carrera{
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

    public UBA_EXACTAS_QUIMICA(String nombre){
        Materia _qgel1 = new Materia(1,0);
        Materia _am1 = new Materia(2,0);
        Materia _qgel2 = new Materia(3,0);
        _qgel2.addTPCorrelativas(_qgel1);
        Materia _am2 = new Materia(4,0);
        _am2.addTPCorrelativas(_am1);
        Materia _qa = new Materia(5,0,_qgel1);
        _qa.addTPCorrelativas(_qgel2);
        Materia _qo1 = new Materia(6,0,_qgel1);
        Materia _f1 = new Materia(7,0);
        Materia _qo2 = new Materia(8,0,_qgel2);
        Materia _f2 = new Materia(9,0);
        Materia _qb = new Materia(10,0,_qo1);
        Materia _qf1 = new Materia(11,0,_qgel2,_am2,_f1);
        Materia _e = new Materia(12,0);
        Materia _qf2 = new Materia(13,0,_f2);
        Materia _mgel = new Materia(14,0,_qb);
        Materia _ai = new Materia(15,0,_qa,_qb,_qo2);
        Materia _qi = new Materia(16,0,_am1,_f1);
        Materia _cqia = new Materia(17,0,_f2,_qa);
        Materia _b = new Materia(18,0,_qa,_qo2);
        Materia _e1 = new Materia(19,16);
        Materia _afo = new Materia(20,0);
        Materia _tql = new Materia(21,0,_qa,_qb,_qo2);
        Materia _o2 = new Materia(22,0,_e1);
        materias = new Materia[] {
                _qgel1, _am1, _qgel2, _am2, _qa, _qo1, _f1, _qo2, _f2, _qb, _qf1, _e, _qf2, _mgel, _ai, _qi, _cqia, _b, _e1, _afo, _tql, _o2,
        };
        materiasTodas = new Materia[] {
                _qgel1, _am1, _qgel2, _am2, _qa, _qo1, _f1, _qo2, _f2, _qb, _qf1, _e, _qf2, _mgel, _ai, _qi, _cqia, _b, _e1, _afo, _tql, _o2,
        };
        orientaciones = new Orientacion[]{

        };
        addToArrays();

        _qo1.addTPCorrelativas(_qgel2);
        _f1.addTPCorrelativas(_am1);
        _qo2.addTPCorrelativas(_qgel2);
        _f2.addTPCorrelativas(_am2,_f1);
        _qb.addTPCorrelativas(_qo2,_qa);
        _qf1.addTPCorrelativas(_f2,_qa,_qo1);
        _e.addTPCorrelativas(_am1);
        _qf2.addTPCorrelativas(_qf1);
        _ai.addTPCorrelativas(_qf1,_e);
        _qi.addTPCorrelativas(_am2,_qo2,_qa);
        _cqia.addTPCorrelativas(_qf1);
        _b.addTPCorrelativas(_qb);
        _afo.addTPCorrelativas(_ai);


        System.out.println(_qgel2.TPcorrelativas);
        TP=true;
        this.nombre = nombre;
    }

}