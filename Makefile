.PHONY: run

run: Main.class
	java -cp dist Main Hello world

Main.class: Main.java
	javac -d dist Main.java
