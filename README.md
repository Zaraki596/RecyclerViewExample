# RecyclerViewExample
This is Project uses RecyclerView as name mentioned and uses card view to display data from GITHUB API using REST API'S.

![Example](https://media.giphy.com/media/MVCzupB2FK67jYCOzc/giphy.gif)

## PROCESS

Used RecyclerView by using dependency of Recycler View in build.gradle of app:Module and created basic layout for REcycler view in activitymain.xml wrote Adapter Class for REcycler View then created a layout for USER NAME and IMAGEVIEW using Google cardView dependency included Volley, GLide and GSON dependency in build.gradle, Then passed the GITHUB api URL in The Volley Library After a successfull callback in the volley used GSON parsing library to generate JAVA objects using MODEL and then passed this java object to adapter and used Gide library to load Images into ImageView then Binded all together into a Recycler View to generate the Image and Title of User.
```
implementation 'com.android.support:recyclerview-v7:27.1.0'
implementation 'com.android.support:cardview-v7:27.1.0'
```


## Built With

* [Volley](https://github.com/google/volley) - Networking Library
* [Glide](https://github.com/bumptech/glide) - Used For Image loading
* [Gson](https://github.com/google/gson) - Used to Parse Json into PLAIN OLD JAVA OBJECTS aka POJO 
* [GITHUB API](https://api.github.com/users) - Used to generate JSON File for GIT USERS
