package com.example.processmanagement;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

/**
 * The ProcessManager class manages multiple processes using ArrayList and
 * LinkedList. It provides functionalities to add, remove, search, list, and
 * update processes. Author: Aadarsh Patil
 */
public class ProcessManager {
	// Using ArrayList to store all processes
	private List<Process> processes;

	// Using LinkedList to maintain history of pending and completed processes
	private LinkedList<Process> pendingProcessesHistory;
	private LinkedList<Process> completedProcessesHistory;

	// Constructor to initialize the lists
	public ProcessManager() {
		processes = new ArrayList<>();
		pendingProcessesHistory = new LinkedList<>();
		completedProcessesHistory = new LinkedList<>();
	}

	// Method to add a new process to the list
	public void addProcess(Process process) {
		processes.add(process);
	}

	// Method to remove a process by its ID
	public boolean removeProcess(int processId) {
		Optional<Process> processOpt = processes.stream().filter(p -> p.getProcessId() == processId).findFirst();
		if (processOpt.isPresent()) {
			processes.remove(processOpt.get());
			return true;
		}
		return false;
	}

	// Method to search for a process by its ID
	public Process searchProcess(int processId) {
		return processes.stream().filter(p -> p.getProcessId() == processId).findFirst().orElse(null);
	}

	// Method to list all processes with their details
	public List<Process> listAllProcesses() {
		return new ArrayList<>(processes);
	}

	// Method to update the status of a process by its ID
	public boolean updateProcessStatus(int processId, String newStatus) {
		for (Process process : processes) {
			if (process.getProcessId() == processId) {
				process.setStatus(newStatus);
				return true;
			}
		}
		return false;
	}

	// Method to add a pending process to the history
	public void addPendingProcess(Process process) {
		pendingProcessesHistory.add(process);
	}

	// Method to add a completed process to the history
	public void addCompletedProcess(Process process) {
		completedProcessesHistory.add(process);
	}

	// Method to get the history of pending processes
	public List<Process> getPendingProcessesHistory() {
		return new LinkedList<>(pendingProcessesHistory);
	}

	// Method to get the history of completed processes
	public List<Process> getCompletedProcessesHistory() {
		return new LinkedList<>(completedProcessesHistory);
	}
}
