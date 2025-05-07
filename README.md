---

### **README Document Assignment 2: History Flashcard**

---


# IQ Quiz App
- **Developer**: Sylvester Nyangulu
- **Student Number**: ST10470942
- **Group**: 1
- **Course**: HAW
- **Subject**: IMAD

## Links
- **GitHub Repository**: [Repository URL]
- **YouTube Video**: [YouTube Video Link]



## Project Overview

The IQ Quiz App is a mobile application developed as part of an assignment in Mobile Application and Web Development subject. This application was created using the software "Android Studio" and prompted by kotlin, a programming language used in Android Studio. The app's primary purpose is to simply help student study and test their knowledge, especially students who may have short term memory loss. This app is specifically developed for the history subject.

The IQ Quiz App is a flashcard app that consists of true or false questions related to students who have an interest in history, or rather students who are studding history. The quiz questions are based on the syllabus of history and are questions a student might come across in an exam, hence the app was developed to help students study and test their knowledge or rather IQ in the history subject.

This application also provides students with a score rate that grades the student after attempting a quiz, the app also provides the student with feedback on their score or rather grade of the attempted quiz, followed by the corrections of the questions provided in order for the student to be corrected as well as boost their knowledge. 

The app was developed to meet the requirements of the assignment, which includes a user interface that displays a welcome message and a brief description of the app, as well as flashcard questions that require a true or false answer, and feedback for every answer given, and lastly the score for every question or rather quiz attempted.


## Purpose and Features

### Purpose:
The main goal of this app is to simply help student study and test their knowledge. 

### Key Features:
- Feature 1: Start Button - to start the quiz
- Feature 2: Exit Button - to exit the application
- Feature 3: TextView - to display the quiz questions
- Feature 4: True and False Button - to answer the question displayed in the textview
- Feature 5: Proceed Button - for the user to proceed to the next question
- Feature 6: TextView - to provide the feedback
- Feature 7: Review Button - to review the questions and the answers
- Feature 8: Retry Button - to attempt another quiz

These features aim to provide a user beginner friendly and easy to navigate platform for students studying history.



## Design Considerations

The design of the IQ Quiz was based on the following key considerations:

1. **User Experience (UX)**: The app was designed with the goal of providing an easy-to-navigate user interface, ensuring a seamless user experience.
   
2. **Simplicity**: The app was built to ensure simplicity and performs well with a goal of ensuring that students gain knowledge and study efficiently with no difficulties.
      
3. **Reliability**: The app is reliable and ensures the user gets the most accurate feedback when studying.




## GitHub and GitHub Actions

This project was managed using the platform GitHub for version control, where all code including all changes throughout the duration of building the "Menu Meals" application were committed and pushed regularly. GitHub enabled collaborative coding, allowing me to trace all my changes and maintain project integrity as well as project validity.

### GitHub Actions:
I utilized GitHub and I configured GitHub Actions to automate and test the build and deployment process of the IQ Quiz Application. This includes:

- Running automated build.yml tests to ensure the application's functionality.
- Uploading these build artifacts to GitHub for easy access.

The workflow ensures that my project is automatically built and tested every time I push changes.



## Screenshots

### App Screenshots:
![Screenshot 1](path_to_screenshot_1.png)
*Caption for screenshot 1: [Describe the context, e.g., "The home screen of the app showing the task list."]*

![Screenshot 2](path_to_screenshot_2.png)
*Caption for screenshot 2: [Describe the context, e.g., "The user profile screen where personal information is updated."]*

### Video Demo:
A video showcasing the app's functionality can be viewed here: [YouTube Video Link].


## Challenges and Learnings

During the development of this project, I encountered several challenges, including:

1. **Challenge 1**:Initially when the user would attempt to do a quiz, the user was able to proceed to the next question without answering "true" or "false".
   - **Solution**: Turned out that I had implemented the "BtnNext.isEnabled = false" in the wrong location, therefore Mr Kincade, my IMAD lecturer assisted me by informing me to have a look at my codes and insure that they are all in the correct location.
   
2. **Challenge 2**: The application would crash as soon as the user would attempt the retry the quiz.
   - **Solution**: I called and declare the retry button via "findviewbyid", and further implemented a "val intent" function so that the user would be redirected to the flashcard. 

From these challenges, I learned important lessons in utilising the right commands and functions when coding.

## Future Enhancements

While the current version of the app provides the core functionality, there are several features that could be added in the future, including:

1. **Feature 1**: More subjects like, mathematics, English, physics and etc.
2. **Feature 2**: Include word/number answers and not only restrict the question answers to "true" or "false" answers.
3. **Feature 3**: Include multiple choice questions.
4. **Feature 4**: Users would be able to use the elimination strategy when answering multiple choice questions.
5. **Feature 5**: users would be able to solve or rather show working out when answering maths questions. 


## References

1. Reference 1: Reference 1: The independent institution of education, 2025, IMAD5112/P/W Module manual (word doc) Available at:https://advtechonline.sharepoint.com/:w:/r/sites/TertiaryStudents/_layouts/15/Doc.aspx?sourcedoc=%7BA1FF62F0-8E1A-47BC-99BD-CA07AE24427D%7D&file=IMAD5112_MM.docx&action=default&mobileredirect=true >[accessed 17 march 2025].
2. Reference 2:  Fashion, 2020. Jewellery|Beauty. [image online]. Available at: < https://pin.it/4WJPkHwBC > [Assessed 01 May 2025].
3. Reference 3:  Practical Coding, 2021. Animated Background|Android Studio. [Brand video] Directed by 
Practical Coding, 09 August 2021. Available at: < https://youtu.be/4lEnLTqsnaw?si=b2cEN0Ca9T3CbFjQ > [Assessed 01 May 2025].


## List of Figures

- **Figure 1**: Screenshot of the app's home screen.
- **Figure 2**: Screenshot of the user profile screen.


## Disclosure of AI Usage in My Assessment

In the development of this project, I have used generative AI tools to assist in various parts of the assignment. Below is a detailed disclosure of where and how these tools were used:

### 1. **Section(s) in which Generative AI was used:**
- Kotlin (Flashcard.kt) file in Android studio. 
- Used AI to generate true or false questions based on the South African history.

### 2. **Name of AI Tool(s) Used:**
- **ChatGPT** (OpenAI)


### 3. **Purpose/Intention Behind Use:**
- **Brainstorming**: Used ChatGPT to generate true or false questions based on the South African history.


### 4. **Date(s) in Which Generative AI Was Used:**
-  AI used on **06 May 2025** for brainstorming quiz questions.

### 5. **Link to the AI Chat(s) or Screenshots:**
![Screenshot 2025-05-06 155053](https://github.com/user-attachments/assets/a293e7ae-113c-485c-9626-df3db2a49259)

