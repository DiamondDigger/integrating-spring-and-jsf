# integrating-spring-and-jsf

### We will be creating a simple web page that takes in the year, a month and a day of the month and determines which day of the week it is.
#### Original tutorial from:

https://medium.com/@tsepomaleka/integrating-spring-boot-with-java-server-faces-using-joinfaces-297e64f6a28f

Stack: 
  - Java 8
  - Spring Boot 
  - JSF
  - JoinFaces
  - Maven

The process is divided into 6 subtasks : 
 1) Add the JoinFaces dependencies
 2) Configure application properties
 3) Add Service that will perform the core logic to resolve a date to what day of the week it is
 4) Create a Form bean to hold on to the data that will be passed from the web page to the controller
 5) Create a Controller bean (Action bean)
 6) Create a JSF Page


#### Screenshots of running program after visitting your port from application.properties

### Form

<img src="src/main/resources/images/form.png">

### Data Input

<img src="src/main/resources/images/addingData.png">

### Result

<img src="src/main/resources/images/result.png">

