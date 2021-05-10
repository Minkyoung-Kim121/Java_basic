package a.b.c;

/*
// java SE 税 爽推 鳶徹走
java.lang.* : 切郊 覗稽益轡拭辞 切爽 戚遂馬澗 奄沙 適掘什 薦因
java.io.* : 督析, 覗鍵斗, 乞艦斗, 徹左球 去税 陥丞廃 脊窒径 淫恵 適掘什 薦因
java.net.* : 革闘趨滴 淫恵 適掘什 薦因
java.util.* : 劾促, 獣娃, 困斗, 貝呪(random number)去税 政匿軒銅 適掘什 薦因
java.sql.* : 汽戚斗今戚什 覗稽益掘講拭 琶推廃 陥丞廃 適掘什 薦因
             馬奄 鳶徹走澗 働紺廃 井酔拭幻 紫遂敗
java.applet.* : 蕉巴鹸聖 姥薄馬奄 是廃 淫恵 適掘什 薦因 -> 薄仙澗 設 紫遂馬走 x
java.awt.* : 益掘波 制亀酔 淫恵 陥丞廃 適掘什 薦因
javax.swing.* : AWT 左陥 娃畷廃 什成拭 紫遂鞠澗 制亀酔 淫恵 陥丞廃 適掘什 薦因
*/
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassTest extends Object{ // -> extends Object 持繰亜管.

	public String toString(){
		
		return "ばばば";
	}

	public static void main(String args[]){
		
		ClassTest ct = new ClassTest();
		System.out.println("ct 凧繕痕呪 >>> : " + ct); // -> ct 凧繕痕呪 >>> : ばばば
		System.out.println("ct.toString() >>> : " + ct.toString());
		// -> ct.toString() >>> : ばばば

		Date d = new Date(); //   -> 星鰍聖 承 凶澗 Date 研 潤醤.
		System.out.println("d >>> : " + d); // -> d >>> : Tue Oct 20 15:51:30 KST 2020

		Calendar c = Calendar.getInstance(); 
		// Calendar c = new Calendar(); 
		// public abstract class Calendar extends Object 
		// -> abstract 澗 new 潤辞 instance 馬檎 x
		//    蓄雌適掘什澗 梓端鉢 拝 呪 x

		System.out.println("c >>> : " + c);
/* ->   c >>> : java.util.GregorianCalendar
		[time=1603176690796,areFieldsSet=true,areAllFieldsSet=true,lenient=true,
		zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,
		dstSavings=0,useDaylight=false,transitions=30,lastRule=null],
		firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,
		YEAR=2020,MONTH=9,WEEK_OF_YEAR=43,WEEK_OF_MONTH=4,DAY_OF_MONTH=20,
		DAY_OF_YEAR=294,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,
		HOUR_OF_DAY=15,MINUTE=51,SECOND=30,MILLISECOND=796,ZONE_OFFSET=32400000,DST_OFFSET=0]
*/
		ArrayList aList = new ArrayList(); // ArrayList -> 壕伸聖 幻級嬢虞, 昔畿什亜 赤陥. 授託亜 赤陥.
										   // cf. Vector
		aList.add("aaaa");
		ArrayList aList1 = new ArrayList();
		System.out.println("aList >>> : " + aList); // -> aList >>> : [aaaa]
		aList1.add("sfdg");
		System.out.println("aList1 >>> : " + aList1); // -> aList1 >>> : [sfdg]

//  採乞 昔斗凪戚什 識情背辞 紫遂馬奄
		List lt = new List(); // List 人 ArrayList 澗 採乞 - 切縦 淫域 
							  // 昔斗凪戚什 / 適掘什
		System.out.println("lt >>> : " + lt);
		// ClassTest.java:63: error: List is abstract; cannot be instantiated
		//                List lt = new List();

		HashMap hm = new HashMap();
		hm.put("戚硯", "酔裾植");
		System.out.println("hm >>> : " + hm); // -> hm >>> : {戚硯=酔裾植}
		HashMap hm1 = new HashMap();
		hm1.put("爽社", "酔裾植 植植植");
		System.out.println("hm1 >>> : " + hm1); // -> hm1 >>> : {爽社=酔裾植 植植植}

//  採乞 昔斗凪戚什 識情背辞 紫遂馬奄
		Map mp = new Map();
		System.out.println("mp >>> : " + mp);
		// ClassTest.java:74: error: Map is abstract; cannot be instantiated
		//                Map mp = new Map();

//  什闘元 適掘什研 雌呪稽 紫遂馬奄
		String s = "abc";
		System.out.println("s >>> : " + s);

// Q) char 稽 舵鯵奄?

//  紫遂切 舛税 壕伸 昔什渡什 馬奄 
		int iVal[] = new int[5];
		System.out.println("iVal >>> : " + iVal);

	} // end of main()
	
} // end of ClassTest class