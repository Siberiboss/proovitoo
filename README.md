1) From a shell execute with Docker:

	To create a database container	-->			docker run --name postgres -p 32769:5432 -d -e POSTGRES_USER=user -e POSTGRES_PASSWORD=pw -e POSTGRES_DB=db library/postgres:9.6
	
	(To manage database) 			-->			docker exec -it postgres psql -U user db

2) From the command line execute:

	To start the program			-->			java -jar PROOVITOO.jar

3) From a browser navigate to:

	To insert data into the database	-->		http://localhost:8888/data
	
	To get data from the database;
	
	 with the entry appended to the end -->	http://localhost:8888/data?search=
