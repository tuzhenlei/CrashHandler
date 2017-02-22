#CrashHandler
 [ ![Download](https://api.bintray.com/packages/tzl/CrashHandler/CrashHandler/images/download.svg?version=1.0.1) ](https://bintray.com/tzl/CrashHandler/CrashHandler/1.0.1/link)

Library to handle crash for Android . Especially that after crash，app will restart the stack top activity when API >=21.  
 (minSdkVersion=14).  
##Features:
1. Prompt the user friendly when crash happend.
2. Can save detailed crash information to SDcard.
3. Can completely exit the app after crash when API >=21.
4. Can truly restart app from initial activity but not stack top activity.


######See more details and principle analysis at my blog post: [Android Crash Handle](http://www.jianshu.com/p/c75192c77e28)

##Demo
![](http://i.imgur.com/yjG9Wny.gif)

##Usage
###Step 1
######Add dependencies in build.gradle.

    dependencies {  
    　　compile 'com.tuzhenlei:crashhandler:1.0.1'
    }

######Or Maven:

    <dependency>
      <groupId>com.tuzhenlei</groupId>
      <artifactId>crashhandler</artifactId>
      <version>1.0.1</version>
      <type>pom</type>
    </dependency>

######Or You can download a jar from GitHub's [releases page](https://github.com/tuzhenlei/CrashHandler/releases).
---
###Step 2
init CrashHandler in your Application as :
    
    CrashHandler.getInstance().init(this, BuildConfig.DEBUG);
    
or init as:
    
    CrashHandler.getInstance().init(this, BuildConfig.DEBUG, true, 0, MainActivity.class); 
	
    /**  
    param1: this  
    param2: Whether to save the log to SDcard (/storage/emulated/0/Crash); Suggest save for debugging in debug mode.
    param3: Whether to restart app after crash.
    param4: restart after how many milliseconds are.
    param5: your app's first activity.(such as splashActivity)
    */

###More property settings
set the app close animation  

    CrashHandler.setCloseAnimation(android.R.anim.fade_out);


set custom crash tip

	CrashHandler.setCrashTip("自定义提示信息");


set custom Toast  

	CrashHandler.setCustomToast(toast);

###Contact me
If you have a better idea or way, please let me know , thanks~  
Email: tuzhenlei@gmail.com  
[My Blog](http://www.jianshu.com/u/979813807e62)

###License

    Copyright 2017 tuzhenlei
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
       http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
