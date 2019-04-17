#Bus transportation system
This application usumes that users will make use of a tap and go card to pay for their trips.
Users of the system should be able to access any bus provided that they have a positive balance on their card.
Users can opt for either an adult card or children between the ages of 6 - 17 can receive a card that would enable them to receive discount.
Commutors can choose any route and may even make use of connect routes in other word travel without leaving the bus station and 
continue with a different bus.

##Stakeholders
The current stateholder list include:
- Commutor
- Bus driver
- Cashier

##System in detail
###Boarding 
Users are able to board any bus from any basestation. In this case a basestationi refers to the station where the commutor boards 
the bus. The destination station is where the commutor leaves the bus. The total fees are calculated when the commutor steps of the 
bus this includes the distance traveled times a predefined fee. Depending on the time of the day
there may be an increase hence there is peak and offpeak times. There is also weekend and public holiday 
increase fee that are caculated on their respective times. 

###Bus Driver
A bus driver can drive only one bus at a time but might throughout the duration of a working week be assigned to several different
busses therefor the bus_id is stored. The location of where the driver is assigned to might also change therefor the route details
take all of this information into consideration. A bus will only travel along a predefined route for that particular day. This doesn't mean
that a bus cannot change routes and it might as business needs require.

###Determining route
The route has a unqiue identifier name that requires the departure station and the destination station. 
Based upon that the total distance is also calculated. 