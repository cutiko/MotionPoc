package cl.cutiko.motionpoc

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        with(recycler) {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = cl.cutiko.motionpoc.MainActivity.PseudoAdapter()
        }

    }

    class PseudoHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun setText(position: String) {
            (itemView as? TextView)?.text = position
        }
    }

    class PseudoAdapter : RecyclerView.Adapter<PseudoHolder>() {

        private val list = makeList()

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PseudoHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(android.R.layout.simple_list_item_1, parent, false)
            return PseudoHolder(view)
        }

        override fun getItemCount() = list.size

        override fun onBindViewHolder(holder: PseudoHolder, position: Int) {
            val text = list[position]
            holder.setText(text)
        }

        companion object {
            private fun makeList(): List<String> {
                val mutableList = mutableListOf<String>()
                for (i  in 0 .. 100) {
                    mutableList.add(i.toString())
                }
                return mutableList
            }
        }
    }
}
