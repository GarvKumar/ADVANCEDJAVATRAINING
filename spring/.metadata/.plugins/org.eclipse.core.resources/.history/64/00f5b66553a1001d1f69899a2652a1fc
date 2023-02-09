package com.spn.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("samsung")
public class Samsung {
	@Autowired
	@Qualifier("mediaTech")
	MobileProcessor cpu;

	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}
	public void config() {
		System.out.println("octa core , 4 GB ");
		cpu.process();
	}
	

}
