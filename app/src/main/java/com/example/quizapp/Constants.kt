package com.example.quizapp

import android.widget.TextView

object Constants {
    const val USER_NAME : String = "user_name"
    const val TOTAL_QUES : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"
    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(
            1, "What Country does this Flag belong to?",
            R.drawable.ic_flag_of_argentina, "Argentina",
            "Australia", "Arminia",
            "NewZealand", 1
        )
        questionList.add(que1)

        val que2 = Question(
            2, "What Country does this Flag belong to?",
            R.drawable.ic_flag_of_australia, "Argentina",
            "Australia", "Arminia",
            "NewZealand", 2
        )
        questionList.add(que2)

        val que3 = Question(
            3, "What Country does this Flag belong to?",
            R.drawable.ic_flag_of_belgium, "Argentina",
            "Australia", "Belgium",
            "NewZealand", 3
        )
        questionList.add(que3)

        val que4 = Question(
            4, "What Country does this Flag belong to?",
            R.drawable.ic_flag_of_brazil, "Argentina",
            "Australia", "Brazil",
            "NewZealand", 3
        )
        questionList.add(que4)

        val que5 = Question(
            5, "What Country does this Flag belong to?",
            R.drawable.ic_flag_of_denmark, "Denmark",
            "Australia", "Arminia",
            "NewZealand", 1
        )
        questionList.add(que5)

        val que6 = Question(
            6, "What Country does this Flag belong to?",
            R.drawable.ic_flag_of_fiji, "Fiji",
            "Australia", "Arminia",
            "NewZealand", 1
        )
        questionList.add(que6)

        val que7 = Question(
            7, "What Country does this Flag belong to?",
            R.drawable.ic_flag_of_germany, "Germany",
            "Australia", "Arminia",
            "NewZealand", 1
        )
        questionList.add(que7)

        val que8 = Question(
            8, "What Country does this Flag belong to?",
            R.drawable.ic_flag_of_india, "India",
            "Australia", "Arminia",
            "NewZealand", 1
        )
        questionList.add(que8)

        val que9 = Question(
            9, "What Country does this Flag belong to?",
            R.drawable.ic_flag_of_kuwait, "Kuwait",
            "Australia", "Arminia",
            "NewZealand", 1
        )
        questionList.add(que9)

        val que10 = Question(
            10, "What Country does this Flag belong to?",
            R.drawable.ic_flag_of_new_zealand, "Argentina",
            "Australia", "Arminia",
            "NewZealand", 4
        )
        questionList.add(que10)
        return questionList
    }
}