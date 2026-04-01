package com.example.socialspark // Double check this matches your project!

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // 1. Declare variables and link with your XML
        val etTimeInput = findViewById<EditText>(R.id.timeInput)
        val suggestionDisplay = findViewById<TextView>(R.id.suggestionDisplay)
        val btnReset = findViewById<Button>(R.id.resetButton)
        val btnSuggest = findViewById<Button>(R.id.suggestButton)

        // 2.Add an eventListener, code gets executed when the suggestButton is clicked
        btnSuggest.setOnClickListener {
            val timeOfDay = etTimeInput.text.toString().trim()
                .lowercase()//Convert to string, removes any whitespaces & convert to lowercase


            //Handling Error that may occur(if input is empty)
            if (timeOfDay.isEmpty()) {
                etTimeInput.error = "Input cannot be empty!"
                return@setOnClickListener // Stops the code from running any further
            }

            //Executed in user types anything besides the following
            if (timeOfDay != "morning" && timeOfDay != "afternoon" && timeOfDay != "evening" && timeOfDay != "night") {
                etTimeInput.error = "Please enter morning, afternoon, or evening.."
                return@setOnClickListener
            }

            //Executed if the above a false
            etTimeInput.error = null // Clears the error icon

            //Adding the if Statements to edit the message in the textView
            if (timeOfDay == "morning") {
                suggestionDisplay.text = "Send a GoodMorning Text to Your Family"
              }else if (timeOfDay == "evening"){
                suggestionDisplay.text = "Call a family relative to catch up"
             } else if (timeOfDay == "afternoon") {
                suggestionDisplay.text = "Reach out to a colleague with a Quick Thank you"
             } else if (timeOfDay == "night") {
                suggestionDisplay.text = "Take your wife to the Cinema"
            }
        }



        // 3. Reset Button Logic
        btnReset.setOnClickListener {
            etTimeInput.text.clear()
            etTimeInput.error = null //removes the error message
            //etTimeInput.setBackgroundResource(android.R.drawable.edit_text)
            suggestionDisplay.text = "Suggest"
        }
    }
}
