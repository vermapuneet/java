package com.puneet.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Samsung 
{	@Autowired
	@Qualifier("mediatek")
	MobileProcessor cpu;
	public void config()
	{
		
		System.out.println("ram 4gb");
		cpu.process();
	}
	public MobileProcessor getCPU() {
		return cpu;
	}
	public void setCPU(MobileProcessor cpu)
	{
		this.cpu = cpu;
	}

}
