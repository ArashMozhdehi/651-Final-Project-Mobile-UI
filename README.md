---
description: >-
  This user-friendly and animated mobile application is designed and implemented
  by using Android Studio IDE by Arash Mozhdehi for ENGO 651's course project.
cover: >-
  .gitbook/assets/1--Epic-Bike-Pathways-in-Calgary-Content-Block-Full-Width-002-20180102.jpg
coverY: 0
---

# Bike Assistant's Mobile Application

{% hint style="info" %}


**Good to know:** This Web-Based application satisfies the following requirements for the ENGO 651 course project.

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
{% endhint %}

{% hint style="info" %}
**Good to know:** For this Mobile Application the following APIs of Google are used:

1. Google Maps SDKs
2. Google Directions
3. Google Distance Matrix
4. Google Geocoding
5. Google Geolocation
6. Google Places
{% endhint %}

{% hint style="info" %}
**Good to know:** The objective Bike Assistant's Mobile Application is to provide an aesthetically pleasing and animated UI for the users. The goal of this project is to promote biking among the Calgarians by making destination choosing and cycling more fun, more convenient and safer for bikers.
{% endhint %}

To provide the safety for the Calgarians' loved ones this application allows the users, e.g. parents of a bike rider child, to track their loved one's, e.g. their child, whereabouts. This service is provided through the mobile application, publishing the origin, destination, current location and the current speed of the bike in JSON format. Through the password protected WebUI the users can see those published information on the map powered by Google API using MQTT protocol.

![JSON message](https://i.imgur.com/T6FUauK.png)

### Jump right in to the application

This is the starting page of the application:

{% content-ref url="start/splash-screen.md" %}
[splash-screen.md](start/splash-screen.md)
{% endcontent-ref %}

{% content-ref url="start/internet-connection-checking.md" %}
[internet-connection-checking.md](start/internet-connection-checking.md)
{% endcontent-ref %}

{% hint style="info" %}
**Good to know:** Since this application requires access to the Internet, this application mandates the user to connect to the Internet. For the user's convenience and providing a great user experience it send the user directly to Internet settings to activate the connection.
{% endhint %}

### Authentication and Authorization

In the following parts the functionality of the Login and Registration pages of this mobile application will be discussed.

{% content-ref url="authentication/login.md" %}
[login.md](authentication/login.md)
{% endcontent-ref %}

{% content-ref url="authentication/registration.md" %}
[registration.md](authentication/registration.md)
{% endcontent-ref %}

### Dashboard

In the following link the functionality of the dashboard, the main part of the application, is explained.

{% content-ref url="broken-reference" %}
[Broken link](broken-reference)
{% endcontent-ref %}

