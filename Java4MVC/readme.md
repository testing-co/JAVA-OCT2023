# Notes on Spring MVC
## 1. Project Setup
1. Create a new starter project with MySQL driver, JPA, devtools, Spring Web
2. Add dependencies on pom.xml 
   - For database: persistence validation
   - For web: jasper, jstl
3. Add config on application.properties 
   - For database: [MySQL connection ](https://login.codingdojo.com/m/315/9533/64298)
   - For Web: ```spring.mvc.view.prefix=/WEB-INF/```
   - To enable RESTful routing for forms: ```spring.mvc.hiddenmethod.filter.enabled=true```
4. Create all the subpackages (controllers, models, services, repositories)
5. Create the following files
   | Package    | Files | Use | Platform reference | 
   | ---------- | ---------------| -------------------------| ---|
   | models     | Trip class | like ERD, building the database design on server | [DomainModels](https://login.codingdojo.com/m/315/9533/64299) |
   | repositores| TripRepository interface | To perform queries on MySQL | [Repositories](https://login.codingdojo.com/m/315/9533/64300) |
   | services   | TripService class | To handle all backend logic (will stay the same) | [Services](https://login.codingdojo.com/m/315/9533/64301) |  
   | controllers| HomeController class | To receive HTTP request and render the jsp |   |
