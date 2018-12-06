package alex.betatech.com.voicealarm.db.entity

import java.util.*

data class Alarm constructor(
    var id: String = UUID.randomUUID().toString()
){
}