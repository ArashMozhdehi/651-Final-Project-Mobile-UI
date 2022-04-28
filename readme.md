![Banner](/images/banner.png)
# Bike Assistant – Mobile Application :bicyclist: :biking_woman:

## Table of Contents
- [Introduction](#introduction)
- [Functionalities](#functionalities)
- [Supplementary Information](#supplementary-information)
- [Project Launch](#project-launch)

## Introduction
“Bike Assistant” is a software suite aims to provide an aesthetically pleasing and animated UI for cyclists in Calgary to have one-stop supporting service during their journey. The goal of this project is to provide a more convenient, fun and safer cycling experience for Calgarians. “Bike Assistant” consists of an android mobile app and an interactive web map app. This file describes the functionalities of the mobile app. Please refer to [another repo](https://github.com/ArashMozhdehi/ENGO-651-Final-Project-Backend) of this project for the technologies and technical details applied as well as the functionalities of the web map app. 

## Functionalities
### 1. Initiate the App
#### 1.1. Splash Screen
![Bike Assistant](/images/bikeassistant.PNG) 

Animated introduction of the mobile application.
#### 1.2. Internet Connection Checking
![Internet](/images/internet.PNG) 

Internet connectivity check to ensure user is able to connect the back-end with real-time and semi-real-time API from the open data portal of the city of Calgary.
User will be alerted and asked to activate a Wi-Fi or mobile connection if user is not connected to the Internet.
Use can press exit button to close the application if user does not want to connect to the Internet.
### 2. Authentication 
#### 2.1. Login 
![Login](/images/login.PNG) 

It is a secure login system that receives Token from the back-end and stores it in the internal DB. There is secure communication between the flask-based back-end and this Mobile UI. User is required to fill in username and password for login.
#### 2.2. Registration
![Registration](/images/registration.PNG) 

User is required to provide (i) username, (ii) first name, (iii) last name, (iv) password and (v) weight to create an account. Duplicated username is not allowed and the application will check if the user is already existed. Successful registration will be re-directed to login page with username being auto-filled.
#### 2.3. Forgot Password
![ForgotPassword](/images/ForgotPassword1.PNG) 
![ForgotPassword](/images/ForgotPassword2.PNG) 

User can click “Forgot your password?” in case it is needed. User is then required to input the email address of the registered account for receiving a secure recovery code to reset password.

![ForgotPassword](/images/ForgotPassword3.PNG) 

An email will be sent to user with the recovery code.

![ForgotPassword](/images/ForgotPassword4.PNG) 
![ForgotPassword](/images/ForgotPassword5.PNG) 
![ForgotPassword](/images/ForgotPassword6.PNG) 

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
User can logout the session.

## Supplementary Information
- [Mobile Application Manual]( https://arash-mozhdehi.gitbook.io/bike-assistant/v/mobile-application/)
- [Web-based Application Manual](https://arash-mozhdehi.gitbook.io/bike-assistant/v/web-based-application/)
- [Data Specifications](https://arash-mozhdehi.gitbook.io/bike-assistant/)
- [API Documentation - Swagger](https://app.swaggerhub.com/apis-docs/uofcengo/BikeAssistance/1.0.0)
- [Backend GitHub Repo](https://github.com/ArashMozhdehi/ENGO-651-Final-Project-Backend)

## Project Launch
April 2022
