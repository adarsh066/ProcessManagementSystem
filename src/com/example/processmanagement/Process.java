package com.example.processmanagement;

/**
 * The Process class represents a single process with a unique ID, a name, and a
 * status indicating its current state. Author: Aadarsh Patil
 */
public class Process {
	// Unique identifier for the process
	private int processId;
	// Name of the process
	private String processName;
	// Status of the process (e.g., "Pending", "Running", "Completed")
	private String status;

	// Constructor to initialize the process object
	public Process(int processId, String processName, String status) {
		this.processId = processId;
		this.processName = processName;
		this.status = status;
	}

	// Getter for processId
	public int getProcessId() {
		return processId;
	}

	// Setter for processId
	public void setProcessId(int processId) {
		this.processId = processId;
	}

	// Getter for processName
	public String getProcessName() {
		return processName;
	}

	// Setter for processName
	public void setProcessName(String processName) {
		this.processName = processName;
	}

	// Getter for status
	public String getStatus() {
		return status;
	}

	// Setter for status
	public void setStatus(String status) {
		this.status = status;
	}

	// Overriding toString method to print process details
	@Override
	public String toString() {
		return "Process [processId=" + processId + ", processName=" + processName + ", status=" + status + "]";
	}
}
