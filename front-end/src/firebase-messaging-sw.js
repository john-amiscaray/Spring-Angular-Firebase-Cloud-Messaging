importScripts('https://www.gstatic.com/firebasejs/8.7.0/firebase-app.js')
importScripts('https://www.gstatic.com/firebasejs/8.7.0/firebase-messaging.js')

firebase.initializeApp({
  apiKey: "AIzaSyCE1EyckF_NRex0vdyMGS7Zx5jUD19dErk",
  authDomain: "spring-angular-fcm-demo.firebaseapp.com",
  projectId: "spring-angular-fcm-demo",
  storageBucket: "spring-angular-fcm-demo.appspot.com",
  messagingSenderId: "142109885118",
  appId: "1:142109885118:web:df93d5e0cc6added01d4ef",
  measurementId: "G-DVYFZC7TGZ"
})

const messaging = firebase.messaging();
