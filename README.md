# MongoDB-Spring-Boot-Example
MongoDB-Spring-Boot-Example

Install MongoDB and create database, collection as given in application.properties

Run application using goal : spring-boot:run

and Use RestClient(Mozilla) or Postman(Chrome)

http://localhost:8090/user/create	(Post)
http://localhost:8090/user/			(Get)

{
  "name" : "Viv",
  "userSettings" : {
    "bike" : "Avenger"
  }
}
