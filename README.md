# AndroidViewPager
![ ](https://img.shields.io/badge/-JitPack-red)
![ ](https://img.shields.io/badge/Release-v1.1-yellow?labelColor=Yellow)

The ViewPager with Indicator for Android.
 
## Key Features 🎯
- **View Pager**: Simple and Easy Implementation of View Pager.
- **Indicator**: Indicator for View Pager ensures the track of View Pager status.
- **Custom Rounded View Pager UI**: Custom design for View Pager items.
- **Secure**: Your data, your control. Always.
- **Compatible**: Android 24 or upper.
- **Open Source**: Freedom is beautiful, so is AndroidViewPager. Open source and free to use.

## Download
```groovy
dependencies {
    implementation 'com.github.HaiderQadir:AndroidViewPager:1.1'
}
```
Also configure JitPack
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}
```
## How to use
````
val mFragment = ViewPagerFragment(
   false,
   settingsIconVisibility = false,
   infoIconVisibility = false
)
supportFragmentManager.beginTransaction().replace(R.id.frameLayout, mFragment).commit()
````


## Powered By ![ ](https://img.shields.io/badge/-JitPack-red?labelColor=gray&style=for-the-badge)

 ## License 📄
Copyright 2023 Haider Qadir
