# Android_Authentification    

SOURCE : https://www.androidhive.info/2016/06/android-getting-started-firebase-simple-login-registration-auth/ 

Pour utiliser l'authentification

## collectes :    
- le package java.com.tpillon.authentapp.Logic
- le package java.com.tpillon.authentapp.Views.Activities.Authent
- les activities du dossier res.layout sauf activity_main.xml
- les resources dans les fichiers du dossier res.values


## Ajoute l'authentification au lancement 
Dans le fichier app.manifests.AndroidManifest.xml, ajoute le code suivant :    
```
  <uses-permission android:name="android.permission.INTERNET" />

  <activity android:name=".View.Activities.Authent.ResetPasswordActivity"></activity>
  <activity android:name=".View.Activities.Authent.LoginActivity" />
  <activity android:name=".View.Activities.Authent.SignupActivity">
      <intent-filter>
          <action android:name="android.intent.action.MAIN" />
          <category android:name="android.intent.category.LAUNCHER" />
      </intent-filter>
  </activity>
  
```

## Lie firebase à ton application
Suivre les étapes :     
https://www.androidhive.info/2016/06/android-getting-started-firebase-simple-login-registration-auth/     
1. Enabling Firebase Auth    
2. Creating Android Project    

## indiques quelle activitée s'affichera après l'authentification :

`public static final Class<? extends Activity> ACTIVITY_AFTER_AUTHENT = MainActivity.class;`

Dans la classe java.com.tpillon.authentapp.Views.Activities.Authent.SignupActivity
Remplaces "MainActivity" par le nom de lactivité que tu souhaites ouvrir après l'authentification.
