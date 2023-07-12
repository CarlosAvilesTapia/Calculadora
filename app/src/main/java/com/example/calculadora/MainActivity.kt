package com.example.calculadora

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Instancias de los campos para ingresar números.
        val number1 = findViewById<EditText>(R.id.editTextNumberDecimal)
        val number2 = findViewById<EditText>(R.id.editTextNumberDecimal2)

        // Instancia del campo de resultado.
        val result = findViewById<TextView>(R.id.textResult)

        // Instancias de todos los botones de la app.
        val addButton = findViewById<Button>(R.id.addButton)
        val subtractButton = findViewById<Button>(R.id.subtractButton)
        val multiplyButton = findViewById<Button>(R.id.multiplyButton)
        val divideButton = findViewById<Button>(R.id.divideButton)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val closeButton = findViewById<Button>(R.id.closeButton)
        val easterButton = findViewById<ImageButton>(R.id.easterButton)

        // Asignación de comportamiento al botón suma
        addButton.setOnClickListener(View.OnClickListener { // Validación de campo vacío para el número 1.
            if (number1.text.toString().isEmpty()) {
                Toast.makeText(baseContext, "Please enter number 1.", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            // Validación de campo vacío para el número 2.
            if (number2.text.toString().isEmpty()) {
                Toast.makeText(baseContext, "Please enter number 2.", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }

            // Transformación de los números ingresados a la clase Double para poder usar decimales.
            val num1 = number1.text.toString().toDouble()
            val num2 = number2.text.toString().toDouble()

            // Se asigna al campo de resultado el resultado obtenido del método correspondiente.
            result.text = calculateSum(num1, num2).toString()
        })

        // Asignación de comportamiento al botón resta.
        subtractButton.setOnClickListener(View.OnClickListener { // Validación de campo vacío para el número 1.
            if (number1.text.toString().isEmpty()) {
                Toast.makeText(baseContext, "Please enter number 1.", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            // Validación de campo vacío para el número 2.
            if (number2.text.toString().isEmpty()) {
                Toast.makeText(baseContext, "Please enter number 2.", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            // Transformación de los números ingresados a la clase Double para poder usar decimales.
            val num1 = number1.text.toString().toDouble()
            val num2 = number2.text.toString().toDouble()

            // Se asigna al campo de resultado el resultado obtenido del método correspondiente.
            result.text = calculateSubtract(num1, num2).toString()
        })

        // Asignación de comportamiento al botón multiplicación.
        multiplyButton.setOnClickListener(View.OnClickListener { // Validación de campo vacío para el número 1.
            if (number1.text.toString().isEmpty()) {
                Toast.makeText(baseContext, "Please enter number 1.", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            // Validación de campo vacío para el número 2.
            if (number2.text.toString().isEmpty()) {
                Toast.makeText(baseContext, "Please enter number 2.", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            // Transformación de los números ingresados a la clase Double para poder usar decimales.
            val num1 = number1.text.toString().toDouble()
            val num2 = number2.text.toString().toDouble()

            // Se asigna al campo de resultado el resultado obtenido del método correspondiente.
            result.text = calculateMultiplication(num1, num2).toString()
        })

        // Asignación de comportamiento al botón división.
        divideButton.setOnClickListener(View.OnClickListener { // Validación de campo vacío para el número 1.
            if (number1.text.toString().isEmpty()) {
                Toast.makeText(baseContext, "Please enter number 1.", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            // Validación de campo vacío para el número 2.
            if (number2.text.toString().isEmpty()) {
                Toast.makeText(baseContext, "Please enter number 2.", Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }
            // Transformación de los números ingresados a la clase Double para poder usar decimales.
            val num1 = number1.text.toString().toDouble()
            val num2 = number2.text.toString().toDouble()

            // Se asigna al campo de resultado el resultado obtenido del método correspondiente.
            result.text = calculateDivision(num1, num2).toString()
        })

        // Asignación de comportamiento al botón borrar.
        clearButton.setOnClickListener { // Se asigna vacío a todos los campos.
            number1.setText("")
            number2.setText("")
            result.text = ""
        }

        // Asignación de comportamiento al botón cerrar.
        closeButton.setOnClickListener {
            finish() // Finalizar la aplicación.
        }

        easterButton.setOnClickListener {
            Toast.makeText(
                baseContext,
                "Developed by Carlos Avilés Tapia",
                Toast.LENGTH_LONG
            ).show()
        }
    }

    // Método que calcula la suma de dos números.
    private fun calculateSum(a: Double, b: Double): Double {
        return a + b
    }

    // Método que calcula la resta de dos números.
    private fun calculateSubtract(a: Double, b: Double): Double {
        return a - b
    }

    // Método que calcula la multiplicación de dos números.
    private fun calculateMultiplication(a: Double, b: Double): Double {
        return a * b
    }

    // Método que calcula la división de dos números.
    private fun calculateDivision(a: Double, b: Double): Double {

        // Validación de que el número 2 no sea 0.
        if (b == 0.0) {
            Toast.makeText(baseContext, "Please do not divide by 0.", Toast.LENGTH_SHORT).show()
        }
        return a / b
    }
}