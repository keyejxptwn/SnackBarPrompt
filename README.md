# SnackBarPrompt
基于SnackBar的一个提示
## 使用方法
```
implementation 'com.keyejxptwn:snackprompt:1.0.0'
```
```java
 TSnackbar.make(constraintLayout, "提示", TSnackbar.LENGTH_SHORT, TSnackbar.APPEAR_FROM_TOP_TO_DOWN)
                .setBackgroundColor(Color.RED)
                .setTextGravity(Gravity.CENTER)
                .setTextFontSizeDip(20f)
                .show();
```
顶部弹出提示:APPEAR_FROM_TOP_TO_DOWN
底部弹出提示:APPEAR_FROM_BOTTOM_TO_TOP

#  致谢
[guoyoujin](https://github.com/guoyoujin)

