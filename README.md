## Popular Movies App - Espresso QA Automation
### Automated test cases written in Espresso:

![Test Preview](/README_Resources/test.gif)

The app was created by my friend, Jayvy Difuntorum ([@gr3y6h0st](https://github.com/gr3y6h0st/)), but the automation framework was designed by me, Dustin Sison.

This repo was forked from [https://github.com/gr3y6h0st/Popular-Movies-App](https://github.com/gr3y6h0st/Popular-Movies-App)

This framework uses Espresso to test all features of the app, and the framework is organized in directories containing tests and robots:

![test structure](/README_Resources/test_org.png)

#### Robots
Robot files contain all the related functions for a specific activity. This app uses three robots, one for the home page, the movie details page, and settings page. 
Each robot contains functions that test features on their pages, as well as validate any displayed information.

#### Tests
Test files use the functions from one or multiple robots to test user flows. 
Some examples include:
 - Viewing a movie details page
 - Changing the 'sort by' settings
 - Marking a movie as a favorite

### Setup:
To build this app locally, you will need an API Key from The Movie Database, which you can obtain
here:

[https://www.themoviedb.org/settings/api](https://developer.android.com/studio)

If needed, create an account, then generate an API key. Once you have this key, clone the repository
locally, and open the /app/build.gradle file.

Under BuildTypes > Debug > BuildConfigField, replace API_KEY with the generated API key from The
Movie Database. It should look something like this afterwards:

`buildConfigField 'String', "ApiKey", "\"f1faee8ee152f2eb88a5e28e2e1d1128\""`

The app should now be able to compile.

I highly recommend using [Android Studio](), and using Gradle JDK 1.8 to compile.

### An Inside Look into the app itself:

Popular Movies is a fully-featured application that requests movie information from The Movie
Database API over a web service.

![App Preview 1](/README_Resources/README_Movies_Landing.png) ![App Preview 2](/README_Resources/README_Movies_Movie_Detail.png) ![App Preview 3](/README_Resources/README_Movies_Settings.png)

The app is able to pull the most recent data on all movies released to-date and sort them according
to popularity, rating, or by user favorite titles.