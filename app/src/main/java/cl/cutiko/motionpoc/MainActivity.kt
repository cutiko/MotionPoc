package cl.cutiko.motionpoc

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        backGrounderButton.setOnClickListener {
            with(immutableView) {
                visibility = if (visibility == View.INVISIBLE) View.VISIBLE else View.INVISIBLE
            }
        }
    }
}
