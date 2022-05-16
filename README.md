# 📺 dsmovie-app 📺

> Status: Construction 🚧

### REST API using spring boot and Frontend using React. This API is used to evaluate movies.

<h1 align="center">
  <img alt="Readme" title="Readme" src="https://user-images.githubusercontent.com/87916631/168407779-9eb876a0-37fb-4da9-b6d0-250f85c386e7.gif"/>
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
