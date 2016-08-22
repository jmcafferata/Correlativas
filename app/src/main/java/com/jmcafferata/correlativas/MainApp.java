package com.jmcafferata.correlativas;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.gson.Gson;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;




public class MainApp extends AppCompatActivity {

    Carrera c1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.carrera);

        final TextView numMaterias = (TextView) findViewById(R.id.numMaterias);
        final TextView totalMaterias = (TextView) findViewById(R.id.totalMaterias);
        Button resetButton = (Button) findViewById(R.id.resetButton);
        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        ImageView backArrow = (ImageView) findViewById(R.id.backArrow);
        ImageView beta = (ImageView) findViewById(R.id.beta);
        ImageView share = (ImageView) findViewById(R.id.share);
        TextView progreso = (TextView)findViewById(R.id.progreso);


        beta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainApp.this)
                        .setTitle("Beta Testers")
                        .setMessage("Si querés probar las nuevas funcionalidades de la app antes que todos, enviá un mail a technologies@jmcafferata.com escribiendo qué carrera cursás y qué dispositivo tenés. \n \nConstruyamos entre todos un futuro mejor para la app.")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Intent.ACTION_SEND);
                                intent.setType("text/html");
                                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"technologies@jmcafferata.com"});
                                intent.putExtra(Intent.EXTRA_SUBJECT, "¡Quiero ofrecerme para ser un Correlativas BetaBoy/BetaGirl!");
                                intent.putExtra(Intent.EXTRA_TEXT, "Hola, Cafferata Technologies. \n \nMe enteré que necesitás usuarios que prueben las nuevas funcionalidades de la app antes que todos. Acá te paso mi carrera y mi modelo de teléfono. \n \n¡Andá avisándome cosas!");

                                startActivity(Intent.createChooser(intent, "Send Email"));
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // do nothing
                            }
                        })
                        .setIcon(R.drawable.ic_launcher)
                        .show();
            }
        }); // Beta Button

        SharedPreferences carreraPrefs = getSharedPreferences("X", MODE_PRIVATE);
        if (getIntent().getBooleanExtra("isIt", true)) {
            c1 = getIntent().getParcelableExtra("c");
            SharedPreferences.Editor prefsEditor = carreraPrefs.edit();
            prefsEditor.clear();
            prefsEditor.commit();
            Gson gson = new Gson();
            String json = gson.toJson(c1);
            prefsEditor.putString("Carrera", json);
            prefsEditor.commit();
            c1.setDisponibilidadInicial();
        } else {
            Gson gson = new Gson();
            String json = carreraPrefs.getString("Carrera", "");
            c1 = gson.fromJson(json, Carrera.class);

            c1.disponiblesList.clear();
            Set<String> disponiblesSet = carreraPrefs.getStringSet("Disponibles", new HashSet<String>());
            for (Materia mat : c1.materiasTodas) {
                if (disponiblesSet.contains("" + mat.id)) {
                    c1.disponiblesList.add(mat);
                }
            }

            c1.cursadasList.clear();
            Set<String> cursadasSet = carreraPrefs.getStringSet("Cursadas", new HashSet<String>());
            for (Materia mat : c1.materiasTodas) {
                if (cursadasSet.contains("" + mat.id)) {
                    c1.cursadasList.add(mat);
                }
            }

            c1.noCursadasList.clear();
            Set<String> noCursadasSet = carreraPrefs.getStringSet("No Cursadas", new HashSet<String>());
            for (Materia mat : c1.materiasTodas) {
                if (noCursadasSet.contains("" + mat.id)) {
                    c1.noCursadasList.add(mat);
                }
            }

            c1.TPList.clear();
            Set<String> TPset = carreraPrefs.getStringSet("TP", new HashSet<String>());
            for (Materia mat : c1.materiasTodas) {
                if (TPset.contains("" + mat.id)) {
                    c1.TPList.add(mat);
                }
            }

            if (c1.orientaciones != null) {
                c1.orientacionesNoCursadasList.clear();
                Set<String> orientacionesNoCursadasSet = carreraPrefs.getStringSet("No CursadasO", new HashSet<String>());
                for (Orientacion or : c1.orientacionesList) {
                    if (orientacionesNoCursadasSet.contains("" + or.id)) {
                        c1.orientacionesNoCursadasList.add(or);
                    }
                }

                Set<String> orientacionesCursadasSet = carreraPrefs.getStringSet("CursadasO", new HashSet<String>());
                for (Orientacion or : c1.orientacionesList) {
                    if (orientacionesCursadasSet.contains("" + or.id)) {
                        c1.orientacionesCursadasList.add(or);
                    }
                }

                Set<String> orientacionesDisponiblesSet = carreraPrefs.getStringSet("DisponiblesO", new HashSet<String>());
                for (Orientacion or : c1.orientacionesList) {
                    if (orientacionesDisponiblesSet.contains("" + or.id)) {
                        c1.orientacionesDisponiblesList.add(or);
                    }
                }
            }
        } // Si viene del MainActivity, traer el Parcelable. Si no, cargar los SharedPreferences

        final Carrera c = c1;
        if (c.TP){
            progreso.setText("Materias rendidas: ");
        }

        for (Materia mat : c.todasMaterias) {
            mat.resID = getResources().getIdentifier(mat.buttonString, "id", getPackageName());
        }
        if (c.orientacionesList != null) {
            for (Orientacion o : c.orientacionesList) {
                o.resID = getResources().getIdentifier(o.buttonString, "id", getPackageName());
            }
        } // Asignar los resID de los botones a las Materias

        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        }); // BackArrow


        totalMaterias.setText("" + c.materiasList.size());
        numMaterias.setText("" + c.cursadasList.size());
        progressBar.setProgress(c.cursadasList.size());
        progressBar.setMax(c.materiasList.size());
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.reset();

                // Visibilidad
                int j = 0;
                for (Materia mat : c.todasMaterias) {
                    mat.resID = getResources().getIdentifier(mat.buttonString, "id", getPackageName());
                    Button button = (Button) findViewById(mat.resID);
                    String buttonColor = "Color" + j;
                    int colorID = getResources().getIdentifier(buttonColor, "color", getPackageName());
                    int color = ContextCompat.getColor(getApplicationContext(), colorID);
                    button.setBackgroundColor(color);
                    button.setTextColor(getResources().getColor(R.color.Black));
                    button.setVisibility(View.GONE);
                    j++;
                    if (j == 10) j = 0;
                }

                if (c.orientacionesList != null) {
                    for (Orientacion o : c.orientacionesList) {
                        o.resID = getResources().getIdentifier(o.buttonString, "id", getPackageName());
                        Button button = ((Button) findViewById(o.resID));
                        button.setVisibility(View.GONE);
                    }
                }
                for (Materia mat : c.disponiblesList) {
                    mat.resID = getResources().getIdentifier(mat.buttonString, "id", getPackageName());
                    Button button = ((Button) findViewById(mat.resID));
                    button.setVisibility(View.VISIBLE);
                }

                if (c.orientacionesList != null) {
                    for (Orientacion o : c.orientacionesDisponiblesList) {
                        o.resID = getResources().getIdentifier(o.buttonString, "id", getPackageName());
                        Button button = ((Button) findViewById(o.resID));
                        button.setVisibility(View.VISIBLE);
                    }
                }
                totalMaterias.setText("" + c.materiasList.size());
                numMaterias.setText("" + c.cursadasList.size());
                progressBar.setProgress(c.cursadasList.size());
                progressBar.setMax(c.materiasList.size());
                c1 = c;
            }
        });         // ProgressBar, TextViews y ResetButton

        int s = 0;
        for (final Materia mat : c.todasMaterias) {
            mat.resID = getResources().getIdentifier(mat.buttonString, "id", getPackageName());
            final Button button = (Button) findViewById(mat.resID);
            int resIdString = getApplicationContext().getResources().getIdentifier(c.nombre + "_string" + mat.id, "string", getPackageName());
            button.setText(getResources().getString(resIdString));
            String buttonColor = "Color" + s;
            int colorID = getResources().getIdentifier(buttonColor, "color", getPackageName());
            int color = ContextCompat.getColor(getApplicationContext(), colorID);
            button.setBackgroundColor(color);
            System.out.println("Materia "+mat+ " tiene TP Co " + mat.TPcorrelativas);
            if (c.TP) {
                if (c.TPList.contains(mat)) {
                    button.setBackgroundColor(getResources().getColor(R.color.ColorRed));
                    button.setTextColor(getResources().getColor(R.color.White));
                }
            }
            s++;
            if (s == 10) s = 0;

            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    mat.cursar(c);
                    c.printCursadas();
                    c.printDisponibles();
                    c.printTP();
                    button.setVisibility(View.GONE);

                    // Visibilidad

                    for (Materia matF : c.disponiblesList) {
                        matF.resID = getResources().getIdentifier(matF.buttonString, "id", getPackageName());
                        Button buttonF = ((Button) findViewById(matF.resID));
                        buttonF.setVisibility(View.VISIBLE);
                    }

                    if (c.orientacionesList != null) {
                        for (Orientacion o : c.orientacionesDisponiblesList) {
                            o.resID = getResources().getIdentifier(o.buttonString, "id", getPackageName());
                            Button button = ((Button) findViewById(o.resID));
                            button.setVisibility(View.VISIBLE);

                        }
                    }
                    totalMaterias.setText("" + c.materiasList.size());
                    numMaterias.setText("" + c.cursadasList.size());
                    progressBar.setProgress(c.cursadasList.size());
                    progressBar.setMax(c.materiasList.size());
                    c1 = c;

                }
            });

            if (c.TP) {
                button.setOnLongClickListener(new View.OnLongClickListener() {
                    public boolean onLongClick(View v) {
                        mat.hacerTP(c);
                        c.printCursadas();
                        c.printDisponibles();
                        c.printTP();
                        button.setBackgroundColor(getResources().getColor(R.color.ColorRed));
                        button.setTextColor(getResources().getColor(R.color.White));
                        // Visibilidad

                        for (Materia matF : c.disponiblesList) {
                            matF.resID = getResources().getIdentifier(matF.buttonString, "id", getPackageName());
                            Button buttonF = ((Button) findViewById(matF.resID));
                            buttonF.setVisibility(View.VISIBLE);
                        }

                        if (c.orientacionesList != null) {
                            for (Orientacion o : c.orientacionesDisponiblesList) {
                                o.resID = getResources().getIdentifier(o.buttonString, "id", getPackageName());
                                Button button = ((Button) findViewById(o.resID));
                                button.setVisibility(View.VISIBLE);

                            }
                        }
                        totalMaterias.setText("" + c.materiasList.size());
                        numMaterias.setText("" + c.cursadasList.size());
                        progressBar.setProgress(c.cursadasList.size());
                        progressBar.setMax(c.materiasList.size());
                        c1 = c;
                        return true;    // <- set to true
                    }
                });
            }
        } // Por cada Materia, asignarle un botón con el OnClickListener de cursar y desaparecer

        if (c.orientacionesList != null) {

            for (final Orientacion o : c.orientacionesList) {
                o.resID = getResources().getIdentifier(o.buttonString, "id", getPackageName());
                Button button = ((Button) findViewById(o.resID));
                int resIdString = getApplicationContext().getResources().getIdentifier(c.nombre + "_orientacion_string" + o.id, "string", getPackageName());
                button.setText(getResources().getString(resIdString));
                button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        o.cursar(c);
                        for (Orientacion oF : c.orientacionesList) {
                            oF.resID = getResources().getIdentifier(oF.buttonString, "id", getPackageName());
                            Button buttonOf = (Button) findViewById(oF.resID);
                            buttonOf.setVisibility(View.GONE);
                        }


                        // Visibilidad

                        for (Materia matF : c.disponiblesList) {
                            matF.resID = getResources().getIdentifier(matF.buttonString, "id", getPackageName());
                            Button buttonF = ((Button) findViewById(matF.resID));
                            buttonF.setVisibility(View.VISIBLE);
                        }

                        if (c.orientacionesList != null) {
                            for (Orientacion oF : c.orientacionesDisponiblesList) {
                                oF.resID = getResources().getIdentifier(oF.buttonString, "id", getPackageName());
                                Button buttonOf = ((Button) findViewById(oF.resID));
                                buttonOf.setVisibility(View.VISIBLE);

                            }
                        }
                        totalMaterias.setText("" + c.materiasList.size());
                        numMaterias.setText("" + c.cursadasList.size());
                        progressBar.setProgress(c.cursadasList.size());
                        progressBar.setMax(c.materiasList.size());
                        c1 = c;

                    }
                });
            }
        } // Si hay Orientaciones, lo mismo

        for (Materia mat : c.disponiblesList) {
            mat.resID = getResources().getIdentifier(mat.buttonString, "id", getPackageName());
            Button buttonD = ((Button) findViewById(mat.resID));
            buttonD.setVisibility(View.VISIBLE);
        }

        if (c.orientacionesList != null) {
            for (Orientacion o : c.orientacionesDisponiblesList) {
                o.resID = getResources().getIdentifier(o.buttonString, "id", getPackageName());
                Button buttonD = ((Button) findViewById(o.resID));
                buttonD.setVisibility(View.VISIBLE);
            }
        } // Visibilidad Inicial de Materias y Orientaciones

        //<editor-fold desc="Share">
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(getApplicationContext(), "Cargando...", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                Bitmap src;
                if (c.disponiblesList.size() >= 12) {
                    src = BitmapFactory.decodeResource(getResources(), R.drawable.sharelg);
                } else if (c.disponiblesList.size() >= 2) {
                    src = BitmapFactory.decodeResource(getResources(), R.drawable.share);
                } else {
                    src = BitmapFactory.decodeResource(getResources(), R.drawable.sharesml);

                }

                Bitmap dest = Bitmap.createBitmap(src.getWidth(), src.getHeight(), Bitmap.Config.ARGB_8888);

                DisplayMetrics metrics = getBaseContext().getResources().getDisplayMetrics();
                int w = metrics.widthPixels;
                int h = metrics.heightPixels;
                Canvas cs = new Canvas(dest);
                Paint tPaint = new Paint();
                tPaint.setTextSize(getResources().getDimensionPixelSize(R.dimen.myFontSize));
                tPaint.setColor(getResources().getColor(R.color.Black));
                tPaint.setStyle(Paint.Style.FILL);
                tPaint.setAntiAlias(true);
                tPaint.setTextAlign(Paint.Align.CENTER);
                cs.drawBitmap(src, 0f, 0f, null);
                float y_coord = (cs.getHeight() / 2) - (c.disponiblesList.size() * dpToPixel(20) - dpToPixel(60));
                float x_coord = cs.getWidth() / 2;
                tPaint.setFakeBoldText(true);
                cs.drawText("Éstas son las materias que puedo cursar.", x_coord, y_coord - dpToPixel(80), tPaint);
                cs.drawText("¡A estudiar se ha dicho!", x_coord, y_coord - dpToPixel(40), tPaint);
                for (Materia mat : c.disponiblesList) {
                    int materiaNameInt = getResources().getIdentifier(c.nombre + "_string" + mat.id, "string", getPackageName());
                    String materiaName = "" + getText(materiaNameInt);
                    y_coord += dpToPixel(40);
                    tPaint.setFakeBoldText(false);
                    cs.drawText(StringUtils.abbreviate(materiaName, 100), x_coord, y_coord, tPaint);
                }
                try {
                    File cachePath = new File(getApplicationContext().getCacheDir(), "images");
                    cachePath.mkdirs(); // don't forget to make the directory
                    FileOutputStream stream = new FileOutputStream(cachePath + "/image.png"); // overwrites this image every time
                    dest.compress(Bitmap.CompressFormat.PNG, 100, stream);
                    stream.close();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                File imagePath = new File(getApplicationContext().getCacheDir(), "images");
                File newFile = new File(imagePath, "image.png");
                Uri contentUri = FileProvider.getUriForFile(getApplicationContext(), "com.jmcafferata.correlativas.fileprovider", newFile);
                if (contentUri != null) {

                    Intent shareIntent = new Intent();
                    shareIntent.setAction(Intent.ACTION_SEND);
                    shareIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION); // temp permission for receiving app to read this file
                    shareIntent.setDataAndType(contentUri, getContentResolver().getType(contentUri));
                    shareIntent.putExtra(Intent.EXTRA_STREAM, contentUri);
                    startActivity(Intent.createChooser(shareIntent, "Choose an app"));


                }
            }
        }); // Share button
        //</editor-fold>


        c1 = c;
    }

    @Override
    protected void onPause() {
        super.onPause();
        HashSet<String> disponiblesSet = new HashSet<>();
        for (Materia mat : c1.disponiblesList) {
            disponiblesSet.add("" + mat.id);
        }
        HashSet<String> cursadasSet = new HashSet<>();
        for (Materia mat : c1.cursadasList) {
            cursadasSet.add("" + mat.id);
        }
        HashSet<String> noCursadasSet = new HashSet<>();
        for (Materia mat : c1.noCursadasList) {
            noCursadasSet.add("" + mat.id);
        }
        HashSet<String> orientacionesCursadasSet = new HashSet<>();
        for (Orientacion or : c1.orientacionesCursadasList) {
            orientacionesCursadasSet.add("" + or.id);
        }
        HashSet<String> orientacionesNoCursadasSet = new HashSet<>();
        for (Orientacion or : c1.orientacionesNoCursadasList) {
            orientacionesNoCursadasSet.add("" + or.id);
        }
        HashSet<String> orientacionesDisponiblesSet = new HashSet<>();
        for (Orientacion or : c1.orientacionesDisponiblesList) {
            orientacionesDisponiblesSet.add("" + or.id);
        }
        HashSet<String> TPset = new HashSet<>();
        for (Materia mat : c1.TPList) {
            TPset.add("" + mat.id);
        }
        SharedPreferences prefs = getSharedPreferences("X", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("lastActivity", getClass().getName());
        editor.putStringSet("Disponibles", disponiblesSet);
        editor.putStringSet("Cursadas", cursadasSet);
        editor.putStringSet("No Cursadas", noCursadasSet);
        editor.putStringSet("DisponiblesO", orientacionesDisponiblesSet);
        editor.putStringSet("CursadasO", orientacionesCursadasSet);
        editor.putStringSet("No CursadasO", orientacionesNoCursadasSet);
        editor.putStringSet("TP", TPset);
        editor.commit();
    } // Guardar estado y lastActivity a SharedPreferences
    private float dpToPixel(float dp) {
        DisplayMetrics metrics = this.getResources().getDisplayMetrics();
        float px = dp * (metrics.densityDpi/160f);
        return px;
    }

}
