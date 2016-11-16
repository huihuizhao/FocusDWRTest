package org.baiyun;

import java.util.*;

import interpolation.iw3d;
import interpolation.iw3d.Progress;

/**
 *
 * @author baiyun
 */
public class ItemsBean {
	private String[] class1 = { "����10��", "����20��", "����30��", "����40��", "����40��", "����50��" };
	private String[] class2 = { "��γ5��", "��γ15��", "��γ25��", "��γ35��" };

	/** Creates a new instance of ItemsBean */
	public ItemsBean() {
	}

	public Map ClassList() {
		Map reply = new LinkedHashMap();
		reply.put("0", "100");
		reply.put("1", "500");
		reply.put("2", "1000");

		return reply;
	}

	public String CreateImage(String depth) {
		
		iw3d iw = new iw3d();
		// start Thread
		iw.loadData(Integer.valueOf(depth));
		
		
		// Map reply = new LinkedHashMap();
		String reply = "D://image_"+String.valueOf(depth)+".jpg";


		return reply;
	}
}
