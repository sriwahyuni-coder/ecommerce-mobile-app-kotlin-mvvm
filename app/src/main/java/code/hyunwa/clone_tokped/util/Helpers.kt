package code.hyunwa.clone_tokped.util

import android.app.Activity
import android.app.Dialog
import code.hyunwa.clone_tokped.R

class Helpers {

    fun showProgressDialog(activity: Activity) : Dialog{
        val dialog = Dialog(activity)
        var dialogLayout = activity.layoutInflater.inflate(R.layout.dialog_loader, null)
        dialog?.let {
            it.setContentView(dialogLayout)
            it.setCancelable(false)
            it.window?.setBackgroundDrawableResource(android.R.color.transparent)
        }
        return dialog
    }
}