package com.accolite.mini_au.proxy;

public class CommandExecutorProxy implements CommandExecutor{
	private boolean isAdmin;
	private CommandExecutor executor;
	
	
	public  CommandExecutorProxy(String user,String pwd) {
		if("rithvik".equals(user) && "root".equals(pwd))
			isAdmin = true;
		executor = new CommandExecutorImpl();
	}
	
	
	@Override
	public void runCommand(String cmd) throws Exception {
		if(isAdmin)
		{
			executor.runCommand(cmd);
		}
		else
		{
			if(cmd.trim().contains("del")) {
				throw new Exception("rm command is not allowed for non-admin users");
			}
			else
			{
				executor.runCommand(cmd);
			}
		}
		
	}
	
}
