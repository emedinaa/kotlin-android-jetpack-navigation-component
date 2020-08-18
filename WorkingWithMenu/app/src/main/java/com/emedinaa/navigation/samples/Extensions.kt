package com.emedinaa.navigation.samples

import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment

/**
 * @author : Eduardo Medina
 */
fun Fragment.toast(message: String) {
    Log.d("CONSOLE", message)
    Toast.makeText(requireContext(), message, Toast.LENGTH_LONG).show()
}