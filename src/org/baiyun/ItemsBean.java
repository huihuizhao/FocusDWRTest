package org.baiyun;

import java.util.*;

import interpolation.iw3d;
import interpolation.iw3d.Progress;

/**
 *
 * @author baiyun
 */
public class ItemsBean {
	private String[] class1 = { "东经10度", "东经20度", "东经30度", "东经40度", "东经40度", "东经50度" };
	private String[] class2 = { "北纬5度", "北纬15度", "北纬25度", "北纬35度" };

	/** Creates a new instance of ItemsBean */
	public ItemsBean() {
	}

	public Map ClassList() {
		Map reply = new LinkedHashMap();
		reply.put("0", "所有");
		reply.put("1", "经度");
		reply.put("2", "纬度");

		return reply;
	}

	public String CreateImage(String CLASSID) {
		// Map reply = new LinkedHashMap();
		String reply = "";

		// 这里用数组模拟数据库查询结果。
		// 真实环境中，你只要将数据库查询结果放入到reply里面就可以了。
		// reply的id就是返回后下拉框的option的value，reply的value就是返回后下拉框的option的text。
		// 如: sql = "select * from users where classid=?";
		if (CLASSID == null || CLASSID.equals("") || CLASSID.equals("0")) {
			//
		} else if (CLASSID.equals("150E")) {
			reply = "D://image.jpg";
//			iw3d iw = new iw3d(1000);
			iw3d iw = new iw3d();
			// start Thread
			iw.loadData();
		} else if (CLASSID.equals("25N")) {
			iw3d iw = new iw3d();
			// start Thread
			iw.loadData();
		}

		return reply;
	}
}
