import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class MyService:Service() {
    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }
    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        return START_STICKY
        Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show()
    }
}