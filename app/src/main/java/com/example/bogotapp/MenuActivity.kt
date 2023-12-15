package com.example.bogotapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bogotapp.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.recycler.adapter = SitiosAdapter(
            listOf(
                Sitio("Museo del oro", "museo_oro", "El Museo del Oro ubicado en el centro histórico de Bogotá es un espacio para conocer la historia del oro y otros metales en las sociedades prehispánicas y para aprender de la cultura, la cosmovisión, las herramientas, la ropa y los ritos de esas comunidades."),
                Sitio("Museo Nacional", "museo_nal", "El Museo Nacional de Colombia fue creado en 1823, y es uno de los más antiguos de América. Ofrece a sus visitantes diecisiete salas de exposición permanente, en las cuales se exhiben alrededor de 2.500 obras y objetos, símbolos de la historia y el patrimonio nacional."),
                Sitio("Plaza Bolivar", "plazabolivar", "La Plaza de Bolívar está situada en todo el centro de Bogotá, es el corazón de la ciudad, su punto histórico por excelencia. En el año de 1995, después de haber sido declarada como Monumento Nacional, el decreto 1802 la nombra, Bien de Interés Cultural de Carácter Nacional."),
                Sitio("Jardin Botanic", "jardinb", "Qué son los jardines botánicos o huertos botánicos, son espacios que se centran en la protección, exposición y estudio de las plantas o especies vegetales. Un jardín botánico se dedica a realizar investigaciones científicas sobre la biología centrada en las plantas y se comprometen a exhibir y educar sobre estas.")
            )
        )

    }
}
