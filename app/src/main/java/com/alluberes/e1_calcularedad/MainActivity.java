package com.alluberes.e1_calcularedad;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.time.LocalDate;


import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.Period;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    /// TODO (11) Declarar objeto tipo EditText de "nombre_persona"
    EditText nombrePersona;

    /// TODO (12) Declarar objeto tipo DatePicker de "date_of_birth"
    CalendarView calendarView;

    /// TODO (13) Declarar objeto tipo Button de "calcular_edad"
    Button calcularEdad;

    /// TODO (14) Declarar objeto tipo EditText de "edad_actual"
    TextView edadActual;

    Date datePicked;
    String fechaFormateada;
    String nombreUsuario;
    int edadUsuario;
    SimpleDateFormat formatToShow = new SimpleDateFormat("dd MMMM yyyy");
    SimpleDateFormat formatToCalculate = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /// TODO (15) Relacionar elemento de layout para nombre de persona con variable
            nombrePersona = findViewById(R.id.txtNombreUsuario);
        /// TODO (16) Relacionar elemento de layout para fecha de nacimiento con variable
             calendarView = findViewById(R.id.calendarView);
        /// TODO (17) Relacionar elemento de layout para accion de calcular edad con variable
            calcularEdad = findViewById(R.id.buttonCalcular);
        /// TODO (18) Relacionar elemento de layout para mostrar la edad actual con variable
            edadActual = findViewById(R.id.resultadoDelCalculo);

        /// TODO (20) Asignar accion para el evento setOnClickListener del elemento de boton que calcula la edad
        /// en el evento onClick se debe tomar el valor del DatePicker que indica la fecha de nacimiento,
        /// e invocar la funcion que se crea en el paso 19 para calcular la edad
        /// y mostrar en el elemento del layout para mostrar edad un texto en el siguiente orden
        /// [nombre de la persona] tiene [edad] años de edad
        /// debe sustituir los valores que estan en los corchetes por los valores de los elementos del layout

            calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                //date = String.valueOf( dayOfMonth );
                datePicked = new Date( (year - 1900) ,month,dayOfMonth);
                fechaFormateada = formatToShow.format(datePicked);
            }
        });

            nombrePersona.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    nombreUsuario = nombrePersona.getText().toString() ;
                }
            });

            calcularEdad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // edadActual.setText(String.format("El usuario %s nacio %s y tiene %d anios%d", nombreUsuario, fechaFormateada, 0, 0));
                edadActual.setText(calcularEdadEntreFechas());
            }
        });

    }

    /// TODO (19) Crear funcion para calcular edad. Ha de recibir como parametro año, mes y dia
    /// internamente ha de sacar la diferencia entre la fecha actual y la fecha dada y retornara el valor

        @RequiresApi(api = Build.VERSION_CODES.O)
        public String calcularEdadEntreFechas() {
//
              LocalDate date1 = LocalDate.parse(formatToCalculate.format(datePicked));
              LocalDate date2 = LocalDate.now();
              int numDays = Period.between(date1,date2).getYears();

              if(numDays >= 0){
                        edadUsuario =  numDays;
                        String p = String.format("[ %s ] tiene [ %d ] años de edad",nombreUsuario,edadUsuario);
                  return p;
              }else{
                  return "Favor de digitar una fecha menor que la actual date1 "+ date1 + " date2 "+ date2;
              }


        }


}
