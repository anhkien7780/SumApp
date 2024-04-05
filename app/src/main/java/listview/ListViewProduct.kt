package listview

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.kien.sumapp.R
import android.widget.ArrayAdapter
import android.widget.ListView

class ListViewProduct : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view_product)

        val listString = arrayListOf("Kien", "Nam", "Tien", "Phu", "Tung", "Hai", "Son", "Hieu", "Quanh", "Mai", "Linh")
        val listView = findViewById<ListView>(R.id.listView)
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listString)
        listView.adapter = arrayAdapter

    }
}

