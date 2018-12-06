package alex.betatech.com.voicealarm.alarms

import alex.betatech.com.voicealarm.R
import alex.betatech.com.voicealarm.addOrEditAlarm.AddEditAlarmActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class AlarmsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarms)
        setupToolbar()

    }

    //TODO : Move it to ViewModel
    fun openConfigureAlarm(view : View){
        startActivity(Intent(this,AddEditAlarmActivity::class.java))
    }

    private fun setupToolbar() {
        setSupportActionBar(findViewById(R.id.toolbar))
    }
}
