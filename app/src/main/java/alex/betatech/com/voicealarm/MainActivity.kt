package alex.betatech.com.voicealarm

import alex.betatech.com.voicealarm.add.ConfigureAlarmActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.NonNull

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //TODO : Move it to ViewModel
    fun openConfigureAlarm(view : View){
        startActivity(Intent(this,ConfigureAlarmActivity::class.java))
    }
}
