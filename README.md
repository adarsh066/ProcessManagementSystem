# ProcessManagementSystem

A Java-based process management system that efficiently handles a large number of processes and operations using both ArrayList and LinkedList. The system supports functionalities such as adding, removing, searching, and listing processes, as well as maintaining a history of pending and completed processes.

## Features

- Add a process
- Remove a process
- Search for a process
- List all processes
- Update process status
- Maintain history of pending and completed processes

  ## Project Structure

  ProcessManagementSystem
├── src
│ ├── main
│ │ ├── java
│ │ │ ├── com
│ │ │ │ ├── example
│ │ │ │ │ ├── processmanagement
│ │ │ │ │ │ ├── Process.java
│ │ │ │ │ │ ├── ProcessManager.java
│ │ │ │ │ │ ├── Main.java
├── pom.xml
├── README.md


## Classes

### Process

The `Process` class represents a single process with a unique ID, name, and status.

### ProcessManager

The `ProcessManager` class manages multiple processes using an ArrayList and LinkedList. It provides functionalities to add, remove, search, list, and update processes, as well as maintaining histories of pending and completed processes.

### Main

The `Main` class is used to test the functionalities of the ProcessManager.

## How to Run

1. Open Spring Tool Suite (STS).
2. Create a new Java project named `ProcessManagementSystem`.
3. Create the package `com.example.processmanagement` inside the `src/main/java` directory.
4. Add the `Process.java`, `ProcessManager.java`, and `Main.java` files to the package.
5. Copy the provided code into the respective files.
6. If using Maven, create a `pom.xml` file in the project root with the provided content.
7. Run the `Main` class to test the functionalities.

## Author

Aadarsh Patil
