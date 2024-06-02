package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val tvName : TextView = findViewById(R.id.tv_name)
        val tvScore : TextView = findViewById(R.id.tv_score)
        val tvScoreAvg : TextView = findViewById(R.id.tv_score_avg)
        val tvCongratsOops : TextView = findViewById(R.id.tv_congrats_oops)
        val btnFinish : Button = findViewById(R.id.btn_final)


        tvName.text = intent.getStringExtra(Constants.USER_NAME)
        val mTotalQues = intent.getIntExtra(Constants.TOTAL_QUES, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        tvScore.text = "Your Score is ${correctAnswers} out of ${mTotalQues} Questions"


            if(correctAnswers >= 5){
                tvScoreAvg.text = "Your Score is Above Average"
                tvCongratsOops.text = "CONGRATULATIONS"
            }else{
                tvScoreAvg.text = "Your Score is Below Average"
                tvCongratsOops.text = "Oops"
            }


        btnFinish.setOnClickListener{startActivity(Intent(this, MainActivity::class.java))}

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}