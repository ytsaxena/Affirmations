package android.pass.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.pass.affirmations.Adapter.ItemAdapter
import android.pass.affirmations.Data.Datasource
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview : RecyclerView = findViewById(R.id.affirmation_recycler_view)
        val myDataSet = Datasource().loadAffirmations()

        recyclerview.adapter = ItemAdapter(this,myDataSet)
        recyclerview.setHasFixedSize(true)


    }
}