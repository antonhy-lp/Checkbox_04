package mx.edu.tecmm.moviles.checkbox_04

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textInputEditText_Letra: EditText
    lateinit var checkBoxLetra_Cuersiva: CheckBox
    lateinit var checkBoxNegrita: CheckBox
    lateinit var textViewNombre: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewNombre = findViewById(R.id.textViewNombre)
        textInputEditText_Letra = findViewById(R.id.textInputEditText_Letra)
        checkBoxLetra_Cuersiva = findViewById(R.id.checkBoxLetra_Cuersiva)
        checkBoxNegrita= findViewById(R.id.checkBoxNegrita)
    }
    fun Seleccion(view: View){
       Log.e("Seleccion","As Selecionado Una Opción")
        if(checkBoxLetra_Cuersiva.isChecked && !checkBoxNegrita.isChecked) {
            textInputEditText_Letra.typeface = Typeface.defaultFromStyle(Typeface.ITALIC)
        }else if(checkBoxNegrita.isChecked && !checkBoxLetra_Cuersiva.isChecked){
            textInputEditText_Letra.typeface = Typeface.defaultFromStyle(Typeface.BOLD)
        }
        else if (checkBoxLetra_Cuersiva.isChecked && checkBoxNegrita.isChecked){
            textInputEditText_Letra.typeface = Typeface.defaultFromStyle(Typeface.BOLD_ITALIC)
        }else{
            textInputEditText_Letra.typeface = Typeface.defaultFromStyle(Typeface.NORMAL)
        }
      }
    }
        /*var bold =findViewById(R.id.checkBoxLetra_Cuersiva) as TextView
        bold.setTypeface(null, Typeface.BOLD)
        //var checkBoxLetra_Cuersiva =
        if(view is CheckBox){
            val checked: Boolean = view.isChecked
            when (view.id){
                R.id.checkBoxLetra_Cuersiva ->{
                    if (checked){
                        bold = textInputEditText_Letra
                    }else{
                        checkBoxLetra_Cuersiva
                    }
                }
                R.id.checkBoxLetra_Cuersiva ->{
                    if (checked){

                    }else{

                    }
                }
            }
        }
    }
}*/