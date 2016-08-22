package com.jmcafferata.correlativas;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class Orientacion implements Parcelable {

    public int id;
    public int numReq;
    public ArrayList<Materia> correlativas = new ArrayList<>();
    public ArrayList<Materia> materias = new ArrayList<>();
    public String buttonString;
    public int resID;
    public Materia[] materiasO;

    public Orientacion(int id) {
        this.id = id;
    }

    public Orientacion(int id, int numReq) {
        this.id = id;
        this.numReq = numReq;
        buttonString = "buttonO"+id;
    }

    public Orientacion(int id, int numReq, Materia m1) {
        this.id = id;
        this.numReq = numReq;
        this.correlativas.add(m1);
        buttonString = "buttonO"+id;
    }

    public Orientacion(int id, int numReq, Materia m1, Materia m2) {
        this.id = id;
        this.numReq = numReq;
        this.correlativas.add(m1);
        this.correlativas.add(m2);
        buttonString = "buttonO"+id;
    }

    public Orientacion(int id, int numReq, Materia m1, Materia m2, Materia m3) {
        this.id = id;
        this.numReq = numReq;
        this.correlativas.add(m1);
        this.correlativas.add(m2);
        this.correlativas.add(m3);
        buttonString = "buttonO"+id;
    }

    public Orientacion(int id, int numReq, Materia m1, Materia m2, Materia m3, Materia m4) {
        this.id = id;
        this.numReq = numReq;
        this.correlativas.add(m1);
        this.correlativas.add(m2);
        this.correlativas.add(m3);
        this.correlativas.add(m4);
        buttonString = "buttonO"+id;
    }

    public Orientacion(int id, int numReq, Materia m1, Materia m2, Materia m3, Materia m4, Materia m5) {
        this.id = id;
        this.numReq = numReq;
        this.correlativas.add(m1);
        this.correlativas.add(m2);
        this.correlativas.add(m3);
        this.correlativas.add(m4);
        this.correlativas.add(m5);
        buttonString = "buttonO"+id;
    }

    public Orientacion(int id, int numReq, Materia m1, Materia m2, Materia m3, Materia m4, Materia m5, Materia m6) {
        this.id = id;
        this.numReq = numReq;
        this.correlativas.add(m1);
        this.correlativas.add(m2);
        this.correlativas.add(m3);
        this.correlativas.add(m4);
        this.correlativas.add(m5);
        this.correlativas.add(m6);
        buttonString = "buttonO"+id;
    }

    public Orientacion(int id, int numReq, Materia m1, Materia m2, Materia m3, Materia m4, Materia m5, Materia m6, Materia m7) {
        this.id = id;
        this.numReq = numReq;
        this.correlativas.add(m1);
        this.correlativas.add(m2);
        this.correlativas.add(m3);
        this.correlativas.add(m4);
        this.correlativas.add(m5);
        this.correlativas.add(m6);
        this.correlativas.add(m7);
        buttonString = "buttonO"+id;
    }

    public Orientacion(int id, int numReq, Materia m1, Materia m2, Materia m3, Materia m4, Materia m5, Materia m6, Materia m7, Materia m8) {
        this.id = id;
        this.numReq = numReq;
        this.correlativas.add(m1);
        this.correlativas.add(m2);
        this.correlativas.add(m3);
        this.correlativas.add(m4);
        this.correlativas.add(m5);
        this.correlativas.add(m6);
        this.correlativas.add(m7);
        this.correlativas.add(m8);
        buttonString = "buttonO"+id;
    }

    public Orientacion(int id, int numReq, Materia m1, Materia m2, Materia m3, Materia m4, Materia m5, Materia m6, Materia m7, Materia m8, Materia m9) {
        this.id = id;
        this.numReq = numReq;
        this.correlativas.add(m1);
        this.correlativas.add(m2);
        this.correlativas.add(m3);
        this.correlativas.add(m4);
        this.correlativas.add(m5);
        this.correlativas.add(m6);
        this.correlativas.add(m7);
        this.correlativas.add(m8);
        this.correlativas.add(m9);
        buttonString = "buttonO"+id;
    }

    public Orientacion(int id, int numReq, Materia m1, Materia m2, Materia m3, Materia m4, Materia m5, Materia m6, Materia m7, Materia m8, Materia m9, Materia m10) {
        this.id = id;
        this.numReq = numReq;
        this.correlativas.add(m1);
        this.correlativas.add(m2);
        this.correlativas.add(m3);
        this.correlativas.add(m4);
        this.correlativas.add(m5);
        this.correlativas.add(m6);
        this.correlativas.add(m7);
        this.correlativas.add(m8);
        this.correlativas.add(m9);
        this.correlativas.add(m10);
        buttonString = "buttonO"+id;
    }

    // Métodos
    public void cursar(Carrera carrera) { // ACA PONER EL INTENT GET EXTRA!!
        carrera.orientacionesDisponiblesList.clear();
        System.out.println("Desaparecen las orientaciones");
        carrera.orientacionesCursadasList.addAll(carrera.orientacionesList);
        System.out.println("Todas orientaciones agregadas a OrientacionesCursadasList");
        carrera.orientacionesNoCursadasList.clear();
        System.out.println(this.id + " sacado de orientacionesNoCursadasList");
        carrera.materiasList.addAll(materias);
        System.out.println("Materias de la orientación " + id + " agregadas a MateriasList");
        carrera.noCursadasList.addAll(materias);
        System.out.println("Materias de la orientación " + id + " agregadas a noCursadasList");

        Correlativas.check(carrera);
    }

    public void addToArrays() {
        materias.addAll(Arrays.asList(materiasO));
    }

    @Override
    public String toString() {
        return "" + id; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Orientacion other = (Orientacion) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    // PARCELABLE IMPLEMENTATION

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeInt(numReq);
        parcel.writeTypedList(correlativas);
        parcel.writeTypedList(materias);
        parcel.writeString(buttonString);
        parcel.writeInt(resID);
        parcel.writeTypedArray(materiasO,PARCELABLE_WRITE_RETURN_VALUE);
    }

    public static final Creator<Orientacion> CREATOR = new Creator<Orientacion>() {
        @Override
        public Orientacion createFromParcel(Parcel in) {
            return new Orientacion(in);
        }

        @Override
        public Orientacion[] newArray(int size) {
            return new Orientacion[size];
        }
    };

    public Orientacion(Parcel in) {
        id = in.readInt();
        numReq = in.readInt();
        correlativas = in.createTypedArrayList(Materia.CREATOR);
        materias= in.createTypedArrayList(Materia.CREATOR);
        buttonString = in.readString();
        resID = in.readInt();
        materiasO = in.createTypedArray(Materia.CREATOR);
    }
} // Fin de class Orientacion

