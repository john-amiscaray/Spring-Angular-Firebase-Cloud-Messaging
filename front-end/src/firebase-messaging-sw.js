importScripts('https://www.gstatic.com/firebasejs/8.7.0/firebase-app.js')
importScripts('https://www.gstatic.com/firebasejs/8.7.0/firebase-messaging.js')

firebase.initializeApp({
  apiKey: "your api key",
  authDomain: "your auth domain",
  projectId: "your project id",
  storageBucket: "your storage bucket",
  messagingSenderId: "your messaging sender id",
  appId: "your app id",
  measurementId: "your measurement id"
})

const messaging = firebase.messaging();
