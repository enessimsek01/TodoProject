# todo-project-with-springboot

<div id="top"></div>

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <h3 align="center"> Todo Project</h3>

  <p align="center">
    ·
    <a href="https://github.com/enessimsek01/TodoProject/issues">Report Bug</a>
    ·
    <a href="https://github.com/enessimsek01/TodoProject/issues">Request Feature</a>
  </p>


</div>




<!-- ABOUT THE PROJECT -->
## About The Project

A small ToDo list was done.
* Users can create their own ToDo list
* Users can update the list



### Technologies

- Java 11
- Spring Boot
- Spring Data Jpa
- Maven
- Mapstruct
- H2 Database



<!-- GETTING STARTED -->

## Getting Started


### Prerequisites

* Java 11 or newer


## Endpoint

   <p>It hosts basic operations such as add, delete and update tasks. </p>


|    Endpoint  	    | Method 	  |          Params     	          |           Description                    	            |
|:-----------------:|:---------:|:------------------------------:|:-----------------------------------------------------:|
| findAllTodoList 	 |  GET  	   |          null      	           |         It lists all Tasks.                	          |
|    findById 	     |  GET  	   |            id     	            |      Chooses to a Task according to given id. 	       |   	
|      save 	       |  POST  	  |      TodoSaveRequestDto 	      |           Creates new Task.               	           |   	
|     update 	      |   PUT 	   | id, TodoUpdateRequestDto     	 | Updates the task according to given id.             	 | 
|      deleteById 	 | DELETE  	 |           id      	            |            Deletes the task according to given id.                	             |

* 10 data is transferred by default when the program starts

## Requests
* Get All Tasks List: localhost:8080/api/v1/todos/
* Get A Task: localhost:8080/api/v1/todos/{id}
* Update A Task: localhost:8080/api/v1/todos/{id} -- Fields: "work", "description"
* Save A Task: localhost:8080/api/v1/todos/ -- Fields: "work", "description"
* Delete A Task: localhost:8080/api/v1/todos/{id}

The ID's GenerationType is Identity.

<!-- CONTACT -->

## Contact

* Muhammet Enes ŞİMŞEK - enesimsek01@gmail.com
* Linkedin :  [https://www.linkedin.com/in/muhammetenessimsek01](https://www.linkedin.com/in/muhammetenessimsek01)
* Project Link: [https://github.com/enessimsek01/TodoProject](https://github.com/enessimsek01/TodoProject)

<p align="right">(<a href="#top">back to top</a>)</p>
