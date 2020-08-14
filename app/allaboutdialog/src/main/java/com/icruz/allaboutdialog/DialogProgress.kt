package com.icruz.allaboutdialog

import android.app.AlertDialog
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager

class DialogProgress : DialogFragment(), DialogView  {

    private var dialogView: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder =
            AlertDialog.Builder(activity)
        val inflater = requireActivity().layoutInflater
        dialogView = inflater.inflate(R.layout.dialog_progress_layout, null)
        init()
        builder.setView(dialogView)
        //isCancelable = false
        return builder.create()
    }

    override fun init() {

    }

    override fun bind() {

    }

    override fun showDialog(fragmentManager: FragmentManager) {
        this.show(fragmentManager,"tagdialog")
    }

    override fun dismissDialog() {
        this.dismiss()
    }

}