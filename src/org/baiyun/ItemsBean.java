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
		reply.put("0", "����");
		reply.put("1", "����");
		reply.put("2", "γ��");

		return reply;
	}

	public String CreateImage(String CLASSID) {
		// Map reply = new LinkedHashMap();
		String reply = "";

		// ����������ģ�����ݿ��ѯ�����
		// ��ʵ�����У���ֻҪ�����ݿ��ѯ������뵽reply����Ϳ����ˡ�
		// reply��id���Ƿ��غ��������option��value��reply��value���Ƿ��غ��������option��text��
		// ��: sql = "select * from users where classid=?";
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
