package edu.coe.hughes.guistarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun greet(v: View){
        Toast.makeText(this, R.string.msg, Toast.LENGTH_LONG).show();
    }

    fun changeTxt(v:View){
        var g = this.findViewById<TextView>(R.id.tvResponse);
        g.setText("I've changed....");
    }
}