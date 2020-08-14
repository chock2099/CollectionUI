package com.icruz.allaboutdialog

import androidx.fragment.app.FragmentManager

interface DialogView {

    fun init()

    fun bind()

    fun showDialog(fragmentManager: FragmentManager)

    fun dismissDialog()
}