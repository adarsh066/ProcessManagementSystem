package com.example.processmanagement;

/**
 * The Main class to test the ProcessManager functionalities. Author: Aadarsh
 * Patil
 */
public class Main {
	public static void main(String[] args) {
		// Creating an instance of ProcessManager
		ProcessManager processManager = new ProcessManager();

		// Creating processes
		Process p1 = new Process(1, "Process1", "Pending");
		Process p2 = new Process(2, "Process2", "Running");
		Process p3 = new Process(3, "Process3", "Completed");

		// Adding processes to the manager
		processManager.addProcess(p1);
		processManager.addProcess(p2);
		processManager.addProcess(p3);

		// Listing all processes
		System.out.println("All Processes: " + processManager.listAllProcesses());

		// Searching for a process by ID
		System.out.println("Search Process with ID 2: " + processManager.searchProcess(2));

		// Updating the status of a process
		processManager.updateProcessStatus(2, "Completed");
		System.out.println("Updated Process with ID 2: " + processManager.searchProcess(2));

		// Adding processes to pending and completed history
		processManager.addPendingProcess(p1);
		processManager.addCompletedProcess(p2);

		// Getting the history of pending and completed processes
		System.out.println("Pending Processes History: " + processManager.getPendingProcessesHistory());
		System.out.println("Completed Processes History: " + processManager.getCompletedProcessesHistory());

		// Removing a process by ID
		processManager.removeProcess(3);
		System.out.println("All Processes after removal: " + processManager.listAllProcesses());
	}
}
