package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Instancias de los campos para ingresar números.
        EditText number1 = findViewById(R.id.editTextNumberDecimal);
        EditText number2 = findViewById(R.id.editTextNumberDecimal2);

        // Instancia del campo de resultado.
        TextView result = findViewById(R.id.textResult);

        // Instancias de todos los botones de la app.
        Button addButton = findViewById(R.id.addButton);
        Button subtractButton = findViewById(R.id.subtractButton);
        Button multiplyButton = findViewById(R.id.multiplyButton);
        Button divideButton = findViewById(R.id.divideButton);
        Button clearButton = findViewById(R.id.clearButton);
        Button closeButton = findViewById(R.id.closeButton);
        ImageButton easterButton = findViewById(R.id.easterButton);

        // Asignación de comportamiento al botón suma
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Validación de campo vacío para el número 1.
                if (number1.getText().toString().isEmpty()) {
                    Toast.makeText(getBaseContext(), "Please enter number 1.", Toast.LENGTH_SHORT).show();
                    return;
                }
                // Validación de campo vacío para el número 2.
                if (number2.getText().toString().isEmpty()) {
                    Toast.makeText(getBaseContext(), "Please enter number 2.", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Transformación de los números ingresados a la clase Double para poder usar decimales.
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());
                
                // Se asigna al campo de resultado el resultado obtenido del método correspondiente.
                result.setText(calculateSum(num1, num2) + "");
            }
        });

        // Asignación de comportamiento al botón resta.
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Validación de campo vacío para el número 1.
                if (number1.getText().toString().isEmpty()) {
                    Toast.makeText(getBaseContext(), "Please enter number 1.", Toast.LENGTH_SHORT).show();
                    return;
                }
                // Validación de campo vacío para el número 2.
                if (number2.getText().toString().isEmpty()) {
                    Toast.makeText(getBaseContext(), "Please enter number 2.", Toast.LENGTH_SHORT).show();
                    return;
                }
                // Transformación de los números ingresados a la clase Double para poder usar decimales.
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());

                // Se asigna al campo de resultado el resultado obtenido del método correspondiente.
                result.setText(calculateSubtract(num1, num2) + "");
            }
        });

        // Asignación de comportamiento al botón multiplicación.
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Validación de campo vacío para el número 1.
                if (number1.getText().toString().isEmpty()) {
                    Toast.makeText(getBaseContext(), "Please enter number 1.", Toast.LENGTH_SHORT).show();
                    return;
                }
                // Validación de campo vacío para el número 2.
                if (number2.getText().toString().isEmpty()) {
                    Toast.makeText(getBaseContext(), "Please enter number 2.", Toast.LENGTH_SHORT).show();
                    return;
                }
                // Transformación de los números ingresados a la clase Double para poder usar decimales.
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());

                // Se asigna al campo de resultado el resultado obtenido del método correspondiente.
                result.setText(calculateMultiplication(num1, num2) + "");
            }
        });

        // Asignación de comportamiento al botón división.
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Validación de campo vacío para el número 1.
                if (number1.getText().toString().isEmpty()) {
                    Toast.makeText(getBaseContext(), "Please enter number 1.", Toast.LENGTH_SHORT).show();
                    return;
                }
                // Validación de campo vacío para el número 2.
                if (number2.getText().toString().isEmpty()) {
                    Toast.makeText(getBaseContext(), "Please enter number 2.", Toast.LENGTH_SHORT).show();
                    return;
                }
                // Transformación de los números ingresados a la clase Double para poder usar decimales.
                double num1 = Double.parseDouble(number1.getText().toString());
                double num2 = Double.parseDouble(number2.getText().toString());

                // Se asigna al campo de resultado el resultado obtenido del método correspondiente.
                result.setText(calculateDivision(num1, num2) + "");
            }
        });

        // Asignación de comportamiento al botón borrar.
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Se asigna vacío a todos los campos.
                number1.setText("");
                number2.setText("");
                result.setText("");
            }
        });

        // Asignación de comportamiento al botón cerrar.
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Finalizar la aplicación.
            }
        });

        easterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Developed by Carlos Avilés Tapia", Toast.LENGTH_LONG).show();
            }
        });
    }

    // Método que calcula la suma de dos números.
    public double calculateSum(double a, double b) {
        return a + b;

    }

    // Método que calcula la resta de dos números.
    public double calculateSubtract(double a, double b) {
        return a - b;
    }

    // Método que calcula la multiplicación de dos números.
    public double calculateMultiplication(double a, double b) {
        return a * b;
    }

    // Método que calcula la división de dos números.
    public double calculateDivision(double a, double b) {

        // Validación de que el número 2 no sea 0.
        if (b == 0) {
            Toast.makeText(getBaseContext(), "Please do not divide by 0.", Toast.LENGTH_SHORT).show();
        }
        return a / b;
    }

}
