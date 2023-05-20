# MovieApp
## Curently working on multi platform version.

Display popular movies, tv shows and actors using TMDB API  
This app showcases:                                                                      
* Retrofit working together with Room Database                    
* Data saves on local device
* `RecyclerView` working with `Retrofit` and `Room`




## Changelog
PUBLIC VERSION 1.0
Current state of the app



## Tech Stack

*Retrofit*, *Dagger 2*, *Coroutines*, *Room*, *Glide*




## Screenshots

https://user-images.githubusercontent.com/97247402/183734842-f560339a-e553-479d-85d9-7e30e9e7820f.mp4

# There are 3 buttons:
* Movies
* Tv Shows
* Artists                                                                                                                                                                   
when we click on them, new `activity` starts and top 20 of selected items shows in `recyclerView`. When we click refresh button on top right corner all items reload and list updates using `TMDB Api`. All old items gets deleted so app don't take so much space. 

