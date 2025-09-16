package com.cyrus.example.ui.tabs

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.cyrus.example.R
import com.cyrus.example.antidebug.AntiDebug
import com.cyrus.example.antidebug.AntiDebugActivity
import com.cyrus.example.antisniff.AntiSniffActivity
import com.cyrus.example.device_fingerprint.DeviceFingerprintActivity
import com.cyrus.example.hook.HookActivity
import com.cyrus.example.root.RootActivity

class SecurityFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_security, container, false)

        view.findViewById<Button>(R.id.button_antidebug).setOnClickListener {
            startActivity(Intent(requireContext(), AntiDebugActivity::class.java))
        }
        view.findViewById<Button>(R.id.button_sigtrap).setOnClickListener {
            val detected = AntiDebug.isDebuggerDetected()
            Toast.makeText(requireContext(), if (detected) "Debugger Detected" else "No Debugger Detected", Toast.LENGTH_SHORT).show()
        }
        view.findViewById<Button>(R.id.button_hook).setOnClickListener {
            startActivity(Intent(requireContext(), HookActivity::class.java))
        }
        view.findViewById<Button>(R.id.button_root).setOnClickListener {
            startActivity(Intent(requireContext(), RootActivity::class.java))
        }
        view.findViewById<Button>(R.id.button_device_fingerprint).setOnClickListener {
            startActivity(Intent(requireContext(), DeviceFingerprintActivity::class.java))
        }
        return view
    }
}
