package com.mhj.utils;

import java.util.Arrays;
import java.util.Date;

public class Test {
	/*获取年龄*/
	public static Date getAge(Date src){
		Date date = new Date();
		return date;
	}
	/*获得月初的日期*/
	public static Date getDateByMonthInit(Date src){
		Date date = new Date();
		return date;
	}
	/*获得月末的日期*/
	public static Date getDateByMonthLast(Date src){
		Date date = new Date();
		return date;
	}
	/*求未来日期离今天还剩的天数*/
	public static Date getDaysByFuture (Date future) {
		Date date = new Date();
		boolean after = date.after(date);
		String day=null;
		if(date!=null){
			day+=after;
		}
		return date;
	}
	public static Date getDaysByDeparted (Date departed) {
		Date date = new Date();
		boolean before = date.before(date);
		String day=null;
		if(date!=null){
			day+=before;
		}
		return departed;
	}

	public static void main(String[] args) {
	/*	日期
		Date src=null;
		System.out.println(getAge(src));*/
		/*
		获得月初的日期
		Date date = new Date();
		System.out.println(getDateByMonthInit(date));
		*/
		/*获得月末的日期
		Date date = new Date();
		if(date!=null){
			System.out.println(getDateByMonthInit(date));
		}*/
		//求未来日期离今天还剩的天数
		//System.out.println(getDaysByFuture(null));
		//求过去日期离今天还剩的天数
		//System.out.println(getDaysByFuture(null));
	}
}
