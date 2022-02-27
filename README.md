# Secure, Private Vaccine Card Viewer App for Android

I was tired of opening Google Photos, going to the search bar,
typing in "vaccine" and waiting for the photo of my vaccine card to load
every single time someone asked me for it. I tried setting it as my wallpaper,
but I couldn't get the scaling right. I also considered downloading any other
photo app and adding it as the only photo in the app, but this seemed like more fun.
Plus, it's 100% guaranteed to be private and secure! (It's "self-hosted".)  It also loads really fast,
which is great when there's a long line behind me at Chipotle.

## Installation Instructions

1. [Install Android Studio](https://developer.android.com/studio#downloads) and maybe Java if you don't have it.
2. Clone this repo.
3. Copy a photo of your vaccine card to `app/src/main/res/drawable/vaccine_card.jpg`. If you have a different image file type, that's also fine.
4. Open this folder in Android Studio.
5. Connect your phone to your computer and select it as a device in Android Studio.
You might need to put your phone in Developer Mode and tell it to trust your computer.
There's also a couple more steps on Linux if you haven't done this before.
6. Run the app by pressing the big ole' play button. It should stay on your phone even after disconnecting.
7. Profit.

## Todos

_(Contributions welcome :) )_

- [ ] add an actual icon instead of the default.
- [ ] make zooming less bad. You can only zoom in on the center right now.
- [ ] add innocuous-seeming log statements that actually make remote calls to my secret
server, uploading all my user's private data. Mwuahahaaha. Anyone know a good library for this?
- [ ] learn Kotlin.
