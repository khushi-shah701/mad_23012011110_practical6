## Practical-6
AIM: Create Android Application to demonstrate Frame by frame animation and splash screen to demonstrate twin animation.
Study: ImageView, Frame by Frame Animation, Twin Animation, Immersive Mode, Display Edge to Edge, SplashScreen, AnimationDrawable, onWindowFocusChanged() Method, AnimationUtils class, loadAnimation() method, setAnimationListener() method, overridePendingTransition() method, finish() method, anim folder in res, convert SVG file to .xml file

What is Frame by Frame Animation? What is Twin Animation? How can you achieve edge-to-edge content display in your app?  Create Android Application to demonstrate Frame by frame animation and splash screen to demonstrate twin animation according to below instructions.

Create MainActivity according to below UI design.

Create SplashActivity according to Video

Create gradient Rectangle by using <gradient> tag in <shape> tag for background of SplashActivity. Use radial rectangle with x = 0.9, y =0.9, radius = 1500. Start Color pink and End Color blue. shape should be rectangle

Add these all in project: <animation-list>, oneShot attribute, <set> tag, android:startOffset = 100, android:duration=1000, <scale> tag, <translate> tag, <rotate> tag, <alpha> tag

✅ 1. What is Frame-by-Frame Animation?

Frame-by-frame animation displays multiple images in sequence to create motion.

How the file works:

File: drawable/frame_animation.xml

Contains <animation-list>

Each <item> represents a frame image

Android cycles through frames automatically

AnimationDrawable is used in Kotlin to start the animation

✅ 2. What is Tween Animation?

Tween animation animates properties of a View such as:

Scaling

Moving

Rotating

Fading

How the file works:

File: anim/splash_anim.xml

Uses <set> tag containing <scale>, <translate>, <rotate>, <alpha>

startOffset adds delay

duration controls total animation time

Loaded using AnimationUtils.loadAnimation()

setAnimationListener() waits for animation to finish and opens MainActivity

✅ 3. Edge-to-Edge Content Display

Makes content extend behind status and navigation bars.

How it works:

Transparent system bar colors in themes.xml

WindowCompat.setDecorFitsSystemWindows(window, false) in Activity

Creates immersive UI similar to modern apps

❇ 4. Gradient Radial Background

Splash screen background uses a radial gradient.

How the file works:

File: drawable/gradient_bg.xml

<shape> with rectangle

<gradient type="radial">

centerX="0.9" and centerY="0.9" position the gradient

radius="1500" increases spread

Smooth transition from Pink ➝ Blue

🔥 5. Key Android Concepts Used
AnimationDrawable

Reads frame animation XML

Used for starting & stopping frame-by-frame animation

onWindowFocusChanged()

Ensures animation starts only when view is visible

AnimationUtils.loadAnimation()

Loads tween animation XML

setAnimationListener()

Detects animation end

Moves to next Activity automatically

overridePendingTransition()

Adds transition animation while switching Activity

finish()

Ensures Splash screen does not open again on back press

📂 PROJECT FOLDER STRUCTURE
app/
 ├── manifests/
 │     └── AndroidManifest.xml
 │
 ├── java/
 │     └── com.example.myapp/
 │            ├── SplashActivity.kt
 │            └── MainActivity.kt
 │
 ├── res/
 │     ├── layout/
 │     │     ├── activity_splash.xml
 │     │     └── activity_main.xml
 │     │
 │     ├── drawable/
 │     │     ├── gradient_bg.xml          (radial background)
 │     │     ├── frame_animation.xml      (frame-by-frame animation list)
 │     │     ├── frame1.png
 │     │     ├── frame2.png
 │     │     └── frameN.png
 │     │
 │     ├── anim/
 │     │     ├── splash_anim.xml          (tween animation)
 │     │     ├── scale.xml                (optional separate animations)
 │     │     ├── translate.xml
 │     │     ├── rotate.xml
 │     │     └── alpha.xml
 │     │
 │     ├── values/
 │     │     ├── colors.xml
 │     │     ├── themes.xml
 │     │     └── styles.xml
 │
 └── assets/


| **Screen Name**      | **Screenshot**                                                                                                                                           | **Description**                                                                                             | **Major UI Components**                                                                             | **Animation Used**                                                   |
| -------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------- |
| **1. Splash Screen** | <img width="435" height="959" alt="Screenshot 2025-11-18 060005" src="https://github.com/user-attachments/assets/b34e704f-1fd0-48bd-88ba-daee71d76314" />| Displays app logo with gradient radial background. Automatically navigates to MainActivity after animation. | • ImageView (Logo)<br>• Gradient Background (radial rectangle)<br>• Full-Screen Edge-to-Edge Layout | **Tween Animation**<br>• Scale<br>• Translate<br>• Rotate<br>• Alpha |
| **2. Main Activity** | <img width="437" height="964" alt="Screenshot 2025-11-18 060021" src="https://github.com/user-attachments/assets/89c454c6-c998-4057-9f30-f74f4fb6aec5" />| Shows an ImageView with Frame-by-Frame Animation using AnimationDrawable.                                   | • ImageView (Animation View)<br>• Buttons (optional)                                                | **Frame-by-Frame Animation** using `<animation-list>`                |

📄 CONCLUSION

This project demonstrates:

✔ How frame-by-frame animation works using <animation-list>
✔ How tween animation works using <set> (scale, translate, rotate, alpha)
✔ How to implement a splash screen with animation listener
✔ Use of gradient drawable backgrounds
✔ How to enable immersive edge-to-edge modern UI
✔ Important Android animation APIs like AnimationDrawable, AnimationUtils, and overridePendingTransition
