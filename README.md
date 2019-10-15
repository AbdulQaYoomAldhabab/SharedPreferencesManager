# SharedPreferencesManager
Helps to Store local data using Shared Preferences Manager

[![](https://jitpack.io/v/AbdulQaYoomAldhabab/SharedPreferencesManager.svg)](https://jitpack.io/#AbdulQaYoomAldhabab/SharedPreferencesManager)

# Setup
Add it in your root build.gradle at the end of repositories:

```maven
allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
	
```
# dependencies
```
dependencies {
	        implementation 'com.github.AbdulQaYoomAldhabab:SharedPreferencesManager:v1.0.0'
	}
```

# Initialze

- initialize SharedPreferences Using One of The folowing methods

1 - this initialize shared Preferences with default name of application
```
SharedPreferencesManager.initialize(context);
```
or 

2 - use this message if you want to set custom name for   shared Preferences
```
SharedPreferencesManager.initialize(context, "shared Preferences Name");
```
# Usage
To save your data use put method to set any type of data
```
        SharedPreferencesManager.put("key", data);

        or  --> multiple string sets

        Set<String> strings = new HashSet<>();
        strings.add("string 1");
        strings.add("string 2");
        strings.add("string 3");
        
        SharedPreferencesManager.put("SetsKey", strings);
```

to get saved data use the spicific get of the data type 
ex.
```
      int mInt = SharedPreferencesManager.getInt("key");
      float mFloat = SharedPreferencesManager.getFloat("key");
      String mString = SharedPreferencesManager.getString("key");
      boolean mBoolean = SharedPreferencesManager.getBoolean("key");
      Set<String> mSet = SharedPreferencesManager.getStringSet("key");
```


# Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
Please make sure to update tests as appropriate.
