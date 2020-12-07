package com.xworkz.util;

import com.xworkz.mirror.*;;

public class MirrorUtil {
	public static void main(String[] args) {
		
		
		Mirror mirror=new Mirror();
		mirror.setSize(19);
		mirror.setFrameColor("pink");
		mirror.setFrameShape("round");
		mirror.setPrice(1000);
		
		System.out.println(mirror.getSize()+" "+mirror.getFrameColor()+" "+mirror.getFrameShape()+" "+mirror.getPrice());
		}

}
