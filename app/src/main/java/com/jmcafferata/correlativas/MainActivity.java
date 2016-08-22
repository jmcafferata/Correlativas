package com.jmcafferata.correlativas;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.RemoteMessage;

public class MainActivity extends AppCompatActivity{
    private FirebaseAnalytics mFirebaseAnalytics;


    String SpinnerValueUBA;
    String SpinnerValueFSOC;
    String SpinnerValueDERECHO;
    String SpinnerValueFADU;
    String SpinnerValueFIUBA;
    String SpinnerValueEXACTAS;
    String SpinnerValuePSICO;
    Button GOTO;
    Intent intent;

    Spinner uba;
    Spinner derecho;
    Spinner exactas;
    Spinner fsoc;
    Spinner fadu;
    Spinner fiuba;
    Spinner psico;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);


        //<editor-fold desc="Info mía">
        TextView btn = (TextView) findViewById(R.id.company);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://www.jmcafferata.com/technologies"));
                startActivity(myWebLink);
            }
        });
        //</editor-fold>


        uba = (Spinner) findViewById(R.id.uba);
        derecho = (Spinner) findViewById(R.id.derecho);
        exactas = (Spinner) findViewById(R.id.exactas);
        fsoc = (Spinner) findViewById(R.id.fsoc);
        fadu = (Spinner) findViewById(R.id.fadu);
        fiuba = (Spinner) findViewById(R.id.fiuba);
        psico = (Spinner) findViewById(R.id.psico); // Spinners todo Agregar acá

        GOTO = (Button) findViewById(R.id.button1);


        ArrayAdapter<String> adapterUba = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, SpinnerValues.UBA);
        uba.setAdapter(adapterUba);
        ArrayAdapter<String> adapterDerecho = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, SpinnerValues.DERECHO);
        derecho.setAdapter(adapterDerecho);
        ArrayAdapter<String> adapterExactas = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, SpinnerValues.EXACTAS);
        exactas.setAdapter(adapterExactas);
        ArrayAdapter<String> adapterFsoc = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, SpinnerValues.FSOC);
        fsoc.setAdapter(adapterFsoc);
        ArrayAdapter<String> adapterFiuba = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, SpinnerValues.FIUBA);
        fiuba.setAdapter(adapterFiuba);
        ArrayAdapter<String> adapterFadu = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, SpinnerValues.FADU);
        fadu.setAdapter(adapterFadu);
        ArrayAdapter<String> adapterPsico = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, SpinnerValues.PSICO);
        psico.setAdapter(adapterPsico); // ArrayAdapters todo Agregar acá


        uba.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                SpinnerValueUBA = (String) uba.getSelectedItem();
                switch (SpinnerValueUBA) {
                    case "Universidad de Buenos Aires":
                        break;
                    case "Facultad de Derecho":
                        derecho.setVisibility(View.VISIBLE);
                        uba.setVisibility(View.GONE);
                        break;
                    case "Facultad de Ciencias Exactas y Naturales":
                        exactas.setVisibility(View.VISIBLE);
                        uba.setVisibility(View.GONE);
                        break;
                    case "Facultad de Arquitectura, Diseño y Urbanismo":
                        fadu.setVisibility(View.VISIBLE);
                        uba.setVisibility(View.GONE);
                        break;
                    case "Facultad de Ingeniería":
                        fiuba.setVisibility(View.VISIBLE);
                        uba.setVisibility(View.GONE);
                        break;
                    case "Facultad de Ciencias Sociales":
                        fsoc.setVisibility(View.VISIBLE);
                        uba.setVisibility(View.GONE);
                        break;
                    case "Facultad de Psicología":
                        psico.setVisibility(View.VISIBLE);
                        uba.setVisibility(View.GONE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }

        }); // Spinner de Facultades todo Agregar acá


        GOTO.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                SpinnerValueEXACTAS = (String) exactas.getSelectedItem();
                SpinnerValueDERECHO = (String) derecho.getSelectedItem();
                SpinnerValueFIUBA = (String) fiuba.getSelectedItem();
                SpinnerValueFSOC = (String) fsoc.getSelectedItem();
                SpinnerValueFADU = (String) fadu.getSelectedItem();
                SpinnerValuePSICO = (String) psico.getSelectedItem();
                Bundle bundle = new Bundle();

                //<editor-fold desc="Derecho">
                switch (SpinnerValueDERECHO) {
                    case "Seleccioná la carrera":
                        break;
                    case "Abogacía": {
                        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME,  "" + derecho.getSelectedItem());
                        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                        UBA_DERECHO_ABO c = new UBA_DERECHO_ABO("uba_derecho_abo");
                        Intent intent = new Intent(MainActivity.this, MainApp.class);
                        intent.putExtra("c", c);
                        startActivity(intent);
                        break;
                    }
                }
                //</editor-fold>

                //<editor-fold desc="Exactas">
                switch (SpinnerValueEXACTAS) {
                    case "Seleccioná la carrera":
                        break;
                    case "Ciencias Biológicas": {
                        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "" + exactas.getSelectedItem());
                        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                        UBA_EXACTAS_CB c = new UBA_EXACTAS_CB("uba_exactas_cb");
                        Intent intent = new Intent(MainActivity.this, MainApp.class);
                        intent.putExtra("c", c);
                        startActivity(intent);
                        break;
                    }
                    case "Ciencias de la Computación": {
                        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME , "" + exactas.getSelectedItem());
                        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                        UBA_EXACTAS_CC c = new UBA_EXACTAS_CC("uba_exactas_cc");
                        Intent intent = new Intent(MainActivity.this, MainApp.class);
                        intent.putExtra("c", c);
                        startActivity(intent);
                        break;
                    }
                    case "Ciencias Físicas": {
                        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "" + exactas.getSelectedItem());
                        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                        UBA_EXACTAS_CF c = new UBA_EXACTAS_CF("uba_exactas_cf");
                        Intent intent = new Intent(MainActivity.this, MainApp.class);
                        intent.putExtra("c", c);
                        startActivity(intent);
                        break;
                    }
                    case "Ciencias Químicas": {
                        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "" + exactas.getSelectedItem());
                        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                        UBA_EXACTAS_QUIMICA c = new UBA_EXACTAS_QUIMICA("uba_exactas_quimica");
                        Intent intent = new Intent(MainActivity.this, MainApp.class);
                        intent.putExtra("c", c);
                        startActivity(intent);
                        break;
                    }

                }
                //</editor-fold>

                //<editor-fold desc="FADU">
                switch (SpinnerValueFADU) {
                    case "Seleccioná la carrera":
                        break;
                    case "Arquitectura": {
                        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME,  "" + fadu.getSelectedItem());
                        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                        UBA_FADU_ARQ c = new UBA_FADU_ARQ("uba_fadu_arq");
                        Intent intent = new Intent(MainActivity.this, MainApp.class);
                        intent.putExtra("c", c);
                        startActivity(intent);
                        break;
                    }
                    case "Diseño Gráfico": {
                        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME,  "" + fadu.getSelectedItem());
                        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                        UBA_FADU_DG c = new UBA_FADU_DG("uba_fadu_dg");
                        Intent intent = new Intent(MainActivity.this, MainApp.class);
                        intent.putExtra("c", c);
                        startActivity(intent);
                        break;
                    }
                    case "Diseño Industrial": {
                        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME,  "" + fadu.getSelectedItem());
                        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                        UBA_FADU_INDUSTRIAL c = new UBA_FADU_INDUSTRIAL("uba_fadu_industrial");
                        Intent intent = new Intent(MainActivity.this, MainApp.class);
                        intent.putExtra("c", c);
                        startActivity(intent);
                        break;
                    }
                    case "Diseño de Imagen y Sonido": {
                        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, ""+ fadu.getSelectedItem());
                        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                        UBA_FADU_IMG c = new UBA_FADU_IMG("uba_fadu_img");
                        Intent intent = new Intent(MainActivity.this, MainApp.class);
                        intent.putExtra("c", c);
                        startActivity(intent);
                        break;
                    }
                    case "Diseño de Indumentaria": {
                        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME,  "" + fadu.getSelectedItem());
                        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                        UBA_FADU_INDUM c = new UBA_FADU_INDUM("uba_fadu_indum");
                        Intent intent = new Intent(MainActivity.this, MainApp.class);
                        intent.putExtra("c", c);
                        startActivity(intent);
                        break;
                    }

                }
                //</editor-fold>

                //<editor-fold desc="Ingeniería">
                switch (SpinnerValueFIUBA) {
                    case "Seleccioná la carrera":
                        break;
                    case "Análisis de Sistemas": {
                        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME,  "" + fiuba.getSelectedItem());
                        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                        UBA_FIUBA_SIST c = new UBA_FIUBA_SIST("uba_fiuba_sist");
                        Intent intent = new Intent(MainActivity.this, MainApp.class);
                        intent.putExtra("c", c);
                        intent.putExtra("isIt", true);
                        startActivity(intent);
                        break;
                    }
                    case "Ingeniería Civil": {
                        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME,  "" + fiuba.getSelectedItem());
                        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                        UBA_FIUBA_CIVIL c = new UBA_FIUBA_CIVIL("uba_fiuba_civil");
                        Intent intent = new Intent(MainActivity.this, MainApp.class);
                        intent.putExtra("c", c);
                        startActivity(intent);
                        break;
                    }
                    case "Ingeniería Electrónica": {
                        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME,  "" + fiuba.getSelectedItem());
                        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                        UBA_FIUBA_ELECTRON c = new UBA_FIUBA_ELECTRON("uba_fiuba_electron");
                        Intent intent = new Intent(MainActivity.this, MainApp.class);
                        intent.putExtra("c", c);
                        startActivity(intent);
                        break;
                    }

                    case "Ingeniería Industrial": {
                        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME,  "" + fiuba.getSelectedItem());
                        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                        UBA_FIUBA_INDUSTRIAL c = new UBA_FIUBA_INDUSTRIAL("uba_fiuba_industrial");
                        Intent intent = new Intent(MainActivity.this, MainApp.class);
                        intent.putExtra("c", c);
                        intent.putExtra("isIt", true);
                        startActivity(intent);
                        break;
                    }
                    case "Ingeniería Informática": {
                        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME,  "" + fiuba.getSelectedItem());
                        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                        UBA_FIUBA_INFORMATICA c = new UBA_FIUBA_INFORMATICA("uba_fiuba_informatica");
                        Intent intent = new Intent(MainActivity.this, MainApp.class);
                        intent.putExtra("c", c);
                        startActivity(intent);
                        break;
                    }


                }
                //</editor-fold>

                //<editor-fold desc="FSOC">

                switch (SpinnerValueFSOC) {
                    case "Seleccioná la carrera":
                        break;
                    case "Ciencia Política": {
                        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME,  "" + fsoc.getSelectedItem());
                        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                        UBA_FSOC_CP c = new UBA_FSOC_CP("uba_fsoc_cp");
                        Intent intent = new Intent(MainActivity.this, MainApp.class);
                        intent.putExtra("c", c);
                        startActivity(intent);
                        break;
                    }

                    case "Ciencias de la Comunicación": {
                        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME , "" + fsoc.getSelectedItem());
                        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                        UBA_FSOC_CC c = new UBA_FSOC_CC("uba_fsoc_cc");
                        Intent intent = new Intent(MainActivity.this, MainApp.class);
                        intent.putExtra("c", c);
                        startActivity(intent);
                        break;
                    }
                    case "Relaciones del Trabajo": {
                        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME,  "" + fsoc.getSelectedItem());
                        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                        UBA_FSOC_RT c = new UBA_FSOC_RT("uba_fsoc_rt");
                        Intent intent = new Intent(MainActivity.this, MainApp.class);
                        intent.putExtra("c", c);
                        startActivity(intent);
                        break;
                    }

                    case "Sociología": {
                        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME,  "" + fsoc.getSelectedItem());
                        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                        UBA_FSOC_S c = new UBA_FSOC_S("uba_fsoc_s");
                        Intent intent = new Intent(MainActivity.this, MainApp.class);
                        intent.putExtra("c", c);
                        startActivity(intent);
                        break;
                    }

                    case "Trabajo Social": {
                        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME,  "" + fsoc.getSelectedItem());
                        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                        UBA_FSOC_TS c = new UBA_FSOC_TS("uba_fsoc_ts");
                        Intent intent = new Intent(MainActivity.this, MainApp.class);
                        intent.putExtra("c", c);
                        startActivity(intent);
                        break;
                    }


                }
                //</editor-fold>

                //<editor-fold desc="Psicología">
                switch (SpinnerValuePSICO) {
                    case "Seleccioná la carrera":
                        break;
                    case "Psicología": {
                        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "" + psico.getSelectedItem());
                        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                        UBA_PSICO_PSICO c = new UBA_PSICO_PSICO("uba_psico_psico");
                        Intent intent = new Intent(MainActivity.this, MainApp.class);
                        intent.putExtra("c", c);
                        startActivity(intent);
                        break;
                    }
                }
                //</editor-fold>

            }
        }); // Botón GOTO OnClick todo Agregar las carreras acá


    }

    @Override
    protected void onPause() {
        super.onPause();
        uba.setVisibility(View.VISIBLE);
        SpinnerValueUBA = "Universidad de Buenos Aires";
        derecho.setVisibility(View.GONE);
        exactas.setVisibility(View.GONE);
        fiuba.setVisibility(View.GONE);
        fadu.setVisibility(View.GONE);
        fsoc.setVisibility(View.GONE);
        psico.setVisibility(View.GONE);

        SharedPreferences prefs = getSharedPreferences("X", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("lastActivity", getClass().getName());

        editor.commit();
    }


}
