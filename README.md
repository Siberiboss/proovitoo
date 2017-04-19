1. Use Docker to run Postgres 9.6 and expose the 5432 port to your localhost environment.
2. Create a runnable jar-packaged Spring-Boot application that runs on localhost port 8888 (java -jar app.jar).
3. Use Flyway to create database schema when the application starts. The schema should include one table named "data".
4. Create a Jersey POST endpoint /data that takes JSON input such as { "data": "custom data" } and saves the "custom data" part of the json into the data table in postgres.
5. Create a Jersey GET endpoint /data?search=cust that takes the search value ("cust") and finds all rows from the database that include the word "cust" and returns them as a json list.
6. Use Gradle or Maven for dependencies.
7. Write readme on how to run your application from command line.
8. Create a git repository out of the project and push it into Github. Send us the link to the Github repository as a final step of the project.

- - -

1. From a shell execute with Docker:

	To create a database container	-->			docker run --name postgres -p 32769:5432 -d -e POSTGRES_USER=user -e POSTGRES_PASSWORD=pw -e POSTGRES_DB=db library/postgres:9.6
	
	(To manage database) 			-->			docker exec -it postgres psql -U user db

2. From the command line execute:

	To start the program			-->			java -jar PROOVITOO.jar

3. From a browser navigate to:

	To insert data into the database	-->		http://localhost:8888/data
	
	To get data from the database;
	
	 with the entry appended to the end -->	http://localhost:8888/data?search=
