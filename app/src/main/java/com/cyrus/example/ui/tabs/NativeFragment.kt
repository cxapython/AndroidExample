package com.cyrus.example.ui.tabs

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.cyrus.example.R
import com.cyrus.example.assembly.AssemblyActivity
import com.cyrus.example.jniexample.JNIExampleActivity
import com.cyrus.example.ollvm.OLLVMActivity
import com.cyrus.example.syscall.SyscallActivity
import com.cyrus.example.unicorn.UnicornActivity
import com.cyrus.example.unidbg.UnidbgActivity
import com.cyrus.example.vmp.VMPActivity
import com.cyrus.example.frida_disassemble.FridaDisassembleActivity

class NativeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_native, container, false)

        view.findViewById<Button>(R.id.button_jni).setOnClickListener {
            startActivity(Intent(requireContext(), JNIExampleActivity::class.java))
        }
        view.findViewById<Button>(R.id.button_assembly).setOnClickListener {
            startActivity(Intent(requireContext(), AssemblyActivity::class.java))
        }
        view.findViewById<Button>(R.id.button_syscall).setOnClickListener {
            startActivity(Intent(requireContext(), SyscallActivity::class.java))
        }
        view.findViewById<Button>(R.id.button_ollvm).setOnClickListener {
            startActivity(Intent(requireContext(), OLLVMActivity::class.java))
        }
        view.findViewById<Button>(R.id.button_vmp).setOnClickListener {
            startActivity(Intent(requireContext(), VMPActivity::class.java))
        }
        view.findViewById<Button>(R.id.button_unicorn).setOnClickListener {
            startActivity(Intent(requireContext(), UnicornActivity::class.java))
        }
        view.findViewById<Button>(R.id.button_unidbg).setOnClickListener {
            startActivity(Intent(requireContext(), UnidbgActivity::class.java))
        }
        view.findViewById<Button>(R.id.button_frida_disassemble).setOnClickListener {
            startActivity(Intent(requireContext(), FridaDisassembleActivity::class.java))
        }
        return view
    }
}
