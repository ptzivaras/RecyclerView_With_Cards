# RecyclerView_With_Cards
RecyclerView &amp; CardView
Video:https://www.youtube.com/watch?v=Nw9JF55LDzE

1)For those struggling with the syncing of the dependencies: If you are using the new androidx libraries instead of regular android,
you need to use the dependencies I have outlined below (in the build gradle app) instead of the ones shown in this video:
implementation 'androidx.recyclerview:recyclerview-selection:1.0.0'
implementation 'androidx.cardview:cardview:1.0.0'

2)For those struggling with the cards connected to each other with no space: In example_item.xml in cardViewWidget add
 -app:cardElevation="8dp"
 -android:layout_margin="8dp"
 + and app:cardCornerRadius="4dp for corner
