package com.otirbepilef.girardado

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.otirbepilef.girardado.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.imgViewFace.setOnClickListener{

            val number = Random.nextInt(0,5)

            val listImg = listOf(R.drawable.side1,
                R.drawable.side2,
                R.drawable.side3,
                R.drawable.side4,
                R.drawable.side5,
                R.drawable.side6)
            binding.imgViewFace.setImageResource(listImg[number])
        }
    }
}