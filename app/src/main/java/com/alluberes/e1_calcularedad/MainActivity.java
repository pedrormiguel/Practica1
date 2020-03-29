package com.alluberes.e1_calcularedad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    /// TODO (11) Declarar objeto tipo EditText de "nombre_persona"

    /// TODO (12) Declarar objeto tipo DatePicker de "date_of_birth"

    /// TODO (13) Declarar objeto tipo Button de "calcular_edad"

    /// TODO (14) Declarar objeto tipo EditText de "edad_actual"



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /// TODO (15) Relacionar elemento de layout para nombre de persona con variable

        /// TODO (16) Relacionar elemento de layout para fecha de nacimiento con variable

        /// TODO (17) Relacionar elemento de layout para accion de calcular edad con variable

        /// TODO (18) Relacionar elemento de layout para mostrar la edad actual con variable


        /// TODO (20) Asignar accion para el evento setOnClickListener del elemento de boton que calcula la edad
        /// en el evento onClick se debe tomar el valor del DatePicker que indica la fecha de nacimiento,
        /// e invocar la funcion que se crea en el paso 19 para calcular la edad
        /// y mostrar en el elemento del layout para mostrar edad un texto en el siguiente orden
        /// [nombre de la persona] tiene [edad] años de edad
        /// debe sustituir los valores que estan en los corchetes por los valores de los elementos del layout

    }

    /// TODO (19) Crear funcion para calcular edad. Ha de recibir como parametro año, mes y dia
    /// internamente ha de sacar la diferencia entre la fecha actual y la fecha dada y retornara el valor


}
