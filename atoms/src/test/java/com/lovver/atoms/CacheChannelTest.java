package com.lovver.atoms;

import com.lovver.atoms.core.CacheChannel;

public class CacheChannelTest {

	public static void main(String[] args) {
		CacheChannel cc=CacheChannel.getInstance();
		cc.set("hello", "dddd", "nihaoya");
//		while(true){
//			Object value=cc.get("hello", "dddd");
//			if(value==null){
//				System.out.println("==============="+value);
//			}else{
//				System.out.println("==============="+value);
//			}
//		}
//		cc.evict("hello", "dddd");
//		System.out.println("removed!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
//		while(true){
//			System.out.println("==============="+cc.get("hello", "dddd"));
//		}
//		
//		cc.set("jiangbiao", "hello", "ddddddd");
//		for(int i=0;i<100000;i++){
//			System.out.println("==============="+cc.get("jiangbiao", "hello"));
//		}
	}

}
