package com.jmcafferata.correlativas;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Arrays;

public class Materia implements Parcelable{


    public int id;
    public ArrayList<Materia> correlativas = new ArrayList<>();
    public ArrayList<Materia> finalCorrelativas = new ArrayList<>();
    public ArrayList<Materia> TPcorrelativas = new ArrayList<>();
    public int numReq;
    public String buttonString;
    public int resID;
    public boolean finalDisponible = false;


    //Constructor
    public Materia(int id, int numReq) {
        this.id = id;
        this.numReq = numReq;
        buttonString = "button"+id;
    }

    public Materia(int id, int numReq, Materia... m1) {
        this.id = id;
        this.numReq = numReq;
        this.correlativas.addAll(Arrays.asList(m1));
        buttonString = "button"+id;
    }

    // Métodos


    public void cursar(Carrera carrera){ // ACA PONER EL INTENT GET EXTRA!!
        carrera.cursadasList.add(this);
        carrera.noCursadasList.remove(this);
        carrera.disponiblesList.remove(this);
        hacerTP(carrera);
        Correlativas.check(carrera);
    }

    public void hacerTP(Carrera carrera){
        if (!carrera.TPList.contains(this))
        carrera.TPList.add(this);
        carrera.disponiblesList.remove(this);
        this.finalDisponible = true;
        Correlativas.check(carrera);

    }

    @Override
    public String toString() {
        return ""+id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.id;
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
        final Materia other = (Materia) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    // PARCELABLE IMPLEMENTATION



    public Materia(Parcel in) {
        id = in.readInt();
        correlativas = in.createTypedArrayList(Materia.CREATOR);
        TPcorrelativas = in.createTypedArrayList(Materia.CREATOR);
        numReq = in.readInt();
        buttonString = in.readString();
        resID = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeTypedList(correlativas);
        dest.writeTypedList(TPcorrelativas);
        dest.writeInt(numReq);
        dest.writeString(buttonString);
        dest.writeInt(resID);
    }

    public void addTPCorrelativas(Materia... TPmaterias){
        TPcorrelativas.addAll(Arrays.asList(TPmaterias));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Materia> CREATOR = new Creator<Materia>() {
        @Override
        public Materia createFromParcel(Parcel in) {
            return new Materia(in);
        }

        @Override
        public Materia[] newArray(int size) {
            return new Materia[size];
        }
    };


} // Fin de clase Materia

