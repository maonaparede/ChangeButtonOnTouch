# Welcome to the ChangeButtonOnTouch-Lib wiki!

## This lib was created to make custom buttons quickly;

With this lib, when the button is press, it change the text color and the button background / color.

### XML Example

       <com.example.onbutton.OnButton
        android:id="@+id/button2"
        android:layout_width="300dp"
        android:layout_height="75dp"
        
         android:background="#777"
         app:onTouch_background="#12F"
        
         android:textColor="#FFF"
         app:onTouch_text_color="#854"
        
        android:text="Button"
        /> 



The "**app:onTouch_background**" tag changes the button background when it is pressed.
Use the tag "**android:background**" to set the button background when it is not pressed.


The "**app:onTouch_text_color="#854**" tag to set the text color when the button is pressed.
Use the tag "**android:textColor**" to set the text color when the button is not pressed.


## Download

[Download](https://github.com/maonaparede/ChangeButtonOnTouch_0.1/releases/tag/v0.2) the .aar file and import it to your project(**File>New>New Module>import .JAR / .AAR Package**) and select the .AAR File.

And add in your "**build.gradle(:app)**"

    dependencies{

      implementation project(path: ':onbutton_0.2');

    }


### All Ready - Carpe Diem
