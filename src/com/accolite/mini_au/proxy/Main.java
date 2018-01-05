package com.accolite.mini_au.proxy;

public class Main {
	public static void main(String [] args)
	{
		CommandExecutorProxy cp = new CommandExecutorProxy("rithvik", "root");
		CommandExecutorProxy cp2 = new CommandExecutorProxy("sukesh", "abcd");
		try {
			cp2.runCommand("cmd /c del C:\\Users\\Hyderabad-Intern\\Desktop\\demo.txt");
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			cp.runCommand("cmd /c del C:\\Users\\Hyderabad-Intern\\Desktop\\demo.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
