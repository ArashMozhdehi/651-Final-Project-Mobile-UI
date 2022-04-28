---
cover: ../../.gitbook/assets/memorybench.jpg
coverY: 0
---

# Amenities

{% hint style="info" %}
**Good to know:** For the user's safety he/she will be notified about the traffic incidents and construction site in the city of Calgary 100m ahead of them.
{% endhint %}



{% embed url="https://youtu.be/ENXZ2ySqN-E" %}
Alerting system for the safety of the user
{% endembed %}

Animated help allows the users to conveniently learn about the functionalities of the application with a few taps.

{% embed url="https://youtu.be/WM4YBDzvY_M" %}

The batch of check-boxes to the left bottom of the pages, allows the user to find the amenities on the mapping with different layers of pin-points. By clicking on the pin-points you can see the best bike route to the destination, as well as distance and estimated time to reach the destination.

{% embed url="https://youtu.be/U91_Zpi02mY" %}
Map functionalities for finding routes.
{% endembed %}

The user can also use different styles of map. The application changes the controls' colors respectively based on the style to make the application user-friendly. To make the map more user friendly, I removed the map's PoI's and styled it based on the application's uses and functionalities.

{% embed url="https://youtu.be/GZAb5HJwlGU" %}
Map Styles
{% endembed %}

{% hint style="info" %}
**Good to know:** Other users' feedback on these facilities helps the application to find highest rate. The algorithm that is application uses is based on Q-Learning. The state is the spatial block that user is located. The action is the choice of amenities and the reward are the users' feedbacks.
{% endhint %}

{% hint style="info" %}
**Good to know:** Since the condition of the facilities may change in the future (e.g. the municipality may improve the condition of a restroom), there is exploration/exploitation parameter that allows the facilities with lower rate be chosen with less probability.
{% endhint %}

This functionality allows the user to easily find the public facilities (Water Fountains for drinking water and refilling their canteen or bottle, restroom, and bench to rest) of the city of Calgary.

First the user will be asked to enter a radius for search and within that radius the back-end sends the best match to the UI and the best route will be found for cycling to that location and the user will be directed to that location through the map all the way of that route that route.

{% embed url="https://youtu.be/AGigfy2gYK8" %}
Best route to the facility will be found and the user will be guided along the way
{% endembed %}

The user can then submit his/her feedback about the facility to help the other users in the future. He/she can also skip and don't submit any feedback. The users will be thanked for their feedbacks.

{% embed url="https://youtu.be/TPbhbIFUpHY" %}

{% embed url="https://youtu.be/KhVWTP2tXHY" %}

{% embed url="https://youtu.be/uL_GmYh2jDs" %}
