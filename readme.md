![Banner](/images/banner.png)
# Bike Assistant – Mobile Application :bicyclist: :biking_woman:


## Table of Contents
- [Introduction](#introduction)
- [UML Architectural Design](#uml-architectural-design)
- [UML Sequence Diagram](#uml-sequence-diagram)
- [Architectural Description](#architectural-description)
- [Functionalities](#functionalities)
- [Achievements of Mobile Application Regarding the Project Requirements](#achievements-of-mobile-application-regarding-the-project-requirements)
- [Supplementary Information](#supplementary-information)
- [Project Launch](#project-launch)


## Introduction
“Bike Assistant” is a software suite aims to provide an aesthetically pleasing and animated UI for cyclists in Calgary to have one-stop supporting service during their journey. The goal of this project is to provide a more convenient, fun and safer cycling experience for Calgarians. “Bike Assistant” consists of an android mobile app and an interactive web map app. This file describes the functionalities of the mobile app. Please refer to [another repo](https://github.com/ArashMozhdehi/ENGO-651-Final-Project-Backend) of this project for the technologies and technical details applied as well as the functionalities of the web map app. 


## UML Architectural Design
The Figure 1 illustrates the archetectural design sigram of this Software Suite.
<p align="center" width="100%">
    <img width="70%" src="/images/software arch.png"> 
    <p align="center" > Figure 1: UML Diagram for Architectural Design</>
</p>

<!-- ![Architectural Design](/images/Picture1.jpg) -->

## UML Sequence Diagram

In Figure 2, you can see the Sequence Diagram of the Mobile Application.

<p align="center" width="100%">
    <img width="100%" src="/images/Mobile UI Sequence Diagram.png"> 
    <p align="center" > Figure 2: UML Sequence Diagram</>
</p>

## Architectural Description
The compentents of this sofeware suite are, as follows:
### 1. Databases
- PostgreSQL database with PostGIS host on Heroku cloud platform to store user’s activity. Figure 3, shows the UML Entity-Relation Diagram.
- **Firebase Real-Time DB**, a NoSQL database, host on Google cloud servers to store the user’s profile and credential. In Figure 4, the data storage model of this Real-Time DB is observable. We used Firebase Real-Time DB, for subscribing and real-time update upon data changes.
- **Firebase Storage** is used for staroage of user's profile images. The storage structure of Firebase Storage allows storing images in file structure instead of in BLOB/CLOB format.

<p align="center" width="100%">
    <img width="100%" src="images/ENGO 651's ERD.png"> 
    <p align="center" > Figure 3: UML Entity-Relation Diagram</>
</p>

<p align="center" width="100%">
    <img width="100%" src="images/Firebase RT DB.png"> 
    <p align="center" > Figure 4: Firebase Real-Time DB's storage model</>
</p>

<p align="center" width="100%">
    <img width="100%" src="images/firebase Storage.png"> 
    <p align="center" > Figure 5: Firebase Storage's storage model</>
</p>

### 2. Backend RESTful API
- Backend RESTful API powered by Flask library of Python.
- Consists of **17 API endpoints**, with over **1,000 lines of code** in Python high-level programming language, that each are explained in detail in GitBook.
- Token assignment is used for secure authorization and authentication when the API is used.
- To prevent **Dictionary, Rainbow, and impade Brute Force attacks**, we used an information security method of Salt concatination and Hasing using SHA256.
### 3. Web Application
- HTML, CSS and JS for asynchronous communication and interactive and responsive front-end.
- Web-UI consist of 12 html pages, 9 CSS stylesheet files. 8 .js script files in JavaScript with over **5,000 lines of code**. 
- It also consists of 18 routes and methods in Python.
- Material UI and Bootstrap 5 for aesthetic an interactive UI design.
- For the **Asynchronous** communication, to improve UX, we used jQuery with **AJAX** without SOAP protocol to take advantage of JSON format instead of XML.
### 4. Mobile Application
- It consist of 27 Java classes with over **15,00 lines of code**.
- It also consists of 27 layout designs with over **9000 lines of code** in XML.
- 
### 5. Others
- Google Map JS SDK for map visualization and a mapping frontend.
- Google Firebase SDK for retrival and storage.
- Google’s Matrix API, Google Place, Google Direction are the other APIs that are used in this web application.
- We used subscription based messagin protocol to keep track on users’ location, bearing, velocity, source, and destination of the Mobile Application users.
- We used **Machine Learning** for best amenity's recommendation.
- jQuery with AJAX without SOAP protocol is used for Async communication.
- For simplification and noise reduction and smoothing of trajectories, we used **Douglas–Peucker** algorithm and **Kalman filtering** technique.
- We used a fromula from "The Compendium of Physical Activities" for Calories burnt calculation.
- [Gitbook](https://arash-mozhdehi.gitbook.io/bike-assistant/) for comprehensive documentation of this project.
- [GitBook](https://arash-mozhdehi.gitbook.io/restful-apis-tutorial/) for API documentation with examples.
- [Swagger](https://app.swaggerhub.com/apis-docs/uofcengo/BikeAssistance/1.0.0) for API documentation with examples.

## Functionalities
### 1. Initiate the App
#### 1.1. Splash Screen

In this splash screen name of the application will be transferred to the top of the screen and below that there Lottie animation of a biker that exits the screen after 2.7 seconds.

<p align="center" width="100%">
    <img width="20%" src="https://files.gitbook.com/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FufR1dXN61ueZrnNqp9Io%2Fuploads%2Fgit-blob-6b234f74fff70c85fc7689fb746c882c2594c6fa%2Fqemu-system-x86_64_uW3DiEWIVl.gif?alt=media"> 
</p>

#### 1.2. Internet Connection Checking
Connectivity to the internet will be checked. This functionality is to make sure that the user have the ability to connect to the back-end, real-time and semi-real-time APIs of the city of Calgary and Google's.
In case the user is not connected to the Internet an alert will be shown to ask the user to activate a WiFi or mobile connection. In case that the user doesn't want to connect to the Internet there is an exit button that closes the application as this application cannot work without the Internet.

<p align="center" width="100%">
    <img width="20%" src="https://files.gitbook.com/v0/b/gitbook-x-prod.appspot.com/o/spaces%2FufR1dXN61ueZrnNqp9Io%2Fuploads%2Fgit-blob-4849ece1b1d10b4d2910d32f3682e4a70b5fb643%2FZ6idRWU.gif?alt=media"> 
</p>

### 2. Authentication 
#### 2.1. Login 

This login page has an nice Day and Night animation as well as an animation that moves the text-boxes and button from outside of the page to the middle. This login page allows secure login to the system and receives the Token from the back-end and stores it in the internal DB to be used in future for secure communication between the flask-based back-end and this Mobile UI.

<p align="center" width="100%">
    <img width="20%" src="/images/bS0P9hW[1].gif"> 
</p>


<p align="center" width="100%">
    <img width="20%" src="/images/XLr2L15[1].gif"> 
</p>


#### 2.2. Registration

<!-- ![Registration](/images/registration.PNG)  -->
The registration page with nice Day and Night animation provide a nice UI for the user to register an account in the system using the back-end server powered by Flask.
The registration page asks the user to enter his/her first name, last name and weight, email, as well as a username and password combination for the secure access in the future. The application checks whether the user already exists if so an error will be prompted. For providing the user with a great user experience upon the successful registration the user will be redirected to login page and the user field will be filled with the username for convenient login.

<p align="center" width="100%">
    <img width="20%" src="/images/cE4PjHu[1].gif"> 
</p>

#### 2.3. Forgot Password

User can click on “Forgot your password?” in case they forgot their credentials. User is then required to input the email address of the registered account for receiving a secure recovery code to reset password.
An email will be sent to user with the recovery code.
User can key in the recovery code to the mobile application. New password can be set for the account. 


<p align="center" width="100%">
    <img width="20%" src="/RzF9vUB[1].gif"> 
</p>

<p align="center" width="100%">
    <img width="20%" src="/MfeKmZR[1].gif"> 
</p>
<!-- ![ForgotPassword](/images/ForgotPassword1.PNG) 
![ForgotPassword](/images/ForgotPassword2.PNG)  -->
<!-- 
<p align="center" width="100%">
    <img width="20%" src="/MfeKmZR[1].gif"> 
</p>

<p align="center" width="100%">
    <img width="20%" src="/MfeKmZR[1].gif"> 
</p> -->

<!-- <p align="center" width="100%">
    <img width="20%" src="/images/IdtgYrU[1].gif"> 
</p> -->
<!-- https://i.imgur.com/IdtgYrU.gif -->

<p align="center" width="100%">
    <img width="20%" src="/images/IdtgYrU[1].gif"> 
</p>

<p align="center" width="100%">
    <img width="20%" src="/images/88QUEYr[1].gif"> 
</p>

<!-- https://i.imgur.com/88QUEYr.gif
 -->
<!-- ![ForgotPassword](/images/ForgotPassword3.PNG) 


![ForgotPassword](/images/ForgotPassword4.PNG) 
![ForgotPassword](/images/ForgotPassword5.PNG) 
![ForgotPassword](/images/ForgotPassword6.PNG)  -->

User can key in the recovery code to the mobile application. New password can be set for the account. 

### 3. Dashboard – Mobile App
![Location](/images/location.PNG) 

User will be asked to allow location permission when reach to the dashboard as the application requires real-time GPS data to provide the best services. 

![Dashboard](/images/dashboard.PNG) 

User can click on the buttons on the dashboard for different services.

![DashboardMenu](/images/DashboardMenu.PNG) 

A drawer menu is also available for convenient use. 

#### 3.1. Starts
![Features](/images/features.PNG) 
![Auto](/images/auto.PNG) 

User can explore the City of Calgary with the mapping front-end. User can select interested type of built-in features or key in (with auto-complete support) a place to find the details of the destination. 

**Example:** User can key-in "Uni" and get a list of suggested auto-complete keywords for searching a destination.

![Review](/images/rfeedback.PNG) 
![Submit](/images/sfeedback.PNG) 

User can review and give feedbacks of the selected amenities or type of bike friendly destination. 

**Example:** User can rate from 0 – 5 starts and write comment in the text box for feedback submission.

![Route](/images/route.PNG) 

User can get the recommended route to the selected destination. 

![Alert](/images/alert.PNG) 

When user is approaching within 100m of a traffic incident or construction project site, a warning notification will be sent to user as a safety alerts. 
#### 3.2. Amenities
![Radius](/images/radius.PNG) 
![Water](/images/wfeedback.PNG) 

The application supports facilities types of (i) water fountains, (ii) toilets and (iii) bench for searching, routing and providing feedbacks. 

**Example:** User can input a distance for searching nearby amenities, e.g. input “500” represents 500m.

User can rate 0-5 stars for Cleanness and Functionality in the facilities feedback form.
#### 3.3. Settings
![ProfileUpdate](/images/ProfileUpdate1.PNG) 

User can perform the following actions in the setting: (i) change password, (ii) change weight and (iii) update profile picture.

**Example:** User can input a change for the weight information by input a new value in the page, e.g. “50” represents 50kg.

![ProfileUpdate](/images/ProfileUpdate2.PNG) 
![ProfileUpdate](/images/ProfileUpdate3.PNG) 
![ProfileUpdate](/images/ProfileUpdate4.PNG) 

User can select an image from the google drive or phone storage and make adjustment, such as cropping, to update the profile picture. 

#### 3.4. Statistics
![Stat](/images/stat.PNG) 

User can view the Calories burned Today, last 7 days, and last 30 days with progress bar and bar charts. 
#### 3.5. Logout
User can logout of the system through the logout button.

## Achievements of Mobile Application Regarding the Project Requirements
This Mobile application satisfies the following requirements for the ENGO 651 course project.
1. "your final project must be sufficiently distinct from the labs in this course, and must be more complex than the labs." : This Mobile Application is far more complex than the lab as it has sophisticated mapping, animation, data collection, data collection, data storage features. (Requirement #1)
2. "must have a mapping front-end": Two thoroughly customized and fully interactive maps, customized for this application's use, with the ability to be intractably customized by the user as well are presented to show the amenities and the locations in the city of Calgary. The user is also provided with the distance and estimated time of reaching the destinations and amenities. (Requirement #2)
3. "must have a RESTful API back-end": The application is connected to the RESTful API back-end, powered by Flask library of python. (Requirement #3)
4. "RESTful API must have authentication": The token connected by the back-end is used for communication with the back-end. (Requirement #4)
5. "must use at least one open data": This application uses the following data sources for the purpose of mapping and data analysis: (Requirement #6)
   * Open Calgary
     * Parking lot for the bikes
     * Historical sites
     * Ungoing events in the city of Calgary (It only pick the events that are not ended yet)
     * Calgary's historical sites
     * Calgary's benches
     * Calgary's wash rooms
     * Calgary's water fountains
     * Calgary's live traffic incidents
     * Calgary's construction sites
   * Google's APIs
     * Google Maps SDKs
     * Google Directions (For visualizing the bike-friendly route to the destination)
     * Google Distance Matrix (For measuring the distance between the current location of the user and the destination)
     * Google Geocoding (For finding the place based on the Zip Code)
     * Google Geolocation (User's current location)
     * Google Places (For auto-complete)
6. "must use at least one live data set": This mobile application uses the current location of the user and Calgary's live traffic incidents as the live data sources. (Requirement #7)
7. "must perform data analytics using the following data sources": The mobile application performs data analysis on the current location of the user, Calgary's live traffic incidents (another live data source), and construction sites. It sends a notification to the user when he/she approaches those locations. (Requirement #8)
8. "the front-end must be interactive": This mobile application provides a responsive, interactive, user-friendly, aesthetically pleasing, animated through a Android-based UI. (Requirement #9)
9. "solve a problem": The purpose of this Mobile application is to allow the users to find bike-friendly destinations, e.g bike park, and the best bike route for them. It also directs the users to the amenities, e.g. wash room, in the city of Calgary. It also provides safety to the users by giving them heads up about the dangers along the road, e.g. incident sites. (Requirement #10)

## Supplementary Information
- [Mobile Application Manual and Documentation]( https://arash-mozhdehi.gitbook.io/bike-assistant/v/mobile-application/)
- [Web-based Application Manual and Documentation](https://arash-mozhdehi.gitbook.io/bike-assistant/v/web-based-application/)
- [Database Documentation](https://arash-mozhdehi.gitbook.io/bike-assistant/)
- [GitBiik Space](https://arash-mozhdehi.gitbook.io/bike-assistant/)
- [API Documentation - GitBook](https://arash-mozhdehi.gitbook.io/restful-apis-tutorial/)
- [API Documentation - Swagger](https://app.swaggerhub.com/apis-docs/uofcengo/BikeAssistance/1.0.0)
- [Backend API and Web-UI's GitHub Repo](https://github.com/ArashMozhdehi/ENGO-651-Final-Project-Backend)

## Project Launch
February 2022
