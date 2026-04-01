# Social-Spark-App
A Repo for a Daily Social Suggester App (ST10537175)

This is an App that provides social interaction suggestions based on the user's input time of day, You can watch the video at https://youtu.be/U6_nwlzV7Gw to understand and get the full experience on how exactly the app works


<img width="1920" height="1032" alt="Social Spark – activity_main xml  Social_Spark app main  2026_04_01 11_54_40" src="https://github.com/user-attachments/assets/643940bf-eabc-48bb-a528-7a69bce26465" />



 #        FEATURES
The following features are provided in the app
.The Input field whereby the user will input the time of the day.
.The Suggest Button that will execute the suggestions based on the input the user provided
.The Reset Button that  will clear  everything inside the input and the display suggest field upon clicking it.
.And the Display suggest field that will display different kind of texts executed by the suggest display button

  #      IF STATEMENTS
The code makes use of the if statements to execute the text only if certain conditions are met
eg. If the user input is "morning" ,the if statement checks if the condition is true and if so execute the code(the suggestion)
          
#	Error Handling
I've also used error handling to prevent the program from crashing should the user input the incorrect text
.Should the user input  be empty, The if statement will be executed to display the text "Invalid Input Entered"
.Should the user input a value besides... "Morning", "Mid-Morning", "Afternoon", "night", "Evening" ,An Error message will be displayed
