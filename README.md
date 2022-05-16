# 📺 dsmovie-app 📺

> Status: Completed ✅

### App responsible to review movies. The REST API was developed with Java and Spring boot and the frontend was developed with HTML, CSS, Bootstrap and React.

<h1 align="center">
  <img alt="Readme" title="Readme" src="https://user-images.githubusercontent.com/87916631/168605913-fadfb217-5d67-41ae-8eda-c447e18eb550.gif"/>
</h1>

## 🔘 Fields of MovieModel are:
+ id
+ score
+ count
+ image

## 🔘 Fields of UserModel are:
+ id
+ email

## 🔘 Fields of ScoreModel are:
+ id
+ value

## 🔘 Fields of ScorePKModel are:
+ movie
+ user

## 📔 Features
App responsible to make a user CRUD and let him evaluate movies.

## 🤝🏽 Business Rules
+ The user must have to fill the email field with the right format to complete his evaluation.
+ If the email never was input, it will be saved on the user table.
+ The vote counts only one time. If the user tries to evaluate the same move only the score will be updated.

## ⚒️ Technologies
+ Java 11
+ Spring Boot
+ Maven
+ PostgreSQL
+ HTML
+ CSS
+ Boostrap
+ React
+ Typescript

## 🌱 Starters
+ Spring WEB
+ Validation
+ Spring JPA
+ Spring Postgres Connector
+ Spring Security
+ Swagger UI

## 🪖 Patterns
+ MVC
+ IOC
+ DTO

## 📲 contact
+ linkedin: https://www.linkedin.com/in/maxwneto/
