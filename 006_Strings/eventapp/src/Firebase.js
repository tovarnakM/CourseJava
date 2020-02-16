import * as firebase from 'firebase';

var firebaseConfig = {
    apiKey: "AIzaSyB5dPFdwYNo3PgUYsgXdUJ3rXKURVmR02M",
    authDomain: "eventapp-4cf0e.firebaseapp.com",
    databaseURL: "https://eventapp-4cf0e.firebaseio.com",
    projectId: "eventapp-4cf0e",
    storageBucket: "eventapp-4cf0e.appspot.com",
    messagingSenderId: "305007243833",
    appId: "1:305007243833:web:2e20df89a15a88304ad3e8",
    measurementId: "G-H1FEY6VWNZ"
  };
  // Initialize Firebase
  firebase.initializeApp(firebaseConfig);
  

export {
    firebase
}

