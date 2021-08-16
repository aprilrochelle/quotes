#Quotes Lab Exercise

##Overview

The objective of this lab exercise was to parse JSON data using GSON in Java.

Each time the app runs, a random quote from the list of quotes in the JSON file should be printed to the console.

##How to Run
1. Clone this repository on to your local machine and cd into the directory.
2. Make sure that you have Gradle installed: [Gradle Install Instructions](https://gradle.org/install/)
3. In your `build.gradle` file, add `implementation 'com.google.code.gson:gson:2.8.7'` to the dependencies list.
4. Open the `App.java` file (which should be inside `src > main > java > quotes`)
5. Run `App.main()` and check the console for output.