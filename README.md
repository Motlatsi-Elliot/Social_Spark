# Social-Spark-App
A Repo for a Daily Social Suggester App (ST10537175)

This is an App that provides social interaction suggestions based on the user's input time of day, You can watch the video at https://youtu.be/U6_nwlzV7Gw to understand and get the full experience on how exactly the app works


<img width="1920" height="1032" alt="Social Spark – activity_main xml  Social_Spark app main  2026_04_01 11_54_40" src="https://github.com/user-attachments/assets/643940bf-eabc-48bb-a528-7a69bce26465" />



 #        Core-FEATURES
 *Provides specific activities based on "Morning", "Afternoon", "Evening" or "Night" inputs
 *Anything that is not one of the four valid timeframes will be rejected(error message pops up)
 *Automatically handles "Morning" and "morning" using .lowercase and .trim()
 *Incase of an Invalid input, .error provides a red"!" with an error message

 *LinearLayout designed to easy navigation and readbility

  #      IF STATEMENTS
The code makes use of the if statements to execute the text only if certain conditions are met
eg. If the user input is "morning" ,the if statement checks if the condition is true and if so, executes the code(the suggestion message)
          
#	Error Handling
I've also used error handling to prevent the program from crashing should the user input the incorrect text
*Should the user input  be empty, The if statement will be executed to display the text "Invalid Input Entered"
*Should the user input a value besides... "Morning",  "Afternoon", "night", "Evening" ,An Error message will be displayed

